package com.demo.algorithm.string;

import java.util.HashMap;
import java.util.Map;

public class StoneAndJerry {
    public int numJewelsInStones(String J, String S) {
        int jerry = 0;
        if(S.length()==0||J.length()==0){
            return jerry;
        }
        char[] jarr = J.toCharArray();
        char[] sarr =S.toCharArray();

        Map<Character,Integer> map = new HashMap<Character,Integer>(jarr.length);
        for(int i=0;i<jarr.length;i++){
            map.put(jarr[i],i);
        }

        for(int i=0;i<sarr.length;i++){
            if(map.containsKey(sarr[i])){
                jerry++;
            }
        }
        return  jerry;
    }
}
