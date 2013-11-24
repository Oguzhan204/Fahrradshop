package de.shop.util;

/**
 * @author <a href="mailto:oguzhan.atmaca@web.de">Oguzhan Atmaca</a>
 */
public class NotFoundException extends RuntimeException {
	private static final long serialVersionUID = -866705588853138386L;

	public NotFoundException(String msg) {
		super(msg);
	}
	
	public NotFoundException(String msg, Throwable t) {
		super(msg, t);
	}
}
