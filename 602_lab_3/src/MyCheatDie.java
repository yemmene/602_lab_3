
public class MyCheatDie extends CrookedDie1
{
	// Lab 3e: add your own toString() below, returning
	// whatever you'd want

	public String toString()
	{
		return "I'd like an In-n-Out burger, please..." + this.getLastRoll(); // +
																				// super.toString();
	}
	// Lab 3f: add your own getLastRoll(), returning whatever you want
	
	public int getLastRoll()
	{
		return 1+ (super.getLastRoll() + 7) % 6;
	}
}
