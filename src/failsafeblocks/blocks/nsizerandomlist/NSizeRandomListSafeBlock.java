package failsafeblocks.blocks.nsizerandomlist;

import java.util.ArrayList;
import java.util.List;

import failsafeblocks.blocks.Block;
import failsafeblocks.blocks.SafeBlock;

public class NSizeRandomListSafeBlock extends SafeBlock<Integer, List<Integer>>{


	public NSizeRandomListSafeBlock() {
		super(new NSizeRandomListGeneratorV2(), new NSizeRandomListGeneratorV1());
	}

	@SafeVarargs
	public NSizeRandomListSafeBlock(Block<Integer, List<Integer>>... nSizeListBlocks) {
		super(nSizeListBlocks);
	}

	@Override
	protected List<Integer> fallbackOutput() {
		return new ArrayList<Integer>();
	}


}
