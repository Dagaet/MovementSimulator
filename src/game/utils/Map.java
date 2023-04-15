package game.utils;

public class Map {

    int mapSize;
    String[][] generatedMap;

    public Map(int mapSize) {
        this.mapSize = mapSize;
        this.generatedMap = MapGenerator.mapGenerated(mapSize);
    }

    public String[][] getGeneratedMap() {
        return generatedMap;
    }
}