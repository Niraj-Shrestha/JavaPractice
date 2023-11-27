package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Dog dog = new Dog("pop",2);

        Field[] fields = dog.getClass().getDeclaredFields();

        for(Field field : fields){
            if(field.getName().equals("name")){
                //using setAccessible true will access private fields
                field.setAccessible(true);
                field.set(dog,"test dog");
            }
        }

        System.out.println(dog.getName());

        Method[] methods = dog.getClass().getDeclaredMethods();

        for(Method method : methods){
            if(method.getName().equals("testPrivateMethod")){
                //using setAccessible true will access private method
                method.setAccessible(true);
                method.invoke(dog);
            }
        }
    }
}
