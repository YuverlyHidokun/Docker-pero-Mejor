import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BMIRemotoImpl extends UnicastRemoteObject implements BMIRemoto {
    public BMIRemotoImpl() throws RemoteException {
        super();
    }

    @Override
    public double calcularBMI(double peso, double altura) throws RemoteException {
        return peso / (altura * altura);
    }

    @Override
    public String obtenerCategoriaBMI(double bmi) throws RemoteException {
        if (bmi < 18.5) {
            return "Bajo peso";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
}
