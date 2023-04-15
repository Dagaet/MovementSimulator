import game.player.Player;
import game.utils.Map;
import game.utils.MapGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        Map map = new Map(10);
        Player player = new Player(null, 0, 0, 0);
        System.out.println(MapGenerator.mapGeneratedLegend());
    }
}
