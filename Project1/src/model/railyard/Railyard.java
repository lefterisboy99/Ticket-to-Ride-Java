package model.railyard;

import java.util.ArrayList;

import model.card.TrainCard;

public class Railyard {
	TrainCard t;
	//private int[] trains= {0,0,0,0,0,0,0,0};
	//ArrayList<ArrayList<TrainCard>> train=new ArrayList<ArrayList<TrainCard>>();
	ArrayList<TrainCard> red=new ArrayList<TrainCard>();
	ArrayList<TrainCard> black=new ArrayList<TrainCard>();
	ArrayList<TrainCard> blue=new ArrayList<TrainCard>();
	ArrayList<TrainCard> green=new ArrayList<TrainCard>();
	ArrayList<TrainCard> purple=new ArrayList<TrainCard>();
	ArrayList<TrainCard> white=new ArrayList<TrainCard>();
	ArrayList<TrainCard> yellow=new ArrayList<TrainCard>();
	ArrayList<TrainCard> orange=new ArrayList<TrainCard>();
	ArrayList<TrainCard> locomotive=new ArrayList<TrainCard>();
	
	 /**
     * <b>Accessor:</b> set all cards
     * <b>Postcondition:</b> card's activate
     * @return int value
     */
	public ArrayList<TrainCard> getWhiteCards() {
        return white;
    }

    public void setWhiteCards(TrainCard whiteCards) {
      white.add(whiteCards);
    }

    public ArrayList<TrainCard> getLocomotiveCards() {
        return white;
    }

    public void setLocomotiveCards(TrainCard locomotiveCards) {
      locomotive.add(locomotiveCards);
    }
    
    public ArrayList<TrainCard> getBlackCards() {
        return black;
    }

    public void setBlackCards(TrainCard blackCards) {
        black.add(blackCards);
    }

    public ArrayList<TrainCard> getBlueCards() {
        return blue;
    }

    public void setBlueCards(TrainCard blueCards) {
        blue.add(blueCards);
    }
    public ArrayList<TrainCard> getRedCards() {
        return red;
    }
    public void setRedCards(TrainCard redCards) {
        red.add(redCards);
    }
    public ArrayList<TrainCard> getOrangeCards() {
        return orange;
    }
    public void setOrangeCards(TrainCard orangeCards) {
        orange.add(orangeCards);
    }
    
    public ArrayList<TrainCard> getYellowCards() {
        return yellow;
    }
    public void setYellowCards(TrainCard yellowCards) {
        yellow.add(yellowCards);
    }
    public ArrayList<TrainCard> getGreenCards() {
        return green;
    }
    public void setGreenCards(TrainCard greenCards) {
        green.add(greenCards);
    }
    public ArrayList<TrainCard> getPurpleCards() {
        return purple;
    }
    public void setPurpleCards(TrainCard purpleCards) {
        purple.add(purpleCards);
    }
		
	public void playCards(ArrayList<TrainCard>A,Railyard R) {
		
			}
	
	public void OnThe‘rack(Railyard R,ArrayList<TrainCard>A) {
		
			}
	
	public boolean trainRodding(ArrayList<TrainCard>A,Railyard R) {
		
		
		return false;
		
	}
}
