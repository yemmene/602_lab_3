
public abstract class AbstractDie
{
	private int lastRoll; // visibility could also be protected => access by
							// subclasses + same-package classes

	public AbstractDie()
	{
	}

	public int getLastRoll()
	{
		return this.lastRoll;
	}

	public void setLastRoll(int newRoll)
	{
		this.lastRoll = newRoll;
	}

	public abstract void roll(); // Lab 5-3: make this abstract
	// {
	// setLastRoll((int) (Math.random() * 6 + 1));
	// }

	public String toString()
	{
		return "A AbstractDie object.";
	}

}
