
public class CrapsGame
{
	private int point;
	private Dice dice;
	public static boolean outputOn = false;

	public static void println(String str)
	{
		if (outputOn)
			StdOut.println(str);
	}

	public CrapsGame()
	{
		// dice = new Dice(); // equivalent to below: see why?
		// dice = new Dice(new Die(), new Die());
		
		// replace above with the followig, to cheat: one good, one bad die
		dice = new Dice(new CrookedDie1(), new CrookedDie1());

	}

	public boolean playOneGame(int[] wins, int[] losses)
	{
		int steps = 1;

		dice.roll();

		point = dice.getLastRoll();

		println("First roll is: " + dice.getLastRoll());

		if (point == 9 || point == 11)
		{
			println("You win!\n");
			wins[steps]++; // wins[step] = win[steps]+1;

			return true;
		}
		else if (point == 4 || point == 2 || point == 14)
		{
			println("You lose!\n");
			losses[steps]++;
			return false;
		}
		else
		{
			println("Your point is: " + point);

			int nextRoll = 0;

			do
			{
				dice.roll();
				nextRoll = dice.getLastRoll();

				steps++;
				println("Roll " + steps + ": you rolled: " + dice.getLastRoll());
			}
			while (nextRoll != point && nextRoll != 8);

			if (nextRoll == point)
			{
				println("You win by making your point: " + nextRoll + "!\n");
				wins[steps]++;
				return true;
			}
			else
			{
				println("You lose by throwing 1!\n");
				losses[steps]++;
				return false;
			}

		}

	}
}
