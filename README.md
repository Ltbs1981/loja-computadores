Sistema de Gestão de Computadores
Descrição do Projeto
Este projeto foi desenvolvido como parte de um sistema de gestão de computadores para uma empresa de vendas de hardware. O objetivo principal do sistema é permitir a criação, gerenciamento e consulta de informações relacionadas a diferentes tipos de computadores, como Desktop, Notebook e Servidor. Cada um desses tipos de computador possui componentes específicos, como Memória, HD e Fonte, que também são gerenciados pelo sistema.
Funcionalidades
O sistema oferece as seguintes funcionalidades:
• Cadastro de Computadores: Permite a criação de registros para diferentes tipos de computadores (Desktop, Notebook, Servidor), incluindo a especificação de seus componentes (Memória, HD, Fonte).
• Impressão de Dados: Função para exibir as informações dos computadores cadastrados, juntamente com seus componentes.
• Entrada de Dados: Interface de entrada para que o usuário possa inserir informações diretamente via console.
• Teste Automatizado: Testes unitários foram implementados para validar as funcionalidades de cadastro e impressão dos diferentes tipos de computadores.
Estrutura do Projeto
O projeto está estruturado em várias classes, cada uma responsável por um aspecto do sistema:
• Computador (Classe Abstrata): Classe base que define os atributos e métodos comuns para todos os tipos de computadores.
• Desktop, Notebook, Servidor: Classes concretas que herdam de `Computador` e podem ter comportamentos específicos.
• Memoria, HD, Fonte: Classes que representam os componentes dos computadores, cada uma com seus próprios atributos e métodos.
• ComputadorTeste: Classe de testes unitários para validar o funcionamento das funcionalidades de cadastro e impressão.
Tecnologias Utilizadas
• Java: Linguagem de programação utilizada para desenvolver o sistema.
• JUnit: Biblioteca para a criação de testes unitários.
• Maven: Ferramenta de automação de compilação e gerenciamento de dependências.
• IntelliJ IDEA: Ambiente de desenvolvimento integrado (IDE) usado para o desenvolvimento do projeto.
Como Executar o Projeto
1. Clone o repositório:
bash
Copiar código
git clone https://github.com/seu-usuario/seu-repositorio.git
2. Navegue até o diretório do projeto:
bash
Copiar código
cd seu-repositorio
3. Compile o projeto utilizando o Maven:
bash
Copiar código
mvn clean install
4. Execute os testes para garantir que tudo está funcionando:
bash
Copiar código
mvn test
5. Para rodar o projeto, você pode executar a classe principal diretamente através de sua IDE ou pelo terminal.
Documentação
A documentação do projeto, incluindo capturas de tela dos testes de cadastro e impressão, está disponível no repositório. Ela pode ser encontrada no arquivo DocumentacaoProjeto.docx.
Referências
Para a construção deste projeto, foram consultados os seguintes materiais:
• Documentação oficial do Java
• Guia de uso do JUnit
• Maven Documentation
• Tutoriais e artigos sobre boas práticas de programação em Java.
Conclusão
Este projeto demonstra a implementação de um sistema básico de gestão de computadores, aplicando conceitos de orientação a objetos, herança, encapsulamento e composição. Através das funcionalidades desenvolvidas e dos testes automatizados, o sistema oferece uma base sólida para futuras expansões, como a integração com bancos de dados, interfaces gráficas ou serviços web.
     
