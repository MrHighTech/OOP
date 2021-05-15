package Music;

import java.util.*;

public class Playlist {
    private String name;
    private final List<Track> tracks = new ArrayList<>();
    private final OptionalInt limit;
    private int duration = 0;

    public Playlist (String name) {
        this.setName(name);
        this.limit = OptionalInt.empty();
    }

    public Playlist (String name, int durationLimit) {
        this.setName(name);
        this.limit = OptionalInt.of(durationLimit);

    }

    public String getName() {
        return name;
    }

    public int duration() {
        return duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean add(Track track) {
        if (limit.isPresent()) {
            if (track.getDuration() + duration > limit.getAsInt())
                return false;
        }

        tracks.add(track);
        duration += track.getDuration();
        return true;
    }

    public Track trackAt(int index) {
        return tracks.get(index - 1);
    }

    public void deleteAt(int index) {
        Track track = tracks.remove(index);
        duration -= track.getDuration();
    }

    public void move(int position, int move) {
        Track track = tracks.remove(position - 1);
        tracks.add(position - 1 + move, track);
    }

    public int count() {
        return tracks.size();
    }

    public void invert() {
        for(int i=0, n = tracks.size() ; i < n / 2 ; i++) {
            Track temp = tracks.get(i);
            tracks.set(i, tracks.get(n - 1 - i));
            tracks.set(n - 1 - i, temp);
        }
    }
}
