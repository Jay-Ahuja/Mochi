package src.readers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

import src.run;

public class splitter extends run {

    public static void main(String[] args) {
        return;
    }

    String[] splitOnKey(String String, String Splitter, int Limit) throws SplitterNotFoundException {

        if (String.contains(Splitter)) {
            String[] afterSplit = String.split(Splitter, Limit);
            return afterSplit;

        } else if (!String.contains(Splitter)) {
            throw new SplitterNotFoundException(
                    ANSI_RED + "Splitter provided was not found in the sequence!" + ANSI_RESET);
        }
        return new String[0];
    }

    public String[] splitToArray(String String, String Splitter, int Limit) {
        String[] arr = null;
        try {
            arr = splitOnKey(String, Splitter, Limit);
        } catch (SplitterNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }

        return arr;

    }

    public HashMap<Integer, String> splitToHashMap(String String, String Splitter, int Limit) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        String[] values = null;

        try {
            values = splitOnKey(String, Splitter, Limit);
        } catch (SplitterNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }

        for (int i = 0; i < values.length; i++) {
            map.put(i, values[i]);
        }

        return map;
    }

    public TreeMap<Integer, String> splitToTreeMap(String String, String Splitter, int Limit) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        String[] values = null;

        try {
            values = splitOnKey(String, Splitter, Limit);
        } catch (SplitterNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }

        for (int i = 0; i < values.length; i++) {
            map.put(i, values[i]);
        }

        return map;
    }

    public HashSet<String> splitToHashSet(String String, String Splitter, int Limit) {
        HashSet<String> set = new HashSet<>();
        String[] values = null;

        try {
            values = splitOnKey(String, Splitter, Limit);
        } catch (SplitterNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }

        for (int i = 0; i < values.length; i++) {
            set.add(values[i]);
        }

        return set;
    }

    public TreeSet<String> splitToTreeSet(String String, String Splitter, int Limit) {
        TreeSet<String> set = new TreeSet<>();
        String[] values = null;

        try {
            values = splitOnKey(String, Splitter, Limit);
        } catch (SplitterNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }

        for (int i = 0; i < values.length; i++) {
            set.add(values[i]);
        }

        return set;
    }

    // type 0 = String[]
    // type 1 = ArrayList[]
    // type 2 = Hashmap[]
    // type 3 = TreeMap[]
    // type 4 = HashSet[]
    // type 5 = TreeSet[]

}
