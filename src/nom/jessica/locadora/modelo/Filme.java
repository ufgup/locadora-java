package nom.jessica.locadora.modelo;

public class Filme {

	private Long codigo;
	private String nome;
	private String genero;
	private Integer ano;
	private String autorPrincipal;

	public Filme(Long codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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

	public String toString() {
		return "Filme [codigo=" + codigo + ", nome=" + nome + ", genero=" + genero + ", ano=" + ano
				+ ", autorPrincipal=" + autorPrincipal + "]";
	}



}
