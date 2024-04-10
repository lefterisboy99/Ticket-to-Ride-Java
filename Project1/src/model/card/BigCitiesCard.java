package model.card;

public class BigCitiesCard extends PointCard{

	private int visit1=0,visit2=0;
	private int points;
	private String image;
	public BigCitiesCard(int points,String image) {
		super(points);
		this.image=image;
		this.points=points;
		// TODO Auto-generated constructor stub
	}
	
	public int getPoints() {
		return points;
	}
	public String getimage() {
		return image;
	}
	public void called1() {
		visit1++;
	}
	public void called2() {
		visit2++;
	}
	public int s2() {
		return visit2;
		
	}
	public int s1() {
		return visit1;
		
	}

}
