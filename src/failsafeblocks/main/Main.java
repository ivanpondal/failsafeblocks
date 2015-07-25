package failsafeblocks.main;

import java.util.List;

import failsafeblocks.blocks.nsizerandomlist.NSizeRandomListSafeBlock;
import failsafeblocks.blocks.search.SearchInput;
import failsafeblocks.blocks.search.SearchSafeBlock;
import failsafeblocks.blocks.sort.SortSafeBlock;

public class Main {

	public static void main(String[] args) {
		NSizeRandomListSafeBlock nSizeRandomListSafeBlock = new NSizeRandomListSafeBlock();
		SortSafeBlock<Integer> sortSafeBlock = new SortSafeBlock<Integer>();
		SearchSafeBlock<Integer> searchSafeBlock = new SearchSafeBlock<Integer>();

		List<Integer> randomList = nSizeRandomListSafeBlock.execute(20);
		List<Integer> sortedList = sortSafeBlock.execute(randomList);

		System.out.println(randomList);
		System.out.println(sortedList);
		System.out.println(searchSafeBlock.execute(new SearchInput<Integer>(3, sortedList)));
	}

}
