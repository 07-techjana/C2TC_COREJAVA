package com.tns.dayfourteen.synchronization;

public class DepositLimitExceedsException {

	public DepositLimitExceedsException()
	{
		super("Daily limit of Deposit is exceeded..");
	}
	public DepositLimitExceedsException(String message)
	{
		super(message);
	}

}
