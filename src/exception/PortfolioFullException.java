package exception;

import org.algo.exception.PortfolioException;

public class PortfolioFullException extends PortfolioException
{
	public PortfolioFullException(String msg)
	{
		super(msg);
	}
}