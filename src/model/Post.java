package model;

import java.time.LocalDateTime;

public class Post {
	//1.variables
	private String title;
	private String msg;
	private LocalDateTime dateTime = LocalDateTime.now(); //Set daļa jau ir izveidota
	
	//TODO partaisit uz User sarakstu
	private int countOfLikes = 0; //taisisim increment katru reizi

	
	//2. get and set
	
	public String getTitle() {
		return title;
	}

	
	public void setTitle(String title) {
		if(title !=null && title.length() > 5 && title.length() <50)
			this.title = title;
		
		else
			this.title = "-------";
	}

	public String getMsg() {
		
		return msg;
	}

	
	public void setMsg(String msg) {
		if(msg !=null && msg.length() > 5 && msg.length() <1000)
			this.msg = msg;
		
		else
			this.msg = "-------";
	}

	public int getCountOfLikes() {
		return countOfLikes;
	}

	
	
	//funkcijas 
	public void incrementCountOfLikes(int countOfLikes) {
		this.countOfLikes++; //this izmanto tikai tad, ja sis klases mainigais (ja nav this, tad ir lokalais mainigais)
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}
	
	
	//3.konstruktors - ar tadu pasu nosaukumu ka klase
	
	public Post() {
		setTitle("semestra sākums");
		setMsg("Apsveicam visus ar jaunā mācību gada sākumu");
	}
	
	
	public Post(String title, String msg) {
		setTitle(title);
		setMsg(msg);
	}
	




	//4.tostring
	public String toString() {
		return title + "(" + dateTime + ") \n" + msg + "\n[" + countOfLikes + "]\n";
	}
	//5.other functions
	
}
