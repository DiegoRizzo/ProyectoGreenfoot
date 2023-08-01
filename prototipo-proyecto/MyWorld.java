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
    GreenfootSound myMusic = new GreenfootSound("bgm.mp3");
    int nivel = Greenfoot.getRandomNumber(5);
    
    
    public MyWorld()
    {    
        // Create a new world with 1000x650 cells with a cell size of 1x1 pixels.
        super(1000, 650, 1); 
        setPaintOrder(Character.class, MERINDO.class, NUM1.class, NUM2.class, NUM3.class);
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
        
        if(nivel == 0) {
            NUM8 num8 = new NUM8();
            addObject(num8,640,550);
        
            NUM7 num7 = new NUM7();
            addObject(num7,360,550);
        
            NUM6 num6 = new NUM6();
            addObject(num6,110,550);
        
            PREGUNTA1 pregunta1 = new PREGUNTA1();
            addObject(pregunta1,500,70);
        } else if (nivel == 1) {
            NUM4 num4 = new NUM4();
            addObject(num4,360,550);
        
            NUM3 num3 = new NUM3();
            addObject(num3,640,550);
        
            NUM2 num2 = new NUM2();
            addObject(num2,110,550);
        
            PREGUNTA2 pregunta2 = new PREGUNTA2();
            addObject(pregunta2,500,70);
        } else if (nivel == 2) {
            NUM7 num7 = new NUM7();
            addObject(num7,360,550);
        
            NUM8 num8 = new NUM8();
            addObject(num8,640,550);
        
            NUM9 num9 = new NUM9();
            addObject(num9,110,550);
        
            PREGUNTA3 pregunta3 = new PREGUNTA3();
            addObject(pregunta3,500,70);
        } else if (nivel == 3) {
            NUM4 num4 = new NUM4();
            addObject(num4,360,550);
        
            NUM5 num5 = new NUM5();
            addObject(num5,640,550);
        
            NUM6 num6 = new NUM6();
            addObject(num6,110,550);
        
            PREGUNTA4 pregunta4 = new PREGUNTA4();
            addObject(pregunta4,500,70);
        } else if (nivel == 4) {
            NUM7 num7 = new NUM7();
            addObject(num7,360,550);
        
            NUM5 num5 = new NUM5();
            addObject(num5,640,550);
        
            NUM6 num6 = new NUM6();
            addObject(num6,110,550);
        
            PREGUNTA5 pregunta5 = new PREGUNTA5();
            addObject(pregunta5,500,70);
        }
        if (Greenfoot.isKeyDown("space")) {
            nivel = Greenfoot.getRandomNumber(5);
        }
    }
    public void act() {
        myMusic.play();
    }
}
