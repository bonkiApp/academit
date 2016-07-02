package ru.kibon.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RefClass {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("ru.kibon.reflection.TestClass1");
            System.out.println(c);

            Constructor constr = c.getConstructor(double.class, double.class);
            System.out.println(constr);

            TestClass1 newTestClass1 = new TestClass1(1.5, 6);

            Field firstField = c.getDeclaredField("x");
            System.out.println(firstField);

            Method firstMethod = c.getMethod("sum", double.class, double.class);
            System.out.println(firstMethod);

            firstField.setAccessible(true);

            firstField.setDouble(firstField, 4);
            System.out.println(firstField);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
