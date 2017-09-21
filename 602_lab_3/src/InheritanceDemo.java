// A minor change!
public class InheritanceDemo
{
	/**
	 * Part of Lab 3, 602-01 Fall 2017:
	 * 
	 * Starting Java code for exploring inheritance, constructor chaining,
	 * overriding, and polymorphism ("dynamic method lookup")
	 * 
	 */
	
	public static void main(String[] args)
	{
		Die die1 = new Die();

		// Lab 3a:
		//
		// Add output (println()) code to last line of both Die and CrookedDie1
		// constructors, demonstrating constructor chaining from CrookedDie1 to
		// Die. 
		// 
		// Also run this code in the Eclipse Java debugger: set a breakpoint
		// on line above, then "Step Into" (F5) repeatedly, and observe the sequence of
		// statements. Continue this "Step Into" single-stepping through all of 
		// the remaining code.

		CrookedDie1 crooked1 = new CrookedDie1();

		// Lab 3b: 
		//
		// Modify Die so it no longer overrides toString() (comment it out); 
		// then note how when die1.toString() is called, Object's toString() is
		// executed

		StdOut.println(die1.toString());

		// Lab 3c: 
		// 
		// Modify CrookedDie1's toString() so it returns its
		// superclass's toString(), concatenated to the current String value it
		// returns. (Use super.toString() inside of CrookedDie1's toString()...)

		StdOut.println(crooked1.toString());

		// Lab 3d:
		// 
		// Demonstrate dynamic method lookup by randomly passing
		// either die1 or crooked1 to the describe(..) method below (no mod
		// needed). Clear all breakpoints, then set one on the statement below,
		// and repeat Step Into through describe() call.

		Die whatIsThis = (Math.random() < 0.5) ? die1 : crooked1;

		describe("Can we ever determine the actual type of whatsThis at runtime! ", whatIsThis);

		// Lab 3e:
		//
		// Add your own toString() to MyCheatDie, make it a subclass
		// of CrookedDie1, then create an instance of MyCheatDie and invoke
		// toString() against it.

		MyCheatDie cheat1 = new MyCheatDie();

		StdOut.println(cheat1.toString());
		StdOut.println(cheat1 + " -- yum!"); // treating a ref as a String?
											// automatic toString()!

		// Lab 3f: 
		//
		// Override getNextRoll() in MyCheatDie (have it return
		// any reasonable value you wish), then repeat above.

		Die die2 = cheat1; // equivalent to (Die) cheat1: automatic upcasting

		StdOut.println(die2.getLastRoll());

		Die ad = new Die();
		ad.roll();
	}

	public static void describe(String msg, Die toDescribe)
	{
		StdOut.println(msg + "'" + toDescribe.toString() + "'");
	}

}
