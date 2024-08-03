import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Juego {
    Random random = new Random();
    private List<Integer> mU;
    private List<Integer> mD;
    private Usuario usuario;
    private Usuario dealer;

    public Juego(Usuario usuario) {
        this.usuario = usuario;
        this.dealer = new Usuario("Dealer");
        this.random = new Random();
        this.mU = new ArrayList<>();
        this.mD = new ArrayList<>();
    }
    private int CR() {
        return random.nextInt(9) + 1;
    }
    public void StartGame(){
        mU.clear();
        mU.add(CR());
        mD.clear();
        mD.add(CR());
        mostrarMano();
    }

    private int SacarCarta(){
        mU.add(CR());
        mD.add(CR());
        mostrarMano();
    }
    private int Sum(List<Integer> mano) {
        int total = 0;
        for (int carta : mano) {
            total += carta;
        }
        return total;
    }

    private void mostrarMano() {
        System.out.println("Tu mano: " + mU + " Total: " + Sum(mU));
        System.out.println("Mano del dealer: " + mD + " Total: " + Sum(mD));
    }
}
