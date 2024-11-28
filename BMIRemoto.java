import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BMIRemoto extends Remote {
    double calcularBMI(double peso, double altura) throws RemoteException;
    String obtenerCategoriaBMI(double bmi) throws RemoteException;
}
