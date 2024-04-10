package model.card;

public class TrainCard implements Card {
		private boolean active;
		private int player;
		private int id;
		private int points;
		private CardFace f;
		private CardType t;
		private String Color;
		private String from;
		private String to;
		private String image;
		private int x,y;
	
    private CardColor type;
    
    public TrainCard(String Color,String image) 
    {
        this.image=image;
       this.Color=Color;
    }
    
	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String getColor() {
		return Color;
	}

	@Override
	public void setValue(int value) {
		// TODO Auto-generated method stub
		
	}

	public void setPos(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public int getPosY() {
		return y;
	}
	
	public int getPosX() {
		return x;
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
	public boolean setActivation(boolean active) {
		// TODO Auto-generated method stub
		
		
		return this.active;
		
	}
	
	@Override
	public boolean getActivation() {
		// TODO Auto-generated method stub
		
		return this.active;
		
	}

	@Override
	public int PlayerBelongs() {
		// TODO Auto-generated method stub
		return player;
	}

	@Override
	public void setface(CardFace f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CardFace getface(CardFace f) {
		// TODO Auto-generated method stub
		return f;
	}

	@Override
	public void settypecard(CardType f) {
		// TODO Auto-generated method stub
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
