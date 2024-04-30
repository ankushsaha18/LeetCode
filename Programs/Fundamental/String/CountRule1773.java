import java.util.ArrayList;
import java.util.List;

public class CountRule1773 {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        switch (ruleKey) {
            case "type":
                return count(items, 0, ruleValue, 0);
            case "color":
                return count(items, 1, ruleValue, 0);
            default:
                return count(items, 2, ruleValue, 0);
        }
    }

    public static int count(List<List<String>> item, int ruleIndex, String ruleValue, int currIndex) {
        if (item.size() == currIndex) {
            return 0;
        }
        if (item.get(currIndex).get(ruleIndex).equals(ruleValue)) {
            return 1 + count(item, ruleIndex, ruleValue, ++currIndex);
        }
        return count(item, ruleIndex, ruleValue, ++currIndex);
    }
}
