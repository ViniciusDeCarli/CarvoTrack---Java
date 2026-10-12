package pi;

//import java.util.ArrayList;

public abstract class Forno {
	private int id;	
	private String tipoMaterial;
	private double capacidadeMax;  	
	private double potencia;	
	private int status;
	
	public Forno (int id, String tipo, double capacidadeMax, double potencia) {
		this.id = id;
		this.tipoMaterial = tipo;
		this.capacidadeMax = capacidadeMax;
		this.potencia = potencia;
		this.status = 0;
	}

	public int getId() {
		return this.id;
	}

	public String getTipoMaterial() {
		return this.tipoMaterial;
	}

	public double getCapacidadeMax() {
		return this.capacidadeMax;
	}

	public double getPotencia() {
		return this.potencia;
	}
	
	public String statusForno() {
		if(status == 1) 
			return "Forno está em funcionamento";
		return "Forno não está em funcionamento";
	}
	
	public abstract void instalarSensor(SensorTemp sensor);
	
}
