package game.control;

import game.player.Player;
import game.utils.Map;

public class GameMenu {

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
        if (movement.equals("W")){
            
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
