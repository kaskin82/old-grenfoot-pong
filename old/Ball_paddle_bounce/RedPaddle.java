import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedPaddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedPaddle extends Actor
{
    int speed =7;
    /**
     * Act - do whatever the RedPaddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkKeys();
    }  
    public void moveUP()
    {
        setLocation (getX(),getY() - speed);
    }
    public void moveDOWN()
    {
        setLocation (getX(),getY() + speed);
    }
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("UP"))
        {
            moveUP();
        }
        if (Greenfoot.isKeyDown("down"))
        {
            moveDOWN();
        }
    }
}
