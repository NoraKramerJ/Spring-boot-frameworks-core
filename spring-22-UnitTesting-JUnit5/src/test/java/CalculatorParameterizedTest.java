import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorParameterizedTest {


    @ParameterizedTest
    @ValueSource(strings = {"Java", "JS", "TS"})
    void testCase1(String arg) {
        assertFalse(arg.isEmpty());

    }
    @ParameterizedTest
    @ValueSource(ints = {3,6,9})
    void testCase1(int num) {
        assertEquals(0,num % 3);
        // if all numbers can be divided by 3 or not, zero here the remaining is zero

    }
    @NullAndEmptySource
    //@EmptySource
    //@NullSource
    void testCase3(String arg){
        Assertions.assertFalse(arg.isEmpty());
    }
    @ParameterizedTest
    @MethodSource("")
    void testCase4(String arg){
        Assertions.assertFalse(arg.isEmpty());
    }
    static String[] stringProvider(){
        return new String[]{"Java","JS","TS"};
    }
}
