package Day07;

public class annotationUse {
    
    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated");
    }

    @Override
    public String toString() {
        return "annotationUse class";
    }

    public void uncheckedMethod() {
        java.util.List<String> list = new java.util.ArrayList<String>();
        list.add("example");
    }

    public static void main(String[] args) {
        annotationUse obj = new annotationUse();
        obj.oldMethod();
        System.out.println(obj.toString());
    }

}
