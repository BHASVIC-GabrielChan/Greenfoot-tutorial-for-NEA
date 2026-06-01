import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Write a description of class Output here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Output extends Actor
{
    String text;
    /**
     * Act - do whatever the Output wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            File file = new File ("thing.txt");
            try (Scanner scanner = new Scanner (file))
            {
                while (scanner.hasNextLine()){
                    text = scanner.nextLine();
                }
                
            }catch (FileNotFoundException e)
            {
                System.out.println ("???? out");
                e.printStackTrace();
            

            }
            getWorld().showText (text+"\n34rf", 300,200);
        }
    }
}
