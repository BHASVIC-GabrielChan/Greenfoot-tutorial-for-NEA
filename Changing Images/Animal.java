import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal extends Actor
{
    int imageNumber;
    int speed;
    public Animal (int direction, int speed, int weight)
    {
        setRotation(direction);
        imageNumber = 0;
        this.speed = speed;
    }
    /**
     * Act - do whatever the Animal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
        if (getX() > 598)
        {
            turn(150);
            changeImage();
        }
        if (getX() < 2)
        {
            turn(150);
            changeImage();
        }  
        if (getY() > 398)
        {
            turn(150);
            changeImage();
        }
        if (getY() < 3)
        {
            turn(150);
            changeImage();
        }          
    }
    public void changeImage()
    {
        imageNumber++;
        if (imageNumber == 1)
        {
        setImage("dolphin.png");
        }
        if (imageNumber == 2)
        {
        setImage("ant3.png");
        }
        if (imageNumber == 3)
        {
        setImage("bee.png");
        }
        if (imageNumber == 4)
        {
        setImage("fish1.png");
        }
        if (imageNumber == 5)
        {
            imageNumber = 0;
            setImage("alligator.png");
        }
    }
}
