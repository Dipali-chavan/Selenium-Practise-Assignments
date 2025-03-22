package Selenium;

public class BasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 10;
		String name = "Dipali";
		char c = 'D';
		Double mm = 10.0;
		System.out.println(m);
		System.out.println(name);
		System.out.println(c);
		
		/*int[] arr = {10,20,30,40,50};
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		String[] namee = {"Dipali","Ram", "Sita"};
		for(String s : namee)
		{
			System.out.println(s);
		}
		for(int i=0;i<=namee.length;i++)
		{
			System.out.println(namee[i]);
		}
		*/
		int arr[] = {5,4,3,3,1};
        //System.out.println(arr[0]);
        //System.out.println(arr[4]);
        for(int i= arr.length ;i>=0;i++)
        {
            System.out.println(arr[i]);
        }
	}

}
