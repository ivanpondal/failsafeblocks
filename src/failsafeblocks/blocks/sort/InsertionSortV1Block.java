package failsafeblocks.blocks.sort;

import java.util.List;

import failsafeblocks.blocks.Block;

public class InsertionSortV1Block<T extends Comparable<T>> implements Block<List<T>, List<T>>{

	@Override
	public List<T> process(List<T> list) {

		for (int i = 1; i < list.size(); i++) {
			T valueToSort = list.get(i);
			int j = i;
			while (j > 0 && list.get(j - 1).compareTo(valueToSort) > 0) {
				list.set(j, list.get(j - 1));
				j--;
			}
			list.set(j, valueToSort);
		}

		return list;
	}

}
