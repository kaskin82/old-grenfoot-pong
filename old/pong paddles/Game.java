import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{

    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {
        this (new RedPaddle());
    }
   public Game(RedPaddle bluepaddle)
   {
       this (new BluePaddle());
       addObject (bluepaddle, 550, 200);
    }
   
       
    
  
    public Game(BluePaddle redpaddle)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject (redpaddle, 50, 200);
        
        
        
        
        
       
        
        
    }
    
}