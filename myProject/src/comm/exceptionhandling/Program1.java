package comm.exceptionhandling;

public class Program1 {

	public static void main(String[] args) {

		String str = "welcome2 Hello1 vcube4 to3 ";
		String[] res = str.split(" ");
		String result = "";
		int n = 1;
		for (String s : res) {
			for (String g : res) {
				if (g.contains(n + "")) {
					result += g.replace(n + "", " ");
					n++;
				}
			}
		}
		System.out.println(result);

	}

}
