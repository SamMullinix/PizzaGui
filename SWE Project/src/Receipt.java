// Total, subtotal, tax, first name, last name, payment info, items

import java.text.DecimalFormat;

public class Receipt
{

    // Variables *************************************************************************************************************************

    private double subtotal;
    private double total;
    private double tax;
    private double taxRate = .06;
    private String firstName;
    private String lastName;
    private boolean delivery;
    private double deliveryFee = 3.00;
    DecimalFormat f = new DecimalFormat("##.00");

    // Constructor ************************************************************************************************************************

    Receipt(String firstName, String lastName, double subtotal, boolean delivery)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subtotal = (double)Math.round(subtotal * 100) / 100;
        this.delivery = delivery;
        this.tax = calcTax(subtotal);
        this.total = calcTotal(subtotal);
    }

    //****************************************** TEST CUSTOMER *****************************************************************************


    public static void main(String[] args)
    {
        /*
        Drinks drinks = new Drinks(1,1,1,1);
        Receipt customer1 = new Receipt("Justin", "Kelley", 19.99, true);
        //System.out.println(customer1.firstName + " " + customer1.lastName + "'s subtotal is $1. The total is: " + customer1.total);
        customer1.printReceipt(4, "small", pizza, drinks);
        */
    }



    // Calculations ************************************************************************************************************************

    public double calcTotal(double subtotal)
    {
        total = calcTax(subtotal) + subtotal;
        if(delivery == true)
        {
            total = total + deliveryFee;
        }
        else{}
        return (double)Math.round(total * 100) / 100;
    }

    public double calcTax(double subtotal)
    {
        tax = taxRate * subtotal;
        return (double)Math.round(tax * 100) / 100;
    }

    // Print Receipt ************************************************************************************************************************
    public void printReceipt(int pizzaQuantity, String pizzaSize, Pizza pizza, Drinks drink)
    {
        System.out.println("    Grandpa  Rick's   Pizza    ");
        System.out.println("      137C Mortimier Ave.      ");
        System.out.println("       Rickson, GA 30137       ");
        System.out.println("         (404)137-1337         ");
        System.out.println();
        System.out.println();

        // For loop for printing the items inside of the array of items purchased
        for(int count = 0; count < pizzaQuantity; count++)
        {
            System.out.println(pizzaSize + " pizza  --------------------- $" + pizza.getPizzaPrice());
        }

        for(int count = 0; count < drink.getNumberOfCokes(); count++) {

            if (drink.getNumberOfCokes() > 0)
            {
                System.out.println("Coke         --------------------- $" + drink.getDrinkPrice());
            }
        }

        for(int count = 0; count < drink.getNumberOfSprites(); count++) {

            if (drink.getNumberOfSprites() > 0)
            {
                System.out.println("Sprite       --------------------- $" + drink.getDrinkPrice());
            }
        }

        for(int count = 0; count < drink.getNumberOfMountaintDews(); count++) {

            if (drink.getNumberOfMountaintDews() > 0)
            {
                System.out.println("Mountain Dew --------------------- $" + drink.getDrinkPrice());
            }
        }

        for(int count = 0; count < drink.getNumberOfDietCokes(); count++) {

            if (drink.getNumberOfDietCokes() > 0)
            {
                System.out.println("Diet Coke    --------------------- $" + drink.getDrinkPrice());
            }
        }

        System.out.println();
        System.out.println("Subtotal     -- $" + f.format(subtotal));
        if(delivery == true)
        {
            System.out.println("Delivery Fee -- $" + f.format(deliveryFee));
        }
        System.out.println("Tax          -- $" + f.format(tax));
        System.out.println("Total        -- $" + f.format(total));
        System.out.println();
        System.out.println("Customer Signature -- ");
        System.out.println("_______________________________");
        System.out.println();
    }

}

