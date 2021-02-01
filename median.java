import java.io.PrintStream;
import java.util.*;
//import java.List;

public class median {
  public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    System.out.println("Enter the numbers (enter a non-number to terminate): ");
    List<Integer> lists = new ArrayList<>();
    while (user.hasNextInt()) {
      lists.add(user.nextInt());
    }
    user.close();
    //System.out.println(lists.toString());

    //List<Integer> list = List.of(1, 56, 9, 7, 21, 2, 3, 12, 15, 19, 22, 45, 102, 99, 21);
    //List<Integer> lists = new ArrayList<>(list);
    lists.sort(null);


    System.out.println("Your numbers after sorting: "+lists);

    System.out.println("Total Number you entered: "+lists.size());

    System.out.println("Calculated median: " +medianCalculator(lists));
    
    try{
      PrintStream output = new PrintStream("median.txt");
      output.println("Your numbers after sorting: " + lists);
      output.println("Total Number you entered: " + lists.size());
      output.println("Calculated median: " + medianCalculator(lists));
      output.close();

    }catch(Exception e){
      e.getStackTrace();
    }
  }

  public static double medianCalculator(List<Integer> list) {
    double median = 0;
      if (list.size() % 2 != 0) {
        median = list.get(list.size() / 2);
      } else {
        //median = (double) ((list.get(list.size() / 2) + list.get(list.size() / 2 + 1)) / 2);
        median = (double)(list.get((list.size()-1) / 2) + list.get((list.size()-1) / 2 + 1)) / 2;
      }
    return median;
  }
}
