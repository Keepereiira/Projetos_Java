
import java.util.Random;
public class NumeroSorteio {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(100);
        System.out.println("Número aleatorio é: " + valor);
    }
}
