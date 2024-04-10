package controller;
import model.card.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JPanel;

import model.card.DestinationCard;
import model.card.TrainCard;
import model.player.Player;
import model.player.turn;
import model.railyard.Railyard;
import view.GraphicUI;

/**
 * Controller is the master of the game and controls all 
 * of the operations executed
 * @version 1.0
 * @author dxanthak - mountanton
 */
public class controller 
{
    private int points1=0,points2=0;
    private int position_of_trcards1=8;
    private int position_of_trcards2=8;
    private int position_of_descards1=8;
    private int position_of_descards2=8;
    private BigCitiesCard BigCity1=new BigCitiesCard(12,"resources/images/bigCitiesCards/Chicago.jpg");
    private BigCitiesCard BigCity2=new BigCitiesCard(10,"resources/images/bigCitiesCards/Dallas.jpg");
    private BigCitiesCard BigCity3=new BigCitiesCard(12,"resources/images/bigCitiesCards/LosAngeles.jpg");
    private BigCitiesCard BigCity4=new BigCitiesCard(8,"resources/images/bigCitiesCards/Miami.jpg");
    private BigCitiesCard BigCity5=new BigCitiesCard(15,"resources/images/bigCitiesCards/NewYork.jpg");
    private BigCitiesCard BigCity6=new BigCitiesCard(8,"resources/images/bigCitiesCards/Seattle.jpg");
    static ArrayList<DestinationCard> exodia=new ArrayList<DestinationCard>();
    private int num_red=0,num_yellow=0,num_black=0,num_blue=0,num_purple=0,num_white=0,num_locomotive=0,num_green=0,num_orange=0;
    private int num_red2=0,num_yellow2=0,num_black2=0,num_blue2=0,num_purple2=0,num_white2=0,num_locomotive2=0,num_green2=0,num_orange2=0;
    private boolean notstarted,empty_table,new_round,collectionHasPlayed;
    private static Player P1=new Player("Player1");
	private static Player P2=new Player("Player2");
	private static  boolean flag_for_p11=true;
	private static  boolean flag_for_p12=false;
	private static  boolean flag_for_p21=false;
	private static  boolean flag_for_p22=false;
    private Railyard r1=new Railyard();
    private Railyard r2=new Railyard();
    private turn turn=new turn();
    private static GraphicUI g;
    private ArrayList<Integer> buttons_position =new ArrayList<Integer>();
   // private Sullogi allcards = new Sullogi();
  //  private Sullogi cardsToPlay = new Sullogi();
    private ArrayList<TrainCard>allcards=new ArrayList<TrainCard>();
    private ArrayList<BigCitiesCard>bcP1=new ArrayList<BigCitiesCard>();
    private ArrayList<BigCitiesCard>bcP2=new ArrayList<BigCitiesCard>();
    ArrayList<TrainCard>CardsToPlay=new ArrayList<TrainCard>();
    private static ArrayList<TrainCard>Train_TicketDown=new ArrayList<TrainCard>();
    private static ArrayList<TrainCard> TicketDeck=new ArrayList<TrainCard>();
    
        /**
	* <b>constructor</b>: Constructs a new Controller and sets the game as 
	* eligible to start .<br />
	* <b>postcondition</b>: constructs a new Controller,with new 4 players,new 
        * instances of Turn Class , Round Class and Sullogi Class and initialize
        * some int or boolean variables.So,is responsible for creating a new game and 
	* initializing it.
	*/
        public void initialize() {
        	 setActionBut();
        }
        

    /**
    *<b>Observer</b>: Return true if the collection that player wanted to play , 
    * was finally played ,false otherwise
    * <p><b>Postcondition:</b> return true if the collection that player 
    * wanted to play , was finally played, false otherwise</p>
    * @return true if the collection that player 
    * wanted to play , was finally played, false otherwise
    */
            
    public boolean GetCollectionHasPlayed(){
                 System.out.println(this.collectionHasPlayed);  
                return this.collectionHasPlayed;
        }

    /**
     * <b>transformer(mutative)</b>:take an integer arraylist from view Class (there are 56 buttons and 56 cards),
     * so for example button with id 0 show the card in position 0 in allcards collection.After that
     * check if these cards  can be played and if this true, set the boolean variable collectionHasPlayed to true.
     * <p><b>Postcondition:</b>  set the collectionHasPlayed  to true if the collection played, otherwise false </p>
     * @param cardsPosition the position of the cards in allcards(Sullogi with all the 56 cards) that player wants to play 
     */ 
    public void PlayCollection(ArrayList<Integer> cardsPosition)
    {

    }
    
    /**
     * <b>accessor(selector)</b>:Returns which player has the turn <br />
     * 
     * <p><b>Postcondition:</b> Returns which player has the turn </p>
     *
     * @return which player has the turn (for example 0 if p1 has the turn )
     */
    public int seeTurn()
    {
        return turn.getID();
    }
    
    
    /**
     * <b>transformer(mutative)</b>:if a player press the button fold ,it increases
     * the variable fold (fold++) or sets the variable fold to 0 if a round finished
     * and of course gives the turn to next player
     * <p><b>Postcondition:</b> increase the fold variable(fold++) 
     * or if a round finished sets the fold to 0 and of course give the turn to next player</p>
     */ 
    public void set_Fold()
    {

    }
    
    
    /**
     *<b>Observer</b>: Return true if the table is empty false otherwise
     * (table:the space in which the players drop their cards)
     * <p><b>Postcondition:</b> return  true if the table is empty 
     * false otherwise
     * @return true if the table is empty false otherwise
     */
    public boolean tableIsEmpty()
    {
        
        return this.empty_table;
    }
    
    
    /**
     * <b>transformer(mutative)</b>: sets the variable not_started to false
     * <p><b>Postcondition:</b>  sets the variable not_started to false</p>
     */ 
    public void set_started()
    {
        this.notstarted=false;
    }
    
    
    /*
     *<b>Observer</b>: Return true if the game has not started  false otherwise
     * <p><b>Postcondition:</b> return true if the game  has not started  false otherwise
     * @return true if the game has not started  false otherwise
     */
    public boolean not_started()
    {
        return this.notstarted;
    }
    
    
    
    
    
    /**
     * <b>transformer(mutative):</b> increases the variable isready by 1(isready++)
     * <p><b>Postcondition:</b>  increases the variable isready by 1(isready++)</p>
     */ 
    public void isready()
    {
        
    }
       
    /**
     * <b>transformer(mutative):</b> sort the cards for each player 
     * <p><b>Postcondition:</b> sort the cards for each player  </p>
     */ 
    public void sort_cards()
    {
        
    }
    
    
   
    
    
    /**
     * <b>transformer(mutative)</b>: sets the score of a game after one deal(partida) has finished
     * <p><b>Postcondition:</b>  sets the score of a game after one deal(partida) has finished </p>
     */ 
    public void setScore()
    {
        
    }
    
  
   /**
    * <b>accessor(selector)</b>:Returns the score of the game <br />
    * <p><b>Postcondition:</b> returns the score of the game </p>
    * @return the number of players which are ready for dealing the last 6 cards
    */
    public int GetScore()
    {
        return 1;
    }
    
    
   
    
   /**
    * <b>transformer(mutative)</b>: initializes players cards in the beginning
    * <p><b>Postcondition:</b> initializes players cards in the beginning </p>
    */ 
    public void init_player_cards()
    {
       
    }
    
    
   /**
    * <b>transformer(mutative)</b>: initializes some things(allcards,turn,round) for a new deal(partida)
    * <p><b>Postcondition:</b>  initializes some things(allcards,turn,round) for a new deal(partida)</p>
    */ 
    public void init_table()
    {
          
    }
    
   /**
    *<b>Observer</b>: Return true if we have a new round false otherwise
    * <p><b>Postcondition:</b> return true if we have a new round false otherwise
    * </p>
    * @return true if we have a new round false otherwise
    */
    public boolean Get_new_round()
    {
        return this.new_round;
    }
    
    
   /**
    * <b>transformer(mutative)</b>: make changes after a round started
    * <p><b>Postcondition:</b> make changes after a round started </p>
    * @param cardsPosition 
    */ 
    public void makeChanges(ArrayList<Integer> cardsPosition)
    {
               
    }
    
   
   
    
   /**
    * <b>Observer</b>:Return true if a deal(partida) has finished, false otherwise
    * <p><b>Postcondition:</b> return true if a deal(partida) has finished, false otherwise
    * </p>
    * @return true if a deal(partida) has finished, false otherwise
    */
    public boolean partida_has_finished()
    {

        return false;
    }

    
   /**
    * <b>Observer</b>:Return true if a game(one team reaches 1000 points) has finished, false otherwise
    * <p><b>Postcondition:</b> return true if a game(one team reaches 1000 points)  has finished, false otherwise
    * </p>
    * @return true if a game(one team reaches 1000 points) has finished, false otherwise
    */
    public boolean game_has_finished()
    {
       if(exodia.size()==0||TicketDeck.size()==0)return true;
       if(g.GetScore1()>=100||g.GetScore2()>=100)return true;
        return false;
    }
    
    /**
     * <b>transformer(mutative)</b>: give the turn to player1
     * <p><b>Postcondition:</b> give the turn to player1 in the beggining</p>
     */ 
    public void set_Turn()
    {
     
       
    }

    
    
