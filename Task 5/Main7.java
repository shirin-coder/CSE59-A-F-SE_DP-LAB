
interface INetworkProtocol {
    void broadcastMessage(String msg);
}

class BluetoothMeshNetwork implements INetworkProtocol{
    public void broadcastMessage(String msg){
        System.out.println("Broadcasting via Bluetooth Mesh: " + msg);
    }
}

class WiFiDirectNetwork implements INetworkProtocol{
    public void broadcastMessage(String msg){
        System.out.println("Broadcasting via WiFi Direct: " + msg);
    }
}

class DisasterAlertSystem{
    private INetworkProtocol network;
    public DisasterAlertSystem(INetworkProtocol network){
        this.network = network;
    }

    public void triggerAlert(String alertData){
        network.broadcastMessage(alertData);
    }
}

public class Main7{
    public static void main(String[] args) {
        INetworkProtocol bluetooth = new BluetoothMeshNetwork();
        DisasterAlertSystem alert1 = new DisasterAlertSystem(bluetooth);
        alert1.triggerAlert("Earthquake detected!");

        INetworkProtocol wifi = new WiFiDirectNetwork();
        DisasterAlertSystem alert2 = new DisasterAlertSystem(wifi);
        alert2.triggerAlert(("Flood warning!"));
    }
}
