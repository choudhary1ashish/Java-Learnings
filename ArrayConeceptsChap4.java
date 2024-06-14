package JavBasics;

public class ArrayConeceptsChap4 {

	public static void main(String[] args) {
//		String[] names = {"Ashish", "Rohan", "Mina" , "Minu", "Chotkin" , "BadkaChotkin"};
//		System.out.println(names[2]);
//		Length of Array
//	System.out.println(names.length);   
//	to print all the value of Array: USe for loop
	
//	for(int j=0; j<names.length; j++) {
//	System.out.println(names[j]);
//		}
	
	//          **********2.Object Array : Object is a class
	
//	Object[] ob = new Object[6];
//	ob[0] = "Ashish";
//	ob[1] = 2.25f;
//	ob[2] = "22";
//	ob[3] = "a";
//	ob[4] = "London";
//	ob[5] = "04/01/1995";
		Object[] Ashish = {"Ashish","Rohan","Mina","Minu", "Chotkin", "BadkaChotkin"};
//		System.out.println(Ashish.length);
//		for(int j = 0; j<Ashish.length; j++) {
//			System.out.println(Ashish[j]);
//		}
			
//			Display the array (for each loop) here we mentioned the Object as Array type
//		We can change the Object to String/int, if we had int or String Array type.
		for(Object element: Ashish) {
			System.out.println(element);
			
		}
		
	
//	System.out.println(ob[1]);
//	for(int j= 0; j<ob.length; j++) {
//		System.out.println(ob[j]);
//	}
	
	
	

	
	

	}

}
