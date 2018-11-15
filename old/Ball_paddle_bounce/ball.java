import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author Andrew george
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
        topbounce();
        bottombounce();
        reset();
    }    
    public void reset()
    {
        if (scoreright()){
            setLocation(300,200);
            setRotation(Greenfoot.getRandomNumber(2)* 180);
            bspeed = 3;
            Greenfoot.delay(60);
            
    }
    else if (scoreleft()){
        setLocation( 300, 200);
        setRotation(Greenfoot.getRandomNumber(2)*180);
        bspeed = 3;
        Greenfoot.delay(60);
    }
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
      public void topbounce()
      /*
       * the ball bounces off the top of the screen
       */
      {
          if(getY() < getWorld().getHeight()-390)
          {
              setRotation((getRotation() * -1));
        }
    }
    public void bottombounce()
    /** the ball bounces off the bottom of the screen
     * 
     */
    {
          if(getY() > getWorld().getHeight()-10)
          {
              setRotation((getRotation() * -1));
            }
        }
        public boolean scoreright()
        {
            if( getX() > 570)
            {
               return true;
        }
        else
        {
            return false;
        }
    }
    public boolean scoreleft()
    {
        if( getX() < 30)
        {
            return true;
        }
        else
        {
            return false;
        }
}
}
        

