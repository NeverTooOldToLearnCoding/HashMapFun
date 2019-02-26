import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class HashMapFun{
	public static void main(String[] args){
		HashMap<String,String> trackList = new HashMap<String, String>();
		trackList.put("In the End", "In the end, it doesn't even matter.");
		trackList.put("Gangster's Paradise", "Been spending most of their lives, Livin' in the gangsta's paradise.");
		trackList.put("Thugz Mansion", "A place to spend my quiet nights, time to unwind.");
		trackList.put("Somewhere over the Rainbow", "Somewhere over the rainbow, Way up high.");
		
		String name = trackList.get("Thugz Mansion");
		System.out.println(name);

		Set<String> keys = trackList.keySet();
		for(String key : keys){
			System.out.println(key+": "+trackList.get(key));

		}
	}

}