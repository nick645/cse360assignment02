package cse360assignment02;

public class AddingMachine {
  private int total;
  
  private String transactions = "0";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
    total = total + value;
    String newValue = Integer.toString(value);
    
    transactions = transactions + " + " + newValue;

}

  public void subtract (int value) {
  total = total - value;
    String newValue = Integer.toString(value);
  transactions = transactions + " - " + newValue;
}

  public String toString () {
    return transactions;


  }

  public void clear() {
      transactions = "0";
  }


}






