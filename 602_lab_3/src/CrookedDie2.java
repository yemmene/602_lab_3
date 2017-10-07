
public class CrookedDie2 extends Die
{

	public CrookedDie2()
	{
		
	}


	public void roll()
	{
		if (super.getLastRoll() == 6)
			setLastRoll(1);
		else
			setLastRoll(super.getLastRoll()+4);
	}
	
	public String toString()
	{
		return "A CrookedDie2 object, subclassing..." + super.toString();
	}

}
