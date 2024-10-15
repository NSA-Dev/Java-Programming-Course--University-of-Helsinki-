
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nikita
 */
public class Grader {

    private ArrayList<Integer> grades;

    public Grader() {
        grades = new ArrayList<Integer>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        }
    }

    public double average() {
        if (grades.size() > 0) {
            int sum = 0;
            double avg = 0;

            for (int grade : grades) {
                sum += grade;
            }
            avg = sum / grades.size();
            return avg;
        }
        return 0;
    }

    public double averagePassing() {
        if (grades.size() > 0) {
            int sum, count;
            double avg;

            sum = count = 0;
            avg = 0;

            for (int grade : grades) {
                if (grade >= 50) {
                    sum += grade;
                    count++;
                }
            }
            if (count > 0) {
                avg = sum / count;
                return avg;
            }
        }
        return 0;
    }

    public double passPercentage() {
        int passed, total;
        double result;

        passed = 0;
        total = grades.size();

        for (int grade : grades) {
            if (grade >= 50) {
                passed++;
            }
        }

        if (passed > 0) {
            result = 100.0 * passed / total;
            return result;
        }

        return 0.0;
    }

    private void printStars(int value, int amount) {
        System.out.print(value + ":");
        while (amount > 0) {
            System.out.print("*");
            amount--;
        }
    }

    public void printGradeDistribution() {
        int[] gradeArray = new int[6];

        for (int grade : grades) {
            if (grade < 50) {
                gradeArray[0] += 1;
            } else if (grade < 60) {
                gradeArray[1] += 1;
            } else if (grade < 70) {
                gradeArray[2] += 1;
            } else if (grade < 80) {
                gradeArray[3] += 1;
            } else if (grade < 90) {
                gradeArray[4] += 1;
            } else if (grade >= 90) {
                gradeArray[5] += 1;
            }
        }

        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            printStars(i, gradeArray[i]);
            System.out.print("\n");
        }

    }

}
