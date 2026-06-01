import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.FileWriter;
import java.io.IOException;
/**
 * Write a description of class Input here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Input extends Actor
{
    /**
     * Act - do whatever the Input wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            try{
                FileWriter w = new FileWriter ("thing.txt", true);
                w.write("a");
                w.close();
                System.out.println("input");
                
            } catch (IOException e)
            {
                System.out.println("???");
                e.printStackTrace();
            }
        }
    }
}
