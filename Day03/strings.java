public class strings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        String joined = s1 + " " + s2;
        System.out.println("Joined: " + joined);

        System.out.println("Length: " + joined.length());
        System.out.println("Uppercase: " + joined.toUpperCase());
        System.out.println("Contains 'lo': " + joined.contains("lo"));

        String replaced = joined.replace("World", "Java");
        System.out.println("Replaced: " + replaced);

        System.out.println("Substring (6): " + joined.substring(6));

        // String vs StringBuilder for mutability
        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" Java");
        System.out.println(builder.toString());
    }
}
