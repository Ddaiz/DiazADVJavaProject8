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
public class Painting extends StoreItem 
{
    
    // Member Variables
    protected static int paintingCount;
    private int height;
    private int width;
    private String media;
    
    // Constructor
    public Painting(String title, String author, Date dateAquired, int purchasePrice, 
                    int askingPrice, int height, int width, String media) 
    {
        // Super class inheritance with counters that increment when a new object is made
        super(title, author, dateAquired, purchasePrice, askingPrice);
        this.height = height;
        this.width = width;
        this.media = media;
        paintingCount++;
        itemCount++;
    }
    // Empty constructor with no parameters to increase movie and item counters for empty fields    
    public Painting()
    {
        paintingCount++;
        itemCount++;
    }

    // Setters for the dimensions of the painting (height, width) along with type of
    // media like the type of paint used.
    public void setHeight(int height)
    {
        this.height = height;
    }
    
    public void setWidth(int width)
    {
        this.width = width;
    }
    
    public void setMedia(String media)
    {
        this.media = media;
    }

    // Override toString() to make it useable for all classes
    @Override
    public String toString()
    {
        return String.format("Painting:   "+ super.toString() + this.height 
                + "\t" + this.width + "\t" + this.media);
    }
    
    // This method will delete the previous entered painting
    public void deletePainting()
    {
        // If itemCount is equal to 0
        if(itemCount == 0)
        {
            // Set paintingCount to 0 since there are no paintings yet.
            paintingCount = 0;
        }
        
        // If paintingCount is greater than 0, decrement painting and item counters.
        if(paintingCount > 0)
        {
            paintingCount--;
            itemCount--;
        }
    }
    
    // Get method for painting counter
    public int getPaintingCount()
    {
        return paintingCount;
    }
}
