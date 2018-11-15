import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P2 extends Actor
{
     private static final int speed = 7;
    /**
     * Act - do whatever the P2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    public void moveup()
    {
        setLocation ( getX(), getY() - speed);
    }
    public void movedown()
    {
        setLocation ( getX(), getY() + speed);
    }
   
}
