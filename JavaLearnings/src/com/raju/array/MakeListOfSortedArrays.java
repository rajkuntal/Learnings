package com.raju.array;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class MakeListOfSortedArrays {
	

	public List<int[]> sortHere(List<int[]> l, int[] a1, int[] a2, int[] a3) {
		
		l.add(a1);
		l.add(a2);
		l.add(a3);
		
		return l;
	}
	
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
	
	public List<Integer> join(List<int[]> list) {
		
		int[] a1 = {5,6,8,10};
		int[] a2 = {2,4,8,9};
		int[] a3 = {1,3,9,10};
		
        List<Integer> result = new ArrayList<>();
        int k = list.size();
        int[] arrIndexTrack = new int[k];
        int[] arrNumElement = new int[k];
        for (int i = 0; i < list.size(); i++) {
            arrNumElement[i] = list.get(i).length;
        }
        PriorityQueue<ArrayElement> heap = new PriorityQueue<>(k, new ElementComparator());
        for (int i = 0; i < list.size(); i++) {
        	System.out.println("First Element:"+list.get(i)[0]);
            heap.add(new ArrayElement(list.get(i)[0], i));
            arrNumElement[i]--;
            System.out.println("arrNumElement[i]: "+arrNumElement[i]);
        }
        while (!heap.isEmpty()) {
        	System.out.println("Queue :"+heap.element().data);
            ArrayElement curr = heap.poll();
            result.add(curr.data);
            System.out.println("curr.data :"+curr.data);
            int which = curr.whichArray;
            if (arrNumElement[which] != 0) {
            	System.out.println("which : " + which);
            	System.out.println("arrNumElement[which]:"+arrNumElement[which]);
                arrNumElement[which]--;
                System.out.println("arrIndexTrack[which] :" + arrIndexTrack[which]);
                arrIndexTrack[which]++;
                int index = arrIndexTrack[which];
                System.out.println("Index :" + index);
                ArrayElement next = new ArrayElement(list.get(which)[index], which);
                heap.add(next);
            }
        }
        return result;
    }

    public class ArrayElement {
        int data;
        int whichArray;

        ArrayElement(int d, int w) {
            data = d;
            whichArray = w;
        }
    }

    private class ElementComparator implements Comparator<ArrayElement> {
        @Override
        public int compare(ArrayElement o1, ArrayElement o2) {
            return o1.data - o2.data;
        }
}

	public static void main(String[] args) {
		
		List<int[]> l = new ArrayList<>();
		
		int[] a1 = {5,6,8,10};
		int[] a2 = {2,4,8,9};
		int[] a3 = {1,3,9,10};
		
		MakeListOfSortedArrays obj = new MakeListOfSortedArrays();
		
		l = obj.sortHere(l, a1, a2, a3);
		
		//List<Integer> ll = obj.mergeSortedArrays(l);
		
		List<Integer> ll = obj.join(l);
		
		System.out.println(ll);
		
	}
}
