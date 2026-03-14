import java.util.*;
public class Main
{
    
    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> list)
    {
        int left = 0;
        int right = list.size()-1;
        
        while (left< right)
        {
            int leftElem = list.get(left);
            int rightElem = list.get(right);
            
            list.set(left,rightElem);
            list.set(right,leftElem);
            
            left++;
            right--;
        }
        return list;
    }
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("ArrayList: "+list);
		
		System.out.println("Reversed ArrayList: "+reverseArrayList(list));
	}
}