import java.util.Date;
import org.json.JSONException;

import jsonstream.*;

public class PlaneTest6
{
    private static boolean haveConnection = true; // false an Hochschulrechnern
    
    public static void main(String[] args)
	{
		String urlString = "https://public-api.adsbexchange.com/VirtualRadar/AircraftList.json";
		PlaneDataServer server;
		PlaneData plane;
		
		if(haveConnection)
			server = new PlaneDataServer(urlString, 0.0, 0.0, 0);
		else
			server = new PlaneDataServer();
		
		Thread t = new Thread(server);
		t.setDaemon(false);
		t.start();
		for(int i = 0;i < 15;i++)
		{
			try {
				plane = server.getNextNonePlaneFromCurrentList();
			}
			catch (JSONException e)
			{
				e.printStackTrace();
				continue; 
			}
		
			Coordinate pos = new Coordinate(plane.getLatitude(), plane.getLongitude());
			String icao = plane.getIcao();
			Date date = new Date(plane.getPosTime());
			int species = plane.getSpecies();
			Lab6_Aufg1 bp;
			switch(species) {
			case Lab6_Aufg1.AIRPLANE:
				bp = new Airplane(icao, pos, date, 5000.0);
				break;
			case Lab6_Aufg1.HELICOPTER:
				bp = new Helicopter(icao, pos, date, Helicopter.WHEELS);
				break;
			case Lab6_Aufg1.GYROCOPTER:
				bp = new Gyrocopter(icao, pos, date, 8);
				break;
			case Lab6_Aufg1.GROUND_VEHICLE:
				bp = new Ground_Vehicle(icao, pos, date, 4);
				break;
			case Lab6_Aufg1.TOWER:
				bp = new Tower(icao, pos, date, 15);
				break;
			default:
				bp = new Lab6_Aufg1(icao, pos, date, species);
			}
			System.out.println(bp);
		}
		System.out.println("Exit");
		System.exit(0);
	}
}