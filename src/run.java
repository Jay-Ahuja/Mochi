package src;


import src.readers.sorting;

/**
 * @author Jay Ahuja
 * @version 0.1
 */

public class run {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        sorting sort = new sorting();
        // String names = "Atul Tina Keshu Nakku Komal Akash Leena Vipul Coco Priyanka Ram";
        // String[] sortednames = null;
        // sortednames = sort.sortZA(names, " ");
        // for (int i=0;i<sortednames.length;i++) {
        //     System.out.println(sortednames[i]);
        // }
        System.out.println(sort.reverse("Keshu"));
    }

    public static class SplitterNotFoundException extends Exception {
        public SplitterNotFoundException(String errormsg) {
            super(errormsg);
        }
    }

}
