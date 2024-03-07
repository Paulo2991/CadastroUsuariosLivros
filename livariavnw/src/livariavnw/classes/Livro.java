package livariavnw.classes;

import java.util.HashSet;
import java.util.Set;

import livariavnw.estadolivro.Estado;

public class Livro {
	private String nome;
	private String nomeAutor;
	private String dataPublicao;
	private Estado estadoLivro;
	Set<Livro> livros = new HashSet<>();
	
	public Livro(String nome,String nomeAutor,String dataPublicacao,Estado estadoLivro) {
		this.nome = nome;
		this.nomeAutor = nomeAutor;
		this.dataPublicao = dataPublicacao;
		this.estadoLivro = estadoLivro;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	
	public String getDataPublicao() {
		return dataPublicao;
	}
	public void setDataPublicao(String dataPublicao) {
		this.dataPublicao = dataPublicao;
	}

	public Estado getEstadoLivro() {
		return estadoLivro;
	}
	
	public void setEstadoLivro(Estado estadoLivro) {
		this.estadoLivro = estadoLivro;
	}
	
	public Livro cadastrarLivros(Livro livro) {
		livros.add(livro);
		return livro;
	}
}
