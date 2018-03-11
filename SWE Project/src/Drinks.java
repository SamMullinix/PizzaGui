
public class Drinks
{

    // Variables **********************************************************************************************************************
    private int numberOfCokes;
    private int numberOfSprites;
    private int numberOfMountainDews;
    private int numberOfDietCokes;
    private double drinkPrice = 1.69;
    private double drinkSubtotal;

    // Constructors *******************************************************************************************************************

    Drinks()
    {

    }

    Drinks(int numberOfCokes, int numberOfSprites, int numberOfMountainDews, int numberOfDietCokes)
    {
        this.numberOfCokes = numberOfCokes;
        this.numberOfSprites = numberOfSprites;
        this.numberOfMountainDews = numberOfMountainDews;
        this.numberOfDietCokes = numberOfDietCokes;
        this.drinkSubtotal = calcDrinkSubtotal();
    }


    public double calcDrinkSubtotal()
    {
        drinkSubtotal = (this.numberOfCokes + this.numberOfSprites + this.numberOfMountainDews + this.numberOfDietCokes) * drinkPrice;
        return drinkSubtotal;
    }


    // Getters ************************************************************************************************************************

    public double getDrinkSubtotal() {
        return drinkSubtotal;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public int getNumberOfCokes() {
        return numberOfCokes;
    }

    public int getNumberOfSprites() {
        return numberOfSprites;
    }

    public int getNumberOfMountaintDews() {
        return numberOfMountainDews;
    }

    public int getNumberOfDietCokes() {
        return numberOfDietCokes;
    }

    public int getTotalNumberOfDrinks()
    {
        return this.numberOfCokes + this.numberOfDietCokes + this.numberOfMountainDews + this.numberOfSprites;
    }

    // Setters ************************************************************************************************************************

    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public void setNumberOfCokes(int numberOfCokes) {
        this.numberOfCokes = numberOfCokes;
    }

    public void setNumberOfSprites(int numberOfSprites) {
        this.numberOfSprites = numberOfSprites;
    }

    public void setNumberOfMountainDews(int numberOfMountainDews) {
        this.numberOfMountainDews = numberOfMountainDews;
    }

    public void setNumberOfDietCokes(int numberOfDietCokes) {
        this.numberOfDietCokes = numberOfDietCokes;
    }

}

