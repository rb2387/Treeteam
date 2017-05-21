package MVN23;

import java.util.ArrayList;
import java.util.List;

public class Songbook {
private List<Karaoke> songs;
	
public Songbook(){
	
	songs = new ArrayList<Karaoke>();

}


public void addSong(Karaoke kar){
	songs.add(kar);
	
}

public int SongCount(){
	return songs.size();
}

}

