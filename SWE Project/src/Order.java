//first name, last name, subtotal,

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Order
{

    // Variables **********************************************************************************************************************

    private double subtotal;
    private String firstName;
    private String lastName;
    private String customerPhoneNumber;
    private int orderNumber;
    private boolean delivery = false;
    private String address;

    // Constructors *******************************************************************************************************************

    Order()
    {

    }

    public double subtotalCalc(Pizza myPizza, Drinks myDrinks)
    {
        subtotal = myPizza.getPizzaSubtotal() + myDrinks.getDrinkSubtotal();
        return (double)Math.round(subtotal * 100) / 100;
    }

    // Getters ************************************************************************************************************************

    public double getSubtotal() {
        return subtotal;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }
    public boolean isDelivery() {
        return delivery;
    }

    public String getAddress()
    {
        return address;
    }


    // Setters ************************************************************************************************************************

    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void setOrderNumber() {
        orderNumber = (int)(Math.random() * 1000) + 1;
    }
    
    public void orderOutputIO() throws IOException
    {
        File orderTable = new File("orderTable.txt");

        if(orderTable.exists())
        {
            FileWriter write = new FileWriter(orderTable, true);
            write.write("\n" + "%" + "\n" + this.customerPhoneNumber);   //1
            write.write("\n" + this.firstName);
            write.write("\n" + this.lastName);    //2
            write.write("\n" + this.address); //3
            write.write("\n" + this.delivery);        //4
            write.write("\n" + this.orderNumber);       //5
            write.write("\n" + this.subtotal + "\n");
            write.close();
        }

        else
        {
            try(PrintWriter output = new PrintWriter(orderTable))
            {
                output.print("\n" + "%" + "\n" + this.customerPhoneNumber);   //1
                output.print("\n" + this.firstName);
                output.print("\n" + this.lastName);    //2
                output.print("\n" + this.address); //3
                output.print("\n" + this.delivery);        //4
                output.print("\n" + this.orderNumber);       //5
                output.print("\n" + this.subtotal + "\n");
            }
            catch (IOException e)
            {
                System.exit(99);
            }
        }
    }


}



