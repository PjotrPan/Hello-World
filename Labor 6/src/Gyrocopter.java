import java.util.Date;

public class Gyrocopter extends Lab6_Aufg1{
	
	public int numberPropellers;
	
	public Gyrocopter(String icao, Coordinate coordinate, Date posTime, int numberPropellers){
		super(); 
		this.icao = icao;
		this.coordinate = coordinate;
		this.posTime = posTime;
		this.numberPropellers = numberPropellers;
	}
	
	public double getNumberPropellers(){
		return numberPropellers;
	}
	
	public String toString(){
		return numberPropellers + Gyrocopter.class.getName();
		
	}

}
