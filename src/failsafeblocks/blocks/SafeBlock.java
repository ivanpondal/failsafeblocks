package failsafeblocks.blocks;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

public abstract class SafeBlock<INPUT, OUTPUT> {
	protected Queue<Block<INPUT, OUTPUT>> blocks = new ArrayDeque<Block<INPUT,OUTPUT>>();

	@SafeVarargs
	public SafeBlock(Block<INPUT, OUTPUT>... blocks) {
		Collections.addAll(this.blocks, blocks);
	}

	protected abstract OUTPUT fallbackOutput();

	public OUTPUT execute(INPUT input) {
		boolean finishedOperation = false;
		OUTPUT result = fallbackOutput();
		Queue<Block<INPUT, OUTPUT>> workingBlocks = blocks;

		while(!finishedOperation && !workingBlocks.isEmpty()){
			try{
				System.out.println("Attempting to procces " + workingBlocks.peek().getClass().getSimpleName() + " block...");
				result = workingBlocks.peek().process(input);
				finishedOperation = true;
			}
			catch(Exception e){
				System.out.println("Working block " + workingBlocks.peek().getClass().getSimpleName() + " failed!");
				System.out.println(e);
				result = fallbackOutput();
				workingBlocks.poll();
			}
		}

		return result;
	}
}
