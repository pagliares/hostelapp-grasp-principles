package xyz.pagliares.controllers;

import xyz.pagliares.domain.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomController {
    private List<Room> rooms;

    public RoomController() {
        this.rooms = new ArrayList<>(); // @TODO Improve after class on Collection API
    }

    public boolean salvarQuarto(int number, String name, String type, int floor,
                                String description, double dailyRate, double dimension) {
        Room room = new Room(number, type);
        room.setDescription(description);
        room.setDimension(dimension);
        room.setFloor(floor);
        this.rooms.add(room);
        return true;
    }

    public static void main(String[] args) {
        RoomController roomController = new RoomController();
        int number = 101;
        String name = "D. Leopoldina"; // name of the room
        String type = "Double";
        double dailyRate = 150.00;
        String description = "Confortable room with decoration from XIX century";
        double dimension = 20.00;
        int floor = 1;

        boolean result = roomController.salvarQuarto(number, name, type, floor, description, dailyRate, dimension);
        if (result)
            System.out.println("Room data saved successfully!");
    }
}
