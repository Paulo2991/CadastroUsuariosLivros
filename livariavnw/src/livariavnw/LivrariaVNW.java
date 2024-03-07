package livariavnw;

import java.util.Scanner;

import livariavnw.classes.Livro;
import livariavnw.classes.Usuario;
import livariavnw.estadolivro.Estado;

public class LivrariaVNW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op = 0;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("1 - Cadastrar Usuário: ");
			System.out.println("2 - Cadastrar Livro: ");
			System.out.println("3 - Alugar Livro: ");
			System.out.println("4 - Devolver Livro: ");
			System.out.println("5 - Sair Do Menu: ");
			op = entrada.nextInt();
			switch (op) {
			case 1:
				System.out.println("Informe seu nome: ");
				String nome = entrada.next();
				System.out.println("Informe seu CPF: ");
				String cpf = entrada.next();
				System.out.println("Informe seu E-mail: ");
				String email = entrada.next();
				System.out.println("Informe seu número de Celular: ");
				String telefone = entrada.next();
				Usuario usuario = new Usuario(nome,cpf,email,telefone);
				usuario.cadastrarUsuario(usuario);
				System.out.println("Usuário cadastrado com sucesso!");
				break;
			case 2:
				System.out.println("Informe seu nome: ");
				nome = entrada.next();
				System.out.println("Informe o nome do author: ");
				String nomeAuthor = entrada.next();
				System.out.println("Informe a data de publicação: ");
				String dataPublicacao = entrada.next();
				Livro livro = new Livro(nome,nomeAuthor,dataPublicacao,Estado.DISPONIVEL);
				livro.cadastrarLivros(livro);
				break;
			default:
				throw new IllegalArgumentException("Unexpected value:" );
			}
		}while(op != 5);
	}

}
