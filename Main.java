import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int result = 0;
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        String tmpA = scanner.next();
        String tmpB = scanner.next();
        String[] a = tmpA.toLowerCase().split("");
        String[] b = tmpB.toLowerCase().split("");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i].equals(a[j])) {
                    count++;
                }
            }
            map1.put(a[i], count);
            count = 0;
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[i].equals(b[j])) {
                    count++;
//                    if (map.containsKey(b[i])) {
//                        map.put(b[i], Math.abs(map.get(b[i]) - count));
//                    } else {
//                        map.put(b[i], count);
//                    }
                }
            }
//            if (map.containsKey(b[i])) {
//                map.put(b[i], Math.abs(map.get(b[i]) - count));
//            } else {
//                map.put(b[i], count);
//            }
            map2.put(b[i], count);
            count = 0;
        }

//        System.out.println("map1 is " + map1);
//        System.out.println("map2 is " + map2);

//        for (var it : map.values()) {
//            result = result + it;
//        }

//        System.out.println("map1 size is " + tmpA.length());;
//        System.out.println("map2 size is " + tmpB.length());;

        if (map1.size() > map2.size()) {
//            System.out.println("><><  map1 > map2");
            for (var x : map2.keySet()) {
                if (map1.containsKey(x)) {
                    map1.put(x, Math.abs(map1.get(x) - map2.get(x)));
                } else {
                    map1.put(x, map2.get(x));
                }
            }
            for (var set: map1.values()) {
                result = result + set;
            }
        }
        if (map1.size() < map2.size()) {
//            System.out.println("><>< map1 < map2");
            for (var x : map1.keySet()) {
                if (map2.containsKey(x)) {
                    map2.put(x, Math.abs(map2.get(x) - map1.get(x)));
                } else {
                    map2.put(x, map1.get(x));
                }
            }

            for (var set: map2.values()) {
                result = result + set;
            }
        }
        if (map1.size() == map2.size()) {
            for (var x : map2.keySet()) {
                if (map1.containsKey(x)) {
                    map1.put(x, Math.abs(map1.get(x) - map2.get(x)));
                } else {
                    map1.put(x, map2.get(x));
                }
            }
            for (var set: map1.values()) {
                result = result + set;
            }
        }
        System.out.println(result);

    }
}
