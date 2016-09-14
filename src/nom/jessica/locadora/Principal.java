package nom.jessica.locadora;

import javax.swing.JOptionPane;

import nom.jessica.locadora.modelo.Filme;

public class Principal {

	public static void main(String[] args) {

		String codigoString = JOptionPane.showInputDialog(null, "Digite o codigo do filme");
		long codigo = Long.parseLong(codigoString);

		while(codigo != 0L) {
			String nome = JOptionPane.showInputDialog("Digite o nome do filme: ");
			Filme filme = new Filme((Long.valueOf(codigo)), nome);

			String anoString = JOptionPane.showInputDialog(null, "Digite o ano do filme");
			filme.setAno(Integer.valueOf(anoString));

			String autorPrincipal = JOptionPane.showInputDialog(null, "Digite o autor principal do filme: ");
			filme.setAutorPrincipal(autorPrincipal);


			String genero = JOptionPane.showInputDialog(null, "Digite o gênero do filme: ");
			filme.setGenero(genero);

			JOptionPane.showMessageDialog(null, filme);

			codigoString = JOptionPane.showInputDialog(null, "Digite o codigo do filme");
			codigo = Long.parseLong(codigoString);
		}

		JOptionPane.showMessageDialog(null, "Quantidade de filmes criados: " + Filme.getQuantidadeFilmes());
	}

}
