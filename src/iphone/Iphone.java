package iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet{
	private String nomeMusica;
	private String nomeContato;
	
	
	//métodos Reprodutor musical
	@Override
	public void tocar() {
		System.out.println("Tocando a música: " + nomeMusica);
	}
	
	@Override
	public void pausar() {
		System.out.println("Música "+ nomeMusica + " pausada");
	}

	@Override
	public void selecionarMusica(String music) {
		
	}
	
	@Override
	public void ligar(String number) {
		
	}
	
	@Override
	public void atender() {
		
	}
	
	@Override
	public void iniciarCorreioVoz() {
		
	}

	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		
	}
}
