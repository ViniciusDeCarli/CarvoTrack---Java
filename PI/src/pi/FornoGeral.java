package pi;

import java.util.ArrayList;

public class FornoGeral extends Forno implements IFornos {
	private ArrayList<SensorTemp> listaSensoresTemp;
	private ArrayList<SensorPressao> listaSensoresPressao;
	
	public FornoGeral(int id, String tipo, double capacidadeMax, double potencia) {
		super(id, tipo, capacidadeMax, potencia);
		this.listaSensoresTemp = new ArrayList<SensorTemp>();
		this.listaSensoresPressao = new ArrayList<SensorPressao>();
	}
	
	public void instalarSensor(SensorTemp sensor) {
		this.listaSensoresTemp.add(sensor);
	}
	
	public void instalarSensor(SensorPressao sensor) {
		this.listaSensoresPressao.add(sensor);
	}
	
}
