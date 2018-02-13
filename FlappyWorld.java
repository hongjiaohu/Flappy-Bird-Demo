import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.List;
<<<<<<< HEAD
=======

>>>>>>> aa2829a8b940e3d18470d4d74813b1388e697f46
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyWorld extends World
{
<<<<<<< HEAD
=======
    
>>>>>>> aa2829a8b940e3d18470d4d74813b1388e697f46
    private int pipeCounter;
    private int flappyCounter;
    
    private String playerName;
    
    private boolean gameStart = false;
    
    private Score scoreBoard;
    
    private String[] leaderNames;
    private int[] leaderScores;
    
    /**
     * FlappyWorld is the constructor for objects of type FlappyWorld
     * 
     * @param There are no parameters
     * @return An instance of type FlappyWorld
     */
    public FlappyWorld()
    {
        
        super(600, 400, 1);
        
<<<<<<< HEAD
        setPaintOrder( Score.class, GameOver.class, BottomPipe.class, TopPipe.class, FlappyBird.class, GameOver.class);
=======
        setPaintOrder( Score.class, GameOver.class, BottomPipe.class, TopPipe.class, FlappyBird.class);
>>>>>>> aa2829a8b940e3d18470d4d74813b1388e697f46
        
        populateWorld();
        
        gameStart = false;
        
        leaderNames = new String[10];
        leaderScores = new int[10];
        
        for( int i = 0; i < leaderScores.length; i++ )
        {
<<<<<<< HEAD
            leaderScores[i] = -1;
        }
       
        //This starts your scenario when a new FlappyWorld is create
        Greenfoot.start();
    }
    
    /**
     * populateWorld is going to add objects to our world to prepare the game
     *
     * @parame No parameters 
     * @return Nothing is returned
     */
    private void populateWorld()
    {
        scoreBoard = new Score();
        
        addObject( new FlappyBird(), 50, getHeight()/2 );
        addObject( new Ground(), getWidth()/2, 375 );
        addObject( scoreBoard, getWidth()/2, getHeight() - 20 );
        
        pipeCounter = -100;
        flappyCounter = -10;
        
        
        
    }
    
    /**
     * act is the code that is run on each iteration of the act cucle
     * 
     * @parame No parameters
     * @return Nothing is returned
     */
    public void act()
    {
        final int FIRST_PIPE = 290;
        
        if( gameStart == false )
        {
            playerName = JOptionPane.showInputDialog( null, "Please enter your name:", "Player Name", JOptionPane. QUESTION_MESSAGE);
            scoreBoard.setPlayerName( playerName );
            
            gameStart = true;
            
            showText( "Get Ready To Play!\nUse the Space Bar to Control FlappyBird!", getWidth()/2, getHeight()/2 );
            Greenfoot.delay(100);
            showText( "3", getWidth()/2, getHeight()/2 );
            Greenfoot.delay(60);
            showText( "2", getWidth()/2, getHeight()/2 );
            Greenfoot.delay(60);
            showText( "1", getWidth()/2, getHeight()/2 );
            Greenfoot.delay(60);
            showText( "开始!", getWidth()/2, getHeight()/2 );
            Greenfoot.delay(30);
            showText( "", getWidth()/2, getHeight()/2 );
        }
        else
        {
            if( getObjects( FlappyBird.class ).size() > 0 )
            {
                pipeCounter++;
                
                if( pipeCounter % 100 == 0 )
                {
                    createPipes();
                }
                
                if( pipeCounter >= FIRST_PIPE )
                {
                    if( flappyCounter % 100 == 0 )
                    {
                        scoreBoard.countScore();
                    }
                    
                    flappyCounter++;
                }
            }
            else
            {
                showText( "Press enter for a new game or \n press L for the leaderBoard.", getWidth()/2, 25 );
                checkKeyPress();
            }
        }
    }
    
    /**
     * createPipes adds pipes at the edge of the world and randomizes their height
     * 
     * @parame There are no parameters
     * @return Nothing is returned
     */
    private void createPipes()
    {
        int topPipeHeight = Greenfoot.getRandomNumber( getHeight() /2 );
        
        TopPipe newTop = new TopPipe();
        BottomPipe newBottom = new BottomPipe();
        
        newTop.getImage().scale( newTop.getImage().getWidth(), topPipeHeight );
        newBottom.getImage().scale( newBottom.getImage().getWidth(), topPipeHeight + 200 );
        
        addObject( newTop, getWidth(), 0 );
        addObject( newBottom, getWidth(), getHeight() );
    }
    
    /**
     * checkKeyPress checks whether the user wants to start a new game or diaplay the leaderBoard 
     * 
     * @parame there are no parameters
     * @return Nothing is returned
     */
    private void checkKeyPress()
    {
        if( Greenfoot.isKeyDown( "enter" ) )
        {
            reset();
        }
        
        if ( Greenfoot.isKeyDown( "1" ) )
        {
            displayLeaderBoard();
        }
        
        
    }
    
    /**
     * reset reset gmame and allow user to play a new game
     * 
     * @parame there are no parameters
     * @return Nothing is returned
     */
    private void  reset()
=======
            
            leaderScores[i] = -1;
        }
        
        //This starts your scenario when a new FlappyWorld is created
        Greenfoot.start();
    }
    
    /**
     * populateWorld is going to add objects to our world to prepare the game
     * 
     * @param No parameters
     * @return Nothing is returned
     */
    private void populateWorld()
    {
        scoreBoard = new Score();
        
        addObject( new FlappyBird(), 50, getHeight()/2 );
        addObject( new Ground(), getWidth()/2, 375 );
        addObject( scoreBoard, getWidth()/2, getHeight() - 20 );
        
        pipeCounter = -100;
        flappyCounter = -10;
    }
    
    /**
     * act is the code that is run on each iteration of the act cycle
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act()
    {
        final int FIRST_PIPE = 290;
        
        if( gameStart == false )
        {
            playerName = JOptionPane.showInputDialog( null, "Please enter your name:", "Player Name", JOptionPane.QUESTION_MESSAGE );
            scoreBoard.setPlayerName( playerName );
            
            gameStart = true;
            
            showText( "Get Ready To Play!\nUse the Space Bar to Control Flappy Bird!", getWidth()/2, getHeight()/2 );
            Greenfoot.delay(100);
            showText( "3", getWidth()/2, getHeight()/2 );
            Greenfoot.delay(60);
            showText( "2", getWidth()/2, getHeight()/2 );
            Greenfoot.delay(60);
            showText( "1", getWidth()/2, getHeight()/2 );
            Greenfoot.delay(60);
            showText( "Go!", getWidth()/2, getHeight()/2 );
            Greenfoot.delay(30);
            showText( "", getWidth()/2, getHeight()/2 );
        }
        else
        {
            if( getObjects( FlappyBird.class ).size() > 0 )
            {
                pipeCounter++;
                
                if( pipeCounter % 100 == 0 )
                {
                    createPipes();
                }
                
                if( pipeCounter >= FIRST_PIPE )
                {
                    if( flappyCounter % 100 == 0 )
                    {
                        scoreBoard.countScore();
                    }
                    
                    flappyCounter++;
                }
            }
            else
            {
                showText( "Press enter for a new game or \n press L for the leaderboard.", getWidth()/2, 25 );
                checkKeyPress();
            }
        }
    }
    
    /**
     * createPipes adds pipes at the edge of the world and randomizes their height
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void createPipes()
    {
        int topPipeHeight = Greenfoot.getRandomNumber( getHeight() / 2 );
        
        TopPipe newTop = new TopPipe();
        BottomPipe newBottom = new BottomPipe();
        
        newTop.getImage().scale( newTop.getImage().getWidth(), topPipeHeight );
        newBottom.getImage().scale( newBottom.getImage().getWidth(), topPipeHeight + 200);
        
        addObject( newTop, getWidth(), 0 );
        addObject( newBottom, getWidth(), getHeight() );
    }
    
    /**
     * checkKeyPress checks whether the user wants to start a new game
     * or display the leaderboard
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void checkKeyPress()
    {
        if( Greenfoot.isKeyDown( "enter" ) )
        {
            reset();
        }
        
        if( Greenfoot.isKeyDown( "l" ) )
        {
            displayLeaderBoard();
        }
    }
    
    /**
     * reset resets the game and allows the user to play a new game
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void reset()
>>>>>>> aa2829a8b940e3d18470d4d74813b1388e697f46
    {
        List allObjects = getObjects( null );
        
        removeObjects( allObjects );
        
        populateWorld();
        
        gameStart = false;
        
<<<<<<< HEAD
        showText( "", getWidth() /2 - 25, getHeight() /2 +25 );
        showText( "", getWidth() /2, 25 );
    }
    
    /**
     * displayleaderBoard dispaly the leaderboard pf the game in a 
     * bicely formatted way
     * 
     * @parame there are no parameters
     * @return Nothing is returned
     */
    private void  displayLeaderBoard()
    {
       List allObjects = getObjects( null );
        
       String leaderBoard = String.format( "%15s %5s %5s\n", "Name", "", "Score" );
       
       removeObjects( allObjects );
       
       for( int i = 0; i < leaderScores.length; i++ )
       { 
           leaderBoard += String.format( "%15s %5s %5s\n", leaderNames[i], "", leaderScores[i] );
           
        }
       
       showText( leaderBoard, getWidth() /2 - 25, getHeight() /2 +25 );
    }

    /**
     * updateleaderBoard updates the leaderBpard
     * 
     * @parame there are no parameters
     * @return Nothing is returned
     */
    public void updateleaderBoard()
