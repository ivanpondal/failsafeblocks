package failsafeblocks.blocks.search;

import failsafeblocks.blocks.Block;
import failsafeblocks.blocks.SafeBlock;

public class SearchSafeBlock<T extends Comparable<T>> extends SafeBlock<SearchInput<T>, Boolean>{

	public SearchSafeBlock() {
		super(new BinarySearchBlock<T>(), new LinearSearchBlock<T>());
	}

	@SafeVarargs
	public SearchSafeBlock(Block<SearchInput<T>, Boolean>... blocks) {
		super(blocks);
	}
	@Override
	protected Boolean fallbackOutput() {
		return false;
	}

}
