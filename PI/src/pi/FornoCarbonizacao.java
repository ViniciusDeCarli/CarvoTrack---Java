package pi;

import java.util.ArrayList;

public class FornoCarbonizacao extends Forno {
	private ArrayList<SensorTemp> listaSensoresTemp;
	
	public FornoCarbonizacao(int id, String tipo, double capacidadeMax, double potencia) {
		super(id, tipo, capacidadeMax, potencia);
		this.listaSensoresTemp = new ArrayList<SensorTemp>();
	}
	
	public void instalarSensor(SensorTemp sensor) {
		this.listaSensoresTemp.add(sensor);
	}
	
}
