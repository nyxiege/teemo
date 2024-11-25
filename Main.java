@FunctionalInterface
interface Addition
{
	int add(int a, int b);

}

public class Main
{
	public static void main(String[] args)
	{
		Addition addition = (i, j) -> {
			int y = 0;
			for(int x = i; x < j; x++) { y+=x;}
			return y; };

		System.out.println(addition.add(Integer.parseInt(args[0]), Integer.parseInt(args[1])));

	}

}