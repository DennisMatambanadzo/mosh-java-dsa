

public class Main {
    public static void main(String[] args) {
        CharFinder charFinder = new CharFinder();
        var words = "a green apple";
        var ch = charFinder.findFirstNonRepeatingChar(words);
        System.out.println(ch);

        var ch2 = charFinder.findFirstRepeatingCharacter(words);
        System.out.println(ch2);
    }
}