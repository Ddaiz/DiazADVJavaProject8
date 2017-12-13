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
public class StoreItem 
{
    // Member variables
    protected static int itemCount = 0;
    private String title;
    private String author;
    private Date dateAquired;
    private int askingPrice;
    private int purchasePrice;
    
    // Constructor
    public StoreItem(String title, String author, Date dateAquired, 
                     int purchasePrice,int askingPrice)
    {
        // Set values to the member variables
        this.title = title;
        this.author = author;
        this.dateAquired = dateAquired;
        this.purchasePrice = purchasePrice;
        this.askingPrice = askingPrice;
        
    }
    
    // Empty constructor for all inherited classes to use
    public StoreItem()
    {
        
    }
   
    // Get and set methods for title, author, date, asking price, purchasing price, and
    // item counter
    public String getTitle()
    {
        return this.title; 
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getAuthor()
    {
        return this.author;
    }
    
    public void setAuthor(String author)
    {
        this.author = author;
    }
        
    public Date getDate()
    {
        return this.dateAquired;
    }
    
    public void setDate(Date dateAquired)
    {
        this.dateAquired = dateAquired;
    }
    
    public int getPurchasePrice()
    {
        return this.purchasePrice;
    }
    
    public void setPurchasePrice(int purchasePrice)
    {
        this.purchasePrice = purchasePrice;
    }
    
    public int getAskingPrice()
    {
        return this.askingPrice;
    }
    
    public void setAskingPrice(int askingPrice)
    {
        this.askingPrice = askingPrice;
    }
        
    public int getCount()
    {
        return itemCount;
    }
    
    public void setCount(int num)
    {
        itemCount = num;
    }
    

    
    // Overrided toString method so that it can be used by all inherited classes
    @Override
    public String toString(){
        return String.format(getTitle() + "\t" + getAuthor() + "\t" + getDate() + "\t" +
                             getAskingPrice() + "\t" + getPurchasePrice() + "\t");
    }
}
