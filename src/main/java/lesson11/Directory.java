package lesson11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Directory {

    private Map<String, List<String>> hmDirectory = new HashMap<>();
    private List<String> phoneNumberList;

    public void add(String surname, String phoneNumber) {
        if (hmDirectory.containsKey(surname)) {
            phoneNumberList = hmDirectory.get(surname);
        } else {
            phoneNumberList = new ArrayList<>();
        }
        phoneNumberList.add(phoneNumber);
        hmDirectory.put(surname, phoneNumberList);
    }

    public List<String> get(String surname) {
        return hmDirectory.get(surname);
    }

}
