package pi;

public class SensorTemp extends Sensor {
	private double tempMax;
	
	public SensorTemp(int tag, String localizacao, String tipo, double tempMax) {
		super(tag, localizacao, tipo);
		this.tempMax = tempMax;
	}
	
	public double getTempMax() {
		return this.tempMax;
	}
}
