package Day191026;

import java.util.*;
import java.util.function.BiConsumer;

public class CalLetter {

        public Map<Character, List<Integer>> process(String origin_) {
            String origin = origin_.toLowerCase();
            // unique
            Set<Character> unique = new HashSet<Character>();
            for (int index = 0; index < origin.length(); index++) {
                char c = origin.charAt(index);
                unique.add(c);
            }
            // map initialization with <char, empty list>
            Map<Character, List<Integer>> positions = new HashMap<>();
            for (Character c: unique) {
                positions.put(c, new ArrayList<>());
            }

            for (int index = 0; index < origin.length(); index++) {
                char c = origin.charAt(index);
                positions.get(c).add(index + 1);
            }
            return positions;
        }

        public void PrintOutPut (Map<Character, List<Integer>> map1)
        {
            //Set<Map.Entry<Character, List<Integer>>> entries=map1.entrySet();
            //for (Map.Entry<Character, List<Integer>> i: entries)
            for (Map.Entry<Character, List<Integer>> i: map1.entrySet())
            System.out.println("Letter " + i.getKey() +" : "+i.getValue().size()+" : "+i.getValue());
        }

    public void printOutput2(Map<Character, List<Integer>> map1) {
        map1.forEach(new BiConsumer<Character, List<Integer>>() {
            @Override
            public void accept(Character ch, List<Integer> list) {
                System.out.printf("letter: %c : %d : %s\n", ch, list.size(), list);
            }
        });
    }


    public void printOutput3(Map<Character, List<Integer>> map1) {
        map1.forEach((ch, list) -> System.out.printf("letter: %c : %d : %s\n", ch, list.size(), list));
    }
    public void printOutput4(Map<Character, List<Integer>> map1) {
        BiConsumer<Character, List<Integer>> biConsumer = new BiConsumer<Character, List<Integer>>() {
            @Override
            public void accept(Character ch, List<Integer> list) {
                System.out.printf("letter: %c : %d : %s\n", ch, list.size(), list);
            }
        };

        map1.forEach(biConsumer);
    }

    public void printOutput5(Map<Character, List<Integer>> map1) {
        BiConsumer<Character, List<Integer>> biConsumer =
                (ch, list) -> System.out.printf("letter: %c : %d : %s\n", ch, list.size(), list);

        map1.forEach(biConsumer);
    }

        public static void main(String[] args) {
    // 1. data obtaining
    Scanner MyObj= new Scanner(System.in);
    System.out.print("Please enter your string: ");
    String sentence = MyObj.nextLine();
    // 2. data process
    CalLetter app = new CalLetter();
    Map<Character, List<Integer>> result = app.process(sentence);
    // 3. output the result
    app.PrintOutPut(result);


    }

}
