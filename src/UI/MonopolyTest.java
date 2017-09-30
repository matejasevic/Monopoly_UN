package UI;

import Data.Board;
import Data.Player;
import java.util.Scanner;

/**
 *
 * @author 
 *  - Juan Ochoa
 *  - Diego Ruiz
 */

public class MonopolyTest {

    /**
     * @param args the command line arguments
     */
    private static Scanner reader = new Scanner(System.in);
    private static Scanner reader2 = new Scanner(System.in);
    private static Player p1 = new Player(null, true);
    private static Player p2 = new Player(null, true);
    private static Player p3 = new Player(null, true);
    private static Player p4 = new Player(null, true);

    public static void main(String[] args) {
        MonopolyConsole console = new MonopolyConsole();
        console.welcome();
        switch (console.getOption()) {
            case 1:
                System.out.println("Select number of players (1 to 4)");
                int b = reader.nextInt();
                if (b >= 1) {
                    System.out.println("Write username for player 1");
                    String name = reader2.nextLine();
                    p1 = new Player(name, true);
                    if (b >= 2) {
                        System.out.println("Write username for player 2");
                        String name2 = reader2.nextLine();
                        p2 = new Player(name2, false);
                        if (b >= 3) {
                            System.out.println("Write username for player 3");
                            String name3 = reader2.nextLine();
                            p3 = new Player(name3, false);
                            if (b == 4) {
                                System.out.println("Write username for player 4");
                                String name4 = reader2.nextLine();
                                p4 = new Player(name4, false);
                            }
                        }
                    }
                }
                System.out.println("List of players:");
                System.out.println(p1.getUsername());
                if (p2.getUsername() != null) {
                    System.out.println(p2.getUsername());
                }
                if (p3.getUsername() != null) {
                    System.out.println(p3.getUsername());
                }
                if (p4.getUsername() != null) {
                    System.out.println(p4.getUsername());
                }
                System.out.println(Board.generateBoard());
                break;
            case 2:
                System.exit(0);
                break;
        }

    }
}
