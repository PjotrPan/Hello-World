import java.util.Date;

public class Helicopter extends Lab6_Aufg1{
	
	public int typeLandingGear;
	
	public static final int  WHEELS = 1;
	public static final int SKIS = 2;
	public static final int FLOATS = 3;
	
	public Helicopter(String icao, Coordinate coordinate, Date posTime, int typeLandingGear){
		super();
		this.icao = icao;
		this.coordinate = coordinate;
		this.posTime = posTime;		
	}

	public double getTypeLandingGear(){
		return typeLandingGear;
	}
	
	public String toString(){
		return typeLandingGear + Helicopter.class.getName();
		
	}
}
