package io.github.futurewl;

import java.util.Comparator;

public class MyComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        System.out.println(o1 + "---" + o2);
        return 0;
    }

}
