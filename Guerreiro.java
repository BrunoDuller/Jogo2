package br.com.fiap.jogo2;

public class Guerreiro extends Jogador implements Visualizacao{

	private int x;
    private int y;
    public Guerreiro() {
        super();
        this.x = 0;
        this.y = 0;
    }
    public Guerreiro(String nome) {
        super(nome);
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getXp() {
        return super.getXp() * 2;
    }
}
	

	

