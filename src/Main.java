import java.util.Optional;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static String nullableMethod() {
        return null;
    }
    public static void main(String[] args) {
        String result = nullableMethod();

        // Optional
        Optional<String> optionalValue = Optional.ofNullable(result);

        /*Optional<String> optionalNull = Optional.ofNullable(null);*/

        if (optionalValue.isPresent()) { //데이터를 가지고 있을 때
            System.out.println("Value is present: " + optionalValue.get());
        } else { // 데이터가 존재하지 않을 때
            System.out.println("Value is not present");
        }

        // Optional<T>.orElse(T other): 데이터가 없을때 other를 대신 사용
        System.out.println("Value is: " + optionalValue.orElse("null"));

        /*// orElse()를 사용하면 기본깞을 전달하는 방식으로 활용할 수 있습니다.
        String result = optionalNull.orElse("Default Value");
        result = optionalNull.orElse(null);
        System.out.println("Value (orElse): " + result);*/
    }
}