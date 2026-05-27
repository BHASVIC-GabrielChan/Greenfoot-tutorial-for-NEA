import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Enemy
{
    int health = 10;
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Boss()
    {
        setRotation(90);
    }
    public void act()
    {
        moveEnemy();
        despawn();
    }
            public void hitByProjectile()
    {
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if (projectile != null)
        {
            getWorld().removeObject(projectile);
            health--;
        }
        if (health == 0)
        {
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            Counter counter = myWorld.getCounter();
            counter.addScore();
            counter.addScore();
            getWorld().removeObject(this);
        }
        
    }
    public void despawn()
    {
        if(this.getY() == 599)
        {
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            HealthBar healthBar = myWorld.getHealthBar();
            for (int i = 0; i < 11; i++){
                healthBar.loseHealth();
            }
            getWorld().removeObject(this);
        }
        else{
            hitByProjectile();
        }
    }
}
