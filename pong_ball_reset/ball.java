import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author Andrew george
 * @version v4 resetting the ball
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
    /**
     * this code is designed to reset the ball should it hit either side
     * it also has 2 seprate scripts should a scoring system be implemented
     */
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
    /**
     * this code detects if the ball and the red paddle are touching.
     */
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
    /**
     * this code is desifgned to detect if the ball intersect the blue paddle.
     * this is sued for the sake of rotatingf the ball and increasing the speed.
     */
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
    /** 
     * this code is what makes th e ball change directions when the different paddles are touched
     * it also increases the balls speed each time
     * this code was changed to fix a bug where the ball would repeatedly touch one paddle
     */
    {
        if(findRpaddle())
        {
            setRotation(getRotation() + 180 + (Greenfoot.getRandomNumber(90)-45));
            setLocation(getX()-5,getY());
            bspeed = (bspeed + 1);
        }
        else if(findBpaddle())
        {
            setRotation(getRotation() + 180 + (Greenfoot.getRandomNumber(90)-45));
            setLocation(getX()+5,getY());
            bspeed = (bspeed + 1);
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
        
        /*
         * this section is dedicated to detecting ball psition for the sake of resetting
         */
        
        public boolean scoreright()
        /**
         * this script detects when the ball gets faar enough right on the screen.
         * this is called upon by the ball reset code
         */
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
    /**
     *  detect if the ball goes far enoguh left
     *  simialr to scoreright
     *  also called upon by the reset script
     */
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
        

