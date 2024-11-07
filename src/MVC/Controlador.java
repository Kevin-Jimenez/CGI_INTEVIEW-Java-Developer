package MVC;

public class Controlador {
    private Model modelo;
    private Vista vista;

    public Controlador(Model modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void setNombreUsuario(String nombre) {
        modelo.setNombre(nombre);
    }

    public String getNombreUsuario() {
        return modelo.getNombre();
    }

    public void actualizarVista() {
        vista.imprimirNombreUsuario(modelo.getNombre());
    }
}
