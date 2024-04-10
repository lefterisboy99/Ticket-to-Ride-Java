package model.player;

import java.util.ArrayList;

import javax.print.attribute.standard.Destination;
import javax.smartcardio.Card;

import model.card.BigCitiesCard;
import model.card.DestinationCard;
import model.card.TrainCard;
import model.railyard.OntheTrack;
import model.railyard.Railyard;

public class Player {
	private String name;
	private int points;
	public Railyard R=new Railyard();
	OntheTrack O;
	public int Chicago=0,Dallas=0,New_York=0,Los_Angeles=0,Miami=0,Seatle=0;
	int blueCardsWon=0,blackCardsWon=0,whiteCardsWon=0,redCardsWon=0,greenCardsWon=0,purpleCardsWon=0, locomotiveCardsWon=0,orangeCardsWon=0,yellowCardsWon=0;
	public ArrayList<TrainCard> A=new ArrayList<TrainCard>();
	ArrayList<TrainCard>cards_to_play;
	ArrayList<TrainCard> cards;
	public ArrayList<DestinationCard> Destination_on_hand=new ArrayList<DestinationCard>();
	public ArrayList<DestinationCard> Destination_on_mpaza=new ArrayList<DestinationCard>();
	public ArrayList<BigCitiesCard> B=new ArrayList<BigCitiesCard>();
private boolean hasPlayed,finished;
   
    
    /**
     * <b>constructor</b>: Constructs a new Player with the given
     * parameter name  team  and ID.<br />
     * <b>postcondition</b>: Creates and initializes a player with the given
     * name,team and ID.Also initializes some variables (for example initialize variables 
     * that give us information if a player has said tichu or grand tichu and 
     * if player has started or finished in a game(se mia partida)
     * @param name is the name of the player.
     * @param team is the team of the player
     * @param ID is the ID of the player
     */
    public Player(String name) 
    { 
        this.name = name;   
        this.hasPlayed=false;
        this.finished=false;
    }
    
    /**
     * <b>transformer(mutative)</b>: it starts to shuffles the cards<br />
     * <b>postcondition</b>: it shuffles the cards
     */
    
    public void shuffleCards() {
    	
    }
    
    
   /**
    * <b>transformer(mutative)</b>: It initializes a player for a new deal(moirasma) <br />
    * <b>postcondition</b>:  clear the contents of players collection and initialize some variables
    * (for example initialize variables that give us information
    * if player has started or finished in a game(se mia partida))
    */
   public void init_player()
   {
       
   }
   
   
   

   
   /**
    * <b>accessor(selector)</b>:Returns the name of the player <br />
    * 
    * <p><b>Postcondition:</b> returns the name of the player </p>
    *
    * @return the the name of the player
    */
   public String getName() 
   {
        return name;
   }

   
   /**
    * <b>transformer(mutative)</b>: sets the name of the player to newName <br />
    * <p><b>Postcondition:</b> the name of this player is changed to newName</p>
    *
    * @param newName the new name of the player
    * 
    */ 
   public void setName(String newName) 
   {
        this.name = newName;
   }
   
   /**
    * <b>transformer(mutative)</b>: gets the player extra points <br />
    * <p><b>Postcondition:</b> the points of this player changed</p>
    *
    * @param newName the new name of the player
    * 
    */ 
   public void getPoints(int points) 
   {
        this.points += points;
   }
   
   
   
   
    /**
    * <b>transformer(mutative)</b>: sets the collection(ArrayList<TrainCard>) who wants a player to play  to cardsforplaying  <br />
    * <p><b>Postcondition:</b>  ArrayList<TrainCard>(collection) of this player is changed to cardsforplaying</p>
    *
    * @param cardsforplaying the new ArrayList<TrainCard> of the cards that player wants to play
    * 
    */ 
   public void setCards_to_play(ArrayList<TrainCard> cardsforplaying)
   {
       
   }
   
   
   /**
    * <b>accessor(selector)</b>:Returns the cards who wants a player to play <br />
    * 
    * <p><b>Postcondition:</b> returns the cards that player wants to play </p>
    *
    * @return the cards that player wants to play
    */
    public ArrayList<TrainCard> getCards_to_play()
    {
        return this.cards_to_play;
    }
   
    
   /**
    * <b>transformer(mutative)</b>: adds a Card to players cards  <br />
    * <p><b>Postcondition:</b>  a card added to players cards</p>
    *
    * @param c the card that will be added to players Collection
    * 
    */ 
   
   
   
