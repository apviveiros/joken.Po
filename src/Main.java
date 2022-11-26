import java.util.Scanner;

public class Main {

    public static JokenPo startGame() {
        System.out.println("******* Jo-ken-Po *******\n");
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String playerName = scan.next().toUpperCase();

        Player user = new Player(playerName);
        Player IA = new Player("IA");

        System.out.print(playerName + ", informe quantos rounds você quer jogar: ");
        int rounds = scan.nextInt();

        return new JokenPo(user, IA, rounds);

    }

    public static void main(String[] args) {
        final JokenPo jokenPo = startGame();
        jokenPo.toPlay();
        jokenPo.showFinalResult();
    }
}