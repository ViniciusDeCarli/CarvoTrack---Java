package pi;

public class ProcessoCarbo {
	private static int count = 1;
	private static int rendimento = 25;
	private int id;
	private double duracao;
	private int madeiraLigada;
	private int fornoUsado;
	private int funcionarioResp;
	
	public ProcessoCarbo (int lote, int cod, int usuarioResp) {
		this.id = count++;
		this.madeiraLigada = lote;
		this.fornoUsado = cod;
		this.funcionarioResp = usuarioResp;
	}

	public int getId() {
		return id;
	}
	
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public double getDuracao() {
		return duracao;
	}

	public double getRendimento() {
		return rendimento;
	}

	public int getListaMadeira() {
		return madeiraLigada;
	}

	public int getListaForno() {
		return fornoUsado;
	}

	public int getListaFuncionario() {
		return funcionarioResp;
	}
	
}
