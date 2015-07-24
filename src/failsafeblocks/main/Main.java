package failsafeblocks.main;

import failsafeblocks.blocks.nsizerandomlist.NSizeRandomListSafeBlock;
import failsafeblocks.blocks.sort.SortSafeBlock;

public class Main {

	public static void main(String[] args) {
		NSizeRandomListSafeBlock nSizeListBlock = new NSizeRandomListSafeBlock();
		SortSafeBlock<Integer> sortSafeBlock = new SortSafeBlock<Integer>();

		System.out.println(nSizeListBlock.execute(21));
		System.out.println(sortSafeBlock.execute(nSizeListBlock.execute(21)));
	}

}
