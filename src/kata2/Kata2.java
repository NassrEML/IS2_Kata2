package kata2;

import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Kata2 {

    public static void main(String[] args) {

        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        Histogram histo = new Histogram(data);
        Map<String, Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<String, Integer> entry : histogr.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " ==> " + value);
        }
    }
}