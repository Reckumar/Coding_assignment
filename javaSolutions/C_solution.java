import java.util.*; 
public class C_solution{  
public static void containAllLetters(String string)  
{  
string = string.toLowerCase();  
boolean allLetterPresent = true;  
for (char ch = 'a'; ch <= 'z'; ch++)   
{  
if (!string.contains(String.valueOf(ch)))   
{  
allLetterPresent = false;  
break;  
}  
}  
if (allLetterPresent)  
System.out.println("Pangram String");  
else  
System.out.println("Not a Pangram String");  
}  
public static void main(String args[])  
{  
try (Scanner sc = new Scanner(System.in)) {
    System.out.print("Enter a string: ");  
    String str= sc.next();  
    containAllLetters(str);
}  
}  
}  