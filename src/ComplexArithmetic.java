import java.util.Objects;
public class ComplexArithmetic {
    public static void operations(String operator1, String operator2, int integer1, int integer2, int integer3) {
        if ((Objects.equals(operator1, "+")) && (Objects.equals(operator2, "+"))) {
            System.out.println(integer1 + integer2 + integer3);
        } else if ((Objects.equals(operator1, "+")) && (Objects.equals(operator2, "-"))) {
            System.out.println(integer1 + integer2 - integer3);
        } else if ((Objects.equals(operator1, "+")) && (Objects.equals(operator2, "*"))) {
            System.out.println(integer1 + integer2 * integer3);
        } else if ((Objects.equals(operator1, "+")) && (Objects.equals(operator2, "/"))) {
            System.out.println(integer1 + integer2 / integer3);
        } else if ((Objects.equals(operator1, "-")) && (Objects.equals(operator2, "+"))) {
            System.out.println(integer1 - integer2 + integer3);
        } else if ((Objects.equals(operator1, "-")) && (Objects.equals(operator2, "-"))) {
            System.out.println(integer1 - integer2 - integer3);
        } else if ((Objects.equals(operator1, "-")) && (Objects.equals(operator2, "*"))) {
            System.out.println(integer1 - integer2 * integer3);
        } else if ((Objects.equals(operator1, "-")) && (Objects.equals(operator2, "/"))) {
            System.out.println(integer1 - integer2 / integer3);
        } else if ((Objects.equals(operator1, "*")) && (Objects.equals(operator2, "+"))) {
            System.out.println(integer1 * integer2 + integer3);
        } else if ((Objects.equals(operator1, "*")) && (Objects.equals(operator2, "-"))) {
            System.out.println(integer1 * integer2 - integer3);
        } else if ((Objects.equals(operator1, "*")) && (Objects.equals(operator2, "*"))) {
            System.out.println(integer1 * integer2 * integer3);
        } else if ((Objects.equals(operator1, "*")) && (Objects.equals(operator2, "/"))) {
            System.out.println(integer1 * integer2 / integer3);
        } else if ((Objects.equals(operator1, "/")) && (Objects.equals(operator2, "+"))) {
            System.out.println(integer1 / integer2 + integer3);
        } else if ((Objects.equals(operator1, "/")) && (Objects.equals(operator2, "-"))) {
            System.out.println(integer1 / integer2 - integer3);
        } else if ((Objects.equals(operator1, "/")) && (Objects.equals(operator2, "*"))) {
            System.out.println(integer1 / integer2 * integer3);
        } else if ((Objects.equals(operator1, "/")) && (Objects.equals(operator2, "/"))) {
            System.out.println(integer1 / integer2 / integer3);
        }
    }
}
