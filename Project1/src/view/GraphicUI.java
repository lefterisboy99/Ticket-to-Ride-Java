
package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import controller.controller;
import model.card.BigCitiesCard;
import model.card.DestinationCard;
import model.card.TrainCard;

import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

        
/**
 * @version 1.0
 * @author dxanthak - mountanton
 */
public class GraphicUI extends JFrame  {
    private Image image;
    private ArrayList<JButton> playerCards = new ArrayList<JButton>();
    private ArrayList<JButton> playerRailBlueCardsButtons = new ArrayList<JButton>();
    private ArrayList<JButton> playerRailBlueCardsButtons2 = new ArrayList<JButton>();
    private ArrayList<JButton> playerRailWhiteCardsButtons = new ArrayList<JButton>();
    private ArrayList<JButton> playerRailBlackCardsButtons = new ArrayList<JButton>();
    private ArrayList<JButton> playerRailRedCardsButtons = new ArrayList<JButton>();
    private ArrayList<JButton> playerRailGreenCardsButtons = new ArrayList<JButton>();
    private ArrayList<JButton> playerRailPurpleCardsButtons = new ArrayList<JButton>();
    private ArrayList<JButton> playerRailOrangeCardsButtons = new ArrayList<JButton>();
    private ArrayList<JButton> playerRailYellowCardsButtons = new ArrayList<JButton>();
    private ArrayList<JButton> playerRailNoColorCardsButtons = new ArrayList<JButton>();
    private ArrayList<JButton> playerRailWhiteCardsButtons2 = new ArrayList<JButton>();
    private ArrayList<JButton> playerRailBlackCardsButtons2 = new ArrayList<JButton>();
    private ArrayList<JButton> playerRailRedCardsButtons2 = new ArrayList<JButton>();
    private ArrayList<JButton> playerRailGreenCardsButtons2 = new ArrayList<JButton>();
    private ArrayList<JButton> playerRailPurpleCardsButtons2 = new ArrayList<JButton>();
    private ArrayList<JButton> playerRailOrangeCardsButtons2 = new ArrayList<JButton>();
    private ArrayList<JButton> playerRailYellowCardsButtons2 = new ArrayList<JButton>();
    private ArrayList<JButton> playerRailNoColorCardsButtons2 = new ArrayList<JButton>();
    private ArrayList<JButton> playerDesButtons1 = new ArrayList<JButton>();
    private ArrayList<JButton> playerDesButtons2 = new ArrayList<JButton>();
    private ArrayList<JButton> playerHandButtons1 = new ArrayList<JButton>();
    private ArrayList<JButton> playerHandButtons2 = new ArrayList<JButton>();
    public ArrayList<JButton> Traindowns= new ArrayList<JButton>();
    public JLabel P1;
    public JLabel P2;
    public JButton TrainCard1;
    public JButton TrainCard2;
    public JButton TrainCard3;
    public JButton TrainCard4;
    public JButton TrainCard5;
    public JButton destinationTickets1;
    private JButton play;
    private JButton  moveFromRailButton;
    private int sum1=0;
    private int sum2=0;
    private int count_red;
    private int count_black;
    private int count_blue;
    private int count_purple;
    private int count_allcolor;
    private int count_yellow;
    private int count_white;
    private int count_orange;
    private int count_green;
    private JButton  movetoRailButton;
    private JButton  moveFromRailButton2;
    private JButton  movetoRailButton2;
    private JButton destinationticket;
    public JButton TicketDeck;
    private JButton bigcitiesCard1;
    private JButton bigcitiesCard2;
    private JButton bigcitiesCard3;
    private JButton bigcitiesCard4;
    private JButton bigcitiesCard5;
    private JButton bigcitiesCard6;
    private MenuDialog basic_panel;
    private JDesktopPane player2_field;
    private JDesktopPane player1_field;
    private JDesktopPane player2_field2;
    private JDesktopPane player1_field2;
    public JButton  destinationTickets;
    public JButton  BigCities;
    public JButton  destinationTickets2;
    public JButton  BigCities2;
    public JButton BigCitiesBonus1;
    public JButton BigCitiesBonus2;
    public JButton BigCitiesBonus3;
    public JButton BigCitiesBonus4;
    public JButton BigCitiesBonus5;
    public JButton BigCitiesBonus6;
    private JButton red_useless;
    private JButton black_useless;
    private JButton blue_useless;
    private JButton green_useless;
    private JButton purple_useless;
    private JButton yellow_useless;
    private JButton orange_useless;
    private JButton noColor_useless;
    private JButton white_useless;
    private JButton red_useless2;
    private JButton black_useless2;
    private JButton blue_useless2;
    private JButton green_useless2;
    private JButton purple_useless2;
    private JButton yellow_useless2;
    private JButton orange_useless2;
    private JButton noColor_useless2;
    private JButton white_useless2;
    private JLabel Rail1;
    private JLabel Rail2;
    private JLabel RailYard1;
    private JLabel RailYard2;
    private JLabel TrainHand1;
    private JLabel TrainHand2;
    private JLabel TicketHand1;
    private JLabel TicketHand2;
    private JLabel Track1;
    private JLabel Track2;
    private JLabel score1;
    private JLabel score2;
    private JLabel Title_score1;
    private JLabel blueCardsWon,bigcit,blackCardsWon,whiteCardsWon,redCardsWon,greenCardsWon,purpleCardsWon,yellowCardsWon,orangeCardsWon,allColorCardsWon;
    private JLabel blueCardsWon2,blackCardsWon2,whiteCardsWon2,redCardsWon2,greenCardsWon2,purpleCardsWon2,yellowCardsWon2,orangeCardsWon2,allColorCardsWon2;
    private JLabel destinationCount;
    private JLabel Title_score2;
    private JLabel red_count1;
    private JLabel red_count2;
    private JPanel jPanel1;
    private JLabel trainCount;
    private JTextField jTextField1;
    private URL imageURL;
    private ClassLoader cldr;  
    private JButton[] buttons = new JButton[128];
    private JLayeredPane player1Cards,player1Rail,player1Track,player1Tickets,player1score;
    private JLayeredPane player2Cards,player2Rail,player2Track,player2Tickets,player2score;
    /**
	 * <b>constructor</b>: Creates a new Window and initializes some buttons and panels <br />
	 * <b>postconditions</b>: Creates a new Window and initializes some buttons and panels
	 * starting a new game.
	 */
    public GraphicUI() {
    	cldr = this.getClass().getClassLoader();
    	    this.setLayout(null);
            this.setResizable(false);
            this.setTitle("Ticket to Ride");
            this.setSize(1080,1000);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    
    
    
    public ArrayList<JButton> getPlayerRailBlueCardsButtons() {
        return playerRailBlueCardsButtons;
    }

    public ArrayList<JButton> getPlayerRailWhiteCardsButtons() {
        return playerRailWhiteCardsButtons;
    }

    public ArrayList<JButton> getPlayerRailBlackCardsButtons() {
        return playerRailBlackCardsButtons;
    }
    public ArrayList<JButton> getPlayerRailRedCardsButtons() {
        return playerRailRedCardsButtons;
    }

    public ArrayList<JButton> getPlayerRailPurpleCardsButtons() {
        return playerRailPurpleCardsButtons;
    }

    public ArrayList<JButton> getPlayerRailGreenCardsButtons() {
        return playerRailGreenCardsButtons;
    }
    public ArrayList<JButton> getPlayerRailYellowCardsButtons() {
        return playerRailYellowCardsButtons;
    }

    public ArrayList<JButton> getPlayerRailOrangeCardsButtons() {
        return playerRailOrangeCardsButtons;
    }

    public ArrayList<JButton> getPlayerRailNoColorCardsButtons() {
        return playerRailNoColorCardsButtons;
    }
   

    public ArrayList<JButton> getPlayerRailBlueCardsButtons2() {
        return playerRailBlueCardsButtons2;
    }

    public ArrayList<JButton> getPlayerRailWhiteCardsButtons2() {
        return playerRailWhiteCardsButtons2;
    }

    public ArrayList<JButton> getPlayerRailBlackCardsButtons2() {
        return playerRailBlackCardsButtons2;
    }
    public ArrayList<JButton> getPlayerRailRedCardsButtons2() {
        return playerRailRedCardsButtons2;
    }

    public ArrayList<JButton> getPlayerRailPurpleCardsButtons2() {
        return playerRailPurpleCardsButtons2;
    }

    public ArrayList<JButton> getPlayerRailGreenCardsButtons2() {
        return playerRailGreenCardsButtons2;
    }
    public ArrayList<JButton> getPlayerRailYellowCardsButtons2() {
        return playerRailYellowCardsButtons2;
    }

    public ArrayList<JButton> getPlayerRailOrangeCardsButtons2() {
        return playerRailOrangeCardsButtons2;
    }

    public ArrayList<JButton> getPlayerRailNoColorCardsButtons2() {
        return playerRailNoColorCardsButtons2;
    }
    public ArrayList<JButton> getPlayerRailCardsButtons2() {
        return playerRailBlueCardsButtons2;
    }

    public void updateBlueCardsWon(int num) {
        this.blueCardsWon.setText("Blue:"+num);
    }

    public void updateBlackCardsWon(int num) {
        this.blackCardsWon.setText("Black:"+num);
    }
    
      public void updateWhiteCardsWon(int num) {
        this.whiteCardsWon.setText("White:"+num);
    }
      public void updateRedCardsWon(int num) {
          this.redCardsWon.setText("Red:"+num);
      }

      public void updateGreenCardsWon(int num) {
          this.greenCardsWon.setText("Green:"+num);
      }
      
        public void updateYellowCardsWon(int num) {
          this.yellowCardsWon.setText("Yellow:"+num);
      }
        public void updateOrangeCardsWon(int num) {
            this.orangeCardsWon.setText("Orange:"+num);
        }

        public void updateNoColorCardsWon(int num) {
            this.allColorCardsWon.setText("Locomotive:"+num);
        }
        
          public void updatePurpleCardsWon(int num) {
            this.purpleCardsWon.setText("Purple:"+num);
        }
          
          
          public void updateBlueCardsWon2(int num) {
              this.blueCardsWon2.setText("Blue:"+num);
          }

          public void updateBlackCardsWon2(int num) {
              this.blackCardsWon2.setText("Black:"+num);
          }
          
            public void updateWhiteCardsWon2(int num) {
              this.whiteCardsWon2.setText("White:"+num);
          }
            public void updateRedCardsWon2(int num) {
                this.redCardsWon2.setText("Red:"+num);
            }

            public void updateGreenCardsWon2(int num) {
                this.greenCardsWon2.setText("Green:"+num);
            }
            
              public void updateYellowCardsWon2(int num) {
                this.yellowCardsWon2.setText("Yellow:"+num);
            }
              public void updateOrangeCardsWon2(int num) {
                  this.orangeCardsWon2.setText("Orange:"+num);
              }

              public void updateNoColorCardsWon2(int num) {
                  this.allColorCardsWon2.setText("Locomotive:"+num);
              }
              
                public void updatePurpleCardsWon2(int num) {
                  this.purpleCardsWon2.setText("Purple:"+num);
              }
    
    /**
	 * <b>transformer(mutative)</b>:initializes some buttons and labels <br />
	 * <p><b>Postcondition:</b> initializes some buttons and labels </p>
	 *
     */
    public void initComponents() {
    	
    	URL imageURL = cldr.getResource("resources/images/background.jpg");
    	Image image = new ImageIcon(imageURL).getImage();
    	image=image.getScaledInstance(1200, 1000, java.awt.Image.SCALE_SMOOTH);
    	basic_panel=new MenuDialog(image);
    	bigcit=new JLabel("Available Big Cities Bonus Card");
    	bigcit.setBounds(700, 525, 200,20);
    	basic_panel.add(bigcit);
    	destinationTickets=new JButton();
    	  URL imageURL2 = cldr.getResource("resources/images/destination_Tickets/desBackCard.jpg"); //image
          Image image2 = new ImageIcon(imageURL2).getImage();
          image2 = image2.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
    	destinationTickets.setIcon(new ImageIcon(image2));
    	destinationTickets.setBounds(180, 400, 70, 110);
    	destinationCount=new JLabel("Destination Deck: 0");
    	destinationCount.setBounds(160,520, 140, 40);
        basic_panel.add(destinationCount);
    	basic_panel.add(destinationTickets);
    	

       
    	
    	 trainCount = new JLabel("Ticket Deck: 0");
    	trainCount.setBounds(20,520, 140, 40);
        basic_panel.add(trainCount);
    	 URL imageURL3 = cldr.getResource("resources/images/trainCards/trainBackCard.jpg"); //image
         Image image3 = new ImageIcon(imageURL3).getImage();
         image3 = image3.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
         	TicketDeck=new JButton();
         	TicketDeck.setIcon(new ImageIcon(image3));
   			TicketDeck.setBounds(35, 400, 70, 110);
   			basic_panel.add(TicketDeck);
   			URL imageURL4 = cldr.getResource("resources/images/bigCitiesCards/Chicago.jpg"); //image
            Image image4 = new ImageIcon(imageURL4).getImage();
            image4 = image4.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            	BigCitiesBonus1=new JButton();
            	BigCitiesBonus1.setIcon(new ImageIcon(image4));
            	BigCitiesBonus1.setBounds(600, 400, 70,110);
      			basic_panel.add(BigCitiesBonus1);
      		URL imageURL5 = cldr.getResource("resources/images/bigCitiesCards/Dallas.jpg"); //image
               Image image5 = new ImageIcon(imageURL5).getImage();
               image5 = image5.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
               BigCitiesBonus2=new JButton();
              	BigCitiesBonus2.setIcon(new ImageIcon(image5));
             	BigCitiesBonus2.setBounds(680, 400, 70,110);
          	basic_panel.add(BigCitiesBonus2);
          	URL imageURL6 = cldr.getResource("resources/images/bigCitiesCards/LosAngeles.jpg"); //image
            Image image6 = new ImageIcon(imageURL6).getImage();
            image6 = image6.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            BigCitiesBonus3=new JButton();
           	BigCitiesBonus3.setIcon(new ImageIcon(image6));
          	BigCitiesBonus3.setBounds(760, 400, 70,110);
          	basic_panel.add(BigCitiesBonus3);
          	URL imageURL7 = cldr.getResource("resources/images/bigCitiesCards/Miami.jpg"); //image
            Image image7 = new ImageIcon(imageURL7).getImage();
            image7 = image7.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            BigCitiesBonus4=new JButton();
           	BigCitiesBonus4.setIcon(new ImageIcon(image7));
          	BigCitiesBonus4.setBounds(840, 400, 70,110);
          	basic_panel.add(BigCitiesBonus4);
          	URL imageURL8 = cldr.getResource("resources/images/bigCitiesCards/NewYork.jpg"); //image
            Image image8= new ImageIcon(imageURL8).getImage();
            image8 = image8.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            BigCitiesBonus5=new JButton();
           	BigCitiesBonus5.setIcon(new ImageIcon(image8));
           	BigCitiesBonus5.setBounds(920, 400, 70,110);
           	basic_panel.add(BigCitiesBonus5);
           	URL imageURL9 = cldr.getResource("resources/images/bigCitiesCards/Seattle.jpg"); //image
            Image image9= new ImageIcon(imageURL9).getImage();
            image9 = image9.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            BigCitiesBonus6=new JButton();
           	BigCitiesBonus6.setIcon(new ImageIcon(image9));
          	BigCitiesBonus6.setBounds(1000, 400, 70,110);
          	basic_panel.add(BigCitiesBonus6);
            player1Cards = new JLayeredPane();
            player1Cards.setBounds(10, 800, 550, 150);
            player1Cards.setBackground(Color.WHITE);
            player1Cards.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
            player1Cards.setOpaque(true);
            basic_panel.add(player1Cards, 0);
            player2Cards = new JLayeredPane();
            player2Cards.setBounds(10, 10,550, 150);
            player2Cards.setBackground(Color.WHITE);
            player2Cards.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
            player2Cards.setOpaque(true);
            basic_panel.add(player2Cards, 0);
            player1Tickets = new JLayeredPane();
            player1Tickets.setBounds(560, 800, 250, 150);
            player1Tickets.setBackground(Color.WHITE);
            player1Tickets.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
            player1Tickets.setOpaque(true);
            basic_panel.add(player1Tickets, 0);
            player2Tickets = new JLayeredPane();
            player2Tickets.setBounds(560, 10, 250, 150);
            player2Tickets.setBackground(Color.WHITE);
            player2Tickets.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
            player2Tickets.setOpaque(true);
            basic_panel.add(player2Tickets, 0);
            player1Rail = new JLayeredPane();
            player1Rail.setBounds(10, 590, 550, 200);
            player1Rail.setBackground(Color.WHITE);
            player1Rail.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
            player1Rail.setOpaque(true);
            basic_panel.add(player1Rail, 0);
            player2Rail = new JLayeredPane();
            player2Rail.setBounds(10, 170, 550, 200);
            player2Rail.setBackground(Color.WHITE);
            player2Rail.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
            player2Rail.setOpaque(true);
            basic_panel.add(player2Rail, 0);
            player1Track = new JLayeredPane();
            player1Track.setBounds(560, 590, 250, 200);
            player1Track.setBackground(Color.WHITE);
            player1Track.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
            player1Track.setOpaque(true);
            basic_panel.add(player1Track, 0);
            player2Track = new JLayeredPane();
            player2Track.setBounds(560, 170, 250, 200);
            player2Track.setBackground(Color.WHITE);
            player2Track.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
            player2Track.setOpaque(true);
            basic_panel.add(player2Track, 0);
            player1score = new JLayeredPane();
            player1score.setBounds(810, 590, 250, 360);
            player1score.setBackground(Color.WHITE);
            player1score.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
            player1score.setOpaque(true);
            basic_panel.add(player1score, 0);
            player2score = new JLayeredPane();
            player2score.setBounds(810, 10, 250, 360);
            player2score.setBackground(Color.WHITE);
            player2score.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
            player2score.setOpaque(true);
            basic_panel.add(player2score, 0);
            moveFromRailButton=new JButton();
            moveFromRailButton.setText("Move Cards On-the-Track");
            moveFromRailButton.setBounds(350,170,190,20);
            player1Rail.add(moveFromRailButton);
            movetoRailButton=new JButton();
            movetoRailButton.setText("Play Cards");
            movetoRailButton.setBounds(350,120,190,20);
            player1Cards.add(movetoRailButton);
            moveFromRailButton2=new JButton();
            moveFromRailButton2.setText("Move Cards On-the-Track");
            moveFromRailButton2.setBounds(350,170,190,20);
            player2Rail.add(moveFromRailButton2);
            movetoRailButton2=new JButton();
            movetoRailButton2.setText("Play Cards");
            movetoRailButton2.setBounds(350,120,190,20);
            player2Cards.add(movetoRailButton2);
            destinationTickets1=new JButton();
            destinationTickets1.setText("My Destination Tickets");
            destinationTickets1.setBounds(30,80,190,100);
            player1score.add(destinationTickets1);
            destinationTickets2=new JButton();
            destinationTickets2.setText("My Destination Tickets");
            destinationTickets2.setBounds(30,80,190,100);
            player2score.add(destinationTickets2);
            BigCities=new JButton();
            BigCities.setText("Big Cities Bonus Card");
            BigCities.setBounds(30,200,190,100);
            player1score.add(BigCities);
            BigCities2=new JButton();
            BigCities2.setText("Big Cities Bonus Card");
            BigCities2.setBounds(30,200,190,100);
            player2score.add(BigCities2);
            Rail1=new JLabel("  red             black             blue             green             purple             white             yellow      orange");
            Rail1.setBounds(10,10, 560, 20);
            player1Rail.add(Rail1);
            Rail2=new JLabel("  red             black             blue             green             purple             white             yellow      orange");
            Rail2.setBounds(10,10, 560, 20);
            player2Rail.add(Rail2);
            RailYard1=new JLabel("Railyard");
            RailYard1.setBounds(10,180, 60, 20);
            player1Rail.add(RailYard1);
            RailYard2=new JLabel("Railyard");
            RailYard2.setBounds(10,180, 560, 20);
            player2Rail.add(RailYard2);
            TrainHand1=new JLabel("Train Cards on Hand");
            TrainHand1.setBounds(10,120, 200, 20);
            player1Cards.add(TrainHand1);
            TrainHand2=new JLabel("Train Cards on Hand");
            TrainHand2.setBounds(10,120, 200, 20);
            player2Cards.add(TrainHand2);
            TicketHand1=new JLabel("Tickets on Hand");
            TicketHand1.setBounds(10,120, 200, 20);
            player1Tickets.add(TicketHand1);
            TicketHand2=new JLabel("Tickets on Hand");
            TicketHand2.setBounds(10,120, 200, 20);
            player2Tickets.add(TicketHand2);
            Track1=new JLabel("On-the-Track");
            Track1.setBounds(10,170, 200, 20);
            player1Track.add(Track1);
            Track2=new JLabel("On-the-Track");
            Track2.setBounds(10,170, 200, 20);
            player2Track.add(Track2);
            Title_score1=new JLabel("Player 1 Scoreboard");
            Title_score1.setBounds(10,10, 200, 20);
            player1score.add(Title_score1);
            Title_score2=new JLabel("Player 2 Scoreboard");
            Title_score2.setBounds(10,10, 200, 20);
            player2score.add(Title_score2);
            score1=new JLabel("Score: 0");
            score1.setBounds(10,40, 200, 20);
            P1=new JLabel("Player1: True");
            P1.setBounds(10,25, 200, 20);
            player1score.add(P1);
            player1score.add(score1);
            P2=new JLabel("Player2: False");
            P2.setBounds(10,25, 200, 20);
            player2score.add(P2);
            score2=new JLabel("Score: 0");
            score2.setBounds(10,40, 200, 20);
            player2score.add(score2);
            blueCardsWon=new JLabel("blue:0");
            blueCardsWon.setBounds(110,10, 200, 20);
            blueCardsWon2=new JLabel("blue:0");
            blueCardsWon2.setBounds(110,10, 200, 20);
            redCardsWon=new JLabel("red:0");
            redCardsWon.setBounds(10,10, 40, 20);
            redCardsWon2=new JLabel("red:0");
            redCardsWon2.setBounds(10,10, 40, 20);
            blackCardsWon=new JLabel("black:0");
            blackCardsWon.setBounds(50,10, 60, 20);
            blackCardsWon2=new JLabel("black:0");
            blackCardsWon2.setBounds(50,10, 60, 20);
            greenCardsWon=new JLabel("green:0");
            greenCardsWon.setBounds(160,10, 60, 20);
            greenCardsWon2=new JLabel("green:0");
            greenCardsWon2.setBounds(160,10, 60, 20);
            purpleCardsWon=new JLabel("purple:0");
            purpleCardsWon.setBounds(10,90, 60, 20);
            purpleCardsWon2=new JLabel("purple:0");
            purpleCardsWon2.setBounds(10,90, 60, 20);
            whiteCardsWon=new JLabel("white:0");
            whiteCardsWon.setBounds(70,90, 60, 20);
            whiteCardsWon2=new JLabel("white:0");
            whiteCardsWon2.setBounds(70,90, 60, 20);
            yellowCardsWon=new JLabel("yellow:0");
            yellowCardsWon.setBounds(120,90, 60, 20);
            yellowCardsWon2=new JLabel("yellow:0");
            yellowCardsWon2.setBounds(120,90, 60, 20);
            allColorCardsWon=new JLabel("Locomotive:0");
            allColorCardsWon.setBounds(90,150, 200, 20);
            allColorCardsWon2=new JLabel("Locomotive:0");
            allColorCardsWon2.setBounds(90,150, 200, 20);
            orangeCardsWon=new JLabel("orange:0");
            orangeCardsWon.setBounds(180,90, 200, 20);
            orangeCardsWon2=new JLabel("orange:0");
            orangeCardsWon2.setBounds(180,90, 200, 20);
            player1Track.add(redCardsWon);
            player1Track.add(blackCardsWon);
            player1Track.add(blueCardsWon);
            player1Track.add(greenCardsWon);
            player1Track.add(purpleCardsWon);
            player1Track.add(whiteCardsWon);
            player1Track.add(yellowCardsWon);
            player1Track.add(orangeCardsWon);
            player1Track.add(allColorCardsWon);
            player2Track.add(redCardsWon2);
            player2Track.add(blackCardsWon2);
            player2Track.add(blueCardsWon2);
            player2Track.add(greenCardsWon2);
            player2Track.add(purpleCardsWon2);
            player2Track.add(whiteCardsWon2);
            player2Track.add(yellowCardsWon2);
            player2Track.add(orangeCardsWon2);
            player2Track.add(allColorCardsWon2);
            URL imageURL10 = cldr.getResource("resources/images/trainCards/red_useless.jpg"); //image
            Image image10 = new ImageIcon(imageURL10).getImage();
            image10 = image10.getScaledInstance(40, 30, java.awt.Image.SCALE_SMOOTH);
            red_useless=new JButton();
            red_useless.setIcon(new ImageIcon(image10));
            red_useless.setBounds(5, 40, 40,30);
            red_useless2=new JButton();
            red_useless2.setIcon(new ImageIcon(image10));
            red_useless2.setBounds(5, 40, 40,30);
          	player1Track.add(red_useless);
          	player2Track.add(red_useless2);
          	URL imageURL11 = cldr.getResource("resources/images/trainCards/black_useless.jpg"); //image
            Image image11= new ImageIcon(imageURL11).getImage();
            image11 = image11.getScaledInstance(40, 30, java.awt.Image.SCALE_SMOOTH);
            black_useless=new JButton();
            black_useless.setIcon(new ImageIcon(image11));
            black_useless.setBounds(60, 40, 40,30);
            black_useless2=new JButton();
            black_useless2.setIcon(new ImageIcon(image11));
            black_useless2.setBounds(60, 40, 40,30);
          	player1Track.add(black_useless);
          	player2Track.add(black_useless2);
          	URL imageURL12 = cldr.getResource("resources/images/trainCards/blue_useless.jpg"); //image
            Image image12= new ImageIcon(imageURL12).getImage();
            image12 = image12.getScaledInstance(40, 30, java.awt.Image.SCALE_SMOOTH);
            blue_useless=new JButton();
            blue_useless.setIcon(new ImageIcon(image12));
            blue_useless.setBounds(110, 40, 40,30);
            blue_useless2=new JButton();
            blue_useless2.setIcon(new ImageIcon(image12));
            blue_useless2.setBounds(110, 40, 40,30);
          	player1Track.add(blue_useless);
          	player2Track.add(blue_useless2);
          	URL imageURL13 = cldr.getResource("resources/images/trainCards/green_useless.jpg"); //image
            Image image13= new ImageIcon(imageURL13).getImage();
            image13 = image13.getScaledInstance(40, 30, java.awt.Image.SCALE_SMOOTH);
            green_useless=new JButton();
            green_useless.setIcon(new ImageIcon(image13));
            green_useless.setBounds(170, 40, 40,30);
            green_useless2=new JButton();
            green_useless2.setIcon(new ImageIcon(image13));
            green_useless2.setBounds(170, 40, 40,30);
          	player1Track.add(green_useless);
          	player2Track.add(green_useless2);
          	URL imageURL14 = cldr.getResource("resources/images/trainCards/purple_useless.jpg"); //image
            Image image14= new ImageIcon(imageURL14).getImage();
            image14 = image14.getScaledInstance(40, 30, java.awt.Image.SCALE_SMOOTH);
            purple_useless=new JButton();
            purple_useless.setIcon(new ImageIcon(image14));
            purple_useless.setBounds(10, 110, 40,30);
            purple_useless2=new JButton();
            purple_useless2.setIcon(new ImageIcon(image14));
            purple_useless2.setBounds(10, 110, 40,30);
          	player1Track.add(purple_useless);
          	player2Track.add(purple_useless2);
          	URL imageURL15 = cldr.getResource("resources/images/trainCards/white_useless.jpg"); //image
            Image image15= new ImageIcon(imageURL15).getImage();
            image15 = image15.getScaledInstance(40, 30, java.awt.Image.SCALE_SMOOTH);
            white_useless=new JButton();
            white_useless.setIcon(new ImageIcon(image15));
            white_useless.setBounds(70, 110, 40,30);
            white_useless2=new JButton();
            white_useless2.setIcon(new ImageIcon(image15));
            white_useless2.setBounds(70, 110, 40,30);
            player1Track.add(white_useless);
          	player2Track.add(white_useless2);
          	URL imageURL16 = cldr.getResource("resources/images/trainCards/yellow_useless.jpg"); //image
            Image image16= new ImageIcon(imageURL16).getImage();
            image16 = image16.getScaledInstance(40, 30, java.awt.Image.SCALE_SMOOTH);
            yellow_useless=new JButton();
            yellow_useless.setIcon(new ImageIcon(image16));
            yellow_useless.setBounds(120, 110, 40,30);
            yellow_useless2=new JButton();
            yellow_useless2.setIcon(new ImageIcon(image16));
            yellow_useless2.setBounds(120, 110, 40,30);
          	player1Track.add(yellow_useless);
          	player2Track.add(yellow_useless2);
          	URL imageURL17 = cldr.getResource("resources/images/trainCards/orange_useless.jpg"); //image
            Image image17= new ImageIcon(imageURL17).getImage();
            image17 = image17.getScaledInstance(40, 30, java.awt.Image.SCALE_SMOOTH);
            orange_useless=new JButton();
            orange_useless.setIcon(new ImageIcon(image17));
            orange_useless.setBounds(190, 110, 40,30);
            orange_useless2=new JButton();
            orange_useless2.setIcon(new ImageIcon(image17));
            orange_useless2.setBounds(190, 110, 40,30);
          	player1Track.add(orange_useless);
          	player2Track.add(orange_useless2);
          	URL imageURL18 = cldr.getResource("resources/images/trainCards/locomotive_useless.jpg"); //image
            Image image18= new ImageIcon(imageURL18).getImage();
            image18 = image18.getScaledInstance(70, 40, java.awt.Image.SCALE_SMOOTH);
            noColor_useless=new JButton();
            noColor_useless.setIcon(new ImageIcon(image18));
            noColor_useless.setBounds(170, 150, 70,40);
            noColor_useless2=new JButton();
            noColor_useless2.setIcon(new ImageIcon(image18));
            noColor_useless2.setBounds(170, 150, 70,40);
          	player1Track.add(noColor_useless);
            player2Track.add(noColor_useless2);
            
            
            GroupLayout layout = new GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(basic_panel, GroupLayout.PREFERRED_SIZE, 1110, GroupLayout.PREFERRED_SIZE));
            layout.setVerticalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(basic_panel, GroupLayout.PREFERRED_SIZE, 980, GroupLayout.PREFERRED_SIZE));
            pack();
            basic_panel.repaint();
    }
        public void setFirstCards(ArrayList<TrainCard>TicketDeck,ArrayList<DestinationCard>exodia) {
        	JButton J1=new JButton();
        	JButton J2=new JButton();
        	JButton J3=new JButton();
        	JButton J4=new JButton();
        	JButton J5=new JButton();
        	JButton J6=new JButton();
        	JButton J7=new JButton();
        	JButton J8=new JButton();
        	JButton C1;
            JButton C2;
            JButton C3;
            JButton C4;
            JButton C5;
            JButton C6;
            JButton C7;
            JButton C8;
            JButton C9;
            JButton C10;
            JButton C11;
            JButton C12;
            JButton C13;
            JButton C14;
            JButton C15;
            JButton C16;
        	URL imageURL41 = cldr.getResource(exodia.get(0).getImage()); //image
        	exodia.get(0).setX(10);
        	exodia.get(0).setY(10);
            Image image41= new ImageIcon(imageURL41).getImage();
            image41 = image41.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            J1.setIcon(new ImageIcon(image41));
            J1.setBounds(exodia.get(0).getX(), exodia.get(0).getY(), 70,110);
            playerDesButtons1.add(J1);
           
            
            URL imageURL52 = cldr.getResource(exodia.get(1).getImage()); //image
        	exodia.get(1).setX(40);
        	exodia.get(1).setY(10);
            Image image52= new ImageIcon(imageURL52).getImage();
            image52 = image52.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            J2.setIcon(new ImageIcon(image52));
            J2.setBounds(exodia.get(1).getX(), exodia.get(1).getY(), 70,110);
            playerDesButtons1.add(J2);
            
            
            URL imageURL53 = cldr.getResource(exodia.get(2).getImage()); //image
        	exodia.get(2).setX(70);
        	exodia.get(2).setY(10);
            Image image53= new ImageIcon(imageURL53).getImage();
            image53 = image53.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            J3.setIcon(new ImageIcon(image53));
            J3.setBounds(exodia.get(2).getX(), exodia.get(2).getY(), 70,110);
            playerDesButtons1.add(J3);
           
            
            URL imageURL54 = cldr.getResource(exodia.get(3).getImage()); //image
        	exodia.get(3).setX(100);
        	exodia.get(3).setY(10);
            Image image54= new ImageIcon(imageURL54).getImage();
            image54 = image54.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            J4.setIcon(new ImageIcon(image54));
            J4.setBounds(exodia.get(3).getX(), exodia.get(3).getY(), 70,110);
            playerDesButtons1.add(J4);
           
            
            for(int i=0;i<playerDesButtons1.size();i++)
            	player1Tickets.add(playerDesButtons1.get(i));
            
            
            
        	URL imageURL421 = cldr.getResource(exodia.get(4).getImage()); //image
        	exodia.get(4).setX(10);
        	exodia.get(4).setY(10);
            Image image421= new ImageIcon(imageURL421).getImage();
            image421 = image421.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            J5.setIcon(new ImageIcon(image421));
            J5.setBounds(exodia.get(4).getX(), exodia.get(4).getY(), 70,110);
            playerDesButtons2.add(J5);
           
            
            URL imageURL522 = cldr.getResource(exodia.get(5).getImage()); //image
        	exodia.get(5).setX(40);
        	exodia.get(5).setY(10);
            Image image522= new ImageIcon(imageURL522).getImage();
            image522 = image522.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            J6.setIcon(new ImageIcon(image522));
            J6.setBounds(exodia.get(5).getX(), exodia.get(5).getY(), 70,110);
            playerDesButtons2.add(J6);
            
            
            URL imageURL523 = cldr.getResource(exodia.get(6).getImage()); //image
        	exodia.get(6).setX(70);
        	exodia.get(6).setY(10);
            Image image523= new ImageIcon(imageURL523).getImage();
            image523 = image523.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            J7.setIcon(new ImageIcon(image523));
            J7.setBounds(exodia.get(6).getX(), exodia.get(6).getY(), 70,110);
            playerDesButtons2.add(J7);
           
            
            URL imageURL524 = cldr.getResource(exodia.get(7).getImage()); //image
        	exodia.get(7).setX(100);
        	exodia.get(7).setY(10);
            Image image524= new ImageIcon(imageURL524).getImage();
            image524 = image524.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            J8.setIcon(new ImageIcon(image524));
            J8.setBounds(exodia.get(7).getX(), exodia.get(7).getY(), 70,110);
            playerDesButtons2.add(J8);
           
            
            for(int i=0;i<playerDesButtons2.size();i++)
            	player2Tickets.add(playerDesButtons2.get(i));
            
            
            
            
            
            
            
           // System.out.println(TicketDeck.get(0).getimage());
            C1=new JButton();
            C2=new JButton();
            C3=new JButton();
            C4=new JButton();
            C5=new JButton();
            C6=new JButton();
            C7=new JButton();
            C8=new JButton();
            C9=new JButton();
            C10=new JButton();
            C11=new JButton();
            C12=new JButton();
            C13=new JButton();
            C14=new JButton();
            C15=new JButton();
            C16=new JButton();
            URL imageURL1 = cldr.getResource(TicketDeck.get(0).getimage());
            Image image1= new ImageIcon(imageURL1).getImage();
            image1 = image1.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            C1.setIcon(new ImageIcon(image1));
            C1.setBounds(10, 10, 70,110);
            playerHandButtons1.add(C1);
          //System.out.println(TicketDeck.get(1).getimage());
            URL imageURL2 = cldr.getResource(TicketDeck.get(1).getimage());
            Image image2=new ImageIcon(imageURL2).getImage();
            image2 = image2.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            C2.setIcon(new ImageIcon(image2));
            C2.setBounds(10+30, 10, 70, 110);
            playerHandButtons1.add(C2);
            //System.out.println(TicketDeck.get(2).getimage());
            URL imageURL3 = cldr.getResource(TicketDeck.get(2).getimage());
            Image image3=new ImageIcon(imageURL3).getImage();
            image3 = image3.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            C3.setIcon(new ImageIcon(image3));
            C3.setBounds(10+60, 10, 70, 110);
            playerHandButtons1.add(C3);
            //System.out.println(TicketDeck.get(3).getimage());
            URL imageURL4 = cldr.getResource(TicketDeck.get(3).getimage());
            Image image4=new ImageIcon(imageURL4).getImage();
            image4 = image4.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            C4.setIcon(new ImageIcon(image4));
            C4.setBounds(10+90, 10, 70, 110);
            playerHandButtons1.add(C4);
            URL imageURL5 = cldr.getResource(TicketDeck.get(4).getimage());
            Image image5= new ImageIcon(imageURL5).getImage();
            image5 = image5.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            C5.setIcon(new ImageIcon(image5));
            C5.setBounds(10+120, 10, 70,110);
            playerHandButtons1.add(C5);
            URL imageURL6 = cldr.getResource(TicketDeck.get(5).getimage());
            Image image6= new ImageIcon(imageURL6).getImage();
            image6 = image6.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            C6.setIcon(new ImageIcon(image6));
            C6.setBounds(10+150, 10, 70,110);
            playerHandButtons1.add(C6);
            URL imageURL7 = cldr.getResource(TicketDeck.get(6).getimage());
            Image image7= new ImageIcon(imageURL7).getImage();
            image7 = image7.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            C7.setIcon(new ImageIcon(image7));
            C7.setBounds(10+180, 10, 70,110);
            playerHandButtons1.add(C7);
            URL imageURL8 = cldr.getResource(TicketDeck.get(7).getimage());
            Image image8= new ImageIcon(imageURL8).getImage();
            image8 = image8.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            C8.setIcon(new ImageIcon(image8));
            C8.setBounds(10+210, 10, 70,110);
            playerHandButtons1.add(C8);
            URL imageURL9 = cldr.getResource(TicketDeck.get(8).getimage());
            Image image9= new ImageIcon(imageURL9).getImage();
            image9 = image9.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            C9.setIcon(new ImageIcon(image9));
            C9.setBounds(10, 10, 70,110);
            playerHandButtons2.add(C9);
          //System.out.println(TicketDeck.get(1).getimage());
            URL imageURL10 = cldr.getResource(TicketDeck.get(9).getimage());
            Image image10=new ImageIcon(imageURL10).getImage();
            image10 = image10.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            C10.setIcon(new ImageIcon(image10));
            C10.setBounds(10+30, 10, 70, 110);
            playerHandButtons2.add(C10);
           // System.out.println(TicketDeck.get(2).getimage());
            URL imageURL11 = cldr.getResource(TicketDeck.get(10).getimage());
            Image image11=new ImageIcon(imageURL11).getImage();
            image11 = image11.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            C11.setIcon(new ImageIcon(image11));
            C11.setBounds(10+60, 10, 70, 110);
            playerHandButtons2.add(C11);
           // System.out.println(TicketDeck.get(3).getimage());
            URL imageURL12 = cldr.getResource(TicketDeck.get(11).getimage());
            Image image12=new ImageIcon(imageURL12).getImage();
            image12 = image12.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            C12.setIcon(new ImageIcon(image12));
            C12.setIcon(new ImageIcon(image12));
            C12.setBounds(10+90, 10, 70, 110);
            playerHandButtons2.add(C12);
            URL imageURL13 = cldr.getResource(TicketDeck.get(12).getimage());
            Image image13= new ImageIcon(imageURL13).getImage();
            image13 = image13.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            C13.setIcon(new ImageIcon(image13));
            C13.setBounds(10+120, 10, 70,110);
            playerHandButtons2.add(C13);
            URL imageURL14 = cldr.getResource(TicketDeck.get(13).getimage());
            Image image14= new ImageIcon(imageURL14).getImage();
            image14 = image14.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            C14.setIcon(new ImageIcon(image14));
            C14.setBounds(10+150, 10, 70,110);
            playerHandButtons2.add(C14);
            URL imageURL15 = cldr.getResource(TicketDeck.get(14).getimage());
            Image image15= new ImageIcon(imageURL15).getImage();
            image15 = image15.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            C15.setIcon(new ImageIcon(image15));
            C15.setBounds(10+180, 10, 70,110);
            playerHandButtons2.add(C15);
            URL imageURL16 = cldr.getResource(TicketDeck.get(15).getimage());
            Image image16= new ImageIcon(imageURL16).getImage();
            image16 = image16.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
            C16.setIcon(new ImageIcon(image16));
            C16.setBounds(10+210, 10, 70,110);
            playerHandButtons2.add(C16);
            player1Cards.add(playerHandButtons1.get(0));
            player1Cards.add(playerHandButtons1.get(1));
            player1Cards.add(playerHandButtons1.get(2));
            player1Cards.add(playerHandButtons1.get(3));
            player1Cards.add(playerHandButtons1.get(4));
            player1Cards.add(playerHandButtons1.get(5));
            player1Cards.add(playerHandButtons1.get(6));
            player1Cards.add(playerHandButtons1.get(7));
            player2Cards.add(playerHandButtons2.get(0));
            player2Cards.add(playerHandButtons2.get(1));
            player2Cards.add(playerHandButtons2.get(2));
            player2Cards.add(playerHandButtons2.get(3));
            player2Cards.add(playerHandButtons2.get(4));
            player2Cards.add(playerHandButtons2.get(5));
            player2Cards.add(playerHandButtons2.get(6));
            player2Cards.add(playerHandButtons2.get(7));
            URL imageURL17 = cldr.getResource(TicketDeck.get(16).getimage());
            Image image17= new ImageIcon(imageURL17).getImage();
            image17 = image17.getScaledInstance(50, 90, java.awt.Image.SCALE_SMOOTH);
            URL imageURL18 = cldr.getResource(TicketDeck.get(17).getimage());
            Image image18= new ImageIcon(imageURL18).getImage();
            image18 = image18.getScaledInstance(50, 90, java.awt.Image.SCALE_SMOOTH);
            URL imageURL19 = cldr.getResource(TicketDeck.get(18).getimage());
            Image image19= new ImageIcon(imageURL19).getImage();
            image19 = image19.getScaledInstance(50, 90, java.awt.Image.SCALE_SMOOTH);
            URL imageURL20 = cldr.getResource(TicketDeck.get(19).getimage());
            Image image20= new ImageIcon(imageURL20).getImage();
            image20 = image20.getScaledInstance(50, 90, java.awt.Image.SCALE_SMOOTH);
            URL imageURL21 = cldr.getResource(TicketDeck.get(20).getimage());
            Image image21= new ImageIcon(imageURL21).getImage();
            image21 = image21.getScaledInstance(50, 90, java.awt.Image.SCALE_SMOOTH);
            TrainCard1=new JButton();
            TrainCard1.setIcon(new ImageIcon(image17));
            TrainCard1.setBounds(280,400 , 50, 90);
            TrainCard2=new JButton();
            TrainCard2.setBounds(340,400 , 50, 90);
            TrainCard2.setIcon(new ImageIcon(image18));
            TrainCard3=new JButton();
            TrainCard3.setBounds(400,400 , 50, 90);
            TrainCard3.setIcon(new ImageIcon(image19));
            TrainCard4=new JButton();
            TrainCard4.setBounds(460,400 , 50, 90);
            TrainCard5=new JButton();
            TrainCard5.setBounds(520,400 , 50, 90);
            TrainCard4.setIcon(new ImageIcon(image20));
            TrainCard5.setIcon(new ImageIcon(image21));
            Traindowns.add(TrainCard1);
            Traindowns.add(TrainCard2);
            Traindowns.add(TrainCard3);
            Traindowns.add(TrainCard4);
            Traindowns.add(TrainCard5);
            for(int i=0;i<Traindowns.size();i++)
            	basic_panel.add(Traindowns.get(i));
        }
    
        public ArrayList<JButton>get_Des_on_hand(){
        	return playerDesButtons1;
        }
        public ArrayList<JButton>get_Des_on_hand2(){
        	return playerDesButtons2;
        }
        
    public void setDesNum(int num){
    	destinationCount.setText("Destination Deck: "+num);
    	basic_panel.repaint();
   }
    
    public void setTickNum(int num) {
    	trainCount.setText("Ticket Deck: "+num);
    }
  /* a class which is used for putting a background image to a jdesktoppane*/  
