package failsafeblocks.blocks.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import failsafeblocks.blocks.Block;

public class MergeSortBlock<T extends Comparable<T>> implements Block<List<T>, List<T>>{

	@Override
	public List<T> process(List<T> list) {
		return mergeSort(list);
	}

	private List<T> mergeSort(List<T> list){
		if(list.size() == 2){
			if(list.get(0).compareTo(list.get(1)) > 0){
				T swap = list.get(0);
				list.set(0, list.get(1));
				list.set(1, swap);
			}
		}
		else if(list.size() > 2){
			int m = list.size() / 2;
			List<T> leftSubList = (0 == m) ? Arrays.asList(list.get(0)) : list.subList(0, m + 1);
			List<T> rightSublist = (m + 1 == list.size() - 1) ? Arrays.asList(list.get(m + 1)) : list.subList(m + 1, list.size());
			list = join(mergeSort(leftSubList), mergeSort(rightSublist));
		}
		return list;
	}

	private List<T> join(List<T> leftSubList, List<T> rightSubList){
		List<T> mergedList = new ArrayList<T>();
		int i = 0;
		int j = 0;

		while(i < leftSubList.size() && j < rightSubList.size()){
			if(leftSubList.get(i).compareTo(rightSubList.get(j)) < 0){
				mergedList.add(leftSubList.get(i));
				i++;
			}
			else{
				mergedList.add(rightSubList.get(j));
				j++;
			}
		}

		List<T> remainingList = i == leftSubList.size() ? rightSubList : leftSubList;
		int k = i == leftSubList.size() ? j : i;

		while(k < remainingList.size()){
			mergedList.add(remainingList.get(k));
			k++;
		}
		return mergedList;
	}
}
