import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter counter = new Counter();
    HealthBar healthBar = new HealthBar();
    boolean bossLevel = false;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    public Counter getCounter()
    {
        return counter;
    }
    public HealthBar getHealthBar()
    {
        return healthBar;
    }
    private void prepare()
    {
        addObject (counter, 80,50);
        addObject (healthBar, 520,50);
        Player player = new Player();
        addObject(player,252,546);
    }
    public void act()
    {
        addEnemy1();
        addEnemy2();
        boss();
   
    }
    public void boss()
    {
        if (counter.score >= 25 && bossLevel == false)
        {
            addObject(new Boss(), 300,0);
            bossLevel = true;
        }
    }
    public void addEnemy1()
    {
        if(Greenfoot.getRandomNumber(60)<1){
            addObject(new Enemy1(),Greenfoot.getRandomNumber(600) ,0);
        }
    }
    public void addEnemy2()
    {
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new Enemy2(),Greenfoot.getRandomNumber(600) ,0);
        }    
    }
}
