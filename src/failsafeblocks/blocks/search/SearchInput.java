package failsafeblocks.blocks.search;

import java.util.List;

public class SearchInput<T extends Comparable<T>> {
	private T item;
	private List<T> list;

	public SearchInput(T item, List<T> list) {
		this.item = item;
		this.list = list;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
}
