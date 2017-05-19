package Git;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Github {

	public void getProperties(){
		
		Set<String> properties = new TreeSet<String>(System.getProperties().stringPropertyNames());
		
		Iterator<String> item = properties.iterator();
		while (item.hasNext()) {
			String st = item.next();
			System.out.printf("The property is %s: %s : %n ",st , System.getProperty(st));
			
			
		}
		
		
	}
	
}
