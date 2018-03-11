// Address, city, state, house number, first name, last name, phone, charge account, subdivision/highway, zip code

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Customer {

    // Variables ************************************************************************************************************************

    static int customerCount = 0;
    private String firstName;
    private String lastName;
    private String houseNumber;
    private String city;
    private String state;
    private String zipcode;
    private String subdivisionHighway;
    private String phoneNumber;
    private String streetAdress;
    private String chargeAccount;
    private int customerID;

    // Constructors ************************************************************************************************************************

    Customer() {
        customerCount++;
    }

    Customer(String firstName, String lastName, String houseNumber, String city, String state, String zipcode, String subdivisionHighway, String phoneNumber, String streetAdress, String chargeAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.houseNumber = houseNumber;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.subdivisionHighway = subdivisionHighway;
        this.phoneNumber = phoneNumber;
        this.streetAdress = streetAdress;
        this.chargeAccount = chargeAccount;
        customerCount++;
        this.customerID = customerCount;
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer("Joe", "Smith", "housenumber", "city", "state", "zipcode", "subdivision", "phone", "streetaddress", "chargeaccount");
    }

    // Getters ************************************************************************************************************************

    public int getCustomerID() {
        return customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getSubdivisionHighway() {
        return subdivisionHighway;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStreetAdress() {
        return streetAdress;
    }

    public String getChargeAccount() {
        return chargeAccount;
    }


    // Setters ************************************************************************************************************************


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setSubdivisionHighway(String subdivisionHighway) {
        this.subdivisionHighway = subdivisionHighway;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setStreetAdress(String streetAdress) {
        this.streetAdress = streetAdress;
    }

    public void setChargeAccount(String chargeAccount) {
        this.chargeAccount = chargeAccount;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public boolean setReturningCustomer() throws IOException {
        File customerTable = new File("customerTable.txt");

        if (customerTable.exists()) {
            try (Scanner scanner = new Scanner(customerTable)) {
                while (scanner.hasNextLine()) {
                    if (this.phoneNumber.equals(scanner.nextLine().trim())) {
                        this.firstName = scanner.nextLine();
                        this.lastName = scanner.nextLine();
                        this.houseNumber = scanner.nextLine();
                        this.city = scanner.nextLine();
                        this.state = scanner.nextLine();
                        this.zipcode = scanner.nextLine();
                        this.subdivisionHighway = scanner.nextLine();
                        this.streetAdress = scanner.nextLine();
                        this.chargeAccount = scanner.nextLine();
                        return true;
                    }
                }
            } catch (IOException e) {
                System.exit(99);
            }
        }
        return false;
    }

    public void addNewCustomer() throws IOException
    {
        File customerTable = new File("customerTable.txt");

        if(customerTable.exists())
        { ;
            FileWriter write = new FileWriter(customerTable, true);
            write.write("\n" + "%" + "\n" + this.phoneNumber);   //1
            write.write("\n" + this.firstName);
            write.write("\n" + this.lastName);    //2
            write.write("\n" + this.houseNumber); //3
            write.write("\n" + this.city);        //4
            write.write("\n" + this.state);       //5
            write.write("\n" + this.zipcode);
            write.write("\n" + this.subdivisionHighway);
            write.write("\n" + this.streetAdress);
            write.write("\n" + this.chargeAccount + "\n");
            write.close();
        }

        else
        {
            try(PrintWriter output = new PrintWriter(customerTable))
            {
                output.print("\n" + "%" + "\n" + this.phoneNumber);
                output.print("\n" + this.firstName);
                output.print("\n" + this.lastName);
                output.print("\n" + this.houseNumber);
                output.print("\n" + this.city);
                output.print("\n" + this.state);
                output.print("\n" + this.zipcode);
                output.print("\n" + this.subdivisionHighway);
                output.print("\n" + this.streetAdress);
                output.print("\n" + this.chargeAccount + "\n");
            }
            catch (IOException e)
            {
                System.exit(99);
            }
        }

    }

}