public class myDesktopPane extends JDesktopPane
{
   private Image backImage = null;
 
   public myDesktopPane()
   {      
      
   }
 
        @Override
   public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this);
	}
 } 
/* a class which is used for doing some action after a card button has been pushed */  
 private class CardListener implements ActionListener 	{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton but = ((JButton) e.getSource());
		player2Cards.remove(but);
	}
  
                    
                    
 }
 
 
 public void fix_it(int i,TrainCard c) {
	 
	 if(i==1) {
		 URL imageURL20 = cldr.getResource(c.getimage());
         Image image20= new ImageIcon(imageURL20).getImage();
         image20 = image20.getScaledInstance(50, 90, java.awt.Image.SCALE_SMOOTH);
         //TrainCard1=new JButton();
         TrainCard1.setIcon(new ImageIcon(image20));
         TrainCard1.setBounds(280,400 , 50, 90);
		 
	 }
	 if(i==2) {
		 URL imageURL20 = cldr.getResource(c.getimage());
         Image image20= new ImageIcon(imageURL20).getImage();
         image20 = image20.getScaledInstance(50, 90, java.awt.Image.SCALE_SMOOTH);
         //TrainCard2=new JButton();
         TrainCard2.setIcon(new ImageIcon(image20));
         TrainCard2.setBounds(340,400 , 50, 90);
		 
	 }
		if(i==3) {
			URL imageURL20 = cldr.getResource(c.getimage());
	         Image image20= new ImageIcon(imageURL20).getImage();
	         image20 = image20.getScaledInstance(50, 90, java.awt.Image.SCALE_SMOOTH);
	         //TrainCard3=new JButton();
	         TrainCard3.setIcon(new ImageIcon(image20));
	         TrainCard3.setBounds(400,400 , 50, 90);
				 
			 }
			 if(i==4) {
				 URL imageURL20 = cldr.getResource(c.getimage());
		         Image image20= new ImageIcon(imageURL20).getImage();
		         image20 = image20.getScaledInstance(50, 90, java.awt.Image.SCALE_SMOOTH);
		        // TrainCard4=new JButton();
		         TrainCard4.setIcon(new ImageIcon(image20));
		         TrainCard4.setBounds(460,400 , 50, 90);
				 
			 }
		if(i==5) {
			URL imageURL20 = cldr.getResource(c.getimage());
	         Image image20= new ImageIcon(imageURL20).getImage();
	         image20 = image20.getScaledInstance(50, 90, java.awt.Image.SCALE_SMOOTH);
	        // TrainCard5=new JButton();
	         TrainCard5.setIcon(new ImageIcon(image20));
	         TrainCard5.setBounds(520,400 , 50, 90);
				 
			 }
			 
	 
 }
 
 public void updateHand() {
	 for(int i =0; i < playerHandButtons1.size() ;i++) {
		 playerHandButtons1.get(i).setBounds(10+i*30, 10, 70, 110);
	 }
	 
 }
 
 public void updateHand2() {
	 for(int i =0; i < playerHandButtons2.size() ;i++) {
		 playerHandButtons2.get(i).setBounds(10+i*30, 10, 70, 110);
	 }
	 
 }
 
 
 public void updateDesHand() {
	 for(int i =0; i < playerDesButtons1.size() ;i++) {
		 playerDesButtons1.get(i).setBounds(10+i*20, 10, 70, 110);
	 }
	 
 }
 
 public void updateDesHand2() {
	 for(int i =0; i < playerDesButtons2.size() ;i++) {
		 playerDesButtons2.get(i).setBounds(10+i*20, 10, 70, 110);
	 }
	 
 }
 
 public void create_new_Descard1(DestinationCard c,int pos){
	 URL imageURL21 = cldr.getResource(c.getImage());
     Image image21= new ImageIcon(imageURL21).getImage();
     image21 = image21.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
     JButton newTrain=new JButton();
     newTrain.setIcon(new ImageIcon(image21));
     newTrain.setBounds(10+pos*20, 10, 70, 110);
     playerDesButtons1.add(newTrain);
	 player1Tickets.add(playerDesButtons1.get(playerDesButtons1.size()-1));
	 
 }
 
 public void create_new_Descard2(DestinationCard c,int pos){
	 URL imageURL21 = cldr.getResource(c.getImage());
     Image image21= new ImageIcon(imageURL21).getImage();
     image21 = image21.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
     JButton newTrain=new JButton();
     newTrain.setIcon(new ImageIcon(image21));
     newTrain.setBounds(10+pos*20, 10, 70, 110);
     playerDesButtons2.add(newTrain);
	 player2Tickets.add(playerDesButtons2.get(playerDesButtons2.size()-1));
	 
 }
 
 
 public void create_new_card1(TrainCard c,int pos) {
	 
	 URL imageURL21 = cldr.getResource(c.getimage());
     Image image21= new ImageIcon(imageURL21).getImage();
     image21 = image21.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
     JButton newTrain=new JButton();
     newTrain.setIcon(new ImageIcon(image21));
     newTrain.setBounds(10+pos*30, 10, 70, 110);
     playerHandButtons1.add(newTrain);
	 player1Cards.add(playerHandButtons1.get(playerHandButtons1.size()-1));
 }
 
 
