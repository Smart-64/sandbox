package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMain {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person person = new Person("Name", 10);
        Field field = Person.class.getDeclaredField("str");
        field.setAccessible(true);
        //System.out.println(field.get(person));

        Method method = Person.class.getDeclaredMethod("getString");
        method.setAccessible(true);
        method.invoke(person);
    }
}
