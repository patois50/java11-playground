package strings;

public class StringsRunner {

    public static void main(String[] args) {
        var chant = "       USA!!!\n       USA!!!\n";
        System.out.println("chant.repeat(3) = " + chant.repeat(3));
        System.out.println("chant.isBlank() = " + chant.isBlank());
        System.out.println("chant.strip() = " + chant.strip()); // chant.trim()

        //System.out.println("chant.lines() = " + chant.lines().forEach(System.out::println););

    }

}
