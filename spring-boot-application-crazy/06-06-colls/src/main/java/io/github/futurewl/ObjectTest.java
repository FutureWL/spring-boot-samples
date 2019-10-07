package io.github.futurewl;

public class ObjectTest {

    public static void main(String[] args) {
        String[] arr1 = new String[]{"a", "b"};
        System.out.println(arr1.getClass().getComponentType());
        System.out.println(Object.class.isAssignableFrom(String.class));
    }

}
