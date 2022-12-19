import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test {

    private Map<String, Integer> testMap;

    public Test(Map<String, Integer> testMap) {
        this.testMap = testMap;
    }

    public Map<String, Integer> getTestMap() {
        return testMap;
    }

    public void setTestMap(Map<String, Integer> testMap) {
        this.testMap = testMap;
    }

    public void addTest(String s, Integer integer) {
        if (testMap.containsKey(s) && testMap.containsValue(integer)) {
            throw new IllegalArgumentException("такой ключ уже есть и значения совпадают");
        } else {
            testMap.put(s, integer);

        }
    }

}
