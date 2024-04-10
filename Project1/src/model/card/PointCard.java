package model.card;

public class PointCard implements Card {

	private boolean active;
	private int player;
	private int points;
	private CardFace f;
	private CardType t;
	private String image;
	 public PointCard(int points) 
	    {
	        
	        this.points=points;
	     
	        
	    }
	
	@Override
	public boolean setActivation(boolean active) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getActivation() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int PlayerBelongs() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setValue(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPoints() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPoints(int points) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SetTempValue(int j) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int GetTempValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setface(CardFace f) {
		// TODO Auto-generated method stub
		this.f=f;
	}

	@Override
	public CardFace getface(CardFace f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void settypecard(CardType f) {
		t=f;
		
	}
	public CardType gettypecard() {
		return t;
		
	}

	@Override
	public String getimage() {
		// TODO Auto-generated method stub
		return image;
	}
}
