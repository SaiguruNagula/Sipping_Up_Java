package Day04;

public class StringBufferBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(0, 5, "Hi");
        sb.deleteCharAt(sb.length() - 1);
        System.out.println("StringBuffer result: " + sb.toString());

        StringBuilder sbd = new StringBuilder("Java");
        sbd.append(" SE");
        sbd.insert(4, " Platform");
        sbd.reverse();
        System.out.println("StringBuilder reversed: " + sbd.toString());

        // Restore for demonstration
        sbd.reverse();
        System.out.println("StringBuilder normal: " + sbd.toString());
    }
}