    public static void main(String[] args) {
    	
    	
    	
    	g=new GraphicUI();
    	g. initComponents();
    	g.setVisible(true);
    	
    	
    	Deck d = new Deck();
    	try {
			d.readCards("destinationCards.csv");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	exodia=d.eksafanise();
    	g.setDesNum(exodia.size());
    	
    	for(int i=0;i<10;i++) {
    		TrainCard T=new TrainCard("Red","resources/images/trainCards/red.jpg");
    		TicketDeck.add(T);
    	}
    	for(int i=0;i<10;i++) {
    		TrainCard T=new TrainCard("Orange","resources/images/trainCards/orange.jpg");
    		TicketDeck.add(T);
    	}
    	
    	for(int i=0;i<10;i++) {
    		TrainCard T=new TrainCard("Blue","resources/images/trainCards/blue.jpg");
    		TicketDeck.add(T);
    	}
    	for(int i=0;i<10;i++) {
    		TrainCard T=new TrainCard("Black","resources/images/trainCards/black.jpg");
    		TicketDeck.add(T);
    	}
    	for(int i=0;i<10;i++) {
    		TrainCard T=new TrainCard("Purple","resources/images/trainCards/purple.jpg");
    		TicketDeck.add(T);
    	}
    	for(int i=0;i<10;i++) {
    		TrainCard T=new TrainCard("Yellow","resources/images/trainCards/yellow.jpg");
    		TicketDeck.add(T);
    	}
    	for(int i=0;i<10;i++) {
    		TrainCard T=new TrainCard("White","resources/images/trainCards/white.jpg");
    		TicketDeck.add(T);
    	}
    	for(int i=0;i<10;i++) {
    		TrainCard T=new TrainCard("Green","resources/images/trainCards/green.jpg");
    		TicketDeck.add(T);
    	}
    	for(int i=0;i<16;i++) {
    		TrainCard T=new TrainCard("Locomotive","resources/images/trainCards/locomotive.jpg");
    		TicketDeck.add(T);
    	}
    	
    	
    	g.setTickNum(exodia.size());
    	Collections.shuffle(TicketDeck);
    	Collections.shuffle(exodia);
    	g.setFirstCards(TicketDeck,exodia);
    	for(int i=0;i<8;i++)P1.A.add(TicketDeck.get(i));
    	for(int i=8;i<16;i++)P2.A.add(TicketDeck.get(i));
    	for(int i=16;i<21;i++)Train_TicketDown.add(TicketDeck.get(i));
    	for(int i=0;i<21;i++) TicketDeck.remove(i);
    	for(int i=0;i<4;i++)P1.Destination_on_hand.add(exodia.get(i));
    	for(int i=4;i<8;i++)P2.Destination_on_hand.add(exodia.get(i));
    	for(int i=0;i<8;i++) exodia.remove(i);
    	g.setDesNum(exodia.size());
    	g.setTickNum(TicketDeck.size());
    	
    	for(int i=0;i<4;i++) {
    		g.SetScore1(g.GetScore1()-P1.Destination_on_hand.get(i).getPoints());
    	}
    	for(int i=0;i<4;i++) {
    		g.SetScore2(g.GetScore2()-P2.Destination_on_hand.get(i).getPoints());
    	}
    	
    	controller c =new controller();
    	c.initialize();
    	
          
        
    }
    
    public boolean SeeValuation(ArrayList<TrainCard>Set) {
    	int[]array= {0,0,0,0,0,0,0,0,0};
    	int sum=0;
    	int total=0;
    	 if(Set.size()==1)return false;
    	for(int i=0;i<Set.size();i++) {
    		if(Set.get(i).getColor().equals("Red"))
    			array[0]++;
    		if(Set.get(i).getColor().equals("Black"))
    			array[1]++;
    		if(Set.get(i).getColor().equals("Blue"))
    			array[2]++;
    		if(Set.get(i).getColor().equals("Green"))
    			array[3]++;
    		if(Set.get(i).getColor().equals("Purple"))
    			array[4]++;
    		if(Set.get(i).getColor().equals("White"))
    			array[5]++;
    		if(Set.get(i).getColor().equals("Yellow"))
    			array[6]++;
    		if(Set.get(i).getColor().equals("Orange"))
    			array[7]++;
    		if(Set.get(i).getColor().equals("Locomotive"))
    			array[8]++;
    	}
    	
    	if(array[0]!=0) 
    		if(P1.R.getRedCards().size()!=0) return false;
    	if(array[1]!=0) 
    		if(P1.R.getBlackCards().size()!=0) return false;
    	if(array[2]!=0) 
    		if(P1.R.getBlueCards().size()!=0) return false;
    	if(array[3]!=0) 
    		if(P1.R.getGreenCards().size()!=0) return false;
    	if(array[4]!=0) 
    		if(P1.R.getPurpleCards().size()!=0) return false;
    	if(array[5]!=0) 
    		if(P1.R.getWhiteCards().size()!=0) return false;
    	if(array[6]!=0) 
    		if(P1.R.getYellowCards().size()!=0) return false;
    	if(array[7]!=0) 
    		if(P1.R.getOrangeCards().size()!=0) return false;
    	
    	System.out.println("meta apo edo einai false");
    	total=array[0]+array[8];
    	if(array[0]!=0) 
    		if(P2.R.getRedCards().size()>=total) return false;
    	total=array[1]+array[8];
    	if(array[1]!=0) 
    		if(P2.R.getBlackCards().size()>=total) return false;
    	total=array[2]+array[8];
    	if(array[2]!=0) 
    		if(P2.R.getBlueCards().size()>=total) return false;
    	total=array[3]+array[8];
    	if(array[3]!=0) 
    		if(P2.R.getGreenCards().size()>=total) return false;
    	total=array[4]+array[8];
    	if(array[4]!=0) 
    		if(P2.R.getPurpleCards().size()>=total) return false;
    	total=array[5]+array[8];
    	if(array[5]!=0) 
    		if(P2.R.getWhiteCards().size()>=total) return false;
    	total=array[6]+array[8];
    	if(array[6]!=0) 
    		if(P2.R.getYellowCards().size()>=total) return false;
    	total=array[7]+array[8];
    	if(array[7]!=0) 
    		if(P2.R.getOrangeCards().size()>=total) return false;
    	System.out.println("to false");
    	total=array[0]+array[8];
    	if(array[0]!=0)
    	if(P2.R.getRedCards().size()<total) {
    		for(int i=0;i<g.getPlayerRailRedCardsButtons2().size();i++)
        		g.getPlayerRailRedCardsButtons2().get(i).setVisible(false);
    		P2.R.getRedCards().clear();
    	}
    	total=array[1]+array[8];
    	if(array[1]!=0)
    	if(P2.R.getBlackCards().size()<total) {
    		for(int i=0;i<g.getPlayerRailBlackCardsButtons2().size();i++)
        		g.getPlayerRailBlackCardsButtons2().get(i).setVisible(false);
    		P2.R.getBlackCards().clear();
    	}
    	total=array[2]+array[8];
    	if(array[2]!=0)
    	if(P2.R.getBlueCards().size()<total) {
    		for(int i=0;i<g.getPlayerRailBlueCardsButtons2().size();i++)
    		g.getPlayerRailBlueCardsButtons2().get(i).setVisible(false);
    		P2.R.getBlueCards().clear();
    	}
    	total=array[3]+array[8];
    	if(array[3]!=0)
    	if(P2.R.getGreenCards().size()<total) {
    		for(int i=0;i<g.getPlayerRailGreenCardsButtons2().size();i++)
        		g.getPlayerRailGreenCardsButtons2().get(i).setVisible(false);
    		P2.R.getGreenCards().clear();
    	}
    	total=array[4]+array[8];
    	if(array[4]!=0)
    	if(P2.R.getPurpleCards().size()<total) {
    		for(int i=0;i<g.getPlayerRailPurpleCardsButtons2().size();i++)
        		g.getPlayerRailPurpleCardsButtons2().get(i).setVisible(false);
    		P2.R.getPurpleCards().clear();
    	}
    	total=array[5]+array[8];
    	if(array[5]!=0)
    	if(P2.R.getWhiteCards().size()<total) {
    		for(int i=0;i<g.getPlayerRailWhiteCardsButtons2().size();i++)
        		g.getPlayerRailWhiteCardsButtons2().get(i).setVisible(false);
    		P2.R.getWhiteCards().clear();
    	}
    	total=array[6]+array[8];
    	if(array[6]!=0)
    	if(P2.R.getYellowCards().size()<total) {
    		for(int i=0;i<g.getPlayerRailYellowCardsButtons2().size();i++)
        		g.getPlayerRailYellowCardsButtons2().get(i).setVisible(false);
    		
    		P2.R.getYellowCards().clear();
    	}
    	total=array[7]+array[8];
    	if(array[7]!=0)
    	if(P2.R.getOrangeCards().size()<total) {
    		for(int i=0;i<g.getPlayerRailOrangeCardsButtons2().size();i++)
        		g.getPlayerRailOrangeCardsButtons2().get(i).setVisible(false);
    		P2.R.getOrangeCards().clear();
    	}
    	
    	for(int i=0;i<9;i++) {
    		sum+=array[i];
    	}
    	if(sum==array[8])return false;
    	
    	if(sum>=2) {
    		for(int i=0;i<9;i++) {
    			if(sum==array[i])return true;
    		if(array[i]!=0) 
    			if(sum==array[i]+array[8])return true;
    		
    		
    		}
    	if(sum==3) {
    		if(array[8]==1)return false;
    		for(int i=0;i<9;i++) {
    			if(array[i]>1)return false;
    		}
    		return true;
    	}
    	
    		return false;
    	}
    	
    	    	
    	
    	
    	
    	return true;
    }
    
    
    
    
    
    public boolean SeeValuation2(ArrayList<TrainCard>Set) {
    	int[]array= {0,0,0,0,0,0,0,0,0};
    	int sum=0;
    	int total=0;
    	 if(Set.size()==1)return false;
    	for(int i=0;i<Set.size();i++) {
    		if(Set.get(i).getColor().equals("Red"))
    			array[0]++;
    		if(Set.get(i).getColor().equals("Black"))
    			array[1]++;
    		if(Set.get(i).getColor().equals("Blue"))
    			array[2]++;
    		if(Set.get(i).getColor().equals("Green"))
    			array[3]++;
    		if(Set.get(i).getColor().equals("Purple"))
    			array[4]++;
    		if(Set.get(i).getColor().equals("White"))
    			array[5]++;
    		if(Set.get(i).getColor().equals("Yellow"))
    			array[6]++;
    		if(Set.get(i).getColor().equals("Orange"))
    			array[7]++;
    		if(Set.get(i).getColor().equals("Locomotive"))
    			array[8]++;
    	}
    	
    	if(array[0]!=0) 
    		if(P2.R.getRedCards().size()!=0) return false;
    	if(array[1]!=0) 
    		if(P2.R.getBlackCards().size()!=0) return false;
    	if(array[2]!=0) 
    		if(P2.R.getBlueCards().size()!=0) return false;
    	if(array[3]!=0) 
    		if(P2.R.getGreenCards().size()!=0) return false;
    	if(array[4]!=0) 
    		if(P2.R.getPurpleCards().size()!=0) return false;
    	if(array[5]!=0) 
    		if(P2.R.getWhiteCards().size()!=0) return false;
    	if(array[6]!=0) 
    		if(P2.R.getYellowCards().size()!=0) return false;
    	if(array[7]!=0) 
    		if(P2.R.getOrangeCards().size()!=0) return false;
    	
    	System.out.println("meta apo edo einai false");
    	total=array[0]+array[8];
    	if(array[0]!=0) 
    		if(P1.R.getRedCards().size()>=total) return false;
    	total=array[1]+array[8];
    	if(array[1]!=0) 
    		if(P1.R.getBlackCards().size()>=total) return false;
    	total=array[2]+array[8];
    	if(array[2]!=0) 
    		if(P1.R.getBlueCards().size()>=total) return false;
    	total=array[3]+array[8];
    	if(array[3]!=0) 
    		if(P1.R.getGreenCards().size()>=total) return false;
    	total=array[4]+array[8];
    	if(array[4]!=0) 
    		if(P1.R.getPurpleCards().size()>=total) return false;
    	total=array[5]+array[8];
    	if(array[5]!=0) 
    		if(P1.R.getWhiteCards().size()>=total) return false;
    	total=array[6]+array[8];
    	if(array[6]!=0) 
    		if(P1.R.getYellowCards().size()>=total) return false;
    	total=array[7]+array[8];
    	if(array[7]!=0) 
    		if(P1.R.getOrangeCards().size()>=total) return false;
    	System.out.println("to false");
    	total=array[0]+array[8];
    	if(array[0]!=0)
    	if(P1.R.getRedCards().size()<total) {
    		for(int i=0;i<g.getPlayerRailRedCardsButtons().size();i++)
        		g.getPlayerRailRedCardsButtons().get(i).setVisible(false);
    		P1.R.getRedCards().clear();
    	}
    	total=array[1]+array[8];
    	if(array[1]!=0)
    	if(P1.R.getBlackCards().size()<total) {
    		for(int i=0;i<g.getPlayerRailBlackCardsButtons().size();i++)
        		g.getPlayerRailBlackCardsButtons().get(i).setVisible(false);
    		P1.R.getBlackCards().clear();
    	}
    	total=array[2]+array[8];
    	if(array[2]!=0)
    	if(P1.R.getBlueCards().size()<total) {
    		for(int i=0;i<g.getPlayerRailBlueCardsButtons().size();i++)
        		g.getPlayerRailBlueCardsButtons().get(i).setVisible(false);
    		P1.R.getBlueCards().clear();
    	}
    	total=array[3]+array[8];
    	if(array[3]!=0)
    	if(P1.R.getGreenCards().size()<total) {
    		for(int i=0;i<g.getPlayerRailGreenCardsButtons().size();i++)
        		g.getPlayerRailGreenCardsButtons().get(i).setVisible(false);
    		P1.R.getGreenCards().clear();
    	}
    	total=array[4]+array[8];
    	if(array[4]!=0)
    	if(P1.R.getPurpleCards().size()<total) {
    		for(int i=0;i<g.getPlayerRailPurpleCardsButtons().size();i++)
        		g.getPlayerRailPurpleCardsButtons().get(i).setVisible(false);
    		P1.R.getPurpleCards().clear();
    	}
    	total=array[5]+array[8];
    	if(array[5]!=0)
    	if(P1.R.getWhiteCards().size()<total) {
    		for(int i=0;i<g.getPlayerRailWhiteCardsButtons().size();i++)
        		g.getPlayerRailWhiteCardsButtons().get(i).setVisible(false);
    		P1.R.getWhiteCards().clear();
    	}
    	total=array[6]+array[8];
    	if(array[6]!=0)
    	if(P1.R.getYellowCards().size()<total) {
    		for(int i=0;i<g.getPlayerRailYellowCardsButtons().size();i++)
        		g.getPlayerRailYellowCardsButtons().get(i).setVisible(false);
    		P1.R.getYellowCards().clear();
    	}
    	total=array[7]+array[8];
    	if(array[7]!=0)
    	if(P1.R.getOrangeCards().size()<total) {
    		for(int i=0;i<g.getPlayerRailOrangeCardsButtons().size();i++)
        		g.getPlayerRailOrangeCardsButtons().get(i).setVisible(false);
    		P1.R.getOrangeCards().clear();
    	}
    	
    	for(int i=0;i<9;i++) {
    		sum+=array[i];
    	}
    	if(sum==array[8])return false;
    	
    	if(sum>=2) {
    		for(int i=0;i<9;i++) {
    			if(sum==array[i])return true;
    		if(array[i]!=0) 
    			if(sum==array[i]+array[8])return true;
    		
    		
    		}
    	if(sum==3) {
    		if(array[8]==1)return false;
    		for(int i=0;i<9;i++) {
    			if(array[i]>1)return false;
    		}
    		return true;
    	}
    	
    		return false;
    	}
    	
    	    	
    	
    	
    	
    	return true;
    }
    
    
    
    
    
    public void setActionBut() {
      	 for (int i = 0; i < g.Getplayers1Cards().size(); i++) {
               g.Getplayers1Cards().get(i).addActionListener(new PlayerAreaListener());
           }
      	for (int i = 0; i < g.Getplayers2Cards().size(); i++) {
            g.Getplayers2Cards().get(i).addActionListener(new PlayerAreaListener2());
        }
           g.getMoveFromRailButton().addActionListener(new MoveFromRailListener());
           g.getPlayCardButton().addActionListener(new MoveToRailListener());
           g.getMoveFromRailButton2().addActionListener(new MoveFromRailListener2());
           g.getPlayCardButton2().addActionListener(new MoveToRailListener2());
           for (int i = 0; i < g.get_Des_on_hand2().size(); i++) {
               g.get_Des_on_hand2().get(i).addActionListener(new Take_Card_from_Ups2());
           }
           
           for (int i = 0; i < g.get_Des_on_hand().size(); i++) {
               g.get_Des_on_hand().get(i).addActionListener(new Take_Card_from_Ups());
           }
           g.destinationTickets.addActionListener(new Pull_for_Des());
           g.TrainCard1.addActionListener(new Cards_down_to());
           g.TrainCard2.addActionListener(new Cards_down_to());
           g.TrainCard3.addActionListener(new Cards_down_to());
           g.TrainCard4.addActionListener(new Cards_down_to());
           g.TrainCard5.addActionListener(new Cards_down_to());
           g.TicketDeck.addActionListener(new Pull_for_Ticket());
           g.BigCitiesBonus1.addActionListener(new Big_City());
           g.BigCitiesBonus2.addActionListener(new Big_City());
           g.BigCitiesBonus3.addActionListener(new Big_City());
           g.BigCitiesBonus4.addActionListener(new Big_City());
           g.BigCitiesBonus5.addActionListener(new Big_City());
           g.BigCitiesBonus6.addActionListener(new Big_City());
           g.destinationTickets1.addActionListener(new SeeTheCards());
           g.destinationTickets2.addActionListener(new SeeTheCards2());
           g.BigCities.addActionListener(new SeeTheBCards());
           g.BigCities2.addActionListener(new SeeTheBCards2());
      }
    
    
    private class SeeTheCards implements ActionListener {

        public void actionPerformed(ActionEvent e) {
        	g.SeeThis(P1.Destination_on_mpaza);
    }
    }
    private class SeeTheCards2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
        	g.SeeThis(P2.Destination_on_mpaza);
    }
    }
    
    
    private class SeeTheBCards implements ActionListener {

        public void actionPerformed(ActionEvent e) {
        	g.SeeThisBig(bcP1);
    }
    }
    private class SeeTheBCards2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
        	g.SeeThisBig(bcP2);
    }
    }
    
    
    private class Cards_down_to implements ActionListener {

        public void actionPerformed(ActionEvent e) {
        	if(flag_for_p12==true || flag_for_p22==true){
        	JButton but = ((JButton) e.getSource());
            TrainCard c ;
            TrainCard change;
            int x;
            change=TicketDeck.get(0);
     	    TicketDeck.remove(0);
     	    g.setTickNum(TicketDeck.size());
           if(but==g.TrainCard1) {
        	   
        	   c=Train_TicketDown.get(0);
        	   if(flag_for_p12==true) {
        		   
        	   P1.A.add(c);
        	   	g.create_new_card1(c,position_of_trcards1);
        	   	position_of_trcards1++;
        	   	g.Getplayers1Cards().get(g.Getplayers1Cards().size()-1).addActionListener(new PlayerAreaListener());
        	   }
        	   if(flag_for_p22==true) {
            	   P2.A.add(c);
            	   	g.create_new_card2(c,position_of_trcards2);
            	   	position_of_trcards2++;
            	   	g.Getplayers2Cards().get(g.Getplayers2Cards().size()-1).addActionListener(new PlayerAreaListener2());
            	   }
        	  	g.fix_it(1,change);
        	   
        	   Train_TicketDown.set(0, change);
        	  
           }
		 if(but==g.TrainCard2) {
		        	   
		        	   c=Train_TicketDown.get(1);
		        	   if(flag_for_p12==true) {
		            	   P1.A.add(c);
		            	   	g.create_new_card1(c,position_of_trcards1);
		            	   	position_of_trcards1++;
		            	   	g.Getplayers1Cards().get(g.Getplayers1Cards().size()-1).addActionListener(new PlayerAreaListener());
		            	   }
		            	   if(flag_for_p22==true) {
		                	   P2.A.add(c);
		                	   	g.create_new_card2(c,position_of_trcards2);
		                	   	position_of_trcards2++;
		                	   	g.Getplayers2Cards().get(g.Getplayers2Cards().size()-1).addActionListener(new PlayerAreaListener2());
		                	   }
		        	  g.fix_it(2,change);  
		        	  Train_TicketDown.set(1, change);
		           }
		 if(but==g.TrainCard3) {
			   
			   c=Train_TicketDown.get(2);
			   if(flag_for_p12==true) {
	        	   P1.A.add(c);
	        	   	g.create_new_card1(c,position_of_trcards1);
	        	   	g.Getplayers1Cards().get(g.Getplayers1Cards().size()-1).addActionListener(new PlayerAreaListener());
	        	   	position_of_trcards1++;
	        	   }
	        	   if(flag_for_p22==true) {
	            	   P2.A.add(c);
	            	   	g.create_new_card2(c,position_of_trcards2);
	            	   	g.Getplayers2Cards().get(g.Getplayers2Cards().size()-1).addActionListener(new PlayerAreaListener2());
	            	   	position_of_trcards2++;
	            	   }
			  g.fix_it(3,change);
			  Train_TicketDown.set(2, change);
		 }
		 if(but==g.TrainCard4) {
			   
			   c=Train_TicketDown.get(3);
			   if(flag_for_p12==true) {
	        	   P1.A.add(c);
	        	   	g.create_new_card1(c,position_of_trcards1);
	        	   	g.Getplayers1Cards().get(g.Getplayers1Cards().size()-1).addActionListener(new PlayerAreaListener());
	        	   	position_of_trcards1++;
	        	   }
	        	   if(flag_for_p22==true) {
	            	   P2.A.add(c);
	            	   	g.create_new_card2(c,position_of_trcards2);
	            	   	g.Getplayers2Cards().get(g.Getplayers2Cards().size()-1).addActionListener(new PlayerAreaListener2());
	            	   	position_of_trcards2++;
	            	   }
			  g.fix_it(4,change);
			  Train_TicketDown.set(3, change);
		 }
		 if(but==g.TrainCard5) {
			   
			   c=Train_TicketDown.get(4);
			   if(flag_for_p12==true) {
	        	   P1.A.add(c);
	        	   	g.create_new_card1(c,position_of_trcards1);
	        	   	g.Getplayers1Cards().get(g.Getplayers1Cards().size()-1).addActionListener(new PlayerAreaListener());
	        	   	position_of_trcards1++;
	        	   }
	        	   if(flag_for_p22==true) {
	            	   P2.A.add(c);
	            	   	g.create_new_card2(c,position_of_trcards2);
	            	   	g.Getplayers2Cards().get(g.Getplayers2Cards().size()-1).addActionListener(new PlayerAreaListener2());
	            	   	position_of_trcards2++;
	            	   }
			  g.fix_it(5,change);
			  Train_TicketDown.set(4, change);
		 }
 
		 
           g.setTickNum(TicketDeck.size());
           g.updateHand2();
           g.updateHand();
        }
        	if(flag_for_p12==true) {
        		flag_for_p12=false;
        		flag_for_p21=true;
        		g.P1.setText("Player1: False");
    			g.P2.setText("Player2: True");
        	}
        		if(flag_for_p22==true) {
        			flag_for_p22=false;
            		flag_for_p11=true;
            		g.P1.setText("Player1: True");
	    			g.P2.setText("Player2: False");
        	}
    }
    }
   
    public boolean isAllValuesDeff(ArrayList<Integer>A,int x ){
        if(A.size()>1) {
        	int num;
        	for(int i=0;i<A.size();i++) {
        		num=A.get(i);
        		for(int j=0;j<A.size();j++) {
        			if(j!=i) {
        				if(num==A.get(j)) return false;
        			}
        		}
        		
        		
        	}
        	for(int i=0;i<A.size();i++)
        		if(A.get(i)==x)return false;
        		
        		
        }
    	if(A.size()==1 && A.get(0)==x)return false;
    	
    	return true;
    }
    
    private class PlayerAreaListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JButton but = ((JButton) e.getSource());
            TrainCard c ;
            if(flag_for_p12==true) {
                int x = g.Getplayers1Cards().indexOf(but);
                for(int i=0;i<P1.A.size() ;i++)
                	System.out.print(P1.A.get(i).getColor());
              //  if(x==-1) but.setVisible(false);
                System.out.println("to x einai "+x);
                if(isAllValuesDeff(buttons_position,x)) {
                	c = P1.A.get(x);
                	buttons_position.add(x);
                	CardsToPlay.add(c);
                g.Getplayers1Cards().get(x).setBounds(g.Getplayers1Cards().get(x).getBounds().x,g.Getplayers1Cards().get(x).getBounds().y-10,70,110);
                }
           
            	  System.out.println(buttons_position);
        }
        }
    }
    
    
    
    private class PlayerAreaListener2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JButton but = ((JButton) e.getSource());
            TrainCard c ;
            if(flag_for_p22==true) {
                int x = g.Getplayers2Cards().indexOf(but);
                for(int i=0;i<P2.A.size() ;i++)
                	System.out.print(P2.A.get(i).getColor());
              //  if(x==-1) but.setVisible(false);
                System.out.println("to x einai "+x);
                if(isAllValuesDeff(buttons_position,x)) {
                	c = P2.A.get(x);
                	buttons_position.add(x);
                	CardsToPlay.add(c);
                g.Getplayers2Cards().get(x).setBounds(g.Getplayers2Cards().get(x).getBounds().x,g.Getplayers2Cards().get(x).getBounds().y-10,70,110);
                }
           
            	  System.out.println(buttons_position);
        }
        }
    }
    
    
    
    
    
    
    
    public void updateRailAndTrack() {
        String info="";
        if (P1.R.getWhiteCards().size() > 0) {
            int lastOne = P1.R.getWhiteCards().size() - 1;
            System.out.println(lastOne);
            if(P1.R.getWhiteCards().get(lastOne).getColor().equals("White")) {
            	num_white++;
                g.updateWhiteCardsWon(num_white);
            }
            else { 
            	num_locomotive++;
            	g.updateNoColorCardsWon(num_locomotive);
            	
            }
            P1.R.getWhiteCards().remove(lastOne);
           P1.setWhiteCardsWon(P1.getWhiteCardsWon() + 1);

           
            g.getPlayerRailWhiteCardsButtons().get(lastOne).setVisible(false);
            g.getPlayerRailWhiteCardsButtons().remove(lastOne);
           

        }
        if (P1.R.getBlueCards().size() > 0) {
            int lastOne = P1.R.getBlueCards().size() - 1;
            System.out.println(lastOne);
            if(P1.R.getBlueCards().get(lastOne).getColor().equals("Blue")) {
            	num_blue++;
                g.updateBlueCardsWon(num_blue);
                
            }
            else { 
            	num_locomotive++;
            	g.updateNoColorCardsWon(num_locomotive);
            	
            }
            P1.R.getBlueCards().remove(lastOne);
            P1.setBlueCardsWon(P1.getBlueCardsWon() + 1);

           
            g.getPlayerRailBlueCardsButtons().get(lastOne).setVisible(false);
            g.getPlayerRailBlueCardsButtons().remove(lastOne);
            
        }
        if (P1.R.getBlackCards().size() > 0) {
             int lastOne = P1.R.getBlackCards().size() - 1;
             System.out.println(lastOne);
            if(P1.R.getBlackCards().get(lastOne).getColor().equals("Black")) {
            	 num_black++;
                g.updateBlackCardsWon(num_black);
               
            }
            else { 
            	num_locomotive++;
            	g.updateNoColorCardsWon(num_locomotive);
            	
            }
            P1.R.getBlackCards().remove(lastOne);
            P1.setBlackCardsWon(P1.getBlackCardsWon() + 1);
           
            g.getPlayerRailBlackCardsButtons().get(lastOne).setVisible(false);
             g.getPlayerRailBlackCardsButtons().remove(lastOne);     
    }
        if (P1.R.getRedCards().size() > 0) {
            int lastOne = P1.R.getRedCards().size() - 1;
            System.out.println(lastOne);
            if(P1.R.getRedCards().get(lastOne).getColor().equals("Red")) {
            	 num_red++;
                g.updateRedCardsWon(num_red);
               
            }
            else { 
            	num_locomotive++;
            	g.updateNoColorCardsWon(num_locomotive);
            	
            }
           P1.R.getRedCards().remove(lastOne);
           P1.setRedCardsWon(P1.getRedCardsWon() + 1);
           
           
          
           g.getPlayerRailRedCardsButtons().get(lastOne).setVisible(false);
            g.getPlayerRailRedCardsButtons().remove(lastOne);     
   }
        if (P1.R.getGreenCards().size() > 0) {
            int lastOne = P1.R.getGreenCards().size() - 1;
            System.out.println(lastOne);
            if(P1.R.getGreenCards().get(lastOne).getColor().equals("Green")) {
            	num_green++;
                g.updateGreenCardsWon(num_green);
                
            }
            else { 
            	num_locomotive++;
            	g.updateNoColorCardsWon(num_locomotive);
            	
            }
           P1.R.getGreenCards().remove(lastOne);
           P1.setGreenCardsWon(P1.getGreenCardsWon() + 1);
           
           
          
           g.getPlayerRailGreenCardsButtons().get(lastOne).setVisible(false);
            g.getPlayerRailGreenCardsButtons().remove(lastOne);     
   }
        if (P1.R.getYellowCards().size() > 0) {
            int lastOne = P1.R.getYellowCards().size() - 1;
            System.out.println(lastOne);
            if(P1.R.getYellowCards().get(lastOne).getColor().equals("Yellow")) {
            	 num_yellow++;
                g.updateYellowCardsWon(num_yellow);
               
            }
            else { 
            	num_locomotive++;
            	g.updateNoColorCardsWon(num_locomotive);
            	
            }
           P1.R.getYellowCards().remove(lastOne);
           P1.setYellowCardsWon(P1.getYellowCardsWon() + 1);
           
           
           g.getPlayerRailYellowCardsButtons().get(lastOne).setVisible(false);
            g.getPlayerRailYellowCardsButtons().remove(lastOne);     
   }
        if (P1.R.getPurpleCards().size() > 0) {
            int lastOne = P1.R.getPurpleCards().size() - 1;
            System.out.println(lastOne);
            if(P1.R.getPurpleCards().get(lastOne).getColor().equals("Purple")) {
            	num_purple++;
                g.updatePurpleCardsWon(num_purple);
                
            }
            else { 
            	num_locomotive++;
            	g.updateNoColorCardsWon(num_locomotive);
            	
            }
           P1.R.getPurpleCards().remove(lastOne);
           P1.setPurpleCardsWon(P1.getPurpleCardsWon() + 1);
           
           
           
           g.getPlayerRailPurpleCardsButtons().get(lastOne).setVisible(false);
            g.getPlayerRailPurpleCardsButtons().remove(lastOne);     
   }
        if (P1.R.getOrangeCards().size() > 0) {
            int lastOne = P1.R.getOrangeCards().size() - 1;
            System.out.println(lastOne);
            if(P1.R.getOrangeCards().get(lastOne).getColor().equals("Orange")) {
            	 num_orange++;
                g.updateOrangeCardsWon(num_orange);
               
            }
            else { 
            	num_locomotive++;
            	g.updateNoColorCardsWon(num_locomotive);
            	
            }
           P1.R.getOrangeCards().remove(lastOne);
           P1.setOrangeCardsWon(P1.getOrangeCardsWon() + 1);
           
           
          
           g.getPlayerRailOrangeCardsButtons().get(lastOne).setVisible(false);
            g.getPlayerRailOrangeCardsButtons().remove(lastOne);     
   }
        
    }

    
    
    
    public void updateRailAndTrack2() {
        String info="";
        if (P2.R.getWhiteCards().size() > 0) {
            int lastOne = P2.R.getWhiteCards().size() - 1;
            System.out.println(lastOne);
            if(P2.R.getWhiteCards().get(lastOne).getColor().equals("White")) {
            	num_white2++;
                g.updateWhiteCardsWon2(num_white2);
            }
            else { 
            	num_locomotive2++;
            	g.updateNoColorCardsWon2(num_locomotive2);     	
            	
            }
            P2.R.getWhiteCards().remove(lastOne);
           P2.setWhiteCardsWon(P2.getWhiteCardsWon() + 1);

           
            g.getPlayerRailWhiteCardsButtons2().get(lastOne).setVisible(false);
            g.getPlayerRailWhiteCardsButtons2().remove(lastOne);
           

        }
        if (P2.R.getBlueCards().size() > 0) {
            int lastOne = P2.R.getBlueCards().size() - 1;
            System.out.println(lastOne);
            if(P2.R.getBlueCards().get(lastOne).getColor().equals("Blue")) {
            	num_blue2++;
                g.updateBlueCardsWon2(num_blue2);
                
            }
            else { 
            	num_locomotive2++;
            	g.updateNoColorCardsWon2(num_locomotive2);
            	
            }
            P2.R.getBlueCards().remove(lastOne);
            P2.setBlueCardsWon(P2.getBlueCardsWon() + 1);

           
            g.getPlayerRailBlueCardsButtons2().get(lastOne).setVisible(false);
            g.getPlayerRailBlueCardsButtons2().remove(lastOne);
            
        }
        if (P2.R.getBlackCards().size() > 0) {
             int lastOne = P2.R.getBlackCards().size() - 1;
             System.out.println(lastOne);
            if(P2.R.getBlackCards().get(lastOne).getColor().equals("Black")) {
            	 num_black2++;
                g.updateBlackCardsWon2(num_black2);
               
            }
            else { 
            	num_locomotive2++;
            	g.updateNoColorCardsWon2(num_locomotive2);
            	
            }
            P2.R.getBlackCards().remove(lastOne);
            P2.setBlackCardsWon(P2.getBlackCardsWon() + 1);
           
            g.getPlayerRailBlackCardsButtons2().get(lastOne).setVisible(false);
             g.getPlayerRailBlackCardsButtons2().remove(lastOne);     
    }
        if (P2.R.getRedCards().size() > 0) {
            int lastOne = P2.R.getRedCards().size() - 1;
            System.out.println(lastOne);
            if(P2.R.getRedCards().get(lastOne).getColor().equals("Red")) {
            	 num_red2++;
                g.updateRedCardsWon(num_red2);
               
            }
            else { 
            	num_locomotive2++;
            	g.updateNoColorCardsWon2(num_locomotive2);
            	
            }
           P2.R.getRedCards().remove(lastOne);
           P2.setRedCardsWon(P2.getRedCardsWon() + 1);
           
           
          
           g.getPlayerRailRedCardsButtons2().get(lastOne).setVisible(false);
            g.getPlayerRailRedCardsButtons2().remove(lastOne);     
   }
        if (P2.R.getGreenCards().size() > 0) {
            int lastOne = P2.R.getGreenCards().size() - 1;
            System.out.println(lastOne);
            if(P2.R.getGreenCards().get(lastOne).getColor().equals("Green")) {
            	num_green2++;
                g.updateGreenCardsWon2(num_green2);
                
            }
            else { 
            	num_locomotive2++;
            	g.updateNoColorCardsWon2(num_locomotive2);
            	
            }
           P2.R.getGreenCards().remove(lastOne);
           P2.setGreenCardsWon(P2.getGreenCardsWon() + 1);
           
           
          
           g.getPlayerRailGreenCardsButtons2().get(lastOne).setVisible(false);
            g.getPlayerRailGreenCardsButtons2().remove(lastOne);     
   }
        if (P2.R.getYellowCards().size() > 0) {
            int lastOne = P2.R.getYellowCards().size() - 1;
            System.out.println(lastOne);
            if(P2.R.getYellowCards().get(lastOne).getColor().equals("Yellow")) {
            	 num_yellow2++;
                g.updateYellowCardsWon2(num_yellow2);
               
            }
            else { 
            	num_locomotive2++;
            	g.updateNoColorCardsWon2(num_locomotive2);
            	
            }
           P2.R.getYellowCards().remove(lastOne);
           P2.setYellowCardsWon(P2.getYellowCardsWon() + 1);
           
           
           g.getPlayerRailYellowCardsButtons2().get(lastOne).setVisible(false);
            g.getPlayerRailYellowCardsButtons2().remove(lastOne);     
   }
        if (P2.R.getPurpleCards().size() > 0) {
            int lastOne = P2.R.getPurpleCards().size() - 1;
            System.out.println(lastOne);
            if(P2.R.getPurpleCards().get(lastOne).getColor().equals("Purple")) {
            	num_purple2++;
                g.updatePurpleCardsWon2(num_purple2);
                
            }
            else { 
            	num_locomotive2++;
            	g.updateNoColorCardsWon(num_locomotive2);
            	
            }
           P2.R.getPurpleCards().remove(lastOne);
           P2.setPurpleCardsWon(P2.getPurpleCardsWon() + 1);
           
           
           
           g.getPlayerRailPurpleCardsButtons2().get(lastOne).setVisible(false);
            g.getPlayerRailPurpleCardsButtons2().remove(lastOne);     
   }
        if (P2.R.getOrangeCards().size() > 0) {
            int lastOne = P2.R.getOrangeCards().size() - 1;
            System.out.println(lastOne);
            if(P2.R.getOrangeCards().get(lastOne).getColor().equals("Orange")) {
            	 num_orange2++;
                g.updateOrangeCardsWon(num_orange2);
               
            }
            else { 
            	num_locomotive2++;
            	g.updateNoColorCardsWon2(num_locomotive2);
            	
            }
           P2.R.getOrangeCards().remove(lastOne);
           P2.setOrangeCardsWon(P2.getOrangeCardsWon() + 1);
           
           
          
           g.getPlayerRailOrangeCardsButtons2().get(lastOne).setVisible(false);
            g.getPlayerRailOrangeCardsButtons2().remove(lastOne);     
   }
        
    }
    
    
    

    
    private class MoveToRailListener implements ActionListener {
    	JButton but;
    	TrainCard c;
    	int position=0;
    	boolean valid,Loc_exists;
        public void actionPerformed(ActionEvent e) {
        	if(flag_for_p12==true) {
        		flag_for_p12=false;
        		flag_for_p21=true;
        		g.P1.setText("Player1: False");
    			g.P2.setText("Player2: True");
        	//System.out.println(".I.");
        	
        	for(int i=0;i<g.Getplayers1Cards().size();i++) {
        		for(int j=0;j<buttons_position.size();j++) {
        			if(buttons_position.get(j)==i)
        				g.Getplayers1Cards().get(i).setBounds(g.Getplayers1Cards().get(i).getBounds().x,g.Getplayers1Cards().get(i).getBounds().y+10,70,110);
        	}
        	}
        	  valid = SeeValuation(CardsToPlay);
        	  System.out.println(valid);
              for(int i=0;i<buttons_position.size();i++) {
		             if (valid == true) {
		            	  but = g.Getplayers1Cards().get(buttons_position.get(i));
		            	 c=P1.A.get(buttons_position.get(i));
		                 position = 0;
		                 if (c.getColor().equals("White")) {
		                     position = P1.R.getWhiteCards().size();
		                     P1.R.setWhiteCards(c);
		                     g.moveToRail(but,  position - 1,0);
		                     System.out.println("vazo aspri");
		                 } else if (c.getColor().equals("Black")) {
		                     position = P1.R.getBlackCards().size();
		                     g.moveToRail(but,  position - 1,2);
		                     P1.R.setBlackCards(c);
		                     System.out.println("vazo mauri");
		                 } else if (c.getColor().equals("Blue")) {
		                     position = P1.R.getBlueCards().size();
		                     g.moveToRail(but,  position - 1,1);
		                     P1.R.setBlueCards(c);
		                     System.out.println("vazo mple");
		                 }
		                 if (c.getColor().equals("Red")) {
		                     position = P1.R.getRedCards().size();
		                     g.moveToRail(but, position - 1,4);
		                     System.out.println("vazo kokkino");
		                     P1.R.setRedCards(c);
		                 } else if (c.getColor().equals("Green")) {
		                     position = P1.R.getGreenCards().size();
		                     g.moveToRail(but, position - 1,6);
		                     System.out.println("vazo prasino");
		                     P1.R.setGreenCards(c);
		                 } else if (c.getColor().equals("Orange")) {
		                     position = P1.R.getOrangeCards().size();
		                     g.moveToRail(but,  position - 1,5);
		                     System.out.println("vazo portokali");
		                     P1.R.setOrangeCards(c);
		                 }
		                 if (c.getColor().equals("Purple")) {
		                     position = P1.R.getPurpleCards().size();
		                     g.moveToRail(but,  position - 1,3);
		                     P1.R.setPurpleCards(c);
		                     System.out.println("vazo mov");
		                 } else if (c.getColor().equals("Yellow")) {
		                     position = P1.R.getYellowCards().size();
		                     g.moveToRail(but,  position - 1,7);
		                     System.out.println("vazo kitrino");
		                     P1.R.setYellowCards(c);
		                 }
		                 
		                 
		                 System.out.println(position);       
		             
		             }
              }
              Loc_exists=false;
            for(int i=0;i<CardsToPlay.size();i++) {
            	if(CardsToPlay.get(i).getColor().equals("Locomotive"))
            		Loc_exists=true;
            }
            if(Loc_exists) {
              for(int i=0;i<buttons_position.size();i++) {
            	if(valid==true) {
            		but = g.Getplayers1Cards().get(buttons_position.get(i));
	            	 c=P1.A.get(buttons_position.get(i));
	                 position = 0;
	                 TrainCard d = CardsToPlay.get(0);
	                for(int j =0;j<CardsToPlay.size();j++) {
	                	if(CardsToPlay.get(j).getColor()!="Locomotive")
	                		d=CardsToPlay.get(j);
	                }
	                	 
              if (c.getColor().equals("Locomotive")) {
            	 
	            	if(d.getColor().equals("Black")) {
	            		position = P1.R.getBlackCards().size();
	            		 g.moveToRail(but, position - 1,2);
	                     P1.R.setBlackCards(c);
	                     System.out.println("vazo locomotive sto black");
	            	}
	            	if(d.getColor().equals("Red")) {
	            		position = P1.R.getRedCards().size();
	            		 g.moveToRail(but,  position - 1,4);
	                     P1.R.setRedCards(c);
	                     System.out.println("vazo locomotive sto red");
	            	}
	            	if(d.getColor().equals("Blue")) {
	            		position = P1.R.getBlueCards().size();
	            		 g.moveToRail(but, position - 1,1);
	                     P1.R.setBlueCards(c);
	                     System.out.println("vazo locomotive sto blue");
	            	}
	            	if(d.getColor().equals("Green")) {
	            		position = P1.R.getGreenCards().size();
	            		 g.moveToRail(but,  position - 1,6);
	                     P1.R.setGreenCards(c);
	                     System.out.println("vazo locomotive sto green");
	            	}
	            	if(d.getColor().equals("Orange")) {
	            		position = P1.R.getOrangeCards().size();
	            		 g.moveToRail(but, position - 1,5);
	                     P1.R.setOrangeCards(c);
	                     System.out.println("vazo locomotive sto orange");
	            	}
	            	if(d.getColor().equals("Purple")) {
	            		position = P1.R.getPurpleCards().size();
	            		 g.moveToRail(but,  position - 1,3);
	                     P1.R.setPurpleCards(c);
	                     System.out.println("vazo locomotive sto purple");
	            	}
	            	if(d.getColor().equals("White")) {
	            		position = P1.R.getWhiteCards().size();
	            		System.out.println("vazo locomotive sto white");
	            		 g.moveToRail(but,  position - 1,0);
	                     P1.R.setWhiteCards(c);
	            	}
	            	if(d.getColor().equals("Yellow")) {
	            		position = P1.R.getYellowCards().size();
	            		 g.moveToRail(but,  position - 1,7);
	                     P1.R.setYellowCards(c);
	                     System.out.println("vazo locomotive sto yellow");
	            	}
	            	
              		}
            	}
            	}
	                 }
             if(valid==true) { 
            	 TrainCard c;
            	 JButton but ;
            	  int val = 0;
              for(int i=0;i<buttons_position.size();i++) {
            	  if(i==0) {
            		  val=buttons_position.get(i);
            		  c= P1.A.get(buttons_position.get(i));
            		 but = g.Getplayers1Cards().get(buttons_position.get(i));
            		 System.out.println(val);
            		  P1.A.remove(val);
            		  g.Getplayers1Cards().remove(but);
            	  }else {
            		  System.out.println("to value einai "+val);
            		  for(int j =0;j<buttons_position.size();j++) {
            			  if(buttons_position.get(j)>val) {
            				  buttons_position.set(j, buttons_position.get(j)-1);
            			  }
            		  }
            		  System.out.println("ta position einai "+buttons_position);
            		  val=buttons_position.get(i);
            		  c= P1.A.get(buttons_position.get(i));
            		  but = g.Getplayers1Cards().get(buttons_position.get(i));
            		  P1.A.remove(c);
            		  g.Getplayers1Cards().remove(but);
            	  }
            	  }
             }
        	buttons_position.clear();
        	CardsToPlay.clear();
        }

    }
    } 
    
    
    
    
    
    
    private class MoveToRailListener2 implements ActionListener {
    	JButton but;
    	TrainCard c;
    	int position=0;
    	boolean valid,Loc_exists;
        public void actionPerformed(ActionEvent e) {
        	//System.out.println(".I.");
        	if(flag_for_p22==true) {
        		flag_for_p22=false;
        		flag_for_p11=true;
        		g.P1.setText("Player1: True");
    			g.P2.setText("Player2: False");
        	for(int i=0;i<g.Getplayers2Cards().size();i++) {
        		for(int j=0;j<buttons_position.size();j++) {
        			if(buttons_position.get(j)==i)
        				g.Getplayers2Cards().get(i).setBounds(g.Getplayers2Cards().get(i).getBounds().x,g.Getplayers2Cards().get(i).getBounds().y+10,70,110);
        	}
        	}
        	  valid = SeeValuation2(CardsToPlay);
        	  System.out.println(valid);
              for(int i=0;i<buttons_position.size();i++) {
		             if (valid == true) {
		            	  but = g.Getplayers2Cards().get(buttons_position.get(i));
		            	 c=P2.A.get(buttons_position.get(i));
		                 position = 0;
		                 if (c.getColor().equals("White")) {
		                     position = P2.R.getWhiteCards().size();
		                     P2.R.setWhiteCards(c);
		                     g.moveToRail2(but,  position - 1,0);
		                     System.out.println("vazo aspri");
		                 } else if (c.getColor().equals("Black")) {
		                     position = P2.R.getBlackCards().size();
		                     g.moveToRail2(but,  position - 1,2);
		                     P2.R.setBlackCards(c);
		                     System.out.println("vazo mauri");
		                 } else if (c.getColor().equals("Blue")) {
		                     position = P2.R.getBlueCards().size();
		                     g.moveToRail2(but,  position - 1,1);
		                     P2.R.setBlueCards(c);
		                     System.out.println("vazo mple");
		                 }
		                 if (c.getColor().equals("Red")) {
		                     position = P2.R.getRedCards().size();
		                     g.moveToRail2(but, position - 1,4);
		                     System.out.println("vazo kokkino");
		                     P2.R.setRedCards(c);
		                 } else if (c.getColor().equals("Green")) {
		                     position = P2.R.getGreenCards().size();
		                     g.moveToRail2(but, position - 1,6);
		                     System.out.println("vazo prasino");
		                     P2.R.setGreenCards(c);
		                 } else if (c.getColor().equals("Orange")) {
		                     position = P2.R.getOrangeCards().size();
		                     g.moveToRail2(but,  position - 1,5);
		                     System.out.println("vazo portokali");
		                     P2.R.setOrangeCards(c);
		                 }
		                 if (c.getColor().equals("Purple")) {
		                     position = P2.R.getPurpleCards().size();
		                     g.moveToRail2(but,  position - 1,3);
		                     P2.R.setPurpleCards(c);
		                     System.out.println("vazo mov");
		                 } else if (c.getColor().equals("Yellow")) {
		                     position = P2.R.getYellowCards().size();
		                     g.moveToRail2(but,  position - 1,7);
		                     System.out.println("vazo kitrino");
		                     P2.R.setYellowCards(c);
		                 }
		                 
		                 
		                 System.out.println(position);       
		             
		             }
              }
              Loc_exists=false;
            for(int i=0;i<CardsToPlay.size();i++) {
            	if(CardsToPlay.get(i).getColor().equals("Locomotive"))
            		Loc_exists=true;
            }
            if(Loc_exists) {
              for(int i=0;i<buttons_position.size();i++) {
            	if(valid==true) {
            		but = g.Getplayers2Cards().get(buttons_position.get(i));
	            	 c=P2.A.get(buttons_position.get(i));
	                 position = 0;
	                 TrainCard d = CardsToPlay.get(0);
	                for(int j =0;j<CardsToPlay.size();j++) {
	                	if(CardsToPlay.get(j).getColor()!="Locomotive")
	                		d=CardsToPlay.get(j);
	                }
	                	 
              if (c.getColor().equals("Locomotive")) {
            	 
	            	if(d.getColor().equals("Black")) {
	            		position = P2.R.getBlackCards().size();
	            		 g.moveToRail2(but, position - 1,2);
	                     P2.R.setBlackCards(c);
	                     System.out.println("vazo locomotive sto black");
	            	}
	            	if(d.getColor().equals("Red")) {
	            		position = P2.R.getRedCards().size();
	            		 g.moveToRail2(but,  position - 1,4);
	                     P2.R.setRedCards(c);
	                     System.out.println("vazo locomotive sto red");
	            	}
	            	if(d.getColor().equals("Blue")) {
	            		position = P2.R.getBlueCards().size();
	            		 g.moveToRail2(but, position - 1,1);
	                     P2.R.setBlueCards(c);
	                     System.out.println("vazo locomotive sto blue");
	            	}
	            	if(d.getColor().equals("Green")) {
	            		position = P2.R.getGreenCards().size();
	            		 g.moveToRail2(but,  position - 1,6);
	                     P2.R.setGreenCards(c);
	                     System.out.println("vazo locomotive sto green");
	            	}
	            	if(d.getColor().equals("Orange")) {
	            		position = P2.R.getOrangeCards().size();
	            		 g.moveToRail2(but, position - 1,5);
	                     P2.R.setOrangeCards(c);
	                     System.out.println("vazo locomotive sto orange");
	            	}
	            	if(d.getColor().equals("Purple")) {
	            		position = P2.R.getPurpleCards().size();
	            		 g.moveToRail2(but,  position - 1,3);
	                     P2.R.setPurpleCards(c);
	                     System.out.println("vazo locomotive sto purple");
	            	}
	            	if(d.getColor().equals("White")) {
	            		position = P2.R.getWhiteCards().size();
	            		System.out.println("vazo locomotive sto white");
	            		 g.moveToRail2(but,  position - 1,0);
	                     P2.R.setWhiteCards(c);
	            	}
	            	if(d.getColor().equals("Yellow")) {
	            		position = P2.R.getYellowCards().size();
	            		 g.moveToRail2(but,  position - 1,7);
	                     P2.R.setYellowCards(c);
	                     System.out.println("vazo locomotive sto yellow");
	            	}
	            	
              		}
            	}
            	}
	                 }
             if(valid==true) { 
            	 TrainCard c;
            	 JButton but ;
            	  int val = 0;
              for(int i=0;i<buttons_position.size();i++) {
            	  if(i==0) {
            		  val=buttons_position.get(i);
            		  c= P2.A.get(buttons_position.get(i));
            		 but = g.Getplayers2Cards().get(buttons_position.get(i));
            		 System.out.println(val);
            		  P2.A.remove(val);
            		  g.Getplayers2Cards().remove(but);
            	  }else {
            		  System.out.println("to value einai "+val);
            		  for(int j =0;j<buttons_position.size();j++) {
            			  if(buttons_position.get(j)>val) {
            				  buttons_position.set(j, buttons_position.get(j)-1);
            			  }
            		  }
            		  System.out.println("ta position einai "+buttons_position);
            		  val=buttons_position.get(i);
            		  c= P2.A.get(buttons_position.get(i));
            		  but = g.Getplayers2Cards().get(buttons_position.get(i));
            		  P2.A.remove(c);
            		  g.Getplayers2Cards().remove(but);
            	  }
            	  }
             }
        	buttons_position.clear();
        	CardsToPlay.clear();
        }

    }
    }
    
 
    
    
    
    
    private class Take_Card_from_Ups implements ActionListener {

        public void actionPerformed(ActionEvent e) {
        	if(flag_for_p12==true) {
        		flag_for_p12=false;
        		g.P1.setText("Player1: False");
    			g.P2.setText("Player2: True");
        		flag_for_p22=true;
            JButton but = ((JButton) e.getSource());
            int x = g.Getplayers1Des().indexOf(but);
            System.out.println("size"+g.Getplayers1Des().size());
            DestinationCard d=P1.Destination_on_hand.get(x);
            int[] array= {0,0,0,0,0,0,0,0};
            for(int i=0;i<d.Colors().size();i++) {
            	if(d.Colors().get(i).equals("Red")) {
            		array[0]++;
            	}
            	if(d.Colors().get(i).equals("Black")) {
            		array[1]++;
            	}
            	if(d.Colors().get(i).equals("Blue")) {
            		array[2]++;
            	}
            	if(d.Colors().get(i).equals("Green")) {
            		array[3]++;
            	}
            	if(d.Colors().get(i).equals("Purple")) {
            		array[4]++;
            	}
            	if(d.Colors().get(i).equals("White")) {
            		array[5]++;
            	}
            	if(d.Colors().get(i).equals("Yellow")) {
            		array[6]++;
            	}
            	if(d.Colors().get(i).equals("Orange")) {
            		array[7]++;
            	}
            }
            
            System.out.println("oi points tis des einai:"+d.getPoints());
           boolean valid=See_if_colors_exists(array);
           System.out.println(valid);
            if(valid==true) {
            	P1.Destination_on_mpaza.add(d);
            	if(d.from()=="Dallas") {
            		P1.Dallas++;
            	}
            	if(d.from()=="Chicago") {
            		P1.Chicago++;
            	}
            	if(d.from()=="Miami") {
            		P1.Miami++;
            	}
            	if(d.from()=="Seattle") {
            		P1.Seatle++;
            	}
            	if(d.from()=="New York") {
            		P1.New_York++;
            	}
            	if(d.from()=="Los Angeles") {
            		P1.Los_Angeles++;
            	}
            	if(d.to()=="Dallas") {
            		P1.Dallas++;
            	}
            	if(d.to()=="Chicago") {
            		P1.Chicago++;
            	}
            	if(d.to()=="Miami") {
            		P1.Miami++;
            	}
            	if(d.to()=="Seattle") {
            		P1.Seatle++;
            	}
            	if(d.to()=="New York") {
            		P1.New_York++;
            	}
            	if(d.to()=="Los Angeles") {
            		P1.Los_Angeles++;
            	}
            	
            	but.setVisible(false);
            	 g.updateWhiteCardsWon(num_white);
            	 g.updateRedCardsWon(num_red);
            	 g.updateBlueCardsWon(num_blue);
            	 g.updateBlackCardsWon(num_black);
            	 g.updateNoColorCardsWon(num_locomotive);
            	 g.updateOrangeCardsWon(num_orange);
            	 g.updateYellowCardsWon(num_yellow);
            	 g.updatePurpleCardsWon(num_purple);
            	 g.updateGreenCardsWon(num_green);
            	 g.Getplayers1Des().remove(x);
            	 P1.Destination_on_hand.remove(x);
            	 g.SetScore1(g.GetScore1()+2*d.getPoints());
            	
            }
            
            
        }

    }
    }
    
    
    
    
    private class Take_Card_from_Ups2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
        	if(flag_for_p22==true) {
        		g.P1.setText("Player1: True");
    			g.P2.setText("Player2: False");
        		flag_for_p22=false;
        		flag_for_p11=true;
            JButton but = ((JButton) e.getSource());
            int x = g.Getplayers2Des().indexOf(but);
            System.out.println("size"+g.Getplayers2Des().size());
            DestinationCard d=P2.Destination_on_hand.get(x);
            int[] array= {0,0,0,0,0,0,0,0};
            for(int i=0;i<d.Colors().size();i++) {
            	if(d.Colors().get(i).equals("Red")) {
            		array[0]++;
            	}
            	if(d.Colors().get(i).equals("Black")) {
            		array[1]++;
            	}
            	if(d.Colors().get(i).equals("Blue")) {
            		array[2]++;
            	}
            	if(d.Colors().get(i).equals("Green")) {
            		array[3]++;
            	}
            	if(d.Colors().get(i).equals("Purple")) {
            		array[4]++;
            	}
            	if(d.Colors().get(i).equals("White")) {
            		array[5]++;
            	}
            	if(d.Colors().get(i).equals("Yellow")) {
            		array[6]++;
            	}
            	if(d.Colors().get(i).equals("Orange")) {
            		array[7]++;
            	}
            }
            
            System.out.println("oi points tis des einai:"+d.getPoints());
           boolean valid=See_if_colors_exists2(array);
           System.out.println(valid);
            if(valid==true) {
            	P2.Destination_on_mpaza.add(d);
            	if(d.from()=="Dallas") {
            		P2.Dallas++;
            	}
            	if(d.from()=="Chicago") {
            		P2.Chicago++;
            	}
            	if(d.from()=="Miami") {
            		P2.Miami++;
            	}
            	if(d.from()=="Seattle") {
            		P2.Seatle++;
            	}
            	if(d.from()=="New York") {
            		P2.New_York++;
            	}
            	if(d.from()=="Los Angeles") {
            		P2.Los_Angeles++;
            	}
            	if(d.to()=="Dallas") {
            		P2.Dallas++;
            	}
            	if(d.to()=="Chicago") {
            		P2.Chicago++;
            	}
            	if(d.to()=="Miami") {
            		P2.Miami++;
            	}
            	if(d.to()=="Seattle") {
            		P2.Seatle++;
            	}
            	if(d.to()=="New York") {
            		P2.New_York++;
            	}
            	if(d.to()=="Los Angeles") {
            		P2.Los_Angeles++;
            	}
            	but.setVisible(false);
            	 g.updateWhiteCardsWon2(num_white2);
            	 g.updateRedCardsWon2(num_red2);
            	 g.updateBlueCardsWon2(num_blue2);
            	 g.updateBlackCardsWon2(num_black2);
            	 g.updateNoColorCardsWon2(num_locomotive2);
            	 g.updateOrangeCardsWon2(num_orange2);
            	 g.updateYellowCardsWon2(num_yellow2);
            	 g.updatePurpleCardsWon2(num_purple2);
            	 g.updateGreenCardsWon2(num_green2);
            	 g.Getplayers2Des().remove(x);
            	 P2.Destination_on_hand.remove(x);
            	 g.SetScore2(g.GetScore2()+2*d.getPoints());
            	
            }
            
            
        }
        }

    }
    
    
    
    
    
    
    