   /**
    * <b>transformer(mutative)</b>: adds a collection to players points(cards which count for points)  <br />
    * <p><b>Postcondition:</b>  a collection added to players points</p>
    *
    * @param s the points that will be added to players points
    * 
    */ 
   public void set_points(ArrayList<TrainCard> s)
   {
       
   }
   
   

    
   /**
    * <b>accessor(selector)</b>:Returns the Cards collection of a player <br />
    * 
    * <p><b>Postcondition:</b> returns the Cards collection of a player </p>
    *
    * @return the Cards collection of a player
    */
    public ArrayList<TrainCard> getCards()
    {
          return this.cards;
    }
   
   
   
 
   
 
   
   /**
    * <b>transformer(mutative)</b>: sets the variable hasplayed to true
    * <p><b>Postcondition:</b>  sets the variable hasplayed to true</p>
    */ 

   public void Played()
   {
       
   }
   
   
   /**
    * <b>transformer(mutative)</b>: Sets the variable has_finished to true
    * <p><b>Postcondition:</b>  sets the variable hasfinished to true</p>
    */ 
   public void has_finished()
   {
       
   }
   
   
   /**
    * <b>Observer</b>:Returns if a player has played at least one time <br />
    * 
    * <p><b>Postcondition:</b> Returns if a player has played at least one time </p>
    *
    * @return true if a player has played at least one time false otherwise
    */
    public boolean Has_Played()
    {
        return this.hasPlayed;
    }
    
    
    public int getBlueCardsWon() {
        return blueCardsWon;
    }

    public void setBlueCardsWon(int blueCardsWon) {
        this.blueCardsWon = blueCardsWon;
    }

    public int getBlackCardsWon() {
        return blackCardsWon;
    }

    public void setBlackCardsWon(int blackCardsWon) {
        this.blackCardsWon = blackCardsWon;
    }

    public int getWhiteCardsWon() {
        return whiteCardsWon;
    }

    public void setWhiteCardsWon(int whiteCardsWon) {
        this.whiteCardsWon = whiteCardsWon;
    }


   public int getRedCardsWon() {
       return redCardsWon;
   }

   public void setRedCardsWon(int redCardsWon) {
       this.redCardsWon = redCardsWon;
   }

   public int getOrangeCardsWon() {
       return orangeCardsWon;
   }

   public void setOrangeCardsWon(int orangeCardsWon) {
       this.orangeCardsWon = orangeCardsWon;
   }

   public int getYellowCardsWon() {
       return yellowCardsWon;
   }

   public void setYellowCardsWon(int yellowCardsWon) {
       this.yellowCardsWon = yellowCardsWon;
   }
   
   
   public int getPurpleCardsWon() {
       return purpleCardsWon;
   }

   public void setPurpleCardsWon(int purpleCardsWon) {
       this.purpleCardsWon = purpleCardsWon;
   }

   public int getLocomotiveCardsWon() {
       return locomotiveCardsWon;
   }

   public void setLocomotiveCardsWon(int locomotiveCardsWon) {
       this.locomotiveCardsWon = locomotiveCardsWon;
   }

   public int getGreenCardsWon() {
       return greenCardsWon;
   }

   public void setGreenCardsWon(int greenCardsWon) {
       this.greenCardsWon = greenCardsWon;
   }
    
   /**
    * <b>Observer</b>:Returns if a player has finished the game(partida)<br />
    * 
    * <p><b>Postcondition:</b> Returns if a player has finished the game(partida) </p>
    *
    * @return true if a player has finished the game , false otherwise
    */
   public boolean Get_has_finished()
   {
        return this.finished;
   }
	
	
}
