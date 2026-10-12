# 🪵 Sistema de Monitoramento de Fornos de Carbonização

> Sistema em Java desenvolvido para automação, acompanhamento e telemetria de processos de carbonização de madeira em fornos industriais.

## 📋 Sobre o Projeto

O **Sistema de Monitoramento de Fornos de Carbonização** é uma aplicação voltada para a gestão e controle do processo de pirólise/carbonização de biomassa florestal (madeira).

A carbonização controlada exige monitoramento contínuo de variáveis críticas como **temperatura** e **pressão** para assegurar a qualidade do carvão final, evitar perdas de matéria-prima e garantir a segurança operacional das instalações. O sistema adota os princípios de Programação Orientada a Objetos (POO) para modelar os fornos, sensores de telemetria, cargas de madeira e o fluxo completo do processo produtivo.

## 🚀 Principais Funcionalidades

* **Gestão de Fornos:**  
  * Cadastro e controle de instâncias especializadas através de contratos (`IFornos`, `FornoGeral`, `FornoCarbonizacao`).  
  * Acompanhamento do estado operacional de cada forno em tempo real.  
* **Telemetria e Sensores:**  
  * Leitura e monitoramento de grandezas físicas via `SensorTemp` (temperatura) e `SensorPressao` (pressão).  
  * Estrutura hierárquica e polimórfica com base na classe base abstrata `Sensor`.  
* **Controle de Matéria-Prima:**  
  * Associação e registro da madeira utilizada (`Madeira`) para fins de rastreabilidade e rendimento gravimétrico.  
* **Ciclo de Carbonização:**  
  * Orquestração dos estágios do processo térmico (`ProcessoCarbo`).  
* **Autenticação e Acesso:**  
  * Controle de operadores e técnicos responsáveis pela supervisão (`Usuario`).  
* **Painel de Monitoramento:**  
  * Núcleo centralizado (`SistemaMonitoramento`) para agregação de dados e emissão de alertas em caso de anomalias operacionais.

## 🏗️ Arquitetura e Modelagem de Classes

O projeto adota boas práticas de orientação a objetos, explorando abstração, encapsulamento, herança e polimorfismo:

```
src/
└── pi/
    ├── IFornos.java              # Interface com as operações essenciais dos fornos
    ├── Forno.java                # Abstração de domínio de forno
    ├── FornoGeral.java           # Implementação genérica de fornos
    ├── FornoCarbonizacao.java    # Especialização focada no ciclo de carbonização
    ├── Madeira.java              # Modelo da biomassa/matéria-prima utilizada
    ├── Sensor.java               # Classe base abstrata para instrumentos de medição
    ├── SensorTemp.java           # Sensor especializado em leitura térmica (°C)
    ├── SensorPressao.java        # Sensor especializado em leitura barométrica/pressão (bar/psi)
    ├── ProcessoCarbo.java        # Gerenciamento das etapas do ciclo de queima/resfriamento
    ├── Usuario.java              # Operador/responsável pelo acompanhamento
    ├── SistemaMonitoramento.java # Central de controle, leitura e supervisão
    ├── Main.java                 # Ponto de entrada (Entrypoint da aplicação)
    └── module-info.java          # Configurações do módulo Java
```

&nbsp;

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 17+)  
* **Paradigma:** Programação Orientada a Objetos (POO)  
* **Ambiente de Desenvolvimento sugerido:** Eclipse IDE / VS Code / IntelliJ IDEA

## 💻 Como Executar o Projeto

### Pré-requisitos

* **Java JDK 17** (ou versão superior) instalado.  
* **Git** instalado na máquina.

### Passo a Passo

1. **Clone o repositório:**

```sh
git clone https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git
cd NOME-DO-REPOSITORIO
```

2. **Compilação via terminal:**

```sh
# Compilando os arquivos .java para a pasta bin
javac -d bin src/module-info.java src/pi/*.java
```

3. **Execução:**

```sh
java -cp bin pi.Main
```

### Executando no Eclipse IDE

1. Abra o Eclipse e vá em `File > Open Projects from File System...`.  
2. Selecione a pasta raiz deste projeto (`PI`).  
3. Aguarde o Eclipse resolver o `classpath` e a estrutura de módulos.  
4. Clique com o botão direito em `src/pi/Main.java` e selecione `Run As > Java Application`.

## 💡 Sugestões de Melhorias Futuras

- [ ] Criação de interface gráfica (JavaFX ou Swing) para visualização dos gráficos térmicos em tempo real.  
- [ ] Exportação de relatórios de ciclos de queima em formato CSV/PDF.  
- [ ] Integração com microcontroladores (Arduino/ESP32 via MQTT ou Serial) para leitura física de sensores reais.  
- [ ] Persistência de dados em banco relacional (PostgreSQL / MySQL) ou JPA/Hibernate.

## 👥 Equipe & Contribuidores

Projeto desenvolvido como parte do **Projeto Integrador (PI)** por:

| Integrante | GitHub | LinkedIn |
| :---- | :---- | :---- |
| **Vinicius Gabriel Landgraff    De Carli** | [@VinciusDeCarli](https://github.com/ViniciusDeCarli) | [Vinicius De Carli](https://www.linkedin.com/in/vinicius-de-carli-17ba8b356/) |
| **Gabriel Pedro Ramos** | [@Gabigol3](https://github.com/Gabigol3) | [Gabriel Pedro Ramos](https://www.linkedin.com/in/gabriel-pedro-ramos-5a5ba1367/) |
| **Pedro Henrique De Lima Silveira** | [@Lim4S2](https://github.com/Lim4S2) | [Pedro Silveira](https://www.linkedin.com/in/pedro-silveira-001b8630b/?isSelfProfile=false) |
| **Pedro Henrique Marcelino** | [@Dev-PredoMarcelino](https://github.com/Dev-PedroMarcelino) | [Pedro Henrique Marcelino](https://www.linkedin.com/in/pedro-henrique-marcelino-/) |

&nbsp;

## 📄 Licença

Este projeto está sob a licença [MIT](http://LICENSE).