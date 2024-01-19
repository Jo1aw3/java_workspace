package examen2Final_joshuabotello;

import java.util.Objects;

public abstract class User {

	protected String user;
	protected String password;
	protected int tipo;
	
	public User() {
		this.user = "";
		this.password = "";
		this.tipo = 1;
	}
	
	public User(String user, String password, int tipo) {
		this.user = user;
		this.password = password;
		this.tipo = tipo;
	}
	
	public User(User cc) {
		this.user = cc.user;
		this.password = cc.password;
		this.tipo = cc.tipo;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(password, tipo, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(password, other.password) && tipo == other.tipo && Objects.equals(user, other.user);
	}
	
	abstract void print();
	
}
