package LojaGames;

public class Produto {
	private String jogoNome;
	private String generoJogo;
	private String aparelho;
	private int faixaEtaria;
	private int anoLancamento;
	
	
	public Produto(String jogoNome, String generoJogo, String aparelho, int faixaEtaria, int anoLancamento) {
		this.jogoNome = jogoNome;
		this.generoJogo = generoJogo;
		this.aparelho = aparelho;
		this.faixaEtaria = faixaEtaria;
		this.anoLancamento = anoLancamento;
	}
	public String getJogoNome() {
		return jogoNome;
	}
	public void setJogoNome(String jogoNome) {
		this.jogoNome = jogoNome;
	}
	public String getGeneroJogo() {
		return generoJogo;
	}
	public void setGeneroJogo(String generoJogo) {
		this.generoJogo = generoJogo;
	}
	public String getAparelho() {
		return aparelho;
	}
	public void setAparelho(String aparelho) {
		this.aparelho = aparelho;
	}
	public int getFaixaEtaria() {
		return faixaEtaria;
	}
	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public void visualizar() {
		System.out.println("\nNome do jogo: "+jogoNome);
		System.out.println("Gênero do jogo: "+generoJogo);
		System.out.println("Console: "+aparelho);
		System.out.println("Faixa etária: "+faixaEtaria);
		System.out.println("Ano de lançamento: "+anoLancamento);
		System.out.println("**********************************");
	}
}
