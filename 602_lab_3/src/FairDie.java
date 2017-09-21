
public class FairDie extends AbstractDie
{
	private int lastRoll;

	public FairDie()
	{
		// StdOut.println("In Die()");
		this.roll();
	}

	public FairDie(int firstValue)
	{
		// StdOut.println("In Die(int)");
		lastRoll = firstValue;
	}

	// public int getLastRoll()
	// {
	// return this.lastRoll;
	// }

	public void setLastRoll(int lastRoll) // expose this only to subclasses?
	{
		this.lastRoll = lastRoll;
	}

	public void roll()
	{
		setLastRoll((int) (Math.random() * 6 + 1));
	}

	public String toString() // can you change this to protected visiblity?
	{
		return "A FairDie object with lastRoll == " + this.getLastRoll() + super.toString();
		// does getLastRoll() *always* call the method above?
	}

	public String toString(int msg) // Overloading... but NOT overriding!
	{
		return msg + " -> " + this.toString();
	}

}
