package failsafeblocks.blocks;

public interface Block<INPUT, OUTPUT> {
	public OUTPUT process(INPUT input);
}
