package com.mycompany.jogo;

public class GerenciamentoJogador {
    private Jogador jogadores[];
    private int tamanho;
    private int id;
    public static int CONT = 500;
    private static GerenciamentoJogador instancia = null;
    
    private GerenciamentoJogador(int tamanho){
        this.tamanho = tamanho;
        this.jogadores = new Jogador[this.tamanho];
        this.id = 0;
    }
    
    public static GerenciamentoJogador getInstance(int tamanho){
        if(instancia == null){
            instancia = new GerenciamentoJogador(tamanho);
        }
        return instancia;
    }       
    
    public void adicionarJogador(String nome,
            String login, String senha){
        if(this.id < this.tamanho){
            this.jogadores[this.id] = new Jogador(nome,
                login, senha);
            ++this.id;
        }else{ 
            System.out.println("Sem espaco.");
        }
        
    }
    
    public String listarJogadores(){
        int i;
        String conteudo = "";
        for(i = 0; i < this.id; ++i){
            conteudo = conteudo + 
                    this.jogadores[i].imprimirJogador();
        }
        return conteudo;
    }
    
    public Jogador buscarJogador(int busca) {
    	int i;
    	for(i = 0; i < this.id; i++) {
    		if(this.jogadores[i].getId() == busca) {
    			return this.jogadores[i];
    		}
    	}
    	return null;
    }   
    
    public void removerJogador(int busca) {
    	int i, j;
    	boolean removeu = false;
    	for(i = 0; i < this.id; ++i) {
    		if(this.jogadores[i].getId() == busca) {    			
				for(j = i; j < this.id - 1; j++) {
					this.jogadores[j] = this.jogadores[j+1];
				}
				this.jogadores[i] = null;
				--this.id;
				removeu = true;
    		}
    	}
    	if(!removeu) {
    		System.out.println("Elemento nao encontrado");
    	}
    }
    
    public void atualizarJogador(int busca, 
            String nome, String login, 
            String senha, int pontuacao,
            int vidas){
        int i;
        for(i = 0; i < this.id; i++){
            if(busca == this.jogadores[i].getId()){
                this.jogadores[i].setLogin(login);
                this.jogadores[i].setNome(nome);
                this.jogadores[i].setSenha(senha);
                this.jogadores[i].setPontuacao(pontuacao);
                this.jogadores[i].setVidas(vidas);
                break;
            }
        }
    }
    
    public boolean  validarLogin(String login){
        int i;
        for(i = 0; i < this.id; i++){
            if(this.jogadores[i].getLogin().equals(login)){
                return true;
            }
        }
        return false;
    }
}