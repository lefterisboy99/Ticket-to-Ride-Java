package model.card;

import java.util.ArrayList;

public class DestinationCard extends PointCard {
	ArrayList<String>Color =new ArrayList<String>();
	private int points,id;
	private String to,from,image;
	private int x,y;
	public DestinationCard(int points,int id,String from,String to,String image,ArrayList<String>Color) {
		super(points);
		this.points=points;
		this.id=id;
		this.to=to;
		this.from=from;
		this.Color=Color;
		this.image=image;
		
	
		// TODO Auto-generated constructor stub
	}
	
	
	public int getPoints() {
		return points; 
		}
	
	public String getImage() {
		return image;
	}
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public int getid() {
		return id; 
		}
	public String to() {
		return to; 
		}
	public String from() {
		return from; 
		}
	public ArrayList<String> Colors(){
		return Color;
	}
	
	public boolean checkList(ArrayList<TrainCard> b) {
		return true;
	}
	

}
