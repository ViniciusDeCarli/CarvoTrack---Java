package pi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		SistemaMonitoramento sistemaMonitoramento = new SistemaMonitoramento();
		
		int opcaoMenu1 = 0;
		
		Scanner ler = new Scanner(System.in);
		
		sistemaMonitoramento.exibirMenuInicial();
		opcaoMenu1 = ler.nextInt();
		
		while (true) {

			if(opcaoMenu1 == 1) {
				sistemaMonitoramento.cadastrarUsuario();
				sistemaMonitoramento.exibirMenuInicial();
				opcaoMenu1 = ler.nextInt();

			} else if (opcaoMenu1 == 2) {
				Usuario usuario;
				usuario = sistemaMonitoramento.realizarLogin();
				
				if(usuario != null) {
					
					int opcaoMenu2 = -1;
					
					while(opcaoMenu2 != 0) {		
						sistemaMonitoramento.exibirMenuSistema();
						opcaoMenu2 = ler.nextInt();
						
						if(opcaoMenu2 == 1) {
							sistemaMonitoramento.cadastrarLote();
						
						} else if (opcaoMenu2 == 2) {
							int opcaoFornos = 0; 
							
							sistemaMonitoramento.cadastrarForno();
							
							opcaoFornos = ler.nextInt();
							
							if (opcaoFornos == 1)
								sistemaMonitoramento.cadastrarFornoCarbo();
							else if (opcaoFornos == 2)
							sistemaMonitoramento.cadastrarFornoMelhor();
							
						} else if (opcaoMenu2 == 3) {
							int opcaoSensores = 0;
							
							sistemaMonitoramento.cadastrarSensor();
							opcaoSensores = ler.nextInt();
							
							if(opcaoSensores == 1)
								sistemaMonitoramento.cadastrarSensorTemp();
							else if(opcaoSensores == 2)
							sistemaMonitoramento.cadastrarSensorUmidade();
							
						} else if(opcaoMenu2 == 4) {
							int opcaoLista = 0;
							
							sistemaMonitoramento.listarItensCadastrados();
							opcaoLista = ler.nextInt();
							
							if(opcaoLista == 1) {								
								sistemaMonitoramento.listarLotesCadastrados();							
							} else if (opcaoLista == 2) {								
								sistemaMonitoramento.listarSensoresCadastrados();
							} else if (opcaoLista == 3) {
								sistemaMonitoramento.listarFornosCadastrados();								
							} 
							
						} else if(opcaoMenu2 == 5) {							
							sistemaMonitoramento.instalarSensorNoForno();
							
						} else if(opcaoMenu2 == 6) {
							sistemaMonitoramento.comecarProcessoCarbonizacao();
							
						} else if(opcaoMenu2 == 7) {
							sistemaMonitoramento.gerarRelatorioDaCarbonizacao();
				
						} else if(opcaoMenu2 == 8) {
							sistemaMonitoramento.gerarRelatorioMadeiraCarbonizacao();
							
						} else if (opcaoMenu2 == 0) {
							System.out.println("Encerrando o sistema");
							break;
					
						}
					}
				}
			} else {
				System.out.println("Encerrando o sistema");
				break;
			}
		}
	}

}
