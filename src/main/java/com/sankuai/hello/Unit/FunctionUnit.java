package com.sankuai.hello.Unit;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by yanhua on 2017/2/16.
 */
public class FunctionUnit {
    private final static Logger logger = LoggerFactory.getLogger(FunctionUnit.class);
    public void turn(){
        int num = 12345;
        int p;
        List<Integer> n = new ArrayList<Integer>();
        while (true){
            p = num / 10;
            if(p >0){
                n.add(num % 10);
                num = p;
                continue;
            }else{
                n.add(num % 10);
                break;
            }
        }
        System.err.println(n);
    }

    public void date(){
        Long time = System.currentTimeMillis() /1000;
        System.err.println(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.err.println(sdf.format(1449488363 * 1000l));
    }

    public void part(){
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<107; i++){
            list.add(i);
        }
        int limit = 8;
        int count = list.size() / limit + 1;
        List<Integer> part;
        for(int i = 0; i < count; i++){
            int to = (i + 1) * limit < list.size() ? (i + 1) * limit: list.size();
            part = list.subList(i * limit,to);
            System.err.println(part);
        }
    }

    public void list(){
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        List<Integer> b = new ArrayList<Integer>();
        b.add(2);
        b.add(4);
        b.add(null);
//        b.addAll(null);
        List<Integer> c = (List<Integer>) CollectionUtils.subtract(a,b);
        System.err.println(c);


    }

    public void map(){
        List<Integer> list = new ArrayList<Integer>();
        Map<String, List<Integer>> map = new HashedMap();
        map.put("12", list);
        list.add(123);
        System.err.println(map.get("12"));//[123]
//        list = null;
//        HashSet set = new HashSet(list);//err,list不能为空
//        System.err.println(set);
        Map<String, List<Integer>> map1 = new HashedMap();
        List<Integer> abc = map1.get("abc");
        System.err.println(abc);//null

    }

    public void  empty(){
        List<Integer> alist = null;
        int a = CollectionUtils.isEmpty(null)?0:alist.size();
        logger.error(Integer.toString(a));
    }

    public void system(){
        String url = System.getProperty("user.home") + System.getProperty("file.separator");
        System.err.println(url);
    }



    public static void main(String[] args){
        FunctionUnit unit = new FunctionUnit();

        unit.empty();
    }
}
