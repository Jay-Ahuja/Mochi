package src;


import src.filter.sorting;

/**
 * @author Jay Ahuja
 * @version 0.1
 */

public class run {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        sorting sort = new sorting();
        String[] names = {"KESHU AHUJA", "nakkku ahuja", "cOCo"};
        String[] namesR = sort.nameCase(names);
        for (String s : namesR) {
            System.out.println(s);
        }
    }

    public static class SplitterNotFoundException extends Exception {
        public SplitterNotFoundException(String errormsg) {
            super(errormsg);
        }
    }

}
