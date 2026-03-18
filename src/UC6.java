public class UC6 {
    public static void main(String [] args){
        StringBuilder nameBuilder = new StringBuilder();
        String greeting;

        if (args.length == 0)
            // Case 1: No arguments provided
            greeting = "Hello, World!";
        else {
            // Case 2: Use enhanced for loop to add EVERY name + delimiter
            for (String name : args)
                nameBuilder.append(name).append(", ");


            // Remove the trailing ", " (last 2 characters)
            if (nameBuilder.length() > 0) {
                // substring(start, end) where end is total length minus the comma and space
                String finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);
                greeting = "Hello, " + finalNames + "!";
            }
            else
                greeting = "Hello, World!";
        }

        System.out.println(greeting);
    }
}
