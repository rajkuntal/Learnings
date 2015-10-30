package com.raju.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class SortAListofArrays {

	public List<Integer> mergeSortedArrays(List<int[]> input) {
        TreeMap<Integer, Integer> hash = new TreeMap<>();
        for (int[] arr : input) {
            for (int i : arr) {
                if (!hash.containsKey(i)) hash.put(i, 1);
                else {
                    hash.put(i, hash.get(i) + 1);
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (java.util.Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            int count = entry.getValue();
            while (count > 0) {
                list.add(entry.getKey());
                count--;
            }
        }
        return list;
    }
	
	public static void main(String[] args) {
		
		List<int[]> list = new ArrayList<>();
		int[] a1 = {2,4,5,8};
		int[] a2 = {1,3,7,8,10};
		int[] a3 = {4,8,9,11,13};
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		SortAListofArrays obj = new SortAListofArrays();
		List<Integer> res = obj.mergeSortedArrays(list);
		System.out.println("Sorted List :" + res);
		
	}
}
