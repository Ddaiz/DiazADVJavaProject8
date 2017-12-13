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
public class Movie extends StoreItem 
{
    
    // Members variables
    protected static int movieCount;
    private String[] actors;
    private String[] actresses;
    private String director;
    
    
    // Constructor
    public Movie(String title, String author, Date dateAquired, 
                int purchasePrice, int askingPrice, String actor1, String actor2,
                String actress1, String actress2, String director) 
    {
        // Super class inheritance with counters that increment when a new object is made
        super(title, author, dateAquired, purchasePrice, askingPrice);
        
        // Set defaults for actors, actresses, directors and increase movie and item counters
        actors = new String[2];
        actresses = new String[2];
        setActors(actor1, actor2);
        setActresses(actress1, actress2);
        this.director = director;
        movieCount++;
        itemCount++;
    }
    
    // Empty constructor with no parameters to increase movie and item counters for empty fields
    public Movie()
    {
        movieCount++;
        itemCount++;
    }
    
    // Get and set methods for Actors and Actress so they are added to their respective arrays
    // along with a get method for the movie counter.
    public String getActors()
    {
        return this.actors.toString();
    }

    public void setActors(String actor1, String actor2){
        actors[0] = actor1;
        actors[1] = actor2;
    }
    
    public String getActresses()
    {
        return this.getActresses();
    }    
    
    public void setActresses(String actress1, String actress2)
    {
        actresses[0] = actress1;
        actresses[1] = actress2;
    }

    public int getMovieCount()
    {
        return movieCount;
    }
    
    // Overrided toString method to properly output the corresponding names of the
    // actors, actress, and directors
    @Override
    public String toString()
    {
        return String.format("Movie:   " + super.toString() +  this.actors[0].toString() + "\t" + 
                this.actors[1].toString() + "\t" + this.actresses[0].toString() + "\t" + 
                this.actresses[1].toString() + "\t" + this.director); 
    }

    // deleteMovie method
    public void deleteMovie()
    {
        // If itemCount == 0, the movie counter is set to 0 since there are no movies.
        if(itemCount == 0){
            movieCount = 0;
        }
        
        // If the movie count is greater than 0, decrement to delete the last created movie
        if(movieCount > 0)
        {
            movieCount--;
            itemCount--;
        }
    }
}
