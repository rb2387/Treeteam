package MVN23;

public class Karaoke {

	private String artist ; 
	private String song ; 
	private String url;
	
	public Karaoke(String artist , String song , String url){
		this.artist = artist;
		this.song = song ; 
		this.url = url ;
	}
	
	
	public String getArtist(){
		return this.artist;
	}
	
	public String getSong(){
	return this.song;
	}

	public String getUrl(){
		return this.url;
	
}
}