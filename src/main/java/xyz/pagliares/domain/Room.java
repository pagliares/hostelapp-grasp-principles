package xyz.pagliares.domain;

public class Room {
    private int number;
    private String name;
    private String type; // @TODO improve with enum {SINGLE, DOUBLE, EXECUTIVE_SUITE}
    private int floor;
    private String description;
    private double dailyRate;
    private double dimension; // Square meters
}
