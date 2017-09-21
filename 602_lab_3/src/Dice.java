
public class Dice
{
	private Die die1; // may plug in Die or subclass references here
	private Die die2;

	private int lastRoll;

	public Dice()
	{
		this(new Die(), new Die());
	}
	
	public Dice(Die d1, Die d2)
	{
		die1 = d1; // d1 is either instance of Die or a subclass of Die
		die2 = d2;

		this.roll();
	}

	public void roll()
	{
		die1.roll();
		die2.roll();

		this.lastRoll = die1.getLastRoll() + die2.getLastRoll();
	}

	public int getLastRoll()
	{
		return this.lastRoll;
	}

	public String toString()
	{
		return "A Dice object.";
	}

}
