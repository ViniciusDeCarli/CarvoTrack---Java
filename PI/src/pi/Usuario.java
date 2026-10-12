package pi;

public class Usuario {
	private int codigo;	
	private String nome;	
	private String cargo;				
	private String senha;
	
	public Usuario (int codigo, String nome, String cargo, String senha) {
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.senha = senha;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public String getSenha() {
		return senha;
	}
	
	public void atualizarSenha(String senha) {
		this.senha = senha;
	}
	
}
