package failsafeblocks.blocks.sort;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MergeSortBlockTest {

	@Test
	public void testOrderedList() {
		List<Integer> input = Arrays.asList(1, 2, 3, 4);

		MergeSortBlock<Integer> mergeSortBlock = new MergeSortBlock<Integer>();

		assertEquals("[1, 2, 3, 4]", mergeSortBlock.process(input).toString());
	}

	@Test
	public void testUnorderedList(){
		List<Integer> input = Arrays.asList(4, 2, 1, 3);

		MergeSortBlock<Integer> mergeSortBlock = new MergeSortBlock<Integer>();

		assertEquals("[1, 2, 3, 4]", mergeSortBlock.process(input).toString());
	}

	@Test
	public void testUnevenSizeOrderedList(){
		List<Integer> input = Arrays.asList(1, 2, 3);

		MergeSortBlock<Integer> mergeSortBlock = new MergeSortBlock<Integer>();

		assertEquals("[1, 2, 3]", mergeSortBlock.process(input).toString());
	}

	@Test
	public void testUnvenSizeUnorderedList(){
		List<Integer> input = Arrays.asList(2, 3, 1);

		MergeSortBlock<Integer> mergeSortBlock = new MergeSortBlock<Integer>();

		assertEquals("[1, 2, 3]", mergeSortBlock.process(input).toString());
	}

}
