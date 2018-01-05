import java.util.Date;

public class BasicPlane {
	
	public String icao;
	public Coordinate[] coordinate;
	public Date[] posTime;
	public int index;
	
	
	public BasicPlane(String icao, Coordinate[] coordinate, Date[] posTime){
		posTime = new Date[10];
		coordinate = new Coordinate[10];
		this.icao = icao;
		this.index = 0;
		
		coordinate[0] = new Coordinate[...];
	}
	
	public static void addTimeAndPosition(Date posTime, Coordinate coordinate){
		if()
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