import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {

    @Test
    public void test() {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        List<Object> objects = new ArrayList<>();
        List<?> wildcards = objects;
        objects = Collections.singletonList(strings);
        wildcards = strings;
        System.out.println(wildcards);
    }
}
