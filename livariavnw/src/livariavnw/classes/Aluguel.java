package livariavnw.classes;

import livariavnw.estadolivro.Estado;

public class Aluguel {
	
	public void emprestarLivro(Usuario usuario,Livro livro) {
		if(!usuario.usuarioCadastrado(usuario)) {
			System.out.println("Usuário não cadastrado. Não é possível alugar o livro.");
            return;
		}else if(livro.getEstadoLivro() != null) {
			livro.setEstadoLivro(Estado.ALUGADO);
		}
	}
}
