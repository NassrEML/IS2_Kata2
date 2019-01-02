package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Kata2 {

    public static void main(String[] args) {
        Map<Integer, Integer> histogram = new HashMap<>();
        Integer[] data = new Integer[] {1,2,3,4,5,6,7,8,9,5,3,2,1,2,6};

        for (Integer key: data){
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key)+1 : 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " ==> " + value);
        }
    }
}
