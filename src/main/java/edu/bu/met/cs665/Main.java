package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Person;

import edu.bu.met.cs665.vendingmachine.VendingMachineController;

import org.apache.log4j.Logger;


public class Main {

  private static Logger logger = Logger.getLogger(Main.class);


  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    // Let us create an object of the Main class.
    Main m = new Main();
    
    logger.info(m.doIt());
    logger.trace("Trace Message!");
    logger.debug("Debug Message!");
    logger.info("Info Message!");
    logger.warn("Warn Message!");
    logger.error("Error Message!");
    logger.fatal("Fatal Message!");

    System.out.println();
    System.out.println();
    System.out.println();
    
    m.callVendingMachineController();
   
  }

  private void callVendingMachineController() {
    VendingMachineController order = new VendingMachineController();
    
    /* TESTS */

    /* placeCustomerOrder(int choice, int drink, int type, int milk, int sugar) */
    order.placeCustomerOrder(1,2,2,2,1);
    order.placeCustomerOrder(1,1,1,2,3);
    order.placeCustomerOrder(1,2,1,2,4);      /* Incorrect Input for sugar */
    order.placeCustomerOrder(1,3,1,2,3);      /* Incorrect Input for drink */
    order.placeCustomerOrder(1,1,1,4,3);      /* Incorrect Input for milk */

  }

  private String doIt() {
    Person student = new Person("John", "Doe");
    return student.getLastName() + ',' + student.getLastName();
  }

}
