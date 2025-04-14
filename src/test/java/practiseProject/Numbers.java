package practiseProject;

import java.util.HashMap;
import java.util.Map;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int a[] = {5,1,7,4,9};
		
		int min = a[0];
		
		for(int i=1; i < a.length; i++) {
			if (a[i]>min) {
				min = a[i];
			}
		}
		System.out.println(min); */
		
		String s ="a2b3c2";
		
		for (int i=0; i< s.length(); i++) {
			
			if (Character.isAlphabetic(s.charAt(i))) {
				System.out.println(s.charAt(i));
			} else {
				int n =Character.getNumericValue(s.charAt(i));
				for(int j =1;j<n;j++) {
					System.out.println(s.charAt(i-1));
				}
			}
			
		}
		
		String str = "java language";
		char c[] = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char d : c) {
			if (map.containsKey(d)) {
				map.put(d, map.get(d)+1);
			} else {
				map.put(d, 1);
			}
		}
		System.out.println(map);
	}

}
