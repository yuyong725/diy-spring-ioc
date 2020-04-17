package cn.javadog.diy.spring.ioc.test.bean;

/**
 * @author 余勇
 * @date 2020年04月15日 17:35:00
 */
public class SimpleBeanD {

	private String username;
	private String password;
	private String nick;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	@Override
	public String toString() {
		return "SimpleBeanD{" +
			"username='" + username + '\'' +
			", password='" + password + '\'' +
			", nick='" + nick + '\'' +
			'}';
	}
}
