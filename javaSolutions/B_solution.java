import java.util.*;  
public class B_solution{   
  int value(char r)   
  {   
    if (r == 'I')   
      return 1;   
    if (r == 'V')   
      return 5;   
    if (r == 'X')   
      return 10;   
    if (r == 'L')   
      return 50;   
    if (r == 'C')   
      return 100;   
    if (r == 'D')   
      return 500;   
    if (r == 'M')   
      return 1000;   
    return -1;   
  }   
  int convertRomanToInt(String s)   
  {   
    int total = 0;   
    for (int i=0; i<s.length(); i++)   
    {   
      int s1 = value(s.charAt(i));   
      
      if (i+1 <s.length())   
      {   
        int s2 = value(s.charAt(i+1));   
  
        if (s1 >= s2)   
        {   
          total = total + s1;   
        }   
        else  
        {   
          total = total - s1;   
        }   
      }   
      else  
      {   
        total = total + s1;   
      }   
    }   
    return total;   
  }   
   
  public static void main(String args[])   
  {   
    B_solution ans = new B_solution();  
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter capital roman number : ");  
        String str = sc.next(); 
        System.out.println("The Integer is: "+ans.convertRomanToInt(str));
    }   
  }   
}  

