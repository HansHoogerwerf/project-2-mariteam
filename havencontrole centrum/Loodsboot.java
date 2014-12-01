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
        moveTheBoat();

    
    }

    private double ySpeed;
    private double xSpeed;


    
    public void moveTheBoat(){
        setLocation(getExactX()+xSpeed,getExactY()+ySpeed);

    }

    private void processKeys() 
    {
        boatAngle=getRotation();
        
        if(Greenfoot.isKeyDown("w")||Greenfoot.isKeyDown("up"))
        {
            turnTheBoat();
            xSpeed=leftSpeed;
            ySpeed=upSpeed;
            
            
        }
        else
        {
            if(Greenfoot.isKeyDown("s")||Greenfoot.isKeyDown("down"))
        {
            turnTheBoat();
            xSpeed=leftSpeed*-0.5;
            ySpeed=upSpeed*-0.5;
            
            
        }
        else
        {
            xSpeed=0;
            ySpeed=0;
        }
        }
        
        if(Greenfoot.isKeyDown("d")||Greenfoot.isKeyDown("right"))
        {

            turn(1);
        }
        if(Greenfoot.isKeyDown("a")||Greenfoot.isKeyDown("left"))
        {

            turn(-1);
        }  
    }
    
}

