package failsafeblocks.blocks.search;

import java.util.List;

import failsafeblocks.blocks.Block;
public class BinarySearchBlock<T extends Comparable<T>> implements Block<SearchInput<T>, Boolean>  {

	@Override
	public Boolean process(SearchInput<T> input) {
		List<T> list = input.getList();
		T item = input.getItem();
		int low = 0;
		int high = list.size() - 1;

		while(high >= low) {
			int middle = (low + high) / 2;
				if(list.get(middle).compareTo(item) == 0) {
					return true;
				}
				if(list.get(middle).compareTo(item) < 0) {
					low = middle + 1;
				}
				if(list.get(middle).compareTo(item) > 0) {
					high = middle - 1;
				}
		}
		return false;
	}

}
