package xyz.pagliares.domain;

import java.util.ArrayList;
import java.util.List;

public class Hostel {
    private String name;
    private String homepageAddress;
    private String description;
    private String inaugurationDate; // @TODO improve after class on Date/time in Java
    private String contact;
    private List<Room> rooms;
    private List<Guest> guests;
    private List<Employee> employees;
    private Address address;

    public Hostel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.guests = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.address = new Address();
        this.homepageAddress = "";
        this.description = "";
    }
}
