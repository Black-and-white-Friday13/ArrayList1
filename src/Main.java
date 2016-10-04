import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());
        }
        int b = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > b) {
                b = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (b == list.get(i).length()) {
                System.out.println(list.get(i));
            }
        }
    }
}
