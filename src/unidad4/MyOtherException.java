package unidad4;
//checked, porque hereda de exception, ioe sqle, awte todas checked, runtimee no checkeada
//suelen usarse de exception o runtime exception
public class MyOtherException extends Exception {

	public MyOtherException() {
		// TODO Auto-generated constructor stub
	}

	public MyOtherException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MyOtherException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public MyOtherException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MyOtherException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
