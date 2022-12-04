package HW2;

import java.util.LinkedHashMap;
import java.util.Map;

public class where {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "Dmitriy");
        map.put("country", "RF");
        map.put("city", "SPB");
        map.put("age", null);
        map.put("name1", "Tarasov");
        map.put("name2", "Dmitriy");
        System.out.println(whereEnter(map));

    }

    public static StringBuilder whereEnter(Map<String, String> params) {
        StringBuilder res = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (entry.getValue() != null) {
                if (res.toString().equals("")) {
                    res.append(entry.getKey()).append(" = '").append(entry.getValue()).append("'");
                } else {
                    res.append(" and ").append(entry.getKey()).append(" = '")
                            .append(entry.getValue()).append("'");
                }
            }

        }
        return res;
    }

}
