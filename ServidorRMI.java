import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {
    public static void main(String[] args) {
        try {
            // Inicia el registro RMI en el puerto 1099
            LocateRegistry.createRegistry(1099);

            // Crea una instancia del objeto remoto
            BMIRemotoImpl obj = new BMIRemotoImpl();

            // Registra el objeto remoto en el registro RMI
            Naming.rebind("rmi://localhost/BMIRemoto", obj);

            System.out.println("Servidor RMI listo para aceptar peticiones.");
        } catch (MalformedURLException | RemoteException e) {
            System.err.println("Error en el servidor: " + e.toString());
        }
    }
}