private boolean See_if_colors_exists(int[]array) {
   int[] array_of_data= {num_red,num_black,num_blue,num_green,num_purple,num_white,num_yellow,num_orange,num_locomotive};
    	if(array[0]!=0) {
    		if(num_red>=array[0]) {
    			num_red-=array[0];
    		}else {
    			if(num_locomotive+num_red>=array[0]) {
    				num_locomotive=num_red+num_locomotive-array[0];
    				num_red=0;
    			}else {
    				
    				num_red=array_of_data[0];
    				num_black=array_of_data[1];
    				num_blue=array_of_data[2];
    				num_green=array_of_data[3];
    				num_purple=array_of_data[4];
    				num_white=array_of_data[5];
    				num_yellow=array_of_data[6];
    				num_orange=array_of_data[7];
    				num_locomotive=array_of_data[8];
    				return false;
    			}
    		}
    	}
    	if(array[1]!=0) {
    		if(num_black>=array[1]) {
    			num_black-=array[1];
    		}else {
    			if(num_locomotive+num_black>=array[1]) {
    				num_locomotive=num_black+num_locomotive-array[1];
    				num_black=0;
    			}else {
    				num_red=array_of_data[0];
    				num_black=array_of_data[1];
    				num_blue=array_of_data[2];
    				num_green=array_of_data[3];
    				num_purple=array_of_data[4];
    				num_white=array_of_data[5];
    				num_yellow=array_of_data[6];
    				num_orange=array_of_data[7];
    				num_locomotive=array_of_data[8]; 				
    				return false;
    			}
    		}
    	}
		if(array[2]!=0) {
			if(num_blue>=array[2]) {
    			num_blue-=array[2];
    		}else {
    			if(num_locomotive+num_blue>=array[2]) {
    				num_locomotive=num_blue+num_locomotive-array[2];
    				num_blue=0;
    			}else{
    				num_red=array_of_data[0];
    				num_black=array_of_data[1];
    				num_blue=array_of_data[2];
    				num_green=array_of_data[3];
    				num_purple=array_of_data[4];
    				num_white=array_of_data[5];
    				num_yellow=array_of_data[6];
    				num_orange=array_of_data[7];
    				num_locomotive=array_of_data[8]; 				
    				return false;
    			}
    		}
		    	}
		if(array[3]!=0) {
			if(num_green>=array[3]) {
    			num_green-=array[3];
    		}else {
    			if(num_locomotive+num_green>=array[3]) {
    				num_locomotive=num_green+num_locomotive-array[3];
    				num_green=0;
    			}else {
    				num_red=array_of_data[0];
    				num_black=array_of_data[1];
    				num_blue=array_of_data[2];
    				num_green=array_of_data[3];
    				num_purple=array_of_data[4];
    				num_white=array_of_data[5];
    				num_yellow=array_of_data[6];
    				num_orange=array_of_data[7];
    				num_locomotive=array_of_data[8]; 				
    				return false;
    			}
    		}
		}
		if(array[4]!=0) {
			if(num_purple>=array[4]) {
    			num_purple-=array[4];
    		}else {
    			if(num_locomotive+num_purple>=array[4]) {
    				num_locomotive=num_purple+num_locomotive-array[4];
    				num_purple=0;
    			}else {
    				num_red=array_of_data[0];
    				num_black=array_of_data[1];
    				num_blue=array_of_data[2];
    				num_green=array_of_data[3];
    				num_purple=array_of_data[4];
    				num_white=array_of_data[5];
    				num_yellow=array_of_data[6];
    				num_orange=array_of_data[7];
    				num_locomotive=array_of_data[8]; 				
    				return false;
    			}
    		}
			
		}
		if(array[5]!=0) {
			if(num_white>=array[5]) {
    			num_white-=array[5];
    		}else {
    			if(num_locomotive+num_white>=array[5]) {
    				num_locomotive=num_white+num_locomotive-array[5];
    				num_white=0;
    			}else {
    				num_red=array_of_data[0];
    				num_black=array_of_data[1];
    				num_blue=array_of_data[2];
    				num_green=array_of_data[3];
    				num_purple=array_of_data[4];
    				num_white=array_of_data[5];
    				num_yellow=array_of_data[6];
    				num_orange=array_of_data[7];
    				num_locomotive=array_of_data[8]; 				
    				return false;
    			}
    		}
		}
		if(array[6]!=0) {
			if(num_yellow>=array[6]) {
    			num_yellow-=array[6];
    		}else {
    			if(num_locomotive+num_yellow>=array[6]) {
    				num_locomotive=num_yellow+num_locomotive-array[6];
    				num_yellow=0;
    			}else {
    				num_red=array_of_data[0];
    				num_black=array_of_data[1];
    				num_blue=array_of_data[2];
    				num_green=array_of_data[3];
    				num_purple=array_of_data[4];
    				num_white=array_of_data[5];
    				num_yellow=array_of_data[6];
    				num_orange=array_of_data[7];
    				num_locomotive=array_of_data[8]; 				
    				return false;
    			}
    		}
		}
		if(array[7]!=0) {
			if(num_orange>=array[7]) {
    			num_orange-=array[7];
    		}else {
    			if(num_locomotive+num_orange>=array[7]) {
    				num_locomotive=num_orange+num_locomotive-array[7];
    				num_orange=0;
    			}else {
    				num_red=array_of_data[0];
    				num_black=array_of_data[1];
    				num_blue=array_of_data[2];
    				num_green=array_of_data[3];
    				num_purple=array_of_data[4];
    				num_white=array_of_data[5];
    				num_yellow=array_of_data[6];
    				num_orange=array_of_data[7];
    				num_locomotive=array_of_data[8]; 				
    				return false;
    			}
    		}
		}
    	
    	
    	return true;
    	
    }
    


