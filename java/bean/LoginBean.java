package bean;



public class LoginBean implements java.io.Serializable {
	private String username;
	private String password;
	private String role;
        private long id;
	
	public LoginBean()
	{
		System.out.println("Login Model is Called");
	}
	
	
	public LoginBean(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


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


	
	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}

    public long getId() {
        return id;
    }
	public void setId(long i)
        {
            id=i;
        }
                
        

}
