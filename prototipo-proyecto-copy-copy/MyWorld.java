import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootSound;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    GreenfootSound myMusic = new GreenfootSound("kgde.mp3");
    
    public MyWorld()
    {    
        // Create a new world with 1000x650 cells with a cell size of 1x1 pixels.
        super(1000, 650, 1); 
        setPaintOrder(Character.class, MERINDO.class, OPCION1.class, OPCION2.class, R3.class);
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Character character = new Character();
        addObject(character,519,273);
        
        MERINDO merindo = new MERINDO();
        addObject(merindo,900,550);
        
        OPCION1 opcion1 = new OPCION1();
        addObject(opcion1,620,550);
        
        OPCION2 opcion2 = new OPCION2();
        addObject(opcion2,350,550);
        
        R3 r3 = new R3();
        addObject(r3,120,550);
        
        TEXTO texto = new TEXTO();
        addObject(texto,519,70);
        

        
    }
    public void act() {
        myMusic.play();
    }
}
