import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int honey = 0;
    public Bee()
    {getImage().scale(getImage().getWidth()/2 , getImage().getHeight()/2);}
    public void act()
    {
        moveAround();
        checkHoney();
        checkTeleporter();
        youLose();
        youWin();
    }
   public  void moveAround()
   {
       if(Greenfoot.isKeyDown("right")){
           setLocation(getX()+2 ,getY());
           if (checkWall()){
                setLocation(getX()-2 ,getY());
           }
       }

       if(Greenfoot.isKeyDown("left")){
           setLocation(getX()-2 ,getY());
           if (checkWall()){
                setLocation(getX()+2 ,getY());
           }

       }
    
       if(Greenfoot.isKeyDown("up")){
           setLocation(getX() ,getY()-2);
           if (checkWall()){
                setLocation(getX() ,getY()+2);
           }
           
       }

       if(Greenfoot.isKeyDown("down")){
           setLocation(getX() ,getY()+2);
           if (checkWall()){
                setLocation(getX() ,getY()-2);
           }
           
       }
   }
   public boolean checkWall()
   {if(isTouching(Walls.class)){
       return true;
       }
    return false;
    }
    public void checkHoney()
   {if(getOneIntersectingObject(Honey.class)!=null){
       getWorld().removeObject (getOneIntersectingObject(Honey.class));
       honey++;
   }
    }
    public void checkTeleporter()
   {if(getOneIntersectingObject(Teleporter.class)!=null){
       setLocation(162,32);
   }
    }
    public boolean checkEnemy()
   {if(isTouching(Enemy.class)){
       return true;
       }
    return false;
    }
    public void youLose(){
        if (checkEnemy())
        {getWorld().addObject(new YouLose(), 172, 175);Greenfoot.stop();}
    }
    public void youWin(){
        if(isTouching(EndPoint.class) && honey == 5){
            getWorld().addObject(new YouWin(), 172, 175);Greenfoot.stop();
        }
    }
}
