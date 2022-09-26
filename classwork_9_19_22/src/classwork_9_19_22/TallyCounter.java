package classwork_9_19_22;

public class TallyCounter {
	private int count = 0;
	
	public void click() {
		count++;
	}
	
	public void reset() {
		count = 0;
	}
	
	public int getCount() {
		return count;
	}
	
	
}
