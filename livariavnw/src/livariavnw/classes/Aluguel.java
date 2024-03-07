package livariavnw.classes;

import livariavnw.estadolivro.Estado;

public class Aluguel {
	
	public void emprestarLivro(Usuario usuario,Livro livro) {
		if(!usuario.usuarioCadastrado(usuario)) {
			System.out.println("Usu�rio n�o cadastrado. N�o � poss�vel alugar o livro.");
            return;
		}else if(livro.getEstadoLivro() != null) {
			livro.setEstadoLivro(Estado.ALUGADO);
		}
	}
}
