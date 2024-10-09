public class CustomStringMethodsRunner {
    public static void main(String[] args) {
    CustomStringMethods methods = new CustomStringMethods();
    
    boolean bool = methods.longerThan("Alexander the Great!", 18);
    System.out.println(bool);

    String fun = methods.funnyString("pickle", 4);
    System.out.println(fun);

    String half = methods.halvesReversed("racecar");
    System.out.println(half);

    String latin = methods.pigLatin("clay monster");
    System.out.println(latin);

    String remove = methods.removeCharacter("blimp", 3);
    System.out.println(remove);

    String insert = methods.insertAt("I gotta run!", " ZOOM!", "z");
    System.out.println(insert);

    String str = methods.endUp("My name is Paul Maudib Atreides! silence!", 33);
    System.out.println(str);

    String yellOrWhisper = methods.yellOrWhisper("Get out!");
    System.out.println(yellOrWhisper);

    String food = methods.starBetween("My name is Star-Man, get it!");
    System.out.println(food);    
    }
}