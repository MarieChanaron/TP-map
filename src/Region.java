import java.util.HashMap;
import java.util.Map;

public class Region {

    String indicatif;
    String region;
    static Map<String, String> regions = new HashMap<>();

    Region(String indicatif, String region) {
        this.indicatif = indicatif;
        this.region = region;
        regions.put(this.region, this.indicatif);
    }

}
