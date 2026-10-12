package pi;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaMonitoramento {
	
	private Scanner ler;
	private ArrayList<Madeira> listaMadeirasCadastradas;
	private ArrayList<Forno> listaFornosCadastrados;
	private ArrayList<Usuario> listaUsuarioCadastrados;
	private ArrayList<Sensor> listaSensorCadastrados;
	private ArrayList<ProcessoCarbo> listaProcessoCarboFeitos;
	
	public SistemaMonitoramento() {
		this.listaMadeirasCadastradas = new ArrayList<Madeira>();
		this.listaFornosCadastrados = new ArrayList<Forno>();
		this.listaUsuarioCadastrados = new ArrayList<Usuario>();
		this.listaSensorCadastrados = new ArrayList<Sensor>();
		this.listaProcessoCarboFeitos = new ArrayList<ProcessoCarbo>();
		this.ler = new Scanner(System.in);
	}
	
	public void cadastrarUsuario() {
		System.out.println("\n=======================================");
		System.out.println("          CADASTRAR USUÁRIO            ");
		System.out.println("=======================================");
		
		System.out.print("➤ Digite o código do funcionário: ");
		int cod = ler.nextInt();
		
		System.out.print("➤ Digite o nome: ");
		String nome = ler.next();
		
		System.out.print("➤ Digite o cargo: ");
		String cargo = ler.next();
		
		String senha;
		do {
			System.out.print("➤ Digite uma senha (mínimo de 6 dígitos): ");
			senha = ler.next();
			
			if(senha.length() < 6) {
				System.out.println("[!] Erro: A senha é muito curta. Tente novamente.");
			}
		} while(senha.length() < 6);
		
		Usuario usuario = new Usuario(cod, nome, cargo, senha);
		this.listaUsuarioCadastrados.add(usuario);
		System.out.println("[✓] Usuário cadastrado com sucesso!\n");
	}
	
	public void cadastrarLote() {
		System.out.println("\n=======================================");
		System.out.println("        CADASTRAR LOTE DE MADEIRA      ");
		System.out.println("=======================================");
		
		System.out.print("➤ Digite o número do lote: ");
		int lote = ler.nextInt();
		
		System.out.print("➤ Digite o tipo da madeira: ");
		String tipo = ler.next();
		
		System.out.print("➤ Digite a densidade da madeira (de 1 até 100 kg/m³): ");
		double densidade = ler.nextDouble();
		
		System.out.print("➤ Digite o poder calórico da madeira (de 1 á 10 kcal/kg): ");
		double emissividade = ler.nextDouble();
		
		System.out.print("➤ Digite o tamanho do pedaço da madeira (cm): ");
		double tamanho = ler.nextDouble();
		
		System.out.print("➤ Digite o peso total da madeira em toneladas: ");
		double peso = ler.nextDouble();
		
		Madeira madeira = new Madeira(lote, tipo, densidade, emissividade, tamanho, peso);
		this.listaMadeirasCadastradas.add(madeira);
		System.out.println("[✓] Lote de madeira cadastrado com sucesso!\n");
	}
	
	public void cadastrarForno() {
		System.out.println("\n=======================================");
		System.out.println("           CADASTRAR FORNO             ");
		System.out.println("=======================================");
		System.out.println(" Escolha o tipo de forno a cadastrar:");
		System.out.println(" [1] - Forno Simples (Apenas temperatura)");
		System.out.println(" [2] - Forno Completo (Temperatura e Umidade)");
		System.out.println("=======================================");
		System.out.print("➤ Opção: ");
	}
	
	public void cadastrarFornoCarbo() {
		System.out.println("\n--- Cadastro de Forno Simples ---");
		System.out.print("➤ Digite o código do forno: ");
		int codigo = ler.nextInt();
		
		System.out.print("➤ Digite o material do forno: ");
		String tipoForno = ler.next();
		
		System.out.print("➤ Digite o volume máximo em m³: ");
		double volume = ler.nextDouble();
		
		System.out.print("➤ Digite a potência do forno em Quilowatt: ");
		double potencia = ler.nextDouble();
		
		FornoCarbonizacao forno = new FornoCarbonizacao(codigo, tipoForno, volume, potencia);
		this.listaFornosCadastrados.add(forno);
		System.out.println("[✓] Forno Simples cadastrado com sucesso!\n");
	}
	
	public void cadastrarFornoMelhor() {
		System.out.println("\n--- Cadastro de Forno Completo ---");
		System.out.print("➤ Digite o código do forno: ");
		int codigo = ler.nextInt();
		
		System.out.print("➤ Digite o material do forno: ");
		String tipoForno = ler.next();
		
		System.out.print("➤ Digite a capacidade de peso (toneladas): ");
		double peso = ler.nextDouble();
		
		System.out.print("➤ Digite a potência do forno: ");
		double potencia = ler.nextDouble();
		
		FornoGeral forno = new FornoGeral(codigo, tipoForno, peso, potencia);
		this.listaFornosCadastrados.add(forno);
		System.out.println("[✓] Forno Completo cadastrado com sucesso!\n");
	}
	
	public void cadastrarSensor() {
		System.out.println("\n=======================================");
		System.out.println("          CADASTRAR SENSOR             ");
		System.out.println("=======================================");
		System.out.println(" Escolha o tipo de sensor:");
		System.out.println(" [1] - Sensor de Temperatura");
		System.out.println(" [2] - Sensor de Umidade");
		System.out.println(" [3] - Voltar");
		System.out.println("=======================================");
		System.out.print("➤ Opção: ");
	}
	
	public void cadastrarSensorTemp() {
		System.out.println("\n--- Sensor de Temperatura ---");
		System.out.print("➤ Digite a TAG do sensor: ");
		int tag = ler.nextInt();
		
		System.out.print("➤ Digite o tipo do sensor: ");
		String tipo = ler.next();
		
		System.out.print("➤ Onde o sensor ficará instalado? ");
		String localizacao = ler.next();
		
		System.out.print("➤ Qual a temperatura máxima suportada? ");
		double tempMax = ler.nextDouble();
		
		SensorTemp sensor = new SensorTemp(tag, localizacao, tipo, tempMax);
		this.listaSensorCadastrados.add(sensor);
		System.out.println("[✓] Sensor de Temperatura cadastrado com sucesso!\n");
	}
	
	public void cadastrarSensorUmidade() {
		System.out.println("\n--- Sensor de Umidade ---");
		System.out.print("➤ Digite a TAG do sensor: ");
		int tag = ler.nextInt();
		
		System.out.print("➤ Digite o tipo do sensor: ");
		String tipo = ler.next();
		
		System.out.print("➤ Onde o sensor ficará instalado? ");
		String localizacao = ler.next();
		
		System.out.print("➤ Qual a pressão máxima suportada? ");
		double umidadeMax = ler.nextDouble();
		
		SensorPressao sensor = new SensorPressao(tag, localizacao, tipo, umidadeMax);
		this.listaSensorCadastrados.add(sensor);
		System.out.println("[✓] Sensor de Umidade cadastrado com sucesso!\n");
	}
	
	public void listarItensCadastrados() {
		System.out.println("\n=======================================");
		System.out.println("          LISTAGEM DE ITENS            ");
		System.out.println("=======================================");
		System.out.println(" [1] - Listar Lotes de Madeira");
		System.out.println(" [2] - Listar Sensores");
		System.out.println(" [3] - Listar Fornos");
		System.out.println(" [4] - Voltar");
		System.out.println("=======================================");
		System.out.print("➤ Opção: ");
	}
	
	public void listarLotesCadastrados() {
		System.out.println("\n------------------------------------ LOTES DE MADEIRA CADASTRADOS ------------------------------------");
		if (this.listaMadeirasCadastradas.isEmpty()) {
			System.out.println("[!] Nenhum lote registrado ainda.\n");
			return;
		}
		
		for(Madeira madeira : this.listaMadeirasCadastradas) {
			System.out.println(" Lote: " + madeira.getLote() + " | Tipo: " + madeira.getTipoMadeira() + " | Tamanho: " + madeira.getTamanho() + "cm" +
		" | Densidade: " + madeira.getDensidade() + " kg/m³" + " | Poder calórico: " + madeira.getEmissividade() + " kcal/kg");
		}
		System.out.println("------------------------------------------------------------------------------------------------------\n");
	}
	
	public void listarFornosCadastrados() {
		System.out.println("\n--- FORNOS CADASTRADOS ---");
		if (this.listaFornosCadastrados.isEmpty()) {
			System.out.println("[!] Nenhum forno registrado ainda.\n");
			return;
		}
		
		for(Forno forno : this.listaFornosCadastrados) {
			System.out.println(" ID: " + forno.getId() + " | Material: " + forno.getTipoMaterial() + " | Potência: " + forno.getPotencia() + " KW/h");
		}
		System.out.println("--------------------------\n");
	}
	
	public void listarSensoresCadastrados() {
		System.out.println("\n--- SENSORES CADASTRADOS ---");
		if (this.listaSensorCadastrados.isEmpty()) {
			System.out.println("[!] Nenhum sensor registrado ainda.\n");
			return;
		}
		
		for(Sensor sensor : this.listaSensorCadastrados) {
			System.out.println(" TAG: " + sensor.getTag() + " | Tipo: " + sensor.getTipo() + " | Localização: " + sensor.getLocalizacao());
		}
		System.out.println("----------------------------\n");
	}
	
	public void instalarSensorNoForno() {
	    System.out.println("\n=======================================");
	    System.out.println("    INSTALAR SENSOR EM UM FORNO        ");
	    System.out.println("=======================================");
	    
	    System.out.print("➤ Informe a TAG do sensor: ");
	    int idSensor = ler.nextInt();
	    
	    System.out.print("➤ Informe o código do forno: ");
	    int idForno = ler.nextInt();
	    
	    if(idSensor <= 0 || idSensor > this.listaSensorCadastrados.size() || 
	       idForno <= 0 || idForno > this.listaFornosCadastrados.size()) {
	        System.out.println("\n[!] Erro: Sensor ou Forno não encontrado!\n");
	        return;
	    }
	    
	    Sensor sensor = this.listaSensorCadastrados.get(idSensor - 1);
	    Forno forno = this.listaFornosCadastrados.get(idForno - 1);
	    
	    if (forno instanceof FornoCarbonizacao) {
	        if (sensor instanceof SensorTemp) {
	            forno.instalarSensor((SensorTemp) sensor);
	            System.out.println("\n[✓] Sensor de Temperatura instalado no Forno " + forno.getId());
	        } else {
	            System.out.println("\n[!] Erro: O Forno de Carbonização suporta apenas Sensores de Temperatura.");
	        }
	    } 
	    else if (forno instanceof FornoGeral) {
	        if (sensor instanceof SensorTemp) {
	            forno.instalarSensor((SensorTemp) sensor);
	            System.out.println("\n[✓] Sensor de Temperatura instalado no Forno Geral " + forno.getId());
	        } else if (sensor instanceof SensorPressao) {
	            ((FornoGeral) forno).instalarSensor((SensorPressao) sensor);
	            System.out.println("\n[✓] Sensor de Umidade/Pressão instalado no Forno Geral " + forno.getId());
	        }
	    }
	}
	
	public void comecarProcessoCarbonizacao() {
		// VALIDAÇÃO: Verifica se há os requisitos mínimos antes de iniciar
		if (this.listaMadeirasCadastradas.isEmpty() || this.listaFornosCadastrados.isEmpty() || this.listaUsuarioCadastrados.isEmpty()) {
			System.out.println("\n[!] ATENÇÃO: Requisitos insuficientes para iniciar o processo!");
			System.out.println("Para realizar a carbonização, o sistema precisa de pelo menos:");
			if(this.listaMadeirasCadastradas.isEmpty()) System.out.println(" ❌ 1 Lote de madeira cadastrado");
			if(this.listaFornosCadastrados.isEmpty()) System.out.println(" ❌ 1 Forno cadastrado");
			if(this.listaUsuarioCadastrados.isEmpty()) System.out.println(" ❌ 1 Usuário cadastrado");
			System.out.println("Por favor, realize os cadastros pendentes no menu e tente novamente.\n");
			return; // Encerra o método e volta para o menu
		}

		System.out.println("\n=======================================");
		System.out.println("   INICIAR PROCESSO DE CARBONIZAÇÃO    ");
		System.out.println("=======================================");
		
		System.out.print("➤ Informe o código do lote de madeira: ");
		int codLoteCarbo = ler.nextInt();
		
		System.out.print("➤ Informe o código do forno utilizado: ");
		int idFornoCarbo = ler.nextInt();
		
		System.out.print("➤ Informe o código do funcionário responsável: ");
		int codFuncResp = ler.nextInt();
		
		// Tratamento de segurança básico para índices
		if(codLoteCarbo > this.listaMadeirasCadastradas.size() || idFornoCarbo > this.listaFornosCadastrados.size() || codFuncResp > this.listaUsuarioCadastrados.size()) {
			System.out.println("\n[!] Erro: Código de lote, forno ou usuário inválido.\n");
			return;
		}

		Madeira madeira = this.listaMadeirasCadastradas.get(codLoteCarbo - 1);
		Forno forno = this.listaFornosCadastrados.get(idFornoCarbo - 1);
		
		ProcessoCarbo processo = new ProcessoCarbo(codLoteCarbo, idFornoCarbo, codFuncResp);
		
		double tempoHoras = (madeira.getPeso() * madeira.getDensidade()) / (forno.getPotencia() * madeira.getEmissividade());
		
		processo.setDuracao(tempoHoras);
		
		this.listaProcessoCarboFeitos.add(processo);
		System.out.println("\n[✓] Processo de carbonização iniciado e registrado com sucesso!\n");
	}
	
	public void gerarRelatorioDaCarbonizacao() {
		if (this.listaProcessoCarboFeitos.isEmpty()) {
			System.out.println("\n[!] Nenhum processo de carbonização foi registrado ainda.\n");
			return;
		}
		
		System.out.println("Antes de gerar o rel");

		for(ProcessoCarbo processo : this.listaProcessoCarboFeitos) {
			Madeira madeira = this.listaMadeirasCadastradas.get(processo.getListaMadeira() - 1);
			Forno forno = this.listaFornosCadastrados.get(processo.getListaForno() - 1);
			Usuario usuario = this.listaUsuarioCadastrados.get(processo.getListaFuncionario() - 1);
			
			System.out.println("\n==================================================");
			System.out.println("       RELATÓRIO DO PROCESSO DE CARBONIZAÇÃO      ");
			System.out.println("==================================================");
			System.out.println(" ID do Processo: " + processo.getId());
			System.out.println(" Madeira processada: Lote " + madeira.getLote() + " - " + madeira.getTipoMadeira());
			System.out.println(" Forno utilizado: ID " + forno.getId() + " (" + forno.getTipoMaterial() + ")");
			System.out.println(" Funcionário responsável: " + usuario.getNome() + " (" + usuario.getCargo() + ")");
			System.out.printf(" Duração estimada: %.2f horas\n", processo.getDuracao());
			System.out.printf(" Rendimento estimado: %.1f%%\n", processo.getRendimento());
			
			double carvaoProduzidoKg = processo.getRendimento() / 100 * madeira.getPeso();
			System.out.printf(" Estimativa de Carvão Produzido: %.2f Ton.\n", carvaoProduzidoKg);
			System.out.println("==================================================\n");
		}
	}
	
	public void gerarRelatorioMadeiraCarbonizacao() {
		if(this.listaProcessoCarboFeitos.isEmpty()) {
			System.out.println("\n[!] Nenhum processo carbonização foi registrado ainda.\n");
			return;
		}
		
		for(ProcessoCarbo processo : this.listaProcessoCarboFeitos) {
			Madeira madeira = this.listaMadeirasCadastradas.get(processo.getListaMadeira() - 1);
			
			System.out.println("\n==================================================");
			System.out.println("   RELATÓRIO: MADEIRAS NO PROCESSO DE CARBONIZAÇÃO ");
			System.out.println("==================================================");
			System.out.println(" ID do Processo: " + processo.getId());
			System.out.println(" Madeira processada: Lote " + madeira.getLote() + " - " + madeira.getTipoMadeira());
			System.out.printf(" Rendimento estimado: %.1f%%\n", processo.getRendimento());
			
			double carvaoProduzidoKg = processo.getRendimento() / 100 * madeira.getPeso();
			System.out.printf(" Estimativa de carvão produzido: %.2f Ton.\n", carvaoProduzidoKg);
			System.out.println("==================================================\n");
		}
	}
	 
	public Usuario realizarLogin() {
		System.out.println("\n=======================================");
		System.out.println("                LOGIN                  ");
		System.out.println("=======================================");
		System.out.print("➤ Informe o código do usuário: ");
		int cod = ler.nextInt();
		
		System.out.print("➤ Informe a senha: ");
		String senha = ler.next();
		
		// Verificação básica para não dar erro se o código não existir
		if (cod <= 0 || cod > this.listaUsuarioCadastrados.size()) {
			System.out.println("\n[!] Usuário não encontrado.\n");
			return null;
		}

		Usuario usuario = this.listaUsuarioCadastrados.get(cod-1);
		
		if(usuario != null && usuario.getSenha().equals(senha)) {
			System.out.println("\n[✓] Logado com sucesso!");
			System.out.println(" Olá, " + usuario.getNome() + "!");
			return usuario;
		} else { 
			System.out.println("\n[!] Usuário ou senha incorretos.\n");
			return null;
		}
	}
	
	public void exibirMenuInicial() {
		System.out.println("\n=======================================");
		System.out.println(" SISTEMA DE CARBONIZAÇÃO DE CARVÃO     ");
		System.out.println("=======================================");
		System.out.println(" [1] - Cadastrar novo usuário");
		System.out.println(" [2] - Realizar Login");
		System.out.println(" [3] - Sair");
		System.out.println("=======================================");
		System.out.print("➤ Escolha uma opção: ");
	}
	
	public void exibirMenuSistema() {
		System.out.println("\n=======================================");
		System.out.println("        PAINEL DE MONITORAMENTO        ");
		System.out.println("=======================================");
		System.out.println(" [1] - Cadastrar lote de madeira");
		System.out.println(" [2] - Cadastrar forno");
		System.out.println(" [3] - Cadastrar sensor de monitoramento");
		System.out.println(" [4] - Ver itens cadastrados no sistema");
		System.out.println(" [5] - Instalar sensor no forno");
		System.out.println(" [6] - Iniciar processo de carbonização");
		System.out.println(" [7] - Gerar relatório do processo");
		System.out.println(" [8] - Gerar relatório da madeira");
		System.out.println(" [0] - Sair");
		System.out.println("=======================================");
		System.out.print("➤ Escolha uma opção: ");
	}
}