=======
        showText( "", getWidth() / 2 - 25, getHeight() / 2 + 25 );
        
        showText( "", getWidth() / 2, 25 );
    }
    
    /**
     * displayLeaderBoard displays the leaderboard of the game in a
     * nicely formatted way
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void displayLeaderBoard()
    {
        List allObjects = getObjects( null );
        
        String leaderBoard = String.format( "%15s %5s %5s\n", "Name", "", "Score" );
        
        removeObjects( allObjects );
        
        for( int i = 0; i < leaderScores.length; i++ )
        {
            leaderBoard += String.format( "\n%15s %5s %5s", leaderNames[i], "", leaderScores[i] );
        }
        
        showText( leaderBoard, getWidth() / 2 - 25, getHeight() / 2 + 25 );
    }
    
    /**
     * updateLeaderBoard updates the leaderboard
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void updateLeaderBoard()
>>>>>>> aa2829a8b940e3d18470d4d74813b1388e697f46
    {
        int currentScore = scoreBoard.getScore();
        int indexToPlace = - 1;
        
<<<<<<< HEAD
        for( int i = leaderScores.length - 1; i >= 0 && currentScore > leaderScores[i]; i -- )
        {
            indexToPlace = i; 
        }
    
        if( indexToPlace != -1)
        {
            for( int i = leaderScores.length -2; i >= indexToPlace; i --)
=======
        for( int i = leaderScores.length - 1; i >= 0 && currentScore > leaderScores[i]; i-- )
        {
            indexToPlace = i;
        }
        
        if( indexToPlace != -1 )
        {
            for( int i = leaderScores.length - 2; i >= indexToPlace; i-- )
>>>>>>> aa2829a8b940e3d18470d4d74813b1388e697f46
            {
                leaderNames[i+1] = leaderNames[i];
                leaderScores[i+1] = leaderScores[i];
            }
<<<<<<< HEAD
        
            leaderNames[indexToPlace] = playerName;
            leaderScores[indexToPlace] = currentScore;
        }
    
    
    }

=======
            
            leaderNames[indexToPlace] = playerName;
            leaderScores[indexToPlace] = currentScore;
        }
        
    }
    
>>>>>>> aa2829a8b940e3d18470d4d74813b1388e697f46
}
