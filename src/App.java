import game.control.GameMenu;
import game.player.Player;
import game.utils.Map;
import game.utils.MapGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        Map map = new Map(6);
        Player player = new Player("Saul", 1, 1, 1);
        GameMenu gameMenu = new GameMenu(player, map);
        System.out.println(MapGenerator.mapGeneratedLegend());
       // gameMenu.mountPlayer();
        gameMenu.playerMovement();
        System.out.println(player.getCoordinatex());
        System.out.println(player.getCoordinatey());
        System.out.println(gameMenu.printMap());
        gameMenu.playerMovement();
        System.out.println(gameMenu.printMap());


    }
}
