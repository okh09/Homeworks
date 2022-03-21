package lesson11;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

    private static void taskOne() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {"Java", "Cat", "Coffee", "Dog", "Player",
                        "Robot", "Map", "Java", "Lion", "Tiger",
                        "Dog", "Coffee","Java", "Lion", "Android",
                        "Cat", "Robot", "Dog", "Map", "Coffee"};


        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void taskTwo() {

        Directory directory = new Directory();

        directory.add("Антонов", "89001116644");
        directory.add("Андреев", "89001097264");
        directory.add("Медведев", "89056458322");
        directory.add("Путин", "89037653452");
        directory.add("Антонов", "89079875600");
        directory.add("Сергеев", "89013006333");
        directory.add("Максимов", "89047007777");
        directory.add("Медведев", "89618880000");
        directory.add("Хохлов", "89880098876");
        directory.add("Андреев", "89017771234");
        directory.add("Сергеев", "89007896500");

        System.out.println(directory.get("Антонов"));
        System.out.println(directory.get("Андреев"));
        System.out.println(directory.get("Медведев"));
        System.out.println(directory.get("Путин"));
        System.out.println(directory.get("Сергеев"));

    }
}
