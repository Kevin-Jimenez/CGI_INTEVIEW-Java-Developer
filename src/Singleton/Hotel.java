package Singleton;

public class Hotel {
    private static Hotel instance = new Hotel();

    private Hotel() {}

    public static Hotel getInstance() {
        if(instance == null){
            synchronized (Hotel.class){
                if(instance == null){
                    instance = new Hotel();
                }
            }
        }
        return instance;
    }

    public void newAccommodation() {
        System.out.println("Se realiza, nueva reservacion de hospedaje");
    }
}
