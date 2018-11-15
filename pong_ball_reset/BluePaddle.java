import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BluePaddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BluePaddle extends Actor
{
    int speed = 7;
    /**
     * Act - do whatever the BluePaddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */    
     public void act() 
    {
        // Add your action code here.
        checkKeys();
    }    
    public void moveup()
    {
        setLocation ( getX(), getY() - speed);
    }
    public void movedown()
    {
        setLocation ( getX(), getY() + speed);
    }
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("W"))
        {
            moveup();
        }
        if (Greenfoot.isKeyDown("s"))
        {
            movedown();
        }
    }
}
