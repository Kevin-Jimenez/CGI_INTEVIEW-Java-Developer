package Singleton;

public class Main {
    public static void main(String[] args) {
        Hotel singleton = Hotel.getInstance();
        singleton.newAccommodation();
    }
}
