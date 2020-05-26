package com.elvin.designmode.staticfactory;

public class SendFactory {
	/**
	 * This is not original design, added by myself.
	 */
	private SendFactory() {
	}
	
	public static ISender produceMail() {
		return new MailSender();
	}
	
	public static ISender produceSMS() {
		return new SMSSender();
	}

}
