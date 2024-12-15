package exception;

public class CustomerNotFoundException extends Exception {

	public CustomerNotFoundException(String s) {
		super(s);
	}
	public void verifyId(boolean ans) throws CustomerNotFoundException {
		if(ans==false) {
			throw new CustomerNotFoundException("customer not found");
		}
	}
}
