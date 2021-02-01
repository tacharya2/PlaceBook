
//import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;
//import java.io.PrintStream;

class Hello {
  public static void main(String[] args) {
    List<Integer> list = List.of(1, 45, 19, 2, 3, 4, 12, 5, 6, 19, 7, 8, 9);
    List<Integer> lst = new ArrayList<>(list);
    lst.add(25);
    lst.sort(null);
    //System.out.println(lst.toString());
    int total = sum(lst);
    //System.out.println(total);

    try {
      PrintStream output = new PrintStream("outpt.txt");
      output.print("The sorted list is "+lst.toString());
      output.println(" with the total of " + total);
      //printf method
      
      output.close(); // Prevents resource leaks
    } catch (Exception e) {
      e.getStackTrace();
    }
  }

  static int total = 0;

  public static int sum(List<Integer> l) {
    for (int e : l) {
      total += e;
    }
    return total;
  }

}