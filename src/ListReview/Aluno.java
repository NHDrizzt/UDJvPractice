package ListReview;

public class Aluno {
	private String name;
	private String email;
	private Integer room;
	
	
	public Aluno(String name, String email, Integer room) {
		super();
		this.name = name;
		this.email = email;
		this.room = room;
	}


	public Aluno() {
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getRoom() {
		return room;
	}


	public void setRoom(Integer room) {
		this.room = room;
	}
	
	public String toString() {
		return 	name+
				", "+
				email;
	}
	
}
