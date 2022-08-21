package src.filter;

import java.util.ArrayList;
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

    public String[] reverse(String[] arr) {
        StringBuilder rstr = new StringBuilder();
        ArrayList<String> rarr = new ArrayList<String>();

        for (String str : arr) {
            for (char c : str.toCharArray()) {
                rstr.insert(0,c);
            }

            rarr.add(String.valueOf(rstr));
            rstr.setLength(0);
        }

        return rarr.toArray(new String[rarr.size()]);

    }

    // entering string[] into reverse functions reverses every item in the list

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
        return namecase.substring(0,namecase.length()-1);
    }

    public String[] nameCase(String[] arr) {
        StringBuilder sb = new StringBuilder();
        String[] names;
        String namecase = "";
        ArrayList<String> al = new ArrayList<String>();

        for (String str : arr) {
            if (str.contains(" ")) {
                names = str.split(" ");
    
                for (String name : names) {
                    sb.append(String.valueOf(name.toCharArray()[0]).toUpperCase() + name.substring(1, name.length()).toLowerCase()+" ");
    
                }
    
                namecase = sb.toString();
                al.add(namecase.substring(0,namecase.length()-1));
                sb.setLength(0);
    
            } else if (!str.contains(" ")) {
                String let = String.valueOf(str.toCharArray()[0]).toUpperCase();
                namecase = let+str.substring(1,str.length()).toLowerCase();
                al.add(namecase);
            }
        }

        String[] rarr = al.toArray(new String[al.size()]);
        return rarr;

        
    }



    // entering string[] into namecase makes every item in the list become namecase

    public String[] sortAZ(String[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public String sortAZ(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    public String[] sortZA(String[] arr) {
        Arrays.sort(arr, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        return arr;
    }

    public String sortZA(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        StringBuilder rstr = new StringBuilder();

        for (char c : chars) {
            rstr.insert(0,c);
        }

        return String.valueOf(rstr);
        
    }

    

}
