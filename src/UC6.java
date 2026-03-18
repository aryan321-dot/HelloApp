class UC6 {
    void main(String [] args){
        StringBuilder nameBuilder = new StringBuilder();
        if (args.length == 0)
            System.out.println("Hello, World!");
        else {
            for (String name : args)
                nameBuilder.append(name).append(", ");
            // Using .isEmpty() instead of .length() > 0
            if (!nameBuilder.isEmpty()) {
                // Trim the trailing ", "
                String finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);
                System.out.println("Hello, " + finalNames + "!");
            }
        }
    }
}
