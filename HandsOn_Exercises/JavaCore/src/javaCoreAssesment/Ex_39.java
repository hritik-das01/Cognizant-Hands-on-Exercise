package javaCoreAssesment;

import java.lang.reflect.Method;

public class Ex_39 {

	public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Task39_ReflectionDemo");
        Object obj = clazz.getDeclaredConstructor().newInstance();

        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method Name: " + m.getName());
        }

        Method method = clazz.getMethod("sayHello", String.class);
        method.invoke(obj, "Krrishpin");
    }
}
}
