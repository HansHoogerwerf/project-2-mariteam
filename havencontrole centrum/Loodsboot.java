import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Loodsboot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Loodsboot extends Boten
{
    /**
     * Act - do whatever the Loodsboot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        processKeys();
        move();
    }
    
    public int upSpeed = 0;
    public int downSpeed = 0;
    public int leftSpeed = 0;
    public int rightSpeed = 0;
    public void move(){
    setLocation(getX() + leftSpeed+rightSpeed, getY() + upSpeed+downSpeed);
    }
    private void processKeys() 
    {
        
        if(Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("d")) 
        {
            
            move(1);
            
        }
        else{
            move(0);
        }
        if(Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("a")) 
        {
            
            move(-1);
            
        }
        else{
            move(0);
        }
        if(Greenfoot.isKeyDown("down")||Greenfoot.isKeyDown("s")) 
        {
           
            turn(-1);
            
        }
        if(Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("w")) 
        {
           
            turn(1);
            
        }
        
        if(Greenfoot.isKeyDown("space"))
        {
            
            turn(-1);
            
        }

    }
}
