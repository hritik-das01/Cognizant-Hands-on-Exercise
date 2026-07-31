package javaCoreAssesment;

public class Ex_30 {
	public static void inspectObject(Object obj) {
        String result = switch (obj) {
            case Integer i -> "It is an Integer with value: " + i;
            case String s  -> "It is a String with length: " + s.length();
            case Double d  -> "It is a Double with value: " + d;
            case null      -> "Object is null";
            default        -> "Unknown type: " + obj.getClass().getName();
        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        inspectObject(42);
        inspectObject("Hello Java 21");
        inspectObject(3.14);
    }
}