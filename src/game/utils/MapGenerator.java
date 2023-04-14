package game.utils;

public class MapGenerator {

    public static String[][] mapGenerated(int numero) {
        String[][] test = new String[numero][numero];
        String msg = "";
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
        for (int i = test.length - 1; i >= 0; i--) {
            test[i][test.length - 1] = "#";
        }
        for (int i = test.length - 1; i >= 0; i--) {
            test[test.length - 1][i] = "#";
        }

        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[0].length; j++) {
                msg += test[i][j] + " ";
            }
            msg += "\n";
        }
        System.out.println(msg);
        return test;
    }

}
