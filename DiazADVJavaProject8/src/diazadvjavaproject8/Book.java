/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diazadvjavaproject8;

import java.util.Date;
/**
 *
 * @author Dave
 */
public class Book extends StoreItem 
{
    // Member variables
    protected static int bookCount;
    private String genre;

    // Constructor
    public Book(String title, String author, Date dateAquired, 
                int purchasePrice, int askingPrice, String genre) 
    {
        
        // Super class inheritance with counters that increment when a new object is made
        super(title, author, dateAquired, purchasePrice, askingPrice);
        this.genre = genre;
        bookCount++;
        itemCount++;
    }
    
    // Empty constructor with no parameters to increase movie and item counters for empty fields
    public Book()
    {
        bookCount++;
        itemCount++;
    }

    // Get and set methods for genre.
    public String getGenre()
    {
        return this.genre;
    }
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
    


    public void deleteBook(){
        // if itemcount is 0 then there are no other items
        if (itemCount == 0){
            // set to zero
            bookCount = 0;
        }
        
        // decrement
        if(bookCount > 0){
            bookCount--;
            itemCount--;
        }
    }
    
    // Get method for book counter
    public int getBookCount()
    {
        return bookCount;
    }
    
    // Overrided toString method that is useable for the class
    @Override
    public String toString()
    {
        return String.format("Book:   " + super.toString() + getGenre()); 
    }
    
}
