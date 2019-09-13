public class Pessoa implements ExibeDados{
	private String nome;
	private int idade;

	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public int getIdade(){
		return this.idade;
	}

	public void setIdade(int idade){
		this.idade = idade;
	}

	public void exibe(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
	}
}