package com.mycompany.jogo;

import java.util.Comparator;
import java.util.LinkedList;

public class GerenciamentoJogador {

    private LinkedList<Jogador> jogadores;
    public static int CONT = 500;
    private static GerenciamentoJogador instancia = null;

    private GerenciamentoJogador() {
        this.jogadores = new LinkedList<>();
    }

    public static GerenciamentoJogador getInstance() {
        if (instancia == null) {
            instancia = new GerenciamentoJogador();
        }

        return instancia;
    }     
    
    public void adicionarJogador(String nome,
            String login, String senha){
            this.jogadores.add(new Jogador(nome, login, senha));
    }
    

    public String listarJogadores() {
        StringBuilder conteudo = new StringBuilder();

        for (Jogador jogador : this.jogadores) {
            conteudo.append(jogador.imprimirJogador());
        }

        return conteudo.toString();
    }

    public String listarRanking() {
        if (jogadores.isEmpty()) {
            return "Nenhum jogador cadastrado.";
        }

        LinkedList<Jogador> ranking = new LinkedList<>(jogadores);
        ranking.sort(Comparator.comparingInt(Jogador::getPontuacao).reversed());

        StringBuilder conteudo = new StringBuilder();
        int posicao = 1;
        for (Jogador jogador : ranking) {
            conteudo.append(posicao++).append(". ")
                    .append(jogador.getNome()).append(" — ")
                    .append(jogador.getPontuacao()).append(" ponto(s)\n");
        }
        return conteudo.toString();
    }

    public Jogador buscarJogador(int busca) {
        for (Jogador jogador : this.jogadores) {
            if (jogador.getId() == busca) {
                return jogador;
            }
        }

        return null;
    }

    public void removerJogador(int busca) {
        Jogador jogador = buscarJogador(busca);

        if (jogador != null) {
            this.jogadores.remove(jogador);
        } else {
            System.out.println("Elemento nao encontrado");
        }
    }

    public void atualizarJogador(int busca,
            String nome, String login, String senha,
            int pontuacao, int vidas) {

        Jogador jogador = buscarJogador(busca);

        if (jogador != null) {
            jogador.setNome(nome);
            jogador.setLogin(login);
            jogador.setSenha(senha);
            jogador.setPontuacao(pontuacao);
            jogador.setVidas(vidas);
        }
    }

    public boolean validarLogin(String login) {
        for (Jogador jogador : this.jogadores) {
            if (jogador.getLogin().equals(login)) {
                return true;
            }
        }

        return false;
    }
}
