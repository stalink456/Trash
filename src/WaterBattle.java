import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaterBattle {
    public static final int countShips = 6;
    public static final int countOneShips = 3;
    public static final int countTwoShips = 2;
    public static final int countThreeShips = 1;

    public static void main(String[] args) throws IOException {
        System.out.println("Hi, what's your name? ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println("Hi, " + name);
    }
}
