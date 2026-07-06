//Logger Rate Limiter(LC 359)----Premium ki mkc
//Optimal-----Map DS -T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE
package Atlassian.Easy;

import java.util.HashMap;
import java.util.Map;

class Logger {

    private Map<String, Integer> map;

    public Logger() {
        map = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {

        if (!map.containsKey(message)) {
            map.put(message, timestamp);
            return true;
        }

        if (timestamp - map.get(message) >= 10) {
            map.put(message, timestamp);
            return true;
        }

        return false;
    }
}