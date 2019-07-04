import java.util.Random;
import java.util.ArrayList;
import javax.swing.JOptionPane;

class Test {
    public static void main(String[] args) {
        // Guardar posiciones de la carta que se elije al azar
        ArrayList<Integer> cartas = new ArrayList<Integer>(); 
        // Baraja con 40 cartas
        Baraja baraja = new Baraja();
        // Objeto para crear numeros aleatorios
        Random random = new Random();
        // Carta creada con informacion del jugador
        Carta adivinar = null;
        // Numero de vidas
        int vidas = 0;
        // Numero de la posicion de la carta
        int index = 0;
        // Numero de puntos
        int puntos = 0;
        // Numero de carta ingresada por usuario
        int numero = 0;
        // Palo de carta ingresada por usuario
        String palo = "";

        // Inician 3 partidas
        for(int i = 0; i < 3; i++) {

            // Obtener carta aleatoria:
            // generar diferente numero si es que ya habia salido
            do {
                index = random.nextInt(40);
                cartas.add(index);

            } while (cartas.contains(index) == false);

            // Carta temporal
            Carta carta = baraja.getCarta(index);

            // Mostrar mensaje
            JOptionPane.showMessageDialog(null, "Partida " +
                        (i + 1) + "\nLa carta ha sido bajada");

            // Inicializacion de vidas: 3 para cada partida
            vidas = 3;
            while (vidas != 0) {
                try {

                    // Adivinar por numero de carta
                    numero = Integer.parseInt(JOptionPane.showInputDialog(
                                            "Vidas: " + vidas +
                                            "\nAdivina el numero:"));

                    // Adivinar por palo de carta
                    palo = String.valueOf(JOptionPane.showInputDialog(null,
                            "Vidas: " + vidas + "\nAdivina el palo:",
                            "Palos", JOptionPane.QUESTION_MESSAGE, null,
                            new Object[] { "Espadas", "Bastos", "Oros", "Copas"},
                                        "Espadas"));

                    // Carta con informacion del usuario
                    adivinar = new Carta(numero, palo);

                    // Comparacion de cartas:
                    // si adivino, sumar puntos y salir del while
                    if (carta.compararCarta(adivinar)) {
                        JOptionPane.showMessageDialog(null, "Partida " +
                                    (i + 1) + "\nGanaste!");
                        puntos += 5;
                        break;
                    }

                    // Si no adivino, una vida menos
                    vidas--;

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Numero o palo introducidos incorrectamente");
                }
            } 
            
            // Si el usuario se termino sus vidas,
            // restar puntos y mostrar mensaje
            if (carta.compararCarta(adivinar) == false) {
                puntos -= 5;
                JOptionPane.showMessageDialog(null, "Partida " +
                        (i + 1) + "\nPerdiste\n" + carta.toString());
            }
        }

        // Mensaje porque finalizaron las partidas
        JOptionPane.showMessageDialog(null,
                "Partidas finalizadas.\nPuntos: " + puntos);
    }
}
