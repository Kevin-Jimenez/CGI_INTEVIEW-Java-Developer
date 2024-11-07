package Builder;

public class Carro {

    private String placa;
    private String color;
    private String cilindrada;
    private Integer numeroPuertas;
    private String carroceria;

    private Carro(Builder builder){
        this.placa = builder.placa;
        this.color = builder.color;
        this.cilindrada = builder.cilindrada;
        this.numeroPuertas = builder.numeroPuertas;
        this.carroceria = builder.carroceria;
    }


    public static class Builder {
        private String placa;
        private String color;
        private String cilindrada;
        private Integer numeroPuertas;
        private String carroceria;

        public Builder setPlaca(String placa) {
            this.placa = placa;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setCilindrada(String cilindrada) {
            this.cilindrada = cilindrada;
            return this;
        }

        public Builder setNumeroPuertas(Integer numeroPuertas) {
            this.numeroPuertas = numeroPuertas;
            return this;
        }

        public Builder setCarroceria(String carroceria) {
            this.carroceria = carroceria;
            return this;
        }

        public Carro build() {
            return new Carro(this);
        }
    }


    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada='" + cilindrada + '\'' +
                ", numeroPuertas=" + numeroPuertas +
                ", carroceria='" + carroceria + '\'' +
                '}';
    }
}