public void create_new_card2(TrainCard c,int pos) {
	 
	 URL imageURL21 = cldr.getResource(c.getimage());
     Image image21= new ImageIcon(imageURL21).getImage();
     image21 = image21.getScaledInstance(70, 110, java.awt.Image.SCALE_SMOOTH);
     JButton newTrain=new JButton();
     newTrain.setIcon(new ImageIcon(image21));
     newTrain.setBounds(10+pos*30, 10, 70, 110);
     playerHandButtons2.add(newTrain);
	 player2Cards.add(playerHandButtons2.get(playerHandButtons2.size()-1));
 }
 
 
 public int GetScore1() {
	 return sum1;
 }
 public int GetScore2() {
	 return sum2;
 }
 
 
 public void SetScore1(int score11) {
	 sum1=score11;
	 this.score1.setText("Score: "+sum1);
 }
 public void SetScore2(int score22) {
	 sum2=score22;
	 this.score2.setText("Score: "+sum2);
 }
 
 
 
 public ArrayList<JButton> Getplayers1Des(){
	 return playerDesButtons1;
 }
 
 public ArrayList<JButton> Getplayers2Des(){
	 return playerDesButtons2;
 }
 
 
 public ArrayList<JButton> Getplayers1Cards(){
	 return playerHandButtons1;
 }
 
 public ArrayList<JButton> Getplayers2Cards(){
	 return playerHandButtons2;
 }
 
 public JButton getMoveFromRailButton() {
     return moveFromRailButton;
 }
 
 public JButton getPlayCardButton() {
	 return movetoRailButton;
 }
 
 public JButton getMoveFromRailButton2() {
     return moveFromRailButton2;
 }
 
 public JButton getPlayCardButton2() {
	 return movetoRailButton2;
 }
 
 
 public void moveToRail(JButton but, int position,int flag) {
	 
     if(flag==0){
       but.setBounds(330,24+position*10,70,110);
       playerRailWhiteCardsButtons.add(but);
     }
     else if(flag==1){
       but.setBounds(120,24+position*10,70,110);  
       playerRailBlueCardsButtons.add(but);
       
     }
     else if(flag==2){
      but.setBounds(57,24+position*10,70,110);    
      playerRailBlackCardsButtons.add(but);
       
     }
     else if(flag==3){
         but.setBounds(260,24+position*10,70,110);    
         playerRailPurpleCardsButtons.add(but);
          
        }
     else if(flag==4){
         but.setBounds(0,24+position*10,70,110);    
         playerRailRedCardsButtons.add(but);
          
        }
     else if(flag==5){
         but.setBounds(470,24+position*10,70,110);    
         playerRailOrangeCardsButtons.add(but);
          
        }
     else if(flag==6){
         but.setBounds(180,24+position*10,70,110);    
         playerRailGreenCardsButtons.add(but);
          
        }
     else if(flag==7){
         but.setBounds(400,24+position*10,70,110);    
         playerRailYellowCardsButtons.add(but);
          
        }
     
     
     player1Rail.add(but);
     basic_panel.repaint();
 }
 
 
 
 public void SeeThis(ArrayList<DestinationCard>A) {
	 JFrame f = new JFrame();
	 
	 
	for(int i=0;i<A.size();i++) { 
		JButton but=new JButton();
	 URL imageURL = cldr.getResource(A.get(i).getImage()); //image
     Image image = new ImageIcon(imageURL).getImage().getScaledInstance(80, 110, Image.SCALE_SMOOTH);
     but.setIcon(new ImageIcon(image));
     f.add(but);
     but.setSize(80,110);
     
	}
	f.setLayout(new GridLayout(5, 10));
    f.setSize(800,550);
    f.setVisible(true); 
	 
 }
 
 
 public void SeeThisBig(ArrayList<BigCitiesCard>A) {
	 JFrame f = new JFrame();
	 
	 
	for(int i=0;i<A.size();i++) { 
		JButton but=new JButton();
	 URL imageURL = cldr.getResource(A.get(i).getimage()); //image
     Image image = new ImageIcon(imageURL).getImage().getScaledInstance(80, 110, Image.SCALE_SMOOTH);
     but.setIcon(new ImageIcon(image));
     f.add(but);
     but.setSize(80,110);
     
	}
	f.setLayout(new GridLayout(5, 10));
    f.setSize(800,550);
    f.setVisible(true); 
	 
 }
 
 
 
 
 
 
 
