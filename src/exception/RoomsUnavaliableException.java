package exception;

public class RoomsUnavaliableException extends Exception {

	public RoomsUnavaliableException(String s) {
		super(s);
	}
	public void AvailableRoom(boolean ans) throws RoomsUnavaliableException {
		if(ans==false) {
			throw new RoomsUnavaliableException("room not available");
		}
	}
}
