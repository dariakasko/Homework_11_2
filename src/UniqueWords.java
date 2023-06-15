import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class UniqueWords {
    private static String engTextStr = "What is love Baby don't hurt me Don't hurt me no more Baby don't hurt me " +
            "Don't hurt me no more what is love Yeah yeah";
    private static List<String> listOfWords = Arrays.asList(engTextStr.split(" "));
    private static HashMap<String, Integer> mapOfUniqueWords = new HashMap<>();

    private static List<String> checkRegister(List<String> list) {
        int counter;
        for (int i = 0; i < list.size(); i++) {
            counter = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(list.get(i))) {
                    counter++;
                }
            }
            mapOfUniqueWords.put(list.get(i), counter);
        }
        return list;
    }
    public static void printUniqueWords(){
        checkRegister(listOfWords);
        System.out.println(mapOfUniqueWords);
    }
}
