package ex06array;

public class E07ForEachObjet
{
	public static void main(String[] args)
	{
		String[] strArr = new String[] {
				"자바는 재미",
				"자바는 유용",
				"그러나 어려움"
				
		};
		for(String e : strArr) {
			System.out.println(e);
		}
	}
}
