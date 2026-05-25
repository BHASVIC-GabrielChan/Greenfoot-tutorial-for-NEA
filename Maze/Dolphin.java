import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolphin extends Enemy
{
    /**
     * Act - do whatever the Dolphin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Dolphin()
    {getImage().scale(getImage().getWidth()/2 , getImage().getHeight()/2);}

    public void act()
    {
        move(2);
        turn(3);
    }
}
