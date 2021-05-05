package Services;

import entitiy.Guest;
import entitiy.Room;
import Constructor.Context;

public class HotelService {
    public static void getRoomInfo(Room room)
    {
        System.out.println("AVAILABLE "+ RoomService.isAvailable(room));
        System.out.println("Room # : " + room.getRoomNumber());
        System.out.println("Room status: "+room.getRoomStatus());
        System.out.println("Room price : " + room.getPrice());
        System.out.println("Room type : " + room.getRoomType());
        if(room.getGuest()!=null)
            System.out.println("Room occupant : " + room.getGuest().getName());
        else System.out.println("Room occupant : " + room.getGuest());
        System.out.println("Services: ");
        for(int i = 0; i<Context.hotel.GuestArrayList.size();i++) {
            for (int j = 0; j < Context.hotel.GuestArrayList.get(i).serviceArrayList.size(); j++)
            {
            System.out.println(Context.hotel.GuestArrayList.get(i).serviceArrayList.get(j).getService()+ " "+Context.hotel.GuestArrayList.get(i).serviceArrayList.get(j).getPrice());
            }
        }
    }
    public static void setGuest(Guest occupant, Room room)
    {
        if(RoomService.isAvailable(room))
        {
            room.setAvailable(false);
            room.setOccupant(occupant);
        }
        else System.out.println("Данный номер недоступен");
    }
    public static void expelGuest(Guest occupant, Room room)
    {
        if(occupant == room.getOccupant())
            room.setOccupant(null);
        else System.out.println("Данный пользователь здесь не проживант");
    }
}
