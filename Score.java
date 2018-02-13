import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    private int score;
    private String name;
    private boolean scoreChanged;
    
    /**
     * Score is the constructor of objects of type Score
     * 
<<<<<<< HEAD
     * @parame there are no parameters
     * @return an object of type Score
     */
    
=======
     * @param There are no parameters
     * @return an object of type Score
     */
>>>>>>> aa2829a8b940e3d18470d4d74813b1388e697f46
    public Score()
    {
        GreenfootImage scoreImage;
        
        score = 0;
        name = "";
        scoreChanged = false;
        
        scoreImage = new GreenfootImage( String.format("Name:%15s %5s Score:%12d", name, "", score), 30, Color.BLACK, Color.WHITE );
        setImage( scoreImage );
<<<<<<< HEAD
        
    }
    
    /**
     * act is the code that is run on each iteration of the act cucle
     * 
     * @parame No parameters
=======
    }
    
    /**
     * act is the code that is run on each iteration of the act cycle
     * 
     * @param There are no parameters
>>>>>>> aa2829a8b940e3d18470d4d74813b1388e697f46
     * @return Nothing is returned
     */
    public void act() 
    {
<<<<<<< HEAD
=======
        // Add your action code here.
>>>>>>> aa2829a8b940e3d18470d4d74813b1388e697f46
        if( scoreChanged == true )
        {
            display();
        }
<<<<<<< HEAD
        
    }    
    
    /**
     * countScore increases the Score
     * 
     * @parame No parameters
=======
    } 
    
    /**
     * countScore increases the score
     * 
     * @param There are no parameters
>>>>>>> aa2829a8b940e3d18470d4d74813b1388e697f46
     * @return Nothing is returned
     */
    public void countScore()
    {
        score++;
        scoreChanged = true;
    }
    
    /**
<<<<<<< HEAD
     * setPlayerName changes the name displayed on the leaderBoard
     * 
     * @parame playerName is the new player's name
=======
     * setPlayerName changes the name displayed on the leaderboard
     * 
     * @param playerName is the new player's name
>>>>>>> aa2829a8b940e3d18470d4d74813b1388e697f46
     * @return Nothing is returned
     */
    public void setPlayerName( String playerName )
    {
        name = playerName;
        scoreChanged = true;
    }
    
<<<<<<< HEAD
     /**
     * getScore gets the current score for thr player
     * 
     * @parame There are no parameters
=======
    /**
     * getScore gets the current score for the player
     * 
     * @param There are no parameters
>>>>>>> aa2829a8b940e3d18470d4d74813b1388e697f46
     * @return an integer representing the player's score
     */
    public int getScore()
    {
        return score;
    }
    
    /**
     * display displays the Scoreboard's image
     * 
<<<<<<< HEAD
     * @parame no parameter
     * @return no returned
     */
    private void display()
    {
        GreenfootImage newImage= new GreenfootImage( String.format("Name:%15s %5s Score:%12d", name, "", score), 30, Color.BLACK, Color.WHITE);
=======
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void display()
    {
        GreenfootImage newImage = new GreenfootImage( String.format("Name:%15s %5s Score:%12d", name, "", score), 30, Color.BLACK, Color.WHITE );
>>>>>>> aa2829a8b940e3d18470d4d74813b1388e697f46
        setImage( newImage );
        scoreChanged = false;
    }
    
<<<<<<< HEAD
=======
    
    
    
    
    
    
    
    
    
>>>>>>> aa2829a8b940e3d18470d4d74813b1388e697f46
}
