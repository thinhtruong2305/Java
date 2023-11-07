package Beans;

public class UserInfo {
	private String userName;
	private int post;
	private String country;
	
	public UserInfo() {
		
	}
	public UserInfo(String _userName, int _post, String _country) {
		userName = _userName;
		post = _post;
		country = _country;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getPost() {
		return post;
	}
	public void setPost(int post) {
		this.post = post;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
