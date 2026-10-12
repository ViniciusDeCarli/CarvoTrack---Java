package pi;

public abstract class Sensor {
	protected int tag;
	protected String localizacao;
	protected String tipo;
	
	public Sensor (int tag, String localizacao, String tipo) {
		this.tag = tag;
		this.localizacao = localizacao;
		this.tipo = tipo;
	}

	public int getTag() {
		return this.tag;
	}

	public String getLocalizacao() {
		return this.localizacao;
	}
	
	public void mudarLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public String getTipo() {
		return this.tipo;
	}

}