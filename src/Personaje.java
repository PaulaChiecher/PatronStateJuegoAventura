public class Personaje {
    private Estado estado;
    public Personaje(Estado estadoInicial) {
        this.estado = estadoInicial;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
    // Metodo sobrecargado para realizar acción con diferentes mensajes
    public void realizarAccion(String mensaje) {
        System.out.println(mensaje);
        estado.realizarAccion();
    }
    public void realizarAccion() {
        estado.realizarAccion();
    }
}
