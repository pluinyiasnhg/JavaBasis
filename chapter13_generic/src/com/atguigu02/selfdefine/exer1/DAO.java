package com.atguigu02.selfdefine.exer1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: DAO
 * Package: com.atguigu02.selfdefine.exer1
 * Description:
 * 定义个泛型类 DAO<T>，在其中定义一个Map 成员变量，Map 的键为 String 类型，值为 T 类型。
 *
 * 分别创建以下方法：
 * public void save(String id,T entity)： 保存 T 类型的对象到 Map 成员变量中
 * public T get(String id)：从 map 中获取 id 对应的对象
 * public void update(String id,T entity)：替换 map 中key为id的内容,改为 entity 对象
 * public List<T> list()：返回 map 中存放的所有 T 对象
 * public void delete(String id)：删除指定 id 对象
 * @Author pluinyiasnhg
 * @Create 2026/3/6 10:14
 * @Version 1.0
 */
public class DAO<T> {
    private Map<String, T> map;

    {
        map  = new HashMap<>();
    }

    public void save(String id, T entity) {
        if (!map.containsKey(id))
            map.put(id, entity);
    }

    public T get(String id) {
        if (map.containsKey(id))
            return map.get(id);
        return null;
    }

    public void update(String id,T entity) {
        if (map.containsKey(id))
            map.put(id, entity);
    }

    public List<T> list() {
        List<T> list = new ArrayList<>();
        for (Map.Entry<String, T> entry : map.entrySet()) {
            list.add(entry.getValue());
        }

        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }
}
