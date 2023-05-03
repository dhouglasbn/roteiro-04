package problems;

import util.Util;

public class FloorBinarySearchImpl implements Floor {

	@Override
	public Integer floor(Integer[] array, Integer x) {
		this.quickSort(array);
		return this.floor(array, x, 0, array.length - 1);
	}

	public Integer floor(Integer[] array, Integer x, int left, int right) {
		if (left > right) {
			return -1;
		}
		
		int middle = left + (right - left) / 2;
		
		if (array[middle] == x) {
			return array[middle];
		} else if (array[middle] < x) {
			Integer rightFloor = floor(array, x, middle + 1, right);
			
			if (rightFloor == -1) {
	            return array[middle];
	        } else {
	            return rightFloor;
	        }
		} else {
			return floor(array, x, left, middle - 1);
		}
	}
	
	private void quickSort(Integer[] array) {
		this.quickSort(array, 0, array.length - 1);
	}
	
	private void quickSort(Integer[] array, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {
			int indexPivot = partition(array, leftIndex, rightIndex);
			quickSort(array, leftIndex, indexPivot - 1);
			quickSort(array, indexPivot + 1, rightIndex);	
		}
	}
	
        
	private int partition(Integer[] array, int left, int right) {
        Integer pivot = array[left];
        int i = left;

        for (int j = left + 1; j <= right; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                i+=1;
                Util.swap(array, i, j);
            }
        }

        // troca pivot (values[left]) com i.
        Util.swap(array, left, i);
        
        return i; 
    }
}
