import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {


    public static List<String> commonPart(String[] a, String[] b ){

        List<String> result= new ArrayList<>();
        Map<String, Integer> aMap = new HashMap();
        for( String word : a ){
            int counter = 1;
            if( aMap.containsKey(word)  ){
                counter++;
            }
            aMap.put(word , counter);
        }

        for( String word : b ){
            if( aMap.containsKey(word)  ){
                result.add(word);
            }
        }
        return  result;
    }





    public static void main(String[] args) {

        String[] a = {"a","a","b","a","c","c"};
        String[] b = {"a","e","b"};

        System.out.println( commonPart(a,b)   );

    }



}
