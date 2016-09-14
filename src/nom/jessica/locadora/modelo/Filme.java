package nom.jessica.locadora.modelo;

public class Filme {

	private static int quantidadeFilmes = 0;

	private Long codigo;
	private String nome;
	private String genero;
	private Integer ano;
	private String autorPrincipal;

	public Filme(Long codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		quantidadeFilmes++;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getAutorPrincipal() {
		return autorPrincipal;
	}
	public void setAutorPrincipal(String autorPrincipal) {
		this.autorPrincipal = autorPrincipal;
	}

	public static int getQuantidadeFilmes() {
		return quantidadeFilmes;
	}

	public String toString() {
		return "Filme [codigo=" + codigo + ", nome=" + nome + ", genero=" + genero + ", ano=" + ano
				+ ", autorPrincipal=" + autorPrincipal + "]";
	}

}
