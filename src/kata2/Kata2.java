package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author NassEML
 */
public class Kata2 {
    
    public static void main(String[] args) {
        Map<Integer, Integer> histogram = new HashMap<>();
        Integer[] data = new Integer[] {1,2,3,4,5,6,7,8,9,5,3,2,1,2,6};
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{
                histogram.put(data[i], 1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " ==> " + value);
        }
    }
}