package br.com.desafio.carlos.setedias;

public class Movie {
	public String getTitle() {
		return title;
	}
	public String getRank() {
		return rank;
	}
	public String getYear() {
		return year;
	}
	private String title;
	private String rank;
	private String year;
	public Movie(String title, String rank, String year) {
		this.title = title;
		this.rank = rank;
		this.year = year;
	}
	
	
	
}
