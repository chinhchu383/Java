package MAP;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tremap {
    public static void main(String[] args) {
        TreeMap<Integer, Double> treeMap = new TreeMap<>();
        treeMap.put(1, 9d);
        treeMap.put(7, 10.1d);
        treeMap.put(5, 15.02d);
        treeMap.put(19, 928.42d);
        System.out.println("cac phan tu trong treemap: ");
        Set<Map.Entry<Integer, Double>> setTreemap = treeMap.entrySet();
        System.out.println(treeMap);
        //thay khoa 4 co gia tri 9 thanh 19
        treeMap.replace(1, 19d);
        treeMap.replace(5, 15.02, 190d);
        System.out.println("cac phan tu sau khi thay the:");
        setTreemap = treeMap.entrySet();
        System.out.println(setTreemap);
    }
}
