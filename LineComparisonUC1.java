import java.util.Scanner;
class LineComparisonUC1
{
	public static void main(String args[])
	{
		System.out.println("Welcome to Line computation Program");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the co-ordinates of first point for First line: ");
		int x1=scanner.nextInt();
		int y1=scanner.nextInt();
		System.out.println("Enter the co-ordinates of second point for First line: ");
		int x2=scanner.nextInt();
		int y2=scanner.nextInt();
		float length;
		length = (float)Math.sqrt((Math.pow((x1 - x2), 2)) + (Math.pow((y1 - y2), 2)));
		System.out.println("Length of Line=" +length);

	}
}