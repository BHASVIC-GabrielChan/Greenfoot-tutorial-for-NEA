import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    boolean canFire = true;
    public Player()
    {
        setRotation(270);
    }
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        fireProjectile();
    }
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("right")){
            setLocation(this.getX()+5,this.getY());
        }
        if (Greenfoot.isKeyDown("left")){
            setLocation(this.getX()-5,this.getY());
        }
    }
    public void fireProjectile()
    {
        if (Greenfoot.isKeyDown("space")&& canFire == true){
            getWorld().addObject(new Projectile(), getX(), getY()-30);
            canFire = false;
        }
        else if (!Greenfoot.isKeyDown("space"))
        {
            canFire = true;
        }
    }
}
