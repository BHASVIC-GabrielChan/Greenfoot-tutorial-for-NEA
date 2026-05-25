import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ball ball = new Ball();
        addObject(ball,545,159);
        ball.setLocation(261,188);
        Bee bee = new Bee();
        addObject(bee,116,69);
        Bee bee2 = new Bee();
        addObject(bee2,178,218);
        Bee bee3 = new Bee();
        addObject(bee3,310,335);
        YouWin youWin = new YouWin();
        addObject(youWin,297,180);
        removeObject(youWin);
        bee2.setLocation(147,276);
        bee.setLocation(102,228);
        ball.setLocation(180,29);
        bee.setLocation(107,172);
        bee2.setLocation(173,217);
        bee3.setLocation(111,252);
        Bee bee4 = new Bee();
        addObject(bee4,240,273);
        Bee bee5 = new Bee();
        addObject(bee5,48,347);
        Bee bee6 = new Bee();
        addObject(bee6,126,315);
        Bee bee7 = new Bee();
        addObject(bee7,348,185);
        Bee bee8 = new Bee();
        addObject(bee8,341,244);
        Bee bee9 = new Bee();
        addObject(bee9,353,359);
        Bee bee10 = new Bee();
        addObject(bee10,498,261);
        Bee bee11 = new Bee();
        addObject(bee11,527,198);
        Bee bee12 = new Bee();
        addObject(bee12,429,225);
        Bee bee13 = new Bee();
        addObject(bee13,495,356);
    }
}
