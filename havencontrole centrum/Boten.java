import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boten here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Boten extends Actor
{
    private double exactX;
    private double exactY;

    /**
     * Move forward by the specified distance.
     * (Overrides the method in Actor).
     */
    @Override
    public void move(int distance)
    {
        move((double)distance);
    }

    /**
     * Move forward by the specified exact distance.
     */
    public void move(double distance)
    {
        double radians = Math.toRadians(getRotation());
        double dx = Math.cos(radians) * distance;
        double dy = Math.sin(radians) * distance;
        setLocation(exactX + dx, exactY + dy);
    }

    /**
     * Set the location using exact coordinates.
     */
    public void setLocation(double x, double y) 
    {
        exactX = x;
        exactY = y;
        super.setLocation((int) (x + 0.5), (int) (y + 0.5));
    }

    /**
     * Set the location using integer coordinates.
     * (Overrides the method in Actor.)
     */
    @Override
    public void setLocation(int x, int y) 
    {
        exactX = x;
        exactY = y;
        super.setLocation(x, y);
    }

    /**
     * Return the exact x-coordinate (as a double).
     */
    public double getExactX() 
    {
        return exactX;
    }

    /**
     * Return the exact y-coordinate (as a double).
     */
    public double getExactY() 
    {
        return exactY;
    }
    public int boatAngle;
    public double leftSpeed = 0;
    public double rightSpeed = 0;
    public double upSpeed = 0;
    public double downSpeed = 0;
    public void turnTheBoat()
    {
        leftSpeed=-1*Math.cos(Math.toRadians(boatAngle));
        upSpeed=-1*Math.sin(Math.toRadians(boatAngle));
        /**
        if(boatAngle>= -1&& boatAngle<=9){  leftSpeed =-1 ;
        upSpeed=0;
        }else{
        if(boatAngle>= 9&& boatAngle<=18){  leftSpeed =-0.9 ;
        upSpeed=-0.1;
        }else{
        if(boatAngle>= 18&& boatAngle<=27){  leftSpeed =-0.8 ;
        upSpeed=-0.2;
        }else{
        if(boatAngle>= 27&& boatAngle<=36){  leftSpeed =-0.7 ;
        upSpeed=-0.3;
        }else{
        if(boatAngle>= 36&& boatAngle<=45){  leftSpeed =-0.6 ;
        upSpeed=-0.4;
        }else{
        if(boatAngle>= 45&& boatAngle<=54){  leftSpeed =-0.5 ;
        upSpeed=-0.5;
        }else{
        if(boatAngle>= 54&& boatAngle<=63){  leftSpeed =-0.4 ;
        upSpeed=-0.6;
        }else{
        if(boatAngle>= 63&& boatAngle<=72){  leftSpeed =-0.3 ;
        upSpeed=-0.7;
        }else{
        if(boatAngle>= 72&& boatAngle<=81){  leftSpeed =-0.2 ;
        upSpeed=-0.8;
        }else{
        if(boatAngle>= 81&& boatAngle<=90){  leftSpeed =-0.1 ;
        upSpeed=-0.9;
        }else{
        if(boatAngle>= 90&& boatAngle<=99){  leftSpeed =0 ;
        upSpeed=-1;
        }else{
        if(boatAngle>= 99&& boatAngle<=108){  leftSpeed =0.1 ;
        upSpeed=-0.9;
        }else{
        if(boatAngle>= 108&& boatAngle<=117){  leftSpeed =0.2 ;
        upSpeed=-0.8;
        }else{
        if(boatAngle>= 117&& boatAngle<=126){  leftSpeed =0.3 ;
        upSpeed=-0.7;
        }else{
        if(boatAngle>= 126&& boatAngle<=135){  leftSpeed =0.4 ;
        upSpeed=-0.6;
        }else{
        if(boatAngle>= 135&& boatAngle<=144){  leftSpeed =0.5 ;
        upSpeed=-0.5;
        }else{
        if(boatAngle>= 144&& boatAngle<=153){  leftSpeed =0.6 ;
        upSpeed=-0.4;
        }else{
        if(boatAngle>= 153&& boatAngle<=162){  leftSpeed =0.7 ;
        upSpeed=-0.3;
        }else{
        if(boatAngle>=162&& boatAngle<=171){  leftSpeed =0.8 ;
        upSpeed=-0.2;
        }else{
        if(boatAngle>= 171&& boatAngle<=180){  leftSpeed =0.9 ;
        upSpeed=-0.1;
        }else{
        if( boatAngle>= 180&& boatAngle<=189)
        {        leftSpeed =1 ;
        upSpeed=0;
        }else{
        if(boatAngle>= 189&& boatAngle<=198){leftSpeed =0.9 ;
        upSpeed=0.1;
        }else{
        if(boatAngle>= 198&& boatAngle<=207){leftSpeed =0.8 ;
        upSpeed=0.2;
        }else{
        if(boatAngle>= 207&& boatAngle<=216){leftSpeed =0.7 ;
        upSpeed=0.3;
        }else{
        if(boatAngle>=216&& boatAngle<=225){  leftSpeed =0.6 ;
        upSpeed=0.4;
        }else{
        if(boatAngle>= 225&& boatAngle<=234){leftSpeed =0.5 ;
        upSpeed=0.5;
        }else{
        if(boatAngle>= 234&& boatAngle<=243){  leftSpeed =0.4 ;
        upSpeed=0.6;
        }else{
        if(boatAngle>= 243&& boatAngle<=252){leftSpeed =0.3 ;
        upSpeed=0.7;
        }else{
        if(boatAngle>= 252&& boatAngle<=261){  leftSpeed =0.2 ;
        upSpeed=0.8;
        }else{
        if(boatAngle>= 261&& boatAngle<=270){leftSpeed =0.1 ;
        upSpeed=0.1;
        }else{
        if(boatAngle>= 270&& boatAngle<=279){  leftSpeed =0;
        upSpeed=1;
        }else{
        if(boatAngle>= 279&& boatAngle<=288){  leftSpeed =-0.1 ;
        upSpeed=0.9;
        }else{
        if(boatAngle>= 288&& boatAngle<=297){  leftSpeed =-0.2 ;
        upSpeed=0.8;
        }else{
        if(boatAngle>= 297&& boatAngle<=306){  leftSpeed =-0.3 ;
        upSpeed=0.7;
        }else{
        if(boatAngle>= 306&& boatAngle<=315){  leftSpeed =-0.4 ;
        upSpeed=0.6;
        }else{
        if(boatAngle>= 315&& boatAngle<=326){  leftSpeed =-0.5 ;
        upSpeed=0.5;
        }else{
        if(boatAngle>= 324&& boatAngle<=333){  leftSpeed =-0.6 ;
        upSpeed=0.4;
        }else{
        if(boatAngle>= 333&& boatAngle<=342){  leftSpeed =-0.7 ;
        upSpeed=0.3;
        }else{
        if(boatAngle>= 342&& boatAngle<=351){  leftSpeed =-0.8 ;
        upSpeed=0.2;
        }else{
        if(boatAngle>= 351&& boatAngle<=360){  leftSpeed =-0.9 ;
        upSpeed=0.1;
        }else{

                    
        }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
        }

        }
         */


    }
}
