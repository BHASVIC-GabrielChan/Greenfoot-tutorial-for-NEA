import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seagull here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Seagull extends Enemy
{
    int speed = 2;
    public Seagull()
    {getImage().scale(getImage().getWidth()/2 , getImage().getHeight()/2);}
    /**
     * Act - do whatever the Seagull wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
    }
    public void moveAround()
    {
        setLocation(getX()+speed,getY());
        if(isTouching(Walls.class))
        {speed = -speed;}
    }
}
