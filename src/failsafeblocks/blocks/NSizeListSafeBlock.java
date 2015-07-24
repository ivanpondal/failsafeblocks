package failsafeblocks.blocks;

import java.util.ArrayList;
import java.util.List;

public class NSizeListSafeBlock extends SafeBlock<Integer, List<Integer>>{
	@SafeVarargs
	public NSizeListSafeBlock(Block<Integer, List<Integer>>... nSizeListBlocks) {
		super(nSizeListBlocks);
	}

	@Override
	protected List<Integer> fallbackOutput() {
		return new ArrayList<Integer>();
	}


}
