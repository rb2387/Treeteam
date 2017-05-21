package MVN23;
import MVN23.Karaoke;
import MVN23.Songbook;
public class RunKaraoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Karaoke kar = new Karaoke("RB23","Alone","https://www.youtube.com/watch?v=FIMz4M2Vuw4");
		System.out.println(kar);
		Songbook sb = new Songbook();
		sb.addSong(kar);
	System.out.printf("THere are %d %n songs",sb.SongCount());   
	}

}
