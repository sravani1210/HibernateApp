package ar.com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Developrtable")
public class Developer {
	@Id
	@GeneratedValue
	private int userID;
	@Column(name="developernam")
	private String userName;
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Developer(int userID, String userName) {
		super();
		this.userID = userID;
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "Developer [userID=" + userID + ", userName=" + userName + "]";
	}
	public Developer() {
	}
}
