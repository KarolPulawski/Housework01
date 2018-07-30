package pl.coderslab.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {

    public static void main(String[] args) {
        Map<Integer, Integer> finalMap = checkRand(100000, 10);
        for(Integer key : finalMap.keySet()) {
            System.out.println(key + " : " + finalMap.get(key));
        }
    }

    public static Map<Integer, Integer> checkRand(int amount, int interval) {
        Map<Integer, Integer> map = new HashMap<>();
        Random random = new Random();

        for(int i = 0 ; i < interval; i++) {
            map.put(i, 0);
        }

        for(int i = 0; i < amount; i++) {
            Integer key = random.nextInt(interval);
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }
        }
        return map;
    }
}
