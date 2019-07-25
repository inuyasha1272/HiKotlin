package 算法;

import java.util.*;

public class getDiffFromTwoArray {
//    private static  <T> List<T> getDiffFromList(List<T> list1, List<T> list2) {
//        List<T> diff = new ArrayList<>();
//        long start = System.currentTimeMillis();
//        Map<T, Integer> map = new HashMap<T, Integer>(list1.size() + list2.size());
//        List<T> maxList = list1;
//        List<T> minList = list2;
//        if (list2.size() > list1.size()) {
//            maxList = list2;
//            minList = list1;
//        }
//        for (T string : maxList) {
//            map.put(string, 1);
//        }
//        for (T string : minList) {
//            Integer count = map.get(string);
//            if (count != null) {
//                map.put(string, ++count);
//                continue;
//            }
//            map.put(string, 1);
//        }
//        for (Map.Entry<T, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == 1) {
//                diff.add(entry.getKey());
//            }
//        }
//        System.out.println("方法4 耗时：" + (System.currentTimeMillis() - start) + " 毫秒");
//        return diff;
//
//    }

    private static List<Integer> getDiffFrom2Array(int[] list1, int[] list2) {
        List<Integer> diff = new ArrayList<>();
        long start = System.currentTimeMillis();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(list1.length + list2.length);
        int[] maxList = list1;
        int[] minList = list2;
        if (list2.length > list1.length) {
            maxList = list2;
            minList = list1;
        }
        for (int position : maxList) {
            map.put(position, 1);
        }

        for (Integer position : minList) {
            Integer count = map.get(position);
            if (count != null) {
                map.put(position, ++count);
                continue;
            }
            map.put(position, 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                diff.add(entry.getKey());
            }
        }

        System.out.println("方法4 耗时：" + (System.currentTimeMillis() - start) + " 毫秒");
        return diff;

    }



    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4};
        Integer[] array2 = {2, 3, 4, 5, 6};
        ArrayList<Integer> positions = getBIPositions(Arrays.asList(array1), Arrays.asList(array2));

//        List<Integer> diff = getDiffFrom2Array(array1, array2);
        System.out.println(positions);
    }

    private static ArrayList<Integer> getBIPositions(int[] oldPositions, int[] newPositions) {
        if(newPositions == null){
            return null;
        }
        ArrayList<Integer> positions = new ArrayList<>();
        if(oldPositions == null){
            for (int i = 0; i < newPositions.length; i++) {
                positions.add(newPositions[i]);
            }
            return positions;
        }

        for (int i = 0; i < newPositions.length; i++) {
            int i1 = newPositions[i];
            boolean isDiff = true;
            for (int j = 0; j < oldPositions.length; j++) {
                if(i1 == oldPositions[j]){
                    isDiff = false;
                }
            }
            if(isDiff){
                positions.add(i1);
            }
        }
        return positions;
    }

    private static ArrayList<Integer> getBIPositions(List<Integer> oldPositions, List<Integer> newPositions) {
        if(newPositions == null){
            return null;
        }
        ArrayList<Integer> positions = new ArrayList<>();
        if(oldPositions == null){
            positions.addAll(newPositions);
            return positions;
        }

        for (int i = 0; i < newPositions.size(); i++) {
            int i1 = newPositions.get(i);
            if(!oldPositions.contains(i1)){
                positions.add(i1);
            }
        }
        return positions;
    }

}
