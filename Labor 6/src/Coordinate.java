public class Coordinate {

	private double latitude;
	private double longitude;

	Coordinate(double latitude, double longitude) {
		
		
		if(latitude >= -180 && latitude <= 180){
			this.latitude = latitude;
		}else{
		for (int i = 0; latitude - i * 360 > 180 || latitude + i * 360 < -180; i++) {
			if (latitude - i * 360 > 180) {
				this.latitude = latitude - i * 360 - 360;
			} else if (latitude + i * 360 < -180) {
				this.latitude = latitude + i * 360 + 360;
			}
		}
		}

		if(longitude >= -180 && longitude <= 180){
			this.longitude = longitude;
		}else{
		for (int k = 0; longitude - k * 360 > 180 || longitude + k * 360 < -180; k++) {
			if (longitude - k * 360 > 180) {
				this.longitude = longitude - k * 360 - 360;
			} else if (longitude + k * 360 < 180) {
				this.longitude = longitude + k * 360 + 360;
			} else {
				this.longitude = longitude;
			}
		}
		}
	}

	boolean equals() {
		return false;
	}

	public String toString() {
		return "latitude: " + latitude + " longitude: " + longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}
}
