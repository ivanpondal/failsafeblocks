package failsafeblocks.blocks.nsizerandomlist;

import java.util.ArrayList;
import java.util.List;

import failsafeblocks.blocks.Block;

public class NSizeRandomListGeneratorV2 implements Block<Integer, List<Integer>>{

	@Override
	public List<Integer> process(Integer n) {
		List<Integer> randomlyPopulatedList = new ArrayList<Integer>();

		for(int i = 0; i < n; i++){
			randomlyPopulatedList.add((int)(Math.random()*n));
		}

		return randomlyPopulatedList;
	}

}
