package estoque;

public class Produto {
	private String nome = "";
	private float precoCompra;
	private float precoVenda;
	private int estoque;
	private int codigo;
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;	
	}
	
	public float getPrecoCompra() {
		return precoCompra;
	}
	
	public float getPrecoVenda() {
		return precoVenda;
	}
	
	public int getEstoque() {
		return estoque;
	}
	public void  setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
	public void precoCompra(float price) {
		precoCompra = price;
	}
	
	public void precoVenda(float price) {
		precoVenda = price;
	}
	
	Produto(){
		
	}
	
}
