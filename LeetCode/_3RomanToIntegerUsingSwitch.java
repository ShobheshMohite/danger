package LeetCode;

public class _3RomanToIntegerUsingSwitch {
  public static void main(String[] args) {

    String s = "IV";

    int ans = 0;

    for(int i = 0 ; i < s.length(); i++)
    {
      int current = getValue(s.charAt(i));
      int next =  (i < s.length() - 1) ? getValue(s.charAt(i+1)) : 0;

      if(current< next)
      {
        ans -= current;
      } else {
        ans += current;
      }
    }
    System.out.println(ans);
  }

  public static int getValue(char roman) {
    switch (roman) {
      case 'I':
        return 1;
      case 'V':
        return 5;
      case 'X':
        return 10;
      case 'L':
        return 50;
      case 'C':
        return 100;
      case 'D':
        return 500;
      case 'M':
        return 1000;
      default:
        throw new IllegalArgumentException("Invalid Input :  " + roman);
    }
  }

}
