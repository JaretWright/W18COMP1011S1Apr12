package w18comp1011s1apr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author JWright
 */
public class W18COMP1011S1Apr12
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // "driving", "LIVING", "festivus", "PARTYing", "sleep", "eating"
        TreeSet<String> treeSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        treeSet.addAll(Arrays.asList("driving","LIVING","festivus",
                                    "PARTYing", "sleep", "eating"));
        System.out.println(treeSet);
        
        //warm up #2
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("September","Earth Wind and Fire", 337));
        songs.add(new Song("Dang da Police","N.W.A", 187));
        songs.add(new Song("FoxTrott, Uniform, Charlie, Kilo","BloodHound Gang", 252));
        songs.add(new Song("Bullet in the head","Rage Against the Machine",300));
        
        //custom sorting using Lambda expression
        songs.sort((song1, song2) -> song2.getLengthInSec()-song1.getLengthInSec());
        System.out.println(songs);
        
        //filter for the songs with "a" in the name
        songs.stream()
             .filter(song -> song.getSongName().contains("a"))
             .forEach(song -> System.out.println(song));
        
        List<Song> longArtistNames = songs.stream()
                                          .filter(song -> song.getAtrist().length() > 6)
                                          .collect(Collectors.toList());
        System.out.println(longArtistNames);
        
        //adding Song objects to the HashMap
        TreeMap<String, Song> songMap = new TreeMap<>();
        for (Song song:songs)
        {
            songMap.put(song.getSongName(), song);
        }
        
        //Traverse the songMap to see the contents
        System.out.println("\n~~~~~~~~~~Songs in a HashMap object ~~~~~~~~~");
        for (String key:songMap.keySet())
        {
            System.out.printf("Key: %-20s Value: %s%n", key, songMap.get(key));
        }
    }
}
