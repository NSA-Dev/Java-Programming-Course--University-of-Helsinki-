package asteroids;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AsteroidsApplication extends Application {

    public static int WIDTH = 1024;
    public static int HEIGHT = 768;

    public static void main(String[] args) {
        launch(AsteroidsApplication.class);
    }

    public static int partsCompleted() {
        // State how many parts you have completed using the return value of this method
        return 4;
    }

    @Override
    public void start(Stage stage) {
        Pane windowPane = new Pane();

        windowPane.setPrefSize(WIDTH, HEIGHT);
        //score board
        Text scoreText = new Text(10, 20, "Points: 0");
        windowPane.getChildren().add(scoreText);
        AtomicInteger score = new AtomicInteger();

        //entity creation
        List<Projectile> projectiles = new ArrayList<>();
        Ship shipPlayer = new Ship(WIDTH / 2, HEIGHT / 2);
        List<Asteroid> asteroids = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Random rnd = new Random();
            Asteroid asteroid = new Asteroid(rnd.nextInt(WIDTH / 3), rnd.nextInt(HEIGHT));
            asteroids.add(asteroid);
        }

        //add entities to the pane
        windowPane.getChildren().add(shipPlayer.getCharacter());
        asteroids.forEach(asteroid -> windowPane.getChildren().add(asteroid.getCharacter()));
        Scene scene = new Scene(windowPane);

        //ship controls
        Map<KeyCode, Boolean> pressedKeys = new HashMap<>();

        scene.setOnKeyPressed(event -> {
            pressedKeys.put(event.getCode(), Boolean.TRUE);
        });

        scene.setOnKeyReleased(event -> {
            pressedKeys.put(event.getCode(), Boolean.FALSE);
        });

        new AnimationTimer() {

            @Override
            public void handle(long now) {
                if (Math.random() < 0.005) {
                    Asteroid asteroid = new Asteroid(WIDTH, HEIGHT);
                    if (!asteroid.collide(shipPlayer)) {
                        asteroids.add(asteroid);
                        windowPane.getChildren().add(asteroid.getCharacter());
                    }
                }
                if (pressedKeys.getOrDefault(KeyCode.LEFT, false)) {
                    shipPlayer.turnLeft();
                }

                if (pressedKeys.getOrDefault(KeyCode.RIGHT, false)) {
                    shipPlayer.turnRight();
                }

                if (pressedKeys.getOrDefault(KeyCode.UP, false)) {
                    shipPlayer.accelerate();
                }
                if (pressedKeys.getOrDefault(KeyCode.SPACE, false) && projectiles.size() < 3) {
                    Projectile projectile = new Projectile((int) shipPlayer.getCharacter().getTranslateX(), (int) shipPlayer.getCharacter().getTranslateY());
                    projectile.getCharacter().setRotate(shipPlayer.getCharacter().getRotate());
                    projectiles.add(projectile);

                    projectile.accelerate();
                    projectile.setMovement(projectile.getMovement().normalize().multiply(3));

                    windowPane.getChildren().add(projectile.getCharacter());
                }
                shipPlayer.move();
                asteroids.forEach(asteroid -> asteroid.move());
                projectiles.forEach(projectile -> projectile.move());
                projectiles.forEach(projectile -> {
                    asteroids.forEach(asteroid -> {
                        if (projectile.collide(asteroid)) {
                            projectile.setAlive(false);
                            asteroid.setAlive(false);
                        }
                    });
                    if (!projectile.isAlive()) {
                        scoreText.setText("Points: " + score.addAndGet(1000));
                    }
                });

                projectiles.stream()
                        .filter(projectile -> !projectile.isAlive())
                        .forEach(projectile -> windowPane.getChildren().remove(projectile.getCharacter()));
                projectiles.removeAll(projectiles.stream()
                        .filter(projectile -> !projectile.isAlive())
                        .collect(Collectors.toList()));

                asteroids.stream()
                        .filter(asteroid -> !asteroid.isAlive())
                        .forEach(asteroid -> windowPane.getChildren().remove(asteroid.getCharacter()));
                asteroids.removeAll(asteroids.stream()
                        .filter(asteroid -> !asteroid.isAlive())
                        .collect(Collectors.toList()));

            }
        }.start();

        stage.setTitle(
                "J-Asteroids");
        stage.setScene(scene);

        stage.show();

    }

}
