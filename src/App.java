import java.util.Scanner;

import game.control.GameMenu;
import game.player.Player;
import game.utils.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("First of all we need the size of the map, you can write it down: ");
        int mapSize = keyboard.nextInt();
        keyboard.nextLine();
        Map map = new Map(mapSize);

        System.out.println("We also need your player name: ");
        String name = keyboard.nextLine();
        
        Player player = new Player(name, 1, 1, 1);
        GameMenu gameMenu = new GameMenu(player, map);
        
        int option = -1;
        while(option != 5){
            System.out.println("Welcome to the movement player game, what you want to do: ");
            System.out.println("1. Move the player to diferent directions.");
            System.out.println("2. Mount and unmount the player.");
            System.out.println("3. Show the map with the player.");
            System.out.println("4. Show the map legend.");
            System.out.println("5. Close the game");
            option = keyboard.nextInt();

            switch (option){
                case 1:
                    gameMenu.playerMovement();
                    break;
                case 2:
                    System.out.println("What you want to do: Mount or unmount \n 1 for Mount, 2 for unmount");
                    int mount = keyboard.nextInt();
                    if (mount == 1) {
                        gameMenu.mountPlayer();
                    } else if (mount == 2){
                        gameMenu.unmountPlayer();
                    } else {
                        System.out.println("You need to put one of the above");
                    }
                    break;
                case 3:
                    System.out.println("This is the map with the player: ");
                    System.out.println(gameMenu.printMap());
                    break;
                case 4:
                    System.out.println("This is the legend of the map: ");
                    gameMenu.legend();
                    break;
                case 5:
                    System.out.println("Bye bye");
                    break;
                default:
                    System.out.println("You need to select one of the above. \n Exiting the program.");
                    break;
                }
        }
    }
}
