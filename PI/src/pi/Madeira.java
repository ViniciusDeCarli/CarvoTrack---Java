package pi;

public class Madeira {
	public static double metaCarvao = 10;
	private int lote;
	private double tamanho;
	private String tipoMadeira;
	private double densidade;
	private double emissividade;
	private double peso;
	
	public Madeira(int lote, String tipo, double densidade, double emissividade, double tamanho, double peso) {
		this.lote = lote;
		this.tamanho = tamanho;
		this.tipoMadeira = tipo;
		this.densidade = densidade;
		this.emissividade = emissividade;
		this.peso = peso;
	}
	
	public int getLote() {
		return lote;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public String getTipoMadeira() {
		return tipoMadeira;
	}
	public void setTipoMadeira(String tipoMadeira) {
		this.tipoMadeira = tipoMadeira;
	}
	public double getDensidade() {
		return densidade;
	}
	public void setDensidade(double densidade) {
		this.densidade = densidade;
	}
	public double getEmissividade() {
		return emissividade;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() { 
		return this.peso;
	}
	
}
