package Services;

import entitiy.Guest;
import entitiy.Room;

public class RoomService {
    public static boolean isAvailable(Room room) {
        if (room.getRoomStatus() == Room.roomStatus.Ready && room.getOccupant() ==null) return true;
        else return false;
    }

    public static void ChangeRoomStatus(Room room, Room.roomStatus status)
    {
        room.setStatus(status);
    }
    public static void ChangePrice(Room room,double  price)
    {
        room.setPrice(price);
    }
}
