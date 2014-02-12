/*
 * This program lets you play the game Nim.
 * NOTE: THE PERSON THAT REMOVES THE LAST STICK /LOSES/
 * 
 * CSC221
 * Section 1
 * Assignment 4
 * Kurt Kaufman & Austin Hoefs
 * 11/17/13
 * Version 2.0 final
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
public class NimGame
{
    
    private static int numStick = 15;
    private static int compNumRemoved = 0;
    private static int playerWins = 0;
    private static int compWins = 0;
    private JButton remove1 = new JButton("Remove 1 Stick"); 
    private JButton remove2 = new JButton("Remove 2 Sticks");
    private JButton remove3 = new JButton("Remove 3 Sticks");
    private JButton retryButton = new JButton("Retry?");
    private static JLabel sticksLabel = new JLabel("Remove some sticks! There are "+ numStick +" remaining. The Computer will move after you.");
    public NimGame()
    {
        JFrame frame;
        Container contentPane;
        frame = new JFrame("Nim");
        frame.setSize(500, 200);
        frame.setLocation(300, 300);
        frame.setVisible(true);
        contentPane = frame.getContentPane();
        contentPane.setBackground(Color.LIGHT_GRAY);      
         
        contentPane.add(sticksLabel, BorderLayout.NORTH);
        //Add buttons
        contentPane.add(remove1, BorderLayout.WEST);
        contentPane.add(remove2, BorderLayout.CENTER);
        contentPane.add(remove3, BorderLayout.EAST);
        contentPane.add(retryButton, BorderLayout.SOUTH);
        retryButton.setEnabled(false);
      
        //Give the buttons actions
        remove1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent one)
            {
               removeOne();
               if(numStick<=0)
               {
                   compWins = compWins + 1;
                   sticksLabel.setText("Computer wins! The score is player: "+playerWins+", computer " + compWins);
                   remove1.setEnabled(false);
                   remove2.setEnabled(false);
                   remove3.setEnabled(false);
                   retryButton.setEnabled(true);
                   
                }
               else
               {
                   removeRandom();
                   if(numStick <=0)
                   {
                        playerWins = playerWins+1;
                        sticksLabel.setText("Player wins! The score is player: "+playerWins+", computer " + compWins);
                        remove1.setEnabled(false);
                        remove2.setEnabled(false);
                        remove3.setEnabled(false);
                        retryButton.setEnabled(true);
                    }
                }
               if (numStick > 0)
               {
                    sticksLabel.setText("There are " + numStick + " remaining. The computer will make a move after you.");
               }
            }
        
        });
        
        remove2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent two)
            {
               removeTwo();
               if(numStick<=0)
               {
                   compWins = compWins + 1;
                   sticksLabel.setText("Computer wins! The score is player: "+playerWins+", computer " + compWins);
                   remove1.setEnabled(false);
                   remove2.setEnabled(false);
                   remove3.setEnabled(false);
                   retryButton.setEnabled(true);
                   
                }
               else
               {
                   removeRandom();
                   if(numStick <=0)
                   {
                        playerWins = playerWins+1;
                        sticksLabel.setText("Player wins! The score is player: "+playerWins+", computer " + compWins);
                        remove1.setEnabled(false);
                        remove2.setEnabled(false);
                        remove3.setEnabled(false);
                        retryButton.setEnabled(true);
                    }
                }
               if (numStick > 0)
               {
                    sticksLabel.setText("There are " + numStick + " remaining. The computer will make a move after you.");
               }
            }
        });
        remove3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent three)
            {
               removeThree();
               if(numStick <= 0)
               {
                   compWins = compWins + 1;
                   sticksLabel.setText("Computer wins! The score is player: "+playerWins+", computer " + compWins);
                   remove1.setEnabled(false);
                   remove2.setEnabled(false);
                   remove3.setEnabled(false);
                   retryButton.setEnabled(true);
                   
                }
               else
               {
                   removeRandom();
                   if(numStick <=0)
                   {
                        playerWins = playerWins+1;
                        sticksLabel.setText("Player wins! The score is player: "+playerWins+", computer " + compWins);
                        remove1.setEnabled(false);
                        remove2.setEnabled(false);
                        remove3.setEnabled(false);
                        retryButton.setEnabled(true);
                    }
                }
               if (numStick > 0)
               {
                    sticksLabel.setText("There are " + numStick + " remaining. The computer will make a move after you.");
               }
            }
        });
        
        retryButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent retry)
            {
                retry();
            }
        });
        
    }
 
      

    public void removeRandom()
    {
        compNumRemoved  = ((int)(Math.random()*3)+1);
        numStick = numStick-compNumRemoved;
    }
    

    public void removeOne()
    {
            numStick = numStick-1;
    }
    
    public void removeTwo()
    {
            numStick = numStick-2;
    }
    
    public void removeThree()
    {
            numStick = numStick-3;
    }
    
    
    public static void main(String[] args)
    {
        NimGame nim = new NimGame();
    }
    
    public void retry()
    {
        numStick = 15;
        sticksLabel.setText("There are " + numStick + " remaining. The computer will make a move after you.");
        remove1.setEnabled(true);
        remove2.setEnabled(true);
        remove3.setEnabled(true);
        retryButton.setEnabled(false);
    }
}
