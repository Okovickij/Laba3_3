package entitiy;

public class Room {
        public enum roomType {
            One_Bedroom, Two_Bedroom, Three_Bedroom, Penthouse
        }
        public enum roomStatus
        {
            Ready,Repaired,Serviced
        }
        private boolean available;
        private Guest occupant;
        private int roomNum;
        private double price;
        private roomType type;
        private roomStatus status;

        public Room(int roomNum, double price, roomType type, roomStatus status) {
            this.roomNum = roomNum;
            this.price = price;
            this.type = type;
            this.status= status;
        }

    public Guest getOccupant() {
        return occupant;
    }

    public void setOccupant(Guest occupant) {
        this.occupant = occupant;
    }

    public void setStatus(roomStatus status) {
        this.status = status;
    }

        public void setAvailable(boolean available) {
            this.available = available;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public roomType getRoomType() {
            return type;
        }

        public roomStatus getRoomStatus(){return status;}

        public int getRoomNumber() {
            return roomNum;
        }

        public Guest getGuest() {
            return occupant;
        }

}
