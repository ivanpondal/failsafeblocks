package failsafeblocks.blocks.nsizerandomlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import failsafeblocks.blocks.Block;

public class NSizeRandomListBlockV1 implements Block<Integer, List<Integer>>{

	@Override
	public List<Integer> process(Integer n) {
		List<Integer> randomlyPopulatedList = new ArrayList<Integer>();
		Random random = new Random(42);

		for(int i = 0; i < n; i++){
			randomlyPopulatedList.add(random.nextInt(n));
		}

		return randomlyPopulatedList;
	}

}
