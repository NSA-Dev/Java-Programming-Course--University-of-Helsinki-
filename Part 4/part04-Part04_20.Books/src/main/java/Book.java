/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class Book {

    String title;
    int pageNum, publicationYear;

    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.pageNum = numberOfPages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return (this.title);
    }

    public String toString() {

        return (this.title + ", " + this.pageNum
                + " pages, " + this.publicationYear);

    }

}
