public class UC5 {
    public static void main(String [] args){
        StringBuilder namesBuilder = new StringBuilder();
        if (args.length == 0)
            namesBuilder.append("World");
        else 
            for (int i = 0; i < args.length; i++) {
                namesBuilder.append(args[i]);
                if (i < args.length - 1)
                    namesBuilder.append(", ");
            }
        System.out.println("Hello, " + namesBuilder.toString() + "!");
    }
}
