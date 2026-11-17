package com.mycompany.jogo;

public class Jogador {
    private int id;
    private String nome;
    private String login;
    private String senha;
    private int pontuacao;
    private int vidas;

    
    public Jogador(String nome, 
            String login, String senha){
        this.id = ++GerenciamentoJogador.CONT;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.pontuacao = 0;
        this.vidas = 100;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
    public String imprimirJogador(){
        return "Id: " + this.id +
                "\nNome: " + this.nome +
                "\nLogin: " + this.login +
                "\nPontuacao: " + this.pontuacao +
                "\nVidas: " + this.vidas + "\n\n";
    }
}
