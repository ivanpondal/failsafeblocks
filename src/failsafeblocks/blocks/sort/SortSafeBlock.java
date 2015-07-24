package failsafeblocks.blocks.sort;

import java.util.ArrayList;
import java.util.List;

import failsafeblocks.blocks.Block;
import failsafeblocks.blocks.SafeBlock;

public class SortSafeBlock<T extends Comparable<T>> extends SafeBlock<List<T>, List<T>>{

	public SortSafeBlock() {
		super(new InsertionSortV1Block<T>());
	}

	@SafeVarargs
	public SortSafeBlock(Block<List<T>, List<T>>... blocks) {
		super(blocks);
	}

	@Override
	protected List<T> fallbackOutput() {
		return new ArrayList<T>();
	}

}
