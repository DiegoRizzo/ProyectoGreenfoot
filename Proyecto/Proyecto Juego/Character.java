import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        answer();
    }
    
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5, getY());
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5, getY());
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-5);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+5);
        }
    }
    
    public void answer()
    {
        Actor rendirse;
        rendirse = getOneObjectAtOffset(0, 0, MERINDO.class);
        if (rendirse != null && Greenfoot.isKeyDown("space"))
        {
            Greenfoot.playSound("wrong.mp3");
        }
        
        Actor incorrecto1;
        incorrecto1 = getOneObjectAtOffset(0, 0, NUM1.class);
        if (incorrecto1 != null && Greenfoot.isKeyDown("space"))
        {
            Greenfoot.playSound("wrong.mp3");
        }
        
        Actor incorrecto2;
        incorrecto2 = getOneObjectAtOffset(0, 0, NUM3.class);
        if (incorrecto2 != null && Greenfoot.isKeyDown("space"))
        {
            Greenfoot.playSound("wrong.mp3");
        }
        
        Actor correcto;
        correcto = getOneObjectAtOffset(0, 0, NUM2.class);
        if (correcto != null && Greenfoot.isKeyDown("space"))
        {
            Greenfoot.playSound("correct.mp3");
        }
        
    }
}
