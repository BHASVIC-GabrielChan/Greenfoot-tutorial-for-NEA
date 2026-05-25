import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    int speed = 4;
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
        moveAround(); 
        hitEnemy();
        youWin();
    }
    
    public void moveAround(){
        if(Greenfoot.isKeyDown("space"))
        {speed= speed * 2;}
        if(Greenfoot.isKeyDown("v"))
        {speed= 1;}
        if(Greenfoot.isKeyDown("right"))
        {turn(2);}
        if(Greenfoot.isKeyDown("left"))
        {turn(-2);}
        else{
        speed=1;}
    }
    public void hitEnemy(){
        if(isTouching(Bee.class))
        {
            getWorld().addObject(new YouLose(), 300, 200);
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
    public void youWin(){
        if(getY() >= 399){
            getWorld().addObject(new YouWin(), 300, 200);
            Greenfoot.stop();
        }
    }
}
