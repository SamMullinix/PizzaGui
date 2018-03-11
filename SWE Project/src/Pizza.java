// Then size, needs the crust type, needs the toppings, and quantity

// bacon, chicken, pineapple, pepperoni, sausage, olive, onions, ham

import java.text.DecimalFormat;

class Pizza
{

    // Variables **********************************************************************************************************************

    private String size;
    private String crustType;
    private int quantity;
    private boolean bacon = false;
    private boolean chicken = false;
    private boolean pineapple = false;
    private boolean pepperoni = false;
    private boolean sausage = false;
    private boolean olive = false;
    private boolean onion = false;
    private boolean ham = false;
    private double pizzaSubtotal;
    private double smallPrice = 7.68;
    private double mediumPrice = 9.08;
    private double largePrice = 11.24;
    private double pizzaPrice;
    DecimalFormat f = new DecimalFormat("##.00");

    // Constructor ************************************************************************************************************************

    Pizza(String size, String crustType,int  quantity)
    {
        this.size = size;
        this.crustType = crustType;
        this.quantity = quantity;
        pizzaSubtotal = calcPizzaSubtotal(this.size, this.quantity);
    }
    Pizza()
    {

    }

    public double calcPizzaSubtotal(String size, int quantity)
    {
        if (size == "small")
        {
            pizzaSubtotal = smallPrice * quantity;
        }
        else if (size == "medium")
        {
            pizzaSubtotal = mediumPrice * quantity;
        }
        else if (size == "large")
        {
            pizzaSubtotal = largePrice * quantity;
        }

        return (Math.round(pizzaSubtotal * 100)/100);
    }

    // Getters ************************************************************************************************************************

    public double getPizzaPrice()
    {
        return pizzaPrice;
    }

    public String getSize() {
        return size;
    }

    public double getPizzaSubtotal() {
        return pizzaSubtotal;
    }

    public String getCrustType() {
        return crustType;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isBacon() {
        return bacon;
    }

    public boolean isChicken() {
        return chicken;
    }

    public boolean isPineapple() {
        return pineapple;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public boolean isSausage() {
        return sausage;
    }

    public boolean isOlive() {
        return olive;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isHam() {
        return ham;
    }

    // Setters ************************************************************************************************************************

    public void setPrice()
    {
        if (this.size == "small")
        {
            pizzaPrice = smallPrice;
        }
        else if (this.size == "medium")
        {
            pizzaPrice = mediumPrice;
        }
        else if (this.size == "large")
        {
            pizzaPrice = largePrice;
        }
    }

    public void setSize(String size)
    {
        if(size.contains("Small"))
        {
            this.size = "small";
        }
        else if(size.contains("Medium"))
        {
            this.size = "medium";
        }
        else if(size.contains("Large"))
        {
            this.size = "large";
        }
        else
        {
            this.size = "broken";
        }
        setPrice();
    }

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public void setChicken(boolean chicken) {
        this.chicken = chicken;
    }

    public void setPineapple(boolean pineapple) {
        this.pineapple = pineapple;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public void setSausage(boolean sausage) {
        this.sausage = sausage;
    }

    public void setOlive(boolean olive) {
        this.olive = olive;
    }

    public void setOnion(boolean onions) {
        this.onion = onions;
    }

    public void setHam(boolean ham) {
        this.ham = ham;
    }
}