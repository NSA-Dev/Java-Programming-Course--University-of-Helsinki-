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
    private String bookName;
    private int targetAge; 
    
    public Book(String name, int age) {
        bookName = name;
        targetAge = age; 
    }
    
    public String getBookName() {
        return bookName;
    }
    
    public int getTargetAge() {
        return targetAge; 
    }
    
    public String toString() {
        return (bookName 
                + "(recommended for "
                + targetAge 
                +" year-olds or older)");
    }
}
