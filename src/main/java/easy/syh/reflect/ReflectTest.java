package easy.syh.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by syh on 2018/7/17.
 * Desc:
 */

public class ReflectTest {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("easy.syh.reflect.HalliLatte");
//            clazz.isPrimitive();
//            clazz.isArray();
//            clazz.isEnum();
//            clazz.isAnnotation();
//            clazz.isInterface();
            Constructor[] constructors = clazz.getConstructors();
            Constructor constructor = clazz.getConstructor();
            Object o = constructor.newInstance();
            System.out.println(o);

            Field desc = clazz.getField("desc");
//            Class<?> type = desc.getType(); //String.class
            desc.set(o," a cup latte");
            System.out.println(desc.get(o));
            System.out.println(o);
            Field num = clazz.getDeclaredField("num");
            num.setAccessible(true);
            num.set(o,"night");
            System.out.println(o);
            System.out.println(num.get(o));

            Method drink = clazz.getMethod("drink");
            Method drink1 = clazz.getMethod("drink", String.class);
            drink.invoke(o);
            drink1.invoke(o,"coffer");


            Object o1 = clazz.newInstance();
            System.out.println(o1);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
