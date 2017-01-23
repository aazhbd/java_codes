import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Craps extends JApplet implements ActionListener{
	final int WON = 0, LOST = 1, CONTINUE = 2;
	boolean firstRoll = true;
	int sumOfDice = 0;
	int myPoint = 0;
	int gameStatus = CONTINUE;
	
	JLabel die1Label, die2Label, sumLabel, pointLabel;
	JTextField firstDie, secondDie, sum, point;
	JButton roll;
	
	public void init()
	{
		Container c = getContentPane();
		c.setLayout( new FlowLayout() );
		
		die1Label = new JLabel( "Die 1" );
		c.add( die1Label );
		
		firstDie = new JTextField( 10 );
		firstDie.setEditable( false );
		c.add( firstDie );
		
		die2Label = new JLabel( "Die 2" );
		c.add( die2Label );
		
		secondDie = new JTextField( 10 );
		secondDie.setEditable( false );
		c.add( secondDie );
		
		sumLabel = new JLabel( "Sum is" );
		c.add( sumLabel );
		
		sum = new JTextField( 10 );
		sum.setEditable( false );
		c.add( sum );
		
		pointLabel = new JLabel( "Point is" );
		c.add( pointLabel );
		
		point = new JTextField( 10 );
		point.setEditable( false );
		c.add( point );
		
		roll = new JButton( "Roll Dice" );
		roll.addActionListener( this );
		c.add( roll );
	}
	
	public void actionPerformed( ActionEvent e )
	{
		play();
	}
	
	public void play()
	{
		if(firstRoll){
			sumOfDice = rollDice();
			
			switch(sumOfDice){
				case 7:
				case 11:
				gameStatus = WON;
				point.setText( "" );
				break;
				
				
            	case 2:
            	case 3:
            	case 12:
            	gameStatus = LOST;
            	point.setText( "" );
            	break;
            	
            	default:
            	gameStatus = CONTINUE;
            	myPoint = sumOfDice;
            	point.setText(Integer.toString(myPoint));
            	firstRoll = false;
            	break;
            }
       }
       else{
       	sumOfDice = rollDice();
       	if ( sumOfDice == myPoint )
       	gameStatus = WON;
       	else
       	if(sumOfDice == 7)
       	gameStatus = LOST;
       	}
       	if ( gameStatus == CONTINUE )
       	showStatus( "Roll again." );
       	else{
       		if ( gameStatus == WON )
       		showStatus("Player wins. "+"Click Roll Dice to play again.");
       		else
       		showStatus("Player loses. "+"Click Roll Dice to play again." );
       		
       		firstRoll = true;
       	}
    }
    
    public int rollDice()
    {
    	int die1, die2, workSum;
    	die1 = 1 + ( int ) ( Math.random() * 6 );
    	die2 = 1 + ( int ) ( Math.random() * 6 );
    	workSum = die1 + die2;
    	
    	firstDie.setText(Integer.toString(die1));
    	secondDie.setText(Integer.toString(die2));
    	sum.setText( Integer.toString( workSum ) );
    	return workSum;
    }
}