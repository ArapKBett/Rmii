import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MathClient {
    public static void main(String[] args) {
        try {
            // Replace "localhost" with Render's service URL or IP
            Registry registry = LocateRegistry.getRegistry("your-render-service.onrender.com", 1099);
            IRemoteMath remoteMath = (IRemoteMath) registry.lookup("Compute");
            System.out.println("1.7 + 2.8 = " + remoteMath.add(1.7, 2.8));
            System.out.println("6.7 - 2.3 = " + remoteMath.subtract(6.7, 2.3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
