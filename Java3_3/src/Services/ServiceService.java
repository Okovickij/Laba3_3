package Services;
import entitiy.Service;

public class ServiceService {
    public static void ChangePrice(Service service, double price)
    {
       service.setPrice(price);
    }
}
