package failsafeblocks.blocks.search;

import failsafeblocks.blocks.Block;

public class LinearSearchBlock<T extends Comparable<T>> implements Block<SearchInput<T>, Boolean>{

	@Override
	public Boolean process(SearchInput<T> searchInput) {
		for(T item : searchInput.getList()){
			if(item.compareTo(searchInput.getItem()) == 0){
				return true;
			}
		}
		return false;
	}

}
