package Music;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Playlist p1 = PlaylistDataLoader.createPlaylist();
        Playlist p2 = PlaylistDataLoader.createPlaylist();
        Set<String> words = PlaylistUtil.words(p1, p2);
        System.out.println("Words in songs");
        for(String s : words) {
            System.out.println(s);
        }

        Map<String, Integer> wordsCounts = PlaylistUtil.wordsOccurrence(p1);
        System.out.println("Words in songs (occurances):");
        for(var entry : wordsCounts.entrySet()) {
            System.out.println(entry.getKey() + " (" + entry.getValue() + ")");
        }

        Map<Integer, Map<String, Integer>> perLength = PlaylistUtil.perLength(p1);
        System.out.println("Words in songs by words length:");
        for(var lengthEntry : perLength.entrySet()) {
            System.out.print(lengthEntry.getKey() + ": ");
            for(var entry : lengthEntry.getValue().entrySet()) {
                System.out.print(entry.getKey() + " (" + entry.getValue() + ") ");
            }
            System.out.println();
        }
    }
}
