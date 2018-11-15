import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    int bspeed = 3;
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(bspeed);
        direction();
    }    
    public boolean findRpaddle()
    {
        Actor rp= getOneIntersectingObject(RedPaddle.class);
        if (rp != null)
        {
            
            return true;
            
        }
        else
        {
            return false;
        }
    }
    public boolean findBpaddle()
    {
        Actor bp= getOneIntersectingObject(BluePaddle.class);
        if (bp != null)
        {
            
            return true;
            
        }
        else
        {
            return false;
        }
    }
    public void direction()
    {
        if(findRpaddle())
        {
            setRotation(getRotation() + 180 + (Greenfoot.getRandomNumber(90)-45));
            bspeed++;
        }
        else if(findBpaddle())
        {
            setRotation(getRotation() + 180 + (Greenfoot.getRandomNumber(90)-45));
            bspeed++;
        }
    }
      
}
