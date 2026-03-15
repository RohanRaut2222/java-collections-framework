import java.util.*;

public class SecondHighestElementInArrayList
{
    public static void main(String args[])
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(12);
        al.add(10);
        al.add(9);
        al.add(22);
        al.add(8); 

        Collections.sort(al);
        System.out.println(al.get(al.size()-2));
    }
}