public void moveToRail2(JButton but, int position,int flag) {
	 
     if(flag==0){
       but.setBounds(330,24+position*10,70,110);
       playerRailWhiteCardsButtons2.add(but);
     }
     else if(flag==1){
       but.setBounds(120,24+position*10,70,110);  
       playerRailBlueCardsButtons2.add(but);
       
     }
     else if(flag==2){
      but.setBounds(57,24+position*10,70,110);    
      playerRailBlackCardsButtons2.add(but);
       
     }
     else if(flag==3){
         but.setBounds(260,24+position*10,70,110);    
         playerRailPurpleCardsButtons2.add(but);
          
        }
     else if(flag==4){
         but.setBounds(0,24+position*10,70,110);    
         playerRailRedCardsButtons2.add(but);
          
        }
     else if(flag==5){
         but.setBounds(470,24+position*10,70,110);    
         playerRailOrangeCardsButtons2.add(but);
          
        }
     else if(flag==6){
         but.setBounds(180,24+position*10,70,110);    
         playerRailGreenCardsButtons2.add(but);
          
        }
     else if(flag==7){
         but.setBounds(400,24+position*10,70,110);    
         playerRailYellowCardsButtons2.add(but);
          
        }
     
     
     player2Rail.add(but);
     basic_panel.repaint();
 }
 
 
 
 
 
     /* a class which is used for doing some action after play button has been pushed */
      private class PlayListener implements ActionListener 	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
     
      }
      /* a class which is used for doing some action after a Fold button has been pushed */  
      private class FoldListener implements ActionListener 	{
                        /**
	 * <b>transformer(mutative)</b>:doing some action after Fold button has been pushed<br />
	 * <p><b>Postcondition:</b> doing some action after Fold button has been pushed</p>
	 *
     */
		public void actionPerformed(ActionEvent e) 	{
                        
                }
      }
    /* a class which is used for doing some action after a Tichu button has been pushed */    
    private class GameListener implements ActionListener 	{
                      /**
	 * <b>transformer(mutative)</b>:doing some action after Tichu or GrandTichu button has been pushed<br />
	 * <p><b>Postcondition:</b> doing some action after Tichu or GrandTichu button has been pushed</p>
	 *
     */
        @Override
		public void actionPerformed(ActionEvent e) 	{
                       
                }
      }
    /* a class which is used for doing some action after a Settings button has been pushed */    
    private class SettingsListener implements ActionListener 	{
                    /**
	 * <b>transformer(mutative)</b>:doing some action after New Game or Exit button has been pushed<br />
	 * <p><b>Postcondition:</b> doing some action after New Game or Exit button has been pushed</p>
	 *
     */
        @Override
		public void actionPerformed(ActionEvent e) 	{
                   
                }
    }  
}
