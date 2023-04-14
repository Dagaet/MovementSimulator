package game.utils;

public class MapGenerator {

    public static String[][] mapGenerated(int numero) {
        String[][] test = new String[numero][numero];
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[0].length; j++) {
                test[i][j] = "X";
            }
        }
        for (int i = 0; i < test.length; i++) {
            test[i][0] = "#";
        }
        for (int i = 0; i < test.length; i++) {
            test[0][i] = "#";
        }
        for (int i = test.length; i < 0; i--) {
            test[i][0] = "#";
        }
        for (int i = test.length; i < 0; i--) {
            test[0][i] = "#";
        }
        return test;
    }

    @Override
    public String toString() {
        String msg = "";
        return msg;

    }
}
