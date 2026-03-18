public class UC7 {
    void main(String[] args) {
        String nameText;
        if (args.length == 0)
            nameText = "World";
        else
            nameText = String.join(", ", args);
        System.out.println("Hello, " + nameText + "!");
    }
}
