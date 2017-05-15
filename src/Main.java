import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by mb977 on 5/15/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("alreadyOnJAMF"));
        Scanner sc2 = new Scanner(new File("checkThese"));
        FileWriter fw = new FileWriter(new File("ATV"));
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> alreadyOn = new ArrayList<>();
        ArrayList<String> print = new ArrayList<>();
        while (sc2.hasNextLine()) {
            lines.add(sc2.nextLine());

        }
        while (sc.hasNextLine()) {
            alreadyOn.add(sc.nextLine());
        }
        for (int k = 0; k < lines.size(); k++) {
            boolean hi = false;
            for (int l = 0; l < alreadyOn.size(); l++) {
                if (lines.get(k).equalsIgnoreCase(alreadyOn.get(l))) {
                    hi = true;
                }
            }
            boolean same = false;
            for (int i = 0; i < print.size(); i++) {
                if (lines.get(k).equals(print.get(i))) {
                    same = true;
                }
            }
            if (same) {
            } else if (!hi) {
                print.add(lines.get(k));
            }
        }
        for (int k = 0; k < print.size(); k++) {
            boolean hello = true;
            if (print.get(k).toUpperCase().contains("ATV")) {
                fw.write(print.get(k) + "\n");
                print.remove(k);
                lines.remove(k);
                k--;
                hello = false;
            }
            if (hello) {
                System.out.println(print.get(k));
            }
        }
        System.out.println(print.size());
        fw.close();
    }
}
