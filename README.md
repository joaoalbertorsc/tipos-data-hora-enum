Trabalhando com Tipos de Data, Hora e Enums em Java ☕
📝 Sobre o Projeto
Este repositório é um projeto prático desenvolvido em Java que demonstra as melhores práticas para a manipulação de tipos de data e hora (utilizando a moderna API java.time introduzida no Java 8) e o uso estratégico de Enums (java.lang.Enum) no ecossistema de desenvolvimento backend.

O objetivo é servir como um guia rápido e técnico para entender como representar fusos horários, datas locais, períodos, durações, e como associar regras de negócio e constantes ricas utilizando tipos enumerados.

💡 Principais Conceitos Abordados
Java Time API (java.time): Exemplos práticos com LocalDate, LocalTime, LocalDateTime, Instant, ZonedDateTime, além de manipulações com Period, Duration e formatações customizadas utilizando DateTimeFormatter.

Enums Estruturados: Demonstração de enums em Java que vão além de simples listas de constantes, incorporando atributos, construtores privados, métodos e até a implementação de padrões de projeto baseados em comportamento.

Persistência e Integração: Como mapear enums e tipos de data/hora em payloads JSON e boas práticas para evitar inconsistências de fuso horário em aplicações corporativas.

🛠️ Tecnologias Utilizadas
Java (versão 17 ou superior recomendado)

Maven (gerenciador de dependências e build)

🚀 Como Executar o Projeto
Você pode rodar este projeto tanto diretamente pelo terminal (caso não tenha nenhuma IDE instalada) quanto utilizando a sua IDE de preferência.

📋 Pré-requisitos
Certifique-se de ter instalado em sua máquina:

Java JDK (versão 17 ou superior) instalado e configurado nas suas variáveis de ambiente (JAVA_HOME).

Apache Maven instalado (opcional se você utilizar o Maven Wrapper ./mvnw).

💻 Opção 1: Executando pelo Terminal (Sem IDE)
Para quem prefere a agilidade do terminal ou não possui uma IDE Java configurada no momento:

Clone o repositório:

Bash
git clone https://github.com/joaoalbertorsc/tipos-data-hora-enum.git
cd tipos-data-hora-enum
Compile o projeto:
Execute o Maven para compilar as classes e garantir que todas as dependências sejam baixadas:

Bash
mvn clean compile
Execute a aplicação:

Se o projeto possuir uma classe principal (Main) definida no arquivo pom.xml, você pode rodar diretamente com:

Bash
mvn exec:java
Caso queira especificar a classe principal diretamente pelo comando:

Bash
mvn exec:java -Dexec.mainClass="com.seuprojeto.Main"
(Substitua com.seuprojeto.Main pelo caminho completo da classe executável do projeto).

Execute os Testes Unitários:
Caso queira rodar a suíte de testes do projeto via terminal:

Bash
mvn test
🖥️ Opção 2: Executando via IDE (IntelliJ IDEA, Eclipse, VS Code)
Se preferir utilizar um ambiente gráfico completo:

Importar o Projeto:

Abra a sua IDE.

Selecione Open (ou Import Project).

Navegue até a pasta onde clonou o projeto e selecione o arquivo pom.xml. A IDE irá detetar o projeto Maven e importar todas as configurações de forma automática.

Executar:

Localize a classe que contém o método public static void main(String[] args).

Clique com o botão direito sobre a classe ou dentro do método e selecione Run 'NomeDaClasse.main()'.

Testar:

Para rodar os testes, clique com o botão direito na pasta src/test/java e selecione Run 'All Tests'.

Se este repositório te ajudou a dominar as APIs de data, hora e enums no Java, sinta-se à vontade para deixar uma ⭐!
