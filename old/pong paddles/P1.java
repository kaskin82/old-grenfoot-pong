import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P1 extends Actor
{
    private static final int speed = 7;
    /**
     * Act - do whatever the P1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    public void moveUP()
    {
        setLocation (getX(),getY() - speed);
    }
    public void moveDOWN()
    {
        setLocation (getX(),getY() + speed);
    }
}
