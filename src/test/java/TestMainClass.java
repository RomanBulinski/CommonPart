import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestMainClass {

    @Test
    public void test1(){
        String[] a = {"a","a","b","a","c","c"};
        String[] b = {"a","e","b"};
        String[] c = {"a","b"};
        assertArrayEquals( c , Main.commonPart(a,b).toArray()  );
    }

}
