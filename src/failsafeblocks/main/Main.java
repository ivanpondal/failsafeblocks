package failsafeblocks.main;

import failsafeblocks.blocks.nsizerandomlist.NSizeRandomListSafeBlock;
import failsafeblocks.blocks.sort.SortSafeBlock;

public class Main {

	public static void main(String[] args) {
		NSizeRandomListSafeBlock nSizeRandomListSafeBlock = new NSizeRandomListSafeBlock();
		SortSafeBlock<Integer> sortSafeBlock = new SortSafeBlock<Integer>();

		System.out.println(nSizeRandomListSafeBlock.execute(20));
		System.out.println(sortSafeBlock.execute(nSizeRandomListSafeBlock.execute(100)));
	}

}
