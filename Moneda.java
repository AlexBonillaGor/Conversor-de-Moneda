import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Moneda {
    String result;
    String base_code;
    HashMap<String, Float> conversion_rates;

    public Moneda(String result, String base_code, HashMap<String, Float> conversion_rates) {
        this.result = result;
        this.base_code = base_code;
        this.conversion_rates = conversion_rates;
    }


}
