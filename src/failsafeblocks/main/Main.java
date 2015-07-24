package failsafeblocks.main;

import failsafeblocks.blocks.nsizerandomlist.NSizeRandomListSafeBlock;

public class Main {

	public static void main(String[] args) {
		NSizeRandomListSafeBlock nSizeListBlock = new NSizeRandomListSafeBlock();
		System.out.println(nSizeListBlock.execute(21));
	}

}
