package game.utils;

public class Map {
    // Implementa una clase Mapa que cumpla con las siguientes condiciones:
    // a) Debe contener, como mínimo, los siguientes atributos:
    // - Tamaño del mapa
    // - Mapa generado
    // b) El constructor debe recibir el tamaño del mapa. Se debe inicializar aquí
    // el
    // atributo del mapa, mediante un método estático que se encuentra en la clase
    // del
    // siguiente apartado.

    int mapSize;
    String[][] generatedMap = MapGenerator.mapGenerated(3);

    public Map(int mapSize) {
        this.mapSize = mapSize;
    }

    // public void mostrarMatriz(){
    // for (int i = 0; i < matriz4x4.length; i++) {
    // for (int j = 0; j < matriz4x4[0].length; j++) {
    // System.out.print(matriz4x4[i][j] + " ");
    // }
    // System.out.println(" ");
    // }
    // }

}
