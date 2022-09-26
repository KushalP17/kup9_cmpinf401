package classwork_9_19_22;

public class TallyCountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TallyCounter t = new TallyCounter();
		for(int i = 0; i<1023948; i++){
			t.click();
		}
		
		System.out.println(t.getCount());
	}

}
