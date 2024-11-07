package MVC;

public class Main {
    public static void main(String[] args) {
        Model modelo = new Model();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);

        controlador.setNombreUsuario("Kevin Santiago Jimenez Salamanca");
        controlador.actualizarVista();
    }
}
