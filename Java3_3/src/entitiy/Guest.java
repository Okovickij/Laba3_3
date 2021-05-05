package entitiy;

import Services.RoomService;

import java.util.ArrayList;
import java.util.List;

public class Guest {
    private String name;
    public List<Service> serviceArrayList = new ArrayList<>();
    public Guest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
