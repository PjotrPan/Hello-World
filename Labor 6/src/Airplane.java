import java.util.Date;

public class Airplane extends Lab6_Aufg1{
	
	public double maxDistance;
	
	public Airplane(String icao, Coordinate coordinate, Date posTime, double maxDistance){
		super();
		this.icao = icao;
		this.coordinate = coordinate;
		this.posTime = posTime;
		this.maxDistance = maxDistance;
	}

	public double getMaxDistance(){
		return maxDistance;
	}
	
	public String toString(){
		return maxDistance + Airplane.class.getName();
		
	}

}
