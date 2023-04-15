package game.control;

import java.util.Scanner;

import game.player.Player;
import game.utils.Map;

public class GameMenu {
    final private Scanner keyboard = new Scanner(System.in); 
    private Player character;
    private Map map;

    public GameMenu(Player character, Map map) {
        this.character = character;
        this.map = map;
    }

    public void mountPlayer() {
        if (this.character.getVel() == 2) {
            System.out.println("Character is already on the bicicle ");
        } else {
            this.character.setVel(2);
            System.out.println("Player has mounted the bicicle");
        }
    }

    public void unmountPlayer() {
        if (this.character.getVel() == 2) {
            this.character.setVel(1);
            System.out.println("Player has unmounted the bicicle and now is walking");
        } else {
            System.out.println("Character is already walking");
        }
    }

    public void playerMovement(String movement) {
        System.out.println("Where do you want to move? \n Press w,s,a,d to move to an specific direction and then press enter");
        String answer = keyboard.nextLine();

        switch (answer){
            case "w":
                
                break;
            case "s":
                break;
            case "a":
                break; 
            case "d":
                break;
            default:
                System.out.println("Select one please");
                break;
        }

    }

    public void printMap(){

    }

    public void legend(){
        System.out.println("# -> Map border (not accessible)");
        System.out.println("X -> Map's floor (accessible)");
        System.out.println("O -> Players position (by foot)");
        System.out.println("8 -> Players position (on a bicicle)");
    }

}
