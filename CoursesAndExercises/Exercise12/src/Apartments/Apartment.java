package Apartments;

import java.math.BigDecimal;
import java.util.*;

public class Apartment {

    private Collection<Room> rooms;
    private String address;
    private int floor;

    public Apartment(String address, int floor) {
        rooms = new TreeSet<>();
        this.address = address;
        this.floor = floor;
    }

    public void addRooms(Room... rooms) {
        for (Room room : rooms) {
            this.rooms.add(room);
        }
    }

    public void removeRooms(Room... rooms) {
        for (Room room : rooms) {
            this.rooms.remove(room);
        }
    }

    public boolean containsRoom(Room room) {
        return rooms.contains(room);
    }

    public Iterator<Room> roomIterator() {
        return rooms.iterator();
    }

    public BigDecimal getArea() {
        BigDecimal area = new BigDecimal("0");

        for (Room room : rooms) {
            area = room.getArea().add(area);
        }

        return area;
    }

    public String getAddress() {
        return address;
    }

    public int getFloor() {
        return floor;
    }
}
