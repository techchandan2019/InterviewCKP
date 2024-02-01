package com.neosoft.test;

public class DFXException extends RuntimeException {

	/*public DFXException() {
		super();
	}*/
	private String exname;
	public DFXException(String exname) {
		super(exname);
		this.exname=exname;
	}
	public String getExname() {
		return exname;
	}
	
}
/*class ABc{
	
	public static void main(String[] args) {
		throw new DFXException("abbaca");
	}
}
@ControllerAdvice
Class A{
	
	@ExceptionHandler(class=DFXException.class)
	public customError getMessage(DFXException dfx) {
		String msg=dfx.getExname();
		return new CustomeError("404",msg);
	}
	
}
class customError{
	String errorCode;
	String message;

	public customError(String errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.message = message;
	}
	
}*/

