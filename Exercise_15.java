package SorteOpgaver.ch11.aske1208_a_11_15;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fifteen
{
    private int theMode;
    public Integer maxOccurences(List<Integer> list)
    {
        Map<Integer, Integer> map1 = new HashMap<>();

        for (int i = 0; i < list.size(); i++)
        {
            map1.put(i, list.get(i));
        }

        int value = 0;
        int frequency = 0;

        for (Map.Entry<Integer, Integer> m : map1.entrySet())
        {
            if (Collections.frequency(map1.values(), m.getValue()) > frequency)
            {
                frequency = Collections.frequency(map1.values(), m.getValue());
                value = m.getValue();
            }
        }

        return value;
    }
}
