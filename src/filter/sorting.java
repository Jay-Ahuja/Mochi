package src.filter;

import java.util.Arrays;
import java.util.Collections;

import src.run;

public class sorting extends run {

    public static void main(String[] args) {
        // main method
    }

    public String reverse(String str) {
        StringBuilder rstr = new StringBuilder();

        for (char c: str.toCharArray()) {
            rstr.insert(0, c);
        }
        return String.valueOf(rstr);
    }

    public String nameCase(String str) {
        String[] names;
        String namecase = "";

        if (str.contains(" ")) {
            names = str.split(" ");
            StringBuilder sb = new StringBuilder();

            for (String name : names) {
                sb.append(String.valueOf(name.toCharArray()[0]).toUpperCase() + name.substring(1, name.length()).toLowerCase()+" ");

            }

            namecase = sb.toString();

        } else if (!str.contains(" ")) {
            String let = String.valueOf(str.toCharArray()[0]).toUpperCase();
            namecase = let+str.substring(1,str.length()).toLowerCase();
        }
        return namecase;
    }

    public String[] sortAZ(String str, String divider) {
        String[] sorted = str.split(divider);
        Arrays.sort(sorted);
        return sorted;
    }

    public String[] sortZA(String str, String divider) {
        String[] sorted = str.split(divider);
        Arrays.sort(sorted, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        return sorted;
        
    }



}
