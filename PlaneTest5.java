import java.util.Date;
import jsonstream.*;

public class PlaneTest5
{
    private static double latitude = 48.7433425;
    private static double longitude = 9.3201122;
    private static boolean haveConnection = true; // false an Hochschulrechnern
    
    public static void main(String[] args)
	{
		String urlString = "https://public-api.adsbexchange.com/VirtualRadar/AircraftList.json";
		PlaneDataServer server;
		
		if(haveConnection)
			server = new PlaneDataServer(urlString, latitude, longitude, 50);
		else
			server = new PlaneDataServer();

		Thread t = new Thread(server);
		t.setDaemon(false);
		t.start();
		PlaneData plane = server.getFirstPlaneFromNewList();
		Coordinate pos = new Coordinate(plane.getLatitude(), plane.getLongitude());
		BasicPlane2 bp = new BasicPlane2(plane.getIcao(), pos, new Date(plane.getPosTime()));
		System.out.println("Plane = " + bp);
		for(int i = 0;i < 15;i++)
		{
			plane = server.getFirstPlaneFromNewList();
			pos = new Coordinate(plane.getLatitude(), plane.getLongitude());
			bp.addTimeAndPosition(new Date(plane.getPosTime()), pos);
		}
		System.out.println("Plane = " + bp);
		System.exit(0);
	}
}