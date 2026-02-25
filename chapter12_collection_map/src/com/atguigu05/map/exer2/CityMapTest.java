package com.atguigu05.map.exer2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * ClassName: CityMapTest
 * Package: com.atguigu05.map.exer2
 * Description:
 * 案例：二级联动
 * 将省份和城市的名称保存在集合中，当用户选择省份以后，二级联动，显示对应省份的地级市供用户选择。
 * 效果演示见课件。
 * 提示：如果输入的省份不正确，需要重新输入。 如果输入的城市不正确，需要重新输入。
 * @Author pluinyiasnhg
 * @Create 2026/2/19 19:49
 * @Version 1.0
 */
public class CityMapTest {
    public static void main(String[] args) {
        Map map = CityMap.model;
        Set keySet = map.keySet();
        for (Object province : keySet) {
            System.out.print(province + "\t\t");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        String[] cities = new String[0];        // 所在省份的各城市
        while (true) {
            System.out.println("请选择你所在的省份：");
            String myProvince = scanner.next();

            if (map.containsKey(myProvince)) {
                cities = (String[]) map.get(myProvince);
                for (String city : cities) {
                    System.out.print(city + "\t\t");
                }
                System.out.println();

                break;
            }

        }

        boolean isFlag = true;
        while (isFlag) {
            System.out.println("请选择你所在的城市：");
            String myCity = scanner.next();
            for (String city : cities) {
                if (city.equals(myCity)) {
                    System.out.println("信息登记完毕");
                    isFlag = false;
                }
            }
        }

        scanner.close();
    }
}

class CityMap{
    public static Map model = new HashMap();

    static {
        model.put("北京", new String[] {"北京"});
        model.put("辽宁", new String[] {"沈阳","盘锦","铁岭","丹东","大连","锦州","营口"});
        model.put("吉林", new String[] {"长春","延边","吉林","白山","白城","四平","松原"});
        model.put("河北", new String[] {"承德","沧州","邯郸","邢台","唐山","保定","石家庄"});
        model.put("河南", new String[] {"郑州","许昌","开封","洛阳","商丘","南阳","新乡"});
        model.put("山东", new String[] {"济南","青岛","日照","临沂","泰安","聊城","德州"});
    }

}
