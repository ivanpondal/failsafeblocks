package failsafeblocks.blocks.nsizerandomlist;

import java.util.ArrayList;
import java.util.List;

import failsafeblocks.blocks.Block;
import failsafeblocks.blocks.SafeBlock;

public class NSizeRandomListSafeBlock extends SafeBlock<Integer, List<Integer>>{


	public NSizeRandomListSafeBlock() {
		super(new NSizeRandomListV2Block(), new NSizeRandomListV1Block());
	}

	@SafeVarargs
	public NSizeRandomListSafeBlock(Block<Integer, List<Integer>>... blocks) {
		super(blocks);
	}

	@Override
	protected List<Integer> fallbackOutput() {
		return new ArrayList<Integer>();
	}


}
