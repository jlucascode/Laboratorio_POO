# Laboratório de POO

Projeto acadêmico em Java desenvolvido na disciplina de Programação Orientada a Objetos. A aplicação usa Swing para a interface e uma `LinkedList<Jogador>` para manter os cadastros em memória.

## Funcionalidades

- Acesso ao painel administrativo pela tela de login.
- Cadastro, listagem, busca por código, atualização e remoção de jogadores.
- Verificação de login duplicado durante o cadastro.
- Ranking de jogadores da maior para a menor pontuação.
- Retorno à tela de login pelo botão **Sair**.

Os cadastros são descartados ao encerrar o programa. O projeto também inclui um protótipo de jogo da velha em uma janela separada, ainda sem integração com o painel ou com a pontuação dos jogadores.

## Como executar

1. Instale o **JDK 21** e configure-o no Apache NetBeans.
2. Clone o repositório.

   ```bash
   git clone https://github.com/jlucascode/Laboratorio_POO.git
   ```

3. No NetBeans, abra a pasta `Laboratorio_POO/Jogo`, que contém o arquivo `pom.xml`.
4. Execute o projeto. A classe principal é `com.mycompany.jogo.Jogo`.
5. Para acessar o painel na versão de laboratório, use o login `adm` e a senha `123`.

## Organização do código

| Classe | Responsabilidade |
| --- | --- |
| `Jogo` | Inicia a aplicação. |
| `Jogador` | Representa os dados de um jogador, incluindo código, pontuação e vidas. |
| `GerenciamentoJogador` | Mantém a lista de jogadores e implementa as operações de cadastro e ranking. |
| `TelaInicial` e `TelaAdministrador` | Apresentam o login e o painel administrativo. |
| `AdicionaJogador` e `AtualizaJogador` | Apresentam os formulários de cadastro e edição. |
| `JogoVelha` | Contém o protótipo do tabuleiro. |

O código Java e os formulários do NetBeans ficam em `Jogo/src/main/java/com/mycompany/jogo/`. O Maven usa o arquivo `Jogo/pom.xml` para configurar a compilação.
