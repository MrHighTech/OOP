package Apartments;

import java.awt.*;
import java.math.BigDecimal;
import java.util.Objects;

public class Room implements Comparable<T> {
    private FloorType floorType;
    private BigDecimal area;
    private boolean heated;
    private int numberOfWindows;
    private Color wallColor;

    public Room(FloorType floorType, BigDecimal area, boolean heated, int numberOfWindows, Color wallColor) {
        this.floorType = floorType;
        this.area = area;
        this.heated = heated;
        this.numberOfWindows = numberOfWindows;
        this.wallColor = wallColor;
    }

    public FloorType getFloorType() {
        return floorType;
    }

    public BigDecimal getArea() {
        return area;
    }

    public boolean isHeated() {
        return heated;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public Color getWallColor() {
        return wallColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(room.area, area) && heated == room.heated && numberOfWindows == room.numberOfWindows && floorType == room.floorType && Objects.equals(wallColor, room.wallColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floorType, area, heated, numberOfWindows, wallColor);
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
