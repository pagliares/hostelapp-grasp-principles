package xyz.pagliares.domain;

public class Room {
    private int number;
    private String name;
    private String type; // @TODO improve with enum {SINGLE, DOUBLE, EXECUTIVE_SUITE}
    private int floor;
    private String description;
    private double dailyRate;
    private double dimension; // Square meters

    public Room(int number, String type) {
        this.number = number;
        this.type = type;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }
}
