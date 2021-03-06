package constxiong;

public class User {
	
	private Integer id;
	
	private String name;
	
	public User() {
	}
	
	public User(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	private static int i = 0;
	public static User getUser () {
		User user = new User();
		user.setId(--i);
		user.setName("static factory");
		return user;
	}
}
