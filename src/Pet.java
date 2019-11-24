public class Pet {
    int age;
    float weight;
    float height;
    String color;

    public void sleep () {
        System.out.println("Good night");
    }

    public void eat () {
        System.out.println("I'm hungry. Let's eat");
    }

    public void talk (String aWord) {
        String petResponse = "Ok.Ok." + aWord;
    }
}
