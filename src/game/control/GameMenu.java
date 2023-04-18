package game.control;

import java.util.Scanner;

import game.player.Player;
import game.utils.Map;

public class GameMenu {
    final private Scanner keyboard = new Scanner(System.in);
    private Player player;
    private Map map;
    private String[][] endMap;

    public GameMenu(Player character, Map map) {
        this.player = character;
        this.map = map;
        this.endMap = map.getGeneratedMap();
    }

    public void mountPlayer() {
        if (this.player.getVel() == 2) {
            System.out.println("Character is already on the bicycle ");
        } else {
            this.player.setVel(2);
            System.out.println("Player has mounted the bicycle");
        }
    }

    public void unmountPlayer() {
        if (this.player.getVel() == 2) {
            this.player.setVel(1);
            System.out.println("Player has unmounted the bicycle and now is walking");
        } else {
            System.out.println("Character is already walking");
        }
    }

    public void playerMovement() {
        System.out.println(
                "Where do you want to move? \n Press w,s,a,d to move to an specific direction and then press enter");
        String answer = keyboard.nextLine();

        switch (answer) {
            case "w":
                player.setCoordinatey(player.getCoordinatey() - player.getVel());
                break;
            case "s":
                player.setCoordinatey(player.getCoordinatey() + player.getVel());
                break;
            case "a":
                player.setCoordinatex(player.getCoordinatex() - player.getVel());
                break;
            case "d":
                player.setCoordinatex(player.getCoordinatex() + player.getVel());
                break;
            default:
                System.out.println("Select one please");
                break;
        }
    }

    public String printMap() {
        String msg = "";
        for (int i = 0; i < endMap.length; i++) {
            for (int j = 0; j < endMap.length; j++) {
                if (player.getCoordinatex() == j && player.getCoordinatey() == i && player.getVel() == 2) {
                    msg += "8 ";
                } else if (player.getCoordinatex() == j && player.getCoordinatey() == i && player.getVel() == 1) {
                    msg += "0 ";
                } else {
                    msg += endMap[i][j] + " ";
                }
            }
            msg += "\n";
        }
        return msg;
    }

    public void legend() {
        System.out.println("# -> Map border (not accessible)");
        System.out.println("X -> Map's floor (accessible)");
        System.out.println("O -> Players position (by foot)");
        System.out.println("8 -> Players position (on a bicicle)");
    }

}
