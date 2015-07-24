package failsafeblocks.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NSizeRandomlyPopulatedListGenerator implements Block<Integer, List<Integer>>{

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
