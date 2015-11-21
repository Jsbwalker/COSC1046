package question3;

public class Temperature {
	private double temperatureC;
	
	public Temperature(double temp){
		if (temp < -273.15){
			temperatureC = -273.15;
		} else {
			temperatureC = temp;
		}
	}
	
	public void setC(double newTemp){
		if (newTemp < -273.15){
			temperatureC = -273.15;
		} else {
			temperatureC = newTemp;
		}
	}
	
	public double getC(){
		return temperatureC;
	}
	
	public double getF(){
		return temperatureC * 1.8 + 32;
	}
	
	public double getK(){
		return temperatureC + 273.15;
	}
}
