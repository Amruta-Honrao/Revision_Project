
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;





public class Date {

	public static boolean check()  {
		
		String str1 ="hello";
		String str2 = "olloh";
		
		Map<Character, Character> map1 =  new HashMap<Character, Character>();
		Map<Character, Character> map2 =  new HashMap<Character, Character>();

		if(str1.length() == str2.length())
			
		{
			for (int i =0; i< str1.length(); i++)
			{
				 char char1 = str1.charAt(i);
		         char char2 = str2.charAt(i);
				if (map1.containsKey(char1))
				{
					if (map1.get(char1) != char2)
					{
						return false;
					}
				
				}
				else 
				{
					map1.put(char1, char2);  // h ==o
											//  e ==l
				}
				
				if (map2.containsKey(char2))
				{
					if (map2.get(char2) != char1)
					{
						return false;
					}
								}
				else 
				{
				map2.put(char2, char1);	  //o==h
				}
			}
		}
		return true;

	}
	
	public static void main(String[] args) {
		
		Map<Character, Integer> map1 =  new HashMap<Character, Integer>();
		map1.put('c', 2);
		map1.put('d', 3);
		map1.put('e', 4);
		
		for (Map.Entry<Character, Integer> ent : map1.entrySet())
		{
			System.out.println("key is " + ent.getKey() + " value is " + ent.getValue());
		}
}
}
