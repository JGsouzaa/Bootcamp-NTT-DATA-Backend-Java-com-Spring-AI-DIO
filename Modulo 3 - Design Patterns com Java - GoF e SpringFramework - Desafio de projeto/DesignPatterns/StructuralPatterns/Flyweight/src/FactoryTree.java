import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;

public class FactoryTree {

    private static Map<String, TreeType> types =
            new HashMap<>();

    public static TreeType getType(
            String name,
            String color) {

        String key = name + "-" + color;

        if (!types.containsKey(key)) {

            types.put(
                    key,
                    new TreeType(name, color)
            );
        }

        return types.get(key);
    }
}
