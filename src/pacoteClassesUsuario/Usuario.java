package pacoteClassesUsuario;

public class Usuario {

	private String nick;
	private String email;
	private String senha;
	private double carteira;

	public Usuario(String usuario, String senha, String email) {
		this.nick = usuario;
		this.email = email;
		this.senha = senha;
		this.carteira = 50;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public double getCarteira() {
		return carteira;
	}

	public void setCarteira(double carteira) {
		this.carteira = carteira;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
