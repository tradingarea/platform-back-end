/* CopyRight UMF */
package com.tradingarea.major.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangyu
 * @date 2019/8/16 15:19
 */
public class ResUtil {

    public static Map<String, Object> resMap(int code, String msg, Object data) {
        return new HashMap<String, Object>(){{
            put("code", code);
            put("msg", msg);
            put("data", data);
        }};
    }

}
