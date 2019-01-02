package kata2;

import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Kata2 {

    public static void main(String[] args) {

        Integer[] data = new Integer[] {1,2,3,4,5,6,7,8,9,5,3,2,1,2,6};
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " ==> " + value);
        }
    }
}
