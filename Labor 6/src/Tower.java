import java.util.Date;

public class Tower extends Lab6_Aufg1{
	
	public int numberPersonell;
	
	public Tower(String icao, Coordinate coordinate, Date posTime, int numberPersonell){
		this.icao = icao;
		this.coordinate = coordinate;
		this.posTime = posTime;
		this.numberPersonell = numberPersonell;
	}
	
	public double getNumberPersonell(){
		return numberPersonell;
	}
	
	public String toString(){
		return numberPersonell + Tower.class.getName();
		
	}

}
