package LojaGames;

public class TestaGame {

	public static void main(String[] args) {
		Produto p1 = new Produto("God of War","Ação/Aventura","PS2",16,2012);
		Produto p2 = new Produto("Need for Speed - Underground 2","Corrida","PS2",10,2010);
		
		p1.visualizar();
		p2.visualizar();
	}

}
