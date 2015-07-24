package failsafeblocks.main;

import failsafeblocks.blocks.NSizeListSafeBlock;
import failsafeblocks.blocks.NSizePopulatedListGenerator;
import failsafeblocks.blocks.NSizeRandomlyPopulatedListGenerator;

public class Main {

	public static void main(String[] args) {
		NSizeListSafeBlock nSizeListBlock = new NSizeListSafeBlock(new NSizePopulatedListGenerator(), new NSizeRandomlyPopulatedListGenerator());
		System.out.println(nSizeListBlock.execute(21));
	}

}
