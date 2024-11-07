package Builder;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro.Builder()
                .setPlaca("MAY250")
                .setColor("Gris Carbon")
                .setCilindrada("1600 Litros")
                .setNumeroPuertas(5)
                .setCarroceria("Sedan").build();

        System.out.println(carro);
    }
}
