package failsafeblocks.blocks;

import java.util.ArrayList;
import java.util.List;

public class NSizePopulatedListGenerator implements Block<Integer, List<Integer>>{

	@Override
	public List<Integer> process(Integer n) {
		List<Integer> populatedList = new ArrayList<Integer>();

		for(int i = 0; i < n; i++){
			populatedList.add(i);
		}

		return populatedList;
	}

}