private boolean See_if_colors_exists2(int[]array) {
	   int[] array_of_data= {num_red2,num_black2,num_blue2,num_green2,num_purple2,num_white2,num_yellow2,num_orange2,num_locomotive2};
	    	if(array[0]!=0) {
	    		if(num_red2>=array[0]) {
	    			num_red2-=array[0];
	    		}else {
	    			if(num_locomotive2+num_red2>=array[0]) {
	    				num_locomotive2=num_red2+num_locomotive-array[0];
	    				num_red2=0;
	    			}else {
	    				num_red2=array_of_data[0];
	    				num_black2=array_of_data[1];
	    				num_blue2=array_of_data[2];
	    				num_green2=array_of_data[3];
	    				num_purple2=array_of_data[4];
	    				num_white2=array_of_data[5];
	    				num_yellow2=array_of_data[6];
	    				num_orange2=array_of_data[7];
	    				num_locomotive2=array_of_data[8];
	    				
	    				return false;
	    		}
	    		}
	    	}
	    	if(array[1]!=0) {
	    		if(num_black2>=array[1]) {
	    			num_black2-=array[1];
	    		}else {
	    			if(num_locomotive2+num_black2>=array[1]) {
	    				num_locomotive2=num_black2+num_locomotive2-array[1];
	    				num_black2=0;
	    			}else {
	    				num_red2=array_of_data[0];
	    				num_black2=array_of_data[1];
	    				num_blue2=array_of_data[2];
	    				num_green2=array_of_data[3];
	    				num_purple2=array_of_data[4];
	    				num_white2=array_of_data[5];
	    				num_yellow2=array_of_data[6];
	    				num_orange2=array_of_data[7];
	    				num_locomotive2=array_of_data[8]; 				
	    				return false;
	    			}
	    		}
	    	}
			if(array[2]!=0) {
				if(num_blue2>=array[2]) {
	    			num_blue2-=array[2];
	    		}else {
	    			if(num_locomotive2+num_blue2>=array[2]) {
	    				num_locomotive2=num_blue2+num_locomotive2-array[2];
	    				num_blue2=0;
	    			}else{
	    				num_red2=array_of_data[0];
	    				num_black2=array_of_data[1];
	    				num_blue2=array_of_data[2];
	    				num_green2=array_of_data[3];
	    				num_purple2=array_of_data[4];
	    				num_white2=array_of_data[5];
	    				num_yellow2=array_of_data[6];
	    				num_orange2=array_of_data[7];
	    				num_locomotive2=array_of_data[8]; 				
	    				return false;
	    			}
	    		}
			    	}
			if(array[3]!=0) {
				if(num_green2>=array[3]) {
	    			num_green2-=array[3];
	    		}else {
	    			if(num_locomotive2+num_green2>=array[3]) {
	    				num_locomotive2=num_green2+num_locomotive2-array[3];
	    				num_green2=0;
	    			}else {
	    				num_red2=array_of_data[0];
	    				num_black2=array_of_data[1];
	    				num_blue2=array_of_data[2];
	    				num_green2=array_of_data[3];
	    				num_purple2=array_of_data[4];
	    				num_white2=array_of_data[5];
	    				num_yellow2=array_of_data[6];
	    				num_orange2=array_of_data[7];
	    				num_locomotive2=array_of_data[8]; 				
	    				return false;
	    			}
	    		}
			}
			if(array[4]!=0) {
				if(num_purple2>=array[4]) {
	    			num_purple2-=array[4];
	    		}else {
	    			if(num_locomotive2+num_purple2>=array[4]) {
	    				num_locomotive2=num_purple2+num_locomotive2-array[4];
	    				num_purple2=0;
	    			}else {
	    				num_red2=array_of_data[0];
	    				num_black2=array_of_data[1];
	    				num_blue2=array_of_data[2];
	    				num_green2=array_of_data[3];
	    				num_purple2=array_of_data[4];
	    				num_white2=array_of_data[5];
	    				num_yellow2=array_of_data[6];
	    				num_orange2=array_of_data[7];
	    				num_locomotive2=array_of_data[8]; 				
	    				return false;
	    			}
	    		}
				
			}
			if(array[5]!=0) {
				if(num_white2>=array[5]) {
	    			num_white2-=array[5];
	    		}else {
	    			if(num_locomotive2+num_white2>=array[5]) {
	    				num_locomotive2=num_white2+num_locomotive2-array[5];
	    				num_white2=0;
	    			}else {
	    				num_red2=array_of_data[0];
	    				num_black2=array_of_data[1];
	    				num_blue2=array_of_data[2];
	    				num_green2=array_of_data[3];
	    				num_purple2=array_of_data[4];
	    				num_white2=array_of_data[5];
	    				num_yellow2=array_of_data[6];
	    				num_orange2=array_of_data[7];
	    				num_locomotive2=array_of_data[8]; 				
	    				return false;
	    			}
	    		}
			}
			if(array[6]!=0) {
				if(num_yellow2>=array[6]) {
	    			num_yellow2-=array[6];
	    		}else {
	    			if(num_locomotive2+num_yellow2>=array[6]) {
	    				num_locomotive2=num_yellow2+num_locomotive2-array[6];
	    				num_yellow2=0;
	    			}else {
	    				num_red2=array_of_data[0];
	    				num_black2=array_of_data[1];
	    				num_blue2=array_of_data[2];
	    				num_green2=array_of_data[3];
	    				num_purple2=array_of_data[4];
	    				num_white2=array_of_data[5];
	    				num_yellow2=array_of_data[6];
	    				num_orange2=array_of_data[7];
	    				num_locomotive2=array_of_data[8]; 				
	    				return false;
	    			}
	    		}
			}
			if(array[7]!=0) {
				if(num_orange2>=array[7]) {
	    			num_orange2-=array[7];
	    		}else {
	    			if(num_locomotive2+num_orange2>=array[7]) {
	    				num_locomotive2=num_orange2+num_locomotive2-array[7];
	    				num_orange2=0;
	    			}else {
	    				num_red2=array_of_data[0];
	    				num_black2=array_of_data[1];
	    				num_blue2=array_of_data[2];
	    				num_green2=array_of_data[3];
	    				num_purple2=array_of_data[4];
	    				num_white2=array_of_data[5];
	    				num_yellow2=array_of_data[6];
	    				num_orange2=array_of_data[7];
	    				num_locomotive2=array_of_data[8]; 				
	    				return false;
	    			}
	    		}
			}
	    	
	    	
	    	return true;
	    	
	    }
	    



    
	private class Pull_for_Des implements ActionListener {
	
	    public void actionPerformed(ActionEvent e) {
	    		
	    		if(flag_for_p12==true) {
	    			DestinationCard d=exodia.get(0);
		    		exodia.remove(0);
	    			flag_for_p12=false;
	    			flag_for_p21=true;
	    			g.P1.setText("Player1: False");
	    			g.P2.setText("Player2: True");
	    		P1.Destination_on_hand.add(d);
	    		g.setDesNum(exodia.size());
	    		g.create_new_Descard1(d,P1.Destination_on_hand.size());
	    		g.updateDesHand();
	    		g.get_Des_on_hand().get(g.get_Des_on_hand().size()-1).addActionListener(new Take_Card_from_Ups());
	    		}else if(flag_for_p22==true) {
	    			DestinationCard d=exodia.get(0);
		    		exodia.remove(0);
	    			flag_for_p22=false;
	    			flag_for_p11=true;
	    			g.P1.setText("Player1: True");
	    			g.P2.setText("Player2: False");
		    		P2.Destination_on_hand.add(d);
		    		g.setDesNum(exodia.size());
		    		g.create_new_Descard2(d,P2.Destination_on_hand.size());
		    		g.updateDesHand2();
		    		g.get_Des_on_hand2().get(g.get_Des_on_hand2().size()-1).addActionListener(new Take_Card_from_Ups2());
		    		}
	    		
	    		}
	
	}
	
	
	
	private class Big_City implements ActionListener {
		
	    public void actionPerformed(ActionEvent e) {
	    		JButton but=(JButton) e.getSource();
	    		if(but==g.BigCitiesBonus1) {
	    			if(flag_for_p11==true||flag_for_p12==true) {
	    				
	    				if(P1.Chicago>=3) {
	    				g.SetScore1(g.GetScore1()+BigCity1.getPoints());
	    				System.out.println(BigCity1.getPoints());
	    				g.BigCitiesBonus1.setVisible(false);
	    				bcP1.add(BigCity1);
	    				System.out.println(bcP1.size());
	    			}
	    				
	    			}
	    			if(flag_for_p21==true||flag_for_p22==true) {
	    				
	    				if(P2.Chicago>=3) {
	    				g.SetScore2(g.GetScore2()+BigCity1.getPoints());
	    				System.out.println(BigCity1.getPoints());
	    				g.BigCitiesBonus1.setVisible(false);
	    				bcP2.add(BigCity1);
	    				}
	    		}
	    				
	    }
	    		if(but==g.BigCitiesBonus2) {
	    			if(flag_for_p11==true||flag_for_p12==true) {
	    				bcP1.add(BigCity2);
	    				if(P1.Dallas>=3) {
	    				g.SetScore1(g.GetScore1()+BigCity2.getPoints());
	    				System.out.println(bcP1.size());
	    				g.BigCitiesBonus2.setVisible(false);
	    			}
	    				
	    			}
	    			if(flag_for_p21==true||flag_for_p22==true) {
	    				
	    				if(P2.Dallas>=3) {
	    				g.SetScore2(g.GetScore2()+BigCity2.getPoints());
	    				bcP2.add(BigCity2);
	    				g.BigCitiesBonus2.setVisible(false);
	    			}
	    		}
	    				
	    }
	    		
	    		if(but==g.BigCitiesBonus3) {
	    			if(flag_for_p11==true||flag_for_p12==true) {
	    				
	    				if(P1.Los_Angeles>=3) {
	    				g.SetScore1(g.GetScore1()+BigCity3.getPoints());
	    				bcP1.add(BigCity3);
	    				g.BigCitiesBonus3.setVisible(false);
	    			}
	    				
	    			}
	    			if(flag_for_p21==true||flag_for_p22==true) {
	    				
	    				if(P2.Los_Angeles>=3) {
	    				g.SetScore2(g.GetScore2()+BigCity3.getPoints());
	    				g.BigCitiesBonus3.setVisible(false);
	    				bcP2.add(BigCity3);
	    			}
	    		}
	    				
	    }
	    		
	    		if(but==g.BigCitiesBonus4) {
	    			if(flag_for_p11==true||flag_for_p12==true) {
	    				
	    				if(P1.Miami>=3) {
	    				g.SetScore1(g.GetScore1()+BigCity4.getPoints());
	    				bcP1.add(BigCity4);
	    				g.BigCitiesBonus4.setVisible(false);
	    			}
	    				
	    			}
	    			if(flag_for_p21==true||flag_for_p22==true) {
	    				
	    				if(P2.Miami>=3) {
	    				g.SetScore2(g.GetScore2()+BigCity4.getPoints());
	    				bcP2.add(BigCity4);
	    				g.BigCitiesBonus4.setVisible(false);
	    			}
	    		}
	    				
	    }
	    		
	    		if(but==g.BigCitiesBonus5) {
	    			if(flag_for_p11==true||flag_for_p12==true) {
	    				
	    				if(P1.New_York>=3) {
	    				g.SetScore1(g.GetScore1()+BigCity5.getPoints());
	    				bcP1.add(BigCity5);
	    				g.BigCitiesBonus5.setVisible(false);
	    			}
	    				
	    			}
	    			if(flag_for_p21==true||flag_for_p22==true) {
	    				
	    				if(P2.New_York>=3) {
	    				g.SetScore2(g.GetScore2()+BigCity5.getPoints());
	    				bcP2.add(BigCity5);
	    				g.BigCitiesBonus5.setVisible(false);
	    			}
	    		}
	    				
	    }
	    		
	    		
	    		if(but==g.BigCitiesBonus6) {
	    			if(flag_for_p11==true||flag_for_p12==true) {
	    				
	    				if(P1.Seatle>=3) {
	    				g.SetScore1(g.GetScore1()+BigCity6.getPoints());
	    				bcP1.add(BigCity6);
	    				g.BigCitiesBonus6.setVisible(false);
	    			}
	    				
	    			}
	    			if(flag_for_p21==true||flag_for_p22==true) {
	    				if(P2.Seatle>=3) {
	    					bcP2.add(BigCity6);	
	    				g.SetScore2(g.GetScore2()+BigCity6.getPoints());
	    				g.BigCitiesBonus6.setVisible(false);
	    			}
	    		}
	    				
	    }
	    		
	
	}
	
	}
	
	
    
	private class Pull_for_Ticket implements ActionListener {
	
	    public void actionPerformed(ActionEvent e) {
	       
	       if(flag_for_p12==true) {
	    	   TrainCard c;
		       c=TicketDeck.get(0);
		       TicketDeck.remove(0);
		       g.setTickNum(TicketDeck.size());
	       P1.A.add(c);
	       g.create_new_card1(c,position_of_trcards1);
	       g.Getplayers1Cards().get(g.Getplayers1Cards().size()-1).addActionListener(new PlayerAreaListener());
           g.setTickNum(TicketDeck.size());
           position_of_trcards1++;
	    }
	       if(flag_for_p22==true) {
	    	   TrainCard c;
		       c=TicketDeck.get(0);
		       TicketDeck.remove(0);
		       g.setTickNum(TicketDeck.size());
		       P2.A.add(c);
		       g.create_new_card2(c,position_of_trcards2);
		       g.Getplayers2Cards().get(g.Getplayers2Cards().size()-1).addActionListener(new PlayerAreaListener2());
	           g.setTickNum(TicketDeck.size());
	           position_of_trcards2++;
		    }
	       if(flag_for_p12==true) {
	    	   flag_for_p12=false;
	    	   flag_for_p21=true;
	    	   g.P1.setText("Player1: False");
   			g.P2.setText("Player2: True");
	    	   
	       }
	       if(flag_for_p22==true) {
	    	   flag_for_p22=false;
	    	   flag_for_p11=true;
	    	   g.P1.setText("Player1: True");
   			g.P2.setText("Player2: False");
	       }
	    }
	}
	
	
    
    private class MoveFromRailListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JButton but = ((JButton) e.getSource());
            if (game_has_finished() == true) {
            	flag_for_p11=false;
            	flag_for_p21=false;
            	flag_for_p12=false;
            	flag_for_p22=false;
            	g.P1.setText("Player1: False");
    			g.P2.setText("Player2: False");
                return;
            } else {
            if(flag_for_p11==true) {
                updateRailAndTrack();
                flag_for_p11=false;
                flag_for_p12=true;
                game_has_finished();
            }
            
            }
            
        }

    }
    private class MoveFromRailListener2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JButton but = ((JButton) e.getSource());
            if (game_has_finished() == true) {
            	flag_for_p11=false;
            	flag_for_p21=false;
            	flag_for_p12=false;
            	flag_for_p22=false;
            	g.P1.setText("Player1: False");
    			g.P2.setText("Player2: False");
                return;
            } else {
            
            if(flag_for_p21==true) {
                updateRailAndTrack2();
                flag_for_p21=false;
                flag_for_p22=true;
                game_has_finished();
            }
            }
            
        }

    }

}
    
    


