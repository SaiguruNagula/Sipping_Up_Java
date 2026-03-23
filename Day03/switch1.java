public class switch1 {
    public static void main(String[] args) {
        // Switch expression with arrow (Java 14+)
        int day = 3;
        String dayName = switch(day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println(dayName);
        
        // Switch with multiple cases per branch
        String type = switch(day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Unknown";
        };
        System.out.println(type);
        
        // Switch with yield (for complex logic)
        String result = switch(day) {
            case 1, 2 -> {
                System.out.println("Early week");
                yield "Start";
            }
            case 3, 4, 5 -> {
                System.out.println("Mid week");
                yield "Middle";
            }
            case 6, 7 -> {
                System.out.println("Weekend");
                yield "End";
            }
            default -> "Invalid";
        };
        System.out.println(result);
    }
}
