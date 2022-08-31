package 统计.求重复;

import java.util.HashMap;
import java.util.Set;

public class DeMo {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap();
        int[] a = {1, 2, 3,3, 3,3, 5, 7, 8, 9};

        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[1]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        Set<Integer> integers = map.keySet();
        for (Integer integer : integers) {
            System.out.println(integer+"="+map.get(integer));
        }
    }

    }

