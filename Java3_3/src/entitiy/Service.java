package entitiy;

public class Service {
        private double price;
        private String comment;
        public enum typeService
        {
            cleaning,repair,washing,cooking
        }
        private typeService service;
        public double getPrice() {
            return price;
        }
        public Service(double price, typeService service)
        {
            this.price=price;
            this.service=service;
        }
        public void ChangePrice(double price)
        {
            this.price=price;
        }

        public typeService getService() {
            return service;
        }

    public void setPrice(double price) {
        this.price = price;
    }
}
