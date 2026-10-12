package pi;

public class SensorPressao extends Sensor {
	private double umidadeMax;
	
	public SensorPressao (int tag, String localizacao, String tipo, double umidadeMax) {
		super(tag, localizacao, tipo);
		this.umidadeMax = umidadeMax; 
	}
	
	public double getUmidadeMax() {
		return this.umidadeMax;
	}
}
