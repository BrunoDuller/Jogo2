package jogo;

public interface Visualizacao {
	 
	void setX(int x);
	void setY(int y);
	int getX();
	int getY();

	default void mover(int x, int y) {
		setX(x);
	    setY(y);
	 }
}

