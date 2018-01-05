import java.util.Date;

public class Lab6_Aufg1 {
	
	public String icao;
	public Coordinate coordinate;
	public Date posTime;
	public int species;
	
	public static final int NONE = 0;
	public static final int AIRPLANE = 1;
	public static final int HELICOPTER = 4;
	public static final int GYROCOPTER = 5;
	public static final int GROUND_VEHICLE = 7;
	public static final int TOWER = 8;

	
	public Lab6_Aufg1(String icao, Coordinate coordinate, Date posTime, int species){
		
		this.coordinate = coordinate;
		this.icao = icao;
		this.posTime = posTime;
	}
	
	public Lab6_Aufg1(){
		
	}
	
	public String getIcao(){
		return icao;
	}
	public Coordinate getCoordinate(){
		return coordinate;
	}

	public Date getPosTime(){
	return posTime;
	}

	public double distanceFrom(Coordinate c){
		return Math.sqrt((c.getLatitude() - coordinate.getLatitude())
				* (c.getLatitude() - coordinate.getLatitude())
				+ (c.getLongitude() - coordinate.getLongitude())
				* (c.getLongitude() - coordinate.getLongitude()));
		
	}
	
	public String toString() {
		return "ICAO: " + icao + "Koordinaten: " + coordinate + "; Zeit: " + posTime;
	}

	
}