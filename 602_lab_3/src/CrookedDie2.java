
public class CrookedDie2 extends AbstractDie
{

	public CrookedDie2()
	{
		// StdOut.println("In CrookedDie2()");
	}

	public int getLastRoll()
	{
		return 3;
	}

	public void roll()
	{
		// do nothing...
	}

	public String toString()
	{
		return "A CrookedDie2 object, and... " + super.toString();
	}

}
