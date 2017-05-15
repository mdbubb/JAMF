import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("alreadyOnJAMF"));
        Scanner sc2 = new Scanner(new File("checkThese"));
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
                print.remove(k);

                lines.remove(k);
                k--;
                hello = false;
            }
            if (hello) {

                /// System.out.println(print.get(k));
            }
        }
        System.out.println("Middle School West");
        CharSequence west = "mw";
        for (String x : print) {
            if (x.contains(west)) {
                System.out.println(x);
            }
        }
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Middle School east");
        CharSequence east = "me";
        for (String x : print){
            if(x.contains(east)){
                System.out.println(x);
            }
        }
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("South elementary");
        CharSequence south = "so";
        for (String x : print){
            if(x.contains(south)){
                System.out.println(x);
            }
        }
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Skippack elementary");
        CharSequence skp = "sk";
        for (String x : print){
            if(x.contains(skp)){
                System.out.println(x);
            }
        }
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Evergreen elementary");
        CharSequence ev = "eg";
        for (String x : print){
            if(x.contains(ev)){
                System.out.println(x);
            }
        }
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Schwenksville elementary");
        CharSequence sch = "sw";
        for (String x : print){
            if(x.contains(sch)){
                System.out.println(x);
            }
        }
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

        System.out.println("High School");
        CharSequence hs = "hs";
        for (String x : print){
            if(x.contains(hs)){
                System.out.println(x);
            }
        }

    }
}
