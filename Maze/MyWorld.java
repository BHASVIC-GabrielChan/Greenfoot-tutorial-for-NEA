import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int time= 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(345, 350, 1); 
        prepare();
    }
    public void act()
    {
        time++;
        if(time % 360 == 0){
            addObject(new Dolphin(), Greenfoot.getRandomNumber(345), Greenfoot.getRandomNumber(350));
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        WallsHeightLong wallsHeightLong = new WallsHeightLong();
        addObject(wallsHeightLong,286,162);
        wallsHeightLong.setLocation(303,163);
        wallsHeightLong.setLocation(314,197);
        wallsHeightLong.setLocation(316,170);
        WallsHeightLong wallsHeightLong2 = new WallsHeightLong();
        addObject(wallsHeightLong2,29,202);
        wallsHeightLong2.setLocation(16,168);
        WallsHeightMedium wallsHeightMedium = new WallsHeightMedium();
        addObject(wallsHeightMedium,257,213);
        wallsHeightMedium.setLocation(254,263);
        WallsWidthSmall wallsWidthSmall = new WallsWidthSmall();
        addObject(wallsWidthSmall,190,260);
        wallsWidthSmall.setLocation(165,272);
        wallsWidthSmall.setLocation(173,270);
        wallsWidthSmall.setLocation(160,264);
        WallsWidthMedium wallsWidthMedium = new WallsWidthMedium();
        addObject(wallsWidthMedium,137,286);
        wallsWidthMedium.setLocation(67,327);
        WallsHeightMedium wallsHeightMedium2 = new WallsHeightMedium();
        addObject(wallsHeightMedium2,159,312);
        wallsHeightMedium2.setLocation(1055,171);
        WallsHeightSmall wallsHeightSmall = new WallsHeightSmall();
        addObject(wallsHeightSmall,141,311);
        wallsHeightSmall.setLocation(128,301);
        wallsHeightSmall.setLocation(140,308);
        wallsHeightSmall.setLocation(133,313);
        wallsHeightSmall.setLocation(135,292);
        WallsWidthMedium wallsWidthMedium2 = new WallsWidthMedium();
        addObject(wallsWidthMedium2,240,308);
        wallsWidthMedium2.setLocation(249,318);
        wallsHeightMedium.setLocation(251,319);
        WallsHeightSmall wallsHeightSmall2 = new WallsHeightSmall();
        addObject(wallsHeightSmall2,109,188);
        wallsHeightSmall2.setLocation(71,240);
        wallsHeightSmall2.setLocation(70,225);
        WallsHeightMedium wallsHeightMedium3 = new WallsHeightMedium();
        addObject(wallsHeightMedium3,80,192);
        removeObject(wallsHeightMedium3);
        WallsWidthMedium wallsWidthMedium3 = new WallsWidthMedium();
        addObject(wallsWidthMedium3,88,193);
        wallsWidthMedium3.setLocation(161,198);
        wallsWidthMedium3.setLocation(129,203);
        WallsWidthSmall wallsWidthSmall2 = new WallsWidthSmall();
        addObject(wallsWidthSmall2,227,201);
        wallsWidthSmall2.setLocation(211,202);
        wallsHeightMedium.setLocation(252,235);
        wallsHeightMedium.setLocation(252,250);
        WallsHeightSmall wallsHeightSmall3 = new WallsHeightSmall();
        addObject(wallsHeightSmall3,196,163);
        wallsHeightSmall3.setLocation(189,171);
        WallsHeightSmall wallsHeightSmall4 = new WallsHeightSmall();
        addObject(wallsHeightSmall4,139,127);
        wallsHeightSmall4.setLocation(135,104);
        wallsHeightSmall4.setLocation(139,119);
        WallsHeightSmall wallsHeightSmall5 = new WallsHeightSmall();
        addObject(wallsHeightSmall5,289,120);
        wallsHeightSmall5.setLocation(254,117);
        WallsWidthMedium wallsWidthMedium4 = new WallsWidthMedium();
        addObject(wallsWidthMedium4,74,127);
        wallsWidthMedium4.setLocation(77,143);
        WallsWidthMedium wallsWidthMedium5 = new WallsWidthMedium();
        addObject(wallsWidthMedium5,197,97);
        wallsWidthMedium5.setLocation(201,84);
        WallsWidthMedium wallsWidthMedium6 = new WallsWidthMedium();
        addObject(wallsWidthMedium6,100,88);
        wallsWidthMedium6.setLocation(139,78);
        wallsWidthMedium6.setLocation(173,57);
        removeObject(wallsWidthMedium6);
        WallsWidthSmall wallsWidthSmall3 = new WallsWidthSmall();
        addObject(wallsWidthSmall3,122,75);
        wallsWidthSmall3.setLocation(114,82);
        WallsWidthMedium wallsWidthMedium8 = new WallsWidthMedium();
        addObject(wallsWidthMedium8,80,24);
        WallsWidthMedium wallsWidthMedium7 = new WallsWidthMedium();
        addObject(wallsWidthMedium7,256,25);
        wallsWidthMedium7.setLocation(262,29);
        wallsWidthMedium7.setLocation(253,28);
        wallsHeightMedium2.setLocation(338,193);
        removeObject(wallsHeightMedium2);
        Bee bee = new Bee();
        addObject(bee,162,32);
        Honey honey = new Honey();
        addObject(honey,110,105);
        Honey honey2 = new Honey();
        addObject(honey2,292,279);
        Honey honey3 = new Honey();
        addObject(honey3,160,318);
        Honey honey4 = new Honey();
        addObject(honey4,104,292);
        Honey honey5 = new Honey();
        addObject(honey5,228,165);
        Teleporter teleporter = new Teleporter();
        addObject(teleporter,287,249);
        honey2.setLocation(84,164);
        teleporter.setLocation(289,286);
        honey3.setLocation(212,255);
        Teleporter teleporter2 = new Teleporter();
        addObject(teleporter2,163,317);
        Dolphin dolphin = new Dolphin();
        addObject(dolphin,Greenfoot.getRandomNumber(345),Greenfoot.getRandomNumber(350));
        Dolphin dolphin2 = new Dolphin();
        addObject(dolphin2,Greenfoot.getRandomNumber(345),Greenfoot.getRandomNumber(350));
        Seagull seagull = new Seagull();
        addObject(seagull,48,54);
        Seagull seagull2 = new Seagull();
        addObject(seagull2,48,171);
        seagull2.setLocation(1029,345);
        seagull2.moveAround();
        removeObject(seagull2);
        removeObject(teleporter2);
        EndPoint endPoint = new EndPoint();
        addObject(endPoint,158,294);
        endPoint.setLocation(162,284);
        endPoint.setLocation(157,310);
    }
}
