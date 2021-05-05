import Services.HotelService;
import Services.ServiceService;
import entitiy.Guest;
import entitiy.Room;
import Constructor.Context;
import Services.RoomService;
import entitiy.Service;

public class Main {
    public static void main(String[] args){
        Context.hotel.GuestArrayList.add(new Guest("mike"));
        Context.hotel.RoomArrayList.add(new Room(1001, 100.00, Room.roomType.One_Bedroom, Room.roomStatus.Ready));
        HotelService.setGuest(Context.hotel.GuestArrayList.get(0),Context.hotel.RoomArrayList.get(0));
        Context.hotel.GuestArrayList.get(0).serviceArrayList.add(new Service(20,Service.typeService.cleaning));
        HotelService.getRoomInfo(Context.hotel.RoomArrayList.get(0));
        HotelService.expelGuest(Context.hotel.GuestArrayList.get(0),Context.hotel.RoomArrayList.get(0));
        HotelService.getRoomInfo(Context.hotel.RoomArrayList.get(0));
        RoomService.ChangeRoomStatus(Context.hotel.RoomArrayList.get(0), Room.roomStatus.Repaired);
        HotelService.getRoomInfo(Context.hotel.RoomArrayList.get(0));
        RoomService.ChangePrice(Context.hotel.RoomArrayList.get(0),1000);
        HotelService.getRoomInfo(Context.hotel.RoomArrayList.get(0));
        ServiceService.ChangePrice(Context.hotel.GuestArrayList.get(0).serviceArrayList.get(0), 10);

        //Guest vadim = new Guest("vadim");
        //Room one_bedroom1 = new Room(1001, 100.00, Room.roomType.One_Bedroom, Room.roomStatus.Ready);
        //Room two_bedroom1 = new Room(2001, 200.00, Room.roomType.Two_Bedroom, Room.roomStatus.Ready);
        //Service service1= new Service(101, Service.typeService.cleaning);
        //mike.serviceArrayList.add(new Service(101, Service.typeService.cleaning));
        //mike.serviceArrayList.add(new Service(101, Service.typeService.cooking));
        //one_bedroom1.ChangeRoomStatus(Room.roomStatus.Repaired);
        //one_bedroom1.ChangePrice(790.00);
        //one_bedroom1.setGuest(mike);
        //mike.getRoomInfo(one_bedroom1);

        //one_bedroom1.setGuest(vadim);
        //mike.getRoomInfo(one_bedroom1);
    }
}
