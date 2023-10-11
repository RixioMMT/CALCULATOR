import java.util.Objects;
public class Arithmetic {
    public static void operation(String operator1, int integer1, int integer2) {
        if ((Objects.equals(operator1, "+"))) {
            System.out.println(integer1 + integer2);
        } else if ((Objects.equals(operator1, "-"))) {
            System.out.println(integer1 - integer2);
        } else if ((Objects.equals(operator1, "*"))) {
            System.out.println(integer1 * integer2);
        } else if ((Objects.equals(operator1, "/"))) {
            System.out.println(integer1 / integer2);
        }
    }
}
