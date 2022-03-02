package model;

public class Cd {
	
	private String title;
	private String singer;
	private int playingTime;
	private int tracks;
	private String releaseDate;
	private double price;
	private boolean offering;
	
	
	
	
	
	public Cd(String title, String singer, int playingTime, int tracks, String releaseDate, 
			double price) {
		this.title = title;
		this.singer = singer;
		this.playingTime = playingTime;
		this.tracks = tracks;
		this.releaseDate = releaseDate;
		this.price = price;
		offering = false;
	}
	
	public Cd(String title) {
		this.title = title;

	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getPlayingTime() {
		return playingTime;
	}
	public void setPlayingTime(int playingTime) {
		this.playingTime = playingTime;
	}
	public int getTracks() {
		return tracks;
	}
	public void setTracks(int tracks) {
		this.tracks = tracks;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isOffering() {
		return offering;
	}
	
	public boolean getOffering() {
		return offering;
	}
	public void setOffering(boolean offering) {
		this.offering = offering;
	}
	
	
	
	public String print() {
		String s = "";
		s = "title: " +getTitle() + "singer: " + getSinger() +
				"time: " + String.valueOf(getPlayingTime()) +
				" minutes" + "release day : " + getReleaseDate();
		if(isOffering() == true) {
			s += "*** Special Price***";
		}
		
		return s;
				
	}
	

}
