import java.util.Date;

public class Ground_Vehicle extends Lab6_Aufg1{
	
	public int numberSeats;
	
	public Ground_Vehicle(String icao, Coordinate coordinate, Date posTime, int numberSeats){
		
		this.icao = icao;
		this.coordinate = coordinate;
		this.posTime = posTime;
		this.numberSeats = numberSeats;
	}
	
	public double getNumberSeats(){
		return numberSeats;
	}
	
	public String toString(){
		return numberSeats + Ground_Vehicle.class.getName();
		
	}

}
