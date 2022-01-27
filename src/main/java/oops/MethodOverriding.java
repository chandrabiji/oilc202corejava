package oops;

class CentralGovt {
	public void gst() {
		System.out.println("Central Govt GST");
	}
}
class StateGovt extends CentralGovt {
	public void gst() {
		System.out.println("Central Govt GST + State Govt GST");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		CentralGovt center = new CentralGovt();
		center.gst();
		
		StateGovt state = new StateGovt();
		state.gst();
		
		
	    CentralGovt tax = new StateGovt();
	    tax.gst();
	    
	 

	}

}
