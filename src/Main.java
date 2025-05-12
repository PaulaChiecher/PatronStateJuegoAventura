public class Main {
    public static void main(String[] args) {
        // Crear un personaje en estado explorando
        Personaje personaje = new Personaje(new Explorando());
        // Usar metodo sobrecargado para realizar acción con mensaje
        personaje.realizarAccion("El personaje está en una misión de exploración.");
        // Cambiar el estado a descansando
        personaje.setEstado(new Descansando());
        personaje.realizarAccion("El personaje se eencuentra en descanso");
        // Cambiar a estado combatiendo
        personaje.setEstado(new Combatiendo());
        personaje.realizarAccion("El personaje actualmente combate arduamente");

    }
}
