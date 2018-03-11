import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class PizzaGui extends Application {

    boolean creditCardBoolean = false;

    public void start(Stage primaryStage) {
        {

            // Variables
            // Create Customer Object
            Customer customer1 = new Customer();
            Pizza pizza1 = new Pizza();
            Order order1 = new Order();
            Drinks drinks1 = new Drinks();
            // Booelan for checking if customer entered credit card

            // Toggle Group for radio buttons
            final ToggleGroup pizzaSizeGroup = new ToggleGroup();
            final ToggleGroup crustTypeGroup = new ToggleGroup();
            final ToggleGroup deliveryOrCarryoutGroup = new ToggleGroup();

            // Create Images
            Image logo = new Image("Images/logo.png",977,731,true,true);
            Image smallerLogo = new Image("Images/logo.png",651,487,true,true);
            Image bottomLogo = new Image("Images/logoNoText.png",450,350,true,true);
            Image bottomLogoReturningCustomer = new Image("Images/logoNoText.png",450,350,true,true);
            Image smallerBottomLogoNoText = new Image("Images/logoNoText.png",350,250,true,true);
            Image pizzaBackgroundImage = new Image("Images/pizzabackground.png", 900, 900, true, true);
            Image cashBackgroundImage = new Image("Images/money.png", 900, 900, true, true);
            Image drinkBackgroundImage = new Image("Images/soda.png", 900, 900, true, true);
            Image creditCardBackgroundImage = new Image("Images/creditcard.png", 900, 900, true, true);
            Image userBackgroundImage = new Image("Images/user.png", 800, 800, true, true);

            // ImageViews
            ImageView logoView = new ImageView(logo);      // Create imageview for logo
            ImageView bottomLogoScene3 = new ImageView(bottomLogo);
            ImageView logoView2 = new ImageView(smallerLogo);
            ImageView bottomLogoReturningCustomerView = new ImageView(bottomLogoReturningCustomer);
            ImageView bottomMenu = new ImageView(smallerBottomLogoNoText);
            ImageView pizzaBackgroundImageView = new ImageView(pizzaBackgroundImage);
            ImageView cashBackgroundImageView = new ImageView(cashBackgroundImage);
            ImageView drinkBackgroundImageView = new ImageView(drinkBackgroundImage);
            ImageView creditBackgroundImageView = new ImageView(creditCardBackgroundImage);
            ImageView logoViewReceipt = new ImageView(logo);
            ImageView userBackgroundImageView = new ImageView(userBackgroundImage);

            // Carryout Imageview settings
            pizzaBackgroundImageView.setOpacity(.25);
            logoViewReceipt.setOpacity(.25);

            // Create Labels
            // Customer Signup Scene

            Label customerSignUp = new Label("New Customer Sign-Up");
            Label currentCustomerSignInLabel = new Label("Returning Customer Login");
            Label firstNameLabel = new Label("First Name:");
            Label lastNameLabel = new Label("Last Name:");
            Label streetNameLabel = new Label("Street Address:");
            Label houseNumberLabel = new Label("House Number:");
            Label cityLabel = new Label("City:");
            Label stateLabel = new Label("State:");
            Label zipLabel = new Label("Zip:");
            Label subhighwayLabel = new Label("Subdivion/Highway:");
            Label phoneLabel = new Label("Phone Number:");
            Label chargeLabel = new Label("Charge Account:");

            // Returning Customer Scene

            Label returningPhoneNumber = new Label("Phone Number:");
            Label returningCustomerError = new Label("");

            // Scene 5 Labels

            Label menuLabel = new Label("Menu");

            // Returning Customer Selection Scene Labels

            Label customerFoundLabel = new Label("Your Records have been found!");
            Label returningCustomerSignUp = new Label("New Customer Sign-Up");
            Label returningCurrentCustomerSignInLabel = new Label("Returning Customer Login");
            Label returningFirstNameLabel = new Label("First Name:");
            Label returningLastNameLabel = new Label("Last Name:");
            Label returningStreetNameLabel = new Label("Street Address:");
            Label returningHouseNumberLabel = new Label("House Number:");
            Label returningCityLabel = new Label("City:");
            Label returningStateLabel = new Label("State:");
            Label returningZipLabel = new Label("Zip:");
            Label returningSubhighwayLabel = new Label("Subdivion/Highway:");
            Label returningPhoneLabel = new Label("Phone Number:");
            Label returningChargeLabel = new Label("Charge Account:");

            // For Pizza Size
            Label pizzaSizeLabel = new Label("Select Pizza Size:");
            Label toppingsLabel = new Label("Toppings");
            Label numberOfPizzaLabel = new Label("Number of Pizzas:");
            Label crustTypeLabel = new Label("Crust Type:");

            // Carry Out Options Label
            Label deliveryOrCarryout = new Label("Will this order be a delivery or carryout?");
            Label deliveryText = new Label("Delivery");
            Label carryoutText = new Label("Carryout");
            Label startOrderText = new Label("Begin Ordering");

            // Payment Option Labels
            Label selectPaymentType = new Label("Select your form of payment");

            // Drinks Labels
            Label numberOfSpriteLabel = new Label("Sprite");
            Label numberOfCokeLabel = new Label("Coke");
            Label numberOfDietCokeLabel = new Label("Diet Coke");
            Label numberOfMountainDewLabel = new Label("Mountain Dew");
            Label selectYourDrinkLabel = new Label("Select the number of Drinks");

            // Credit Card Labels
            Label creditCardNumberTextLabel = new Label("Credit Card Number");
            Label creditCardNameTextLabel = new Label("Name on Credit Card");
            Label creditCardCVVLabel = new Label("CVV");
            Label creditCardExpirationLabel = new Label("Expiration Date (MMYY)");
            Label creditCardInputStatmentLabel = new Label("Credit Card Information");

            // Recipet Labels

            Label orderPlaced = new Label("Your order has been placed!");
            Label orderNumberReceiptScene = new Label("Order Number: ");
            Label orderNumberText = new Label("");

            // Label Styling
            customerSignUp.setStyle("-fx-font-size: 40px");
            currentCustomerSignInLabel.setStyle("-fx-font-size: 40px");
            returningPhoneNumber.setStyle("-fx-font-size: 30px");
            menuLabel.setStyle("-fx-font-size: 40px");

            // Scene 5 Label Styling
            numberOfPizzaLabel.setWrapText(true);

            // Returning Customer Label Styling
            returningCustomerError.setTextFill(Color.RED);

            // Returning Customer Success Scene Styling
            customerFoundLabel.setStyle("-fx-font-size: 40px");

            // Carryout Label Settings
            deliveryOrCarryout.setStyle("-fx-font-size: 40px");
            deliveryOrCarryout.setWrapText(true);
            deliveryText.setStyle("-fx-font-size: 25px");
            carryoutText.setStyle("-fx-font-size: 25px");
            startOrderText.setStyle("-fx-font-size: 35px");

            // Payment option Label Styling
            selectPaymentType.setStyle("-fx-font-size: 35px");

            // Drink
            selectYourDrinkLabel.setWrapText(true);
            numberOfSpriteLabel.setStyle("-fx-font-size: 25px");
            numberOfCokeLabel.setStyle("-fx-font-size: 25px");
            numberOfDietCokeLabel.setStyle("-fx-font-size: 25px");
            numberOfMountainDewLabel.setStyle("-fx-font-size: 25px");
            selectYourDrinkLabel.setStyle("-fx-font-size: 35px");

            // Credit Card Label Styling

            creditCardCVVLabel.setStyle("-fx-font-size: 25px");
            creditCardExpirationLabel.setStyle("-fx-font-size: 25px");
            creditCardInputStatmentLabel.setStyle("-fx-font-size: 35px");
            creditCardNameTextLabel.setStyle("-fx-font-size: 25px");
            creditCardNumberTextLabel.setStyle("-fx-font-size: 25px");

            // Recipet Label Styling
            orderPlaced.setStyle("-fx-font-size: 35px");
            orderPlaced.setWrapText(true);
            orderNumberReceiptScene.setStyle("-fx-font-size: 25px");
            orderPlaced.setWrapText(true);
            orderNumberText.setStyle("-fx-font-size: 20px");


            // Create TextFields
            // Customer Signup Input
            TextField firstNameTextField = new TextField();
            TextField lastNameTextField = new TextField();
            TextField streetNameTextField = new TextField();
            TextField houseNumberTextField = new TextField();
            TextField cityTextField = new TextField();
            TextField stateTextField = new TextField();
            TextField zipTextField = new TextField();
            TextField subhighwayTextField = new TextField();
            TextField phoneTextField = new TextField();
            TextField chargeTextField = new TextField();
            TextField returningPhoneNumberTextField = new TextField();
            // Scene 5 Textfields
            TextField numberOfPizzas = new TextField("0");

            // Drink Textfields

            TextField numberOfCoke = new TextField("0");
            TextField numberOfSprite = new TextField("0");
            TextField numberOfMountainDew = new TextField("0");
            TextField numberOfDietCoke = new TextField("0");

            // Credit Card Text Fields

            TextField creditCardNumberText = new TextField();
            TextField creditCardNameText = new TextField();
            TextField creditCardCVV = new TextField();
            TextField creditCardExpiration = new TextField();

            // Textfield Styling
            // Scene 5
            numberOfPizzas.setPrefColumnCount(3);
            numberOfPizzas.setAlignment(Pos.CENTER);

            // Drink Scene Styling

            numberOfCoke.setAlignment(Pos.CENTER);
            numberOfSprite.setAlignment(Pos.CENTER);
            numberOfDietCoke.setAlignment(Pos.CENTER);
            numberOfMountainDew.setAlignment(Pos.CENTER);

            // Credit Card Scene Field Styling

            creditCardCVV.setMaxWidth(45);
            creditCardExpiration.setMaxWidth(50);

            // Button CSS
            String  style= getClass().getResource("test.css").toExternalForm();

            // Create Buttons
            // Scene 1 Buttons
            Button clickAnywhere = new Button("Click Here to Continue");

            // Scene 2 Buttons
            Button goBack = new Button("Go Back");
            Button newCustomer = new Button("     New\nCustomer");
            Button returningCustomer = new Button("Returning\nCustomer");

            // Scene 3 Buttons
            Button returnMainMenu = new Button("Go Back");
            Button createAccount = new Button("Create\nAccount");

            // Scene 4 Buttons
            Button returnMainMenu2 = new Button("Go Back");
            Button continueReturningCustomer = new Button("Login");

            // Scene 5 Buttons
            Button additionalPizza = new Button("+");
            Button lessPizza = new Button("-");
            Button returnMainMenu3 = new Button("Go Back");
            Button pizzaMenuButton = new Button("Pizza");
            Button drinkMenuButton = new Button("Drinks");

            // Returning Customer Confirmation Buttons

            Button confirmReturningCustomerButton = new Button("Continue");

            // Carryout Scene Buttons
            Button carryOutGoBack = new Button("Go Back");
            Button beginOrder = new Button();
            Button proceedToCheckOut = new Button("Checkout");

            // Payment Buttons
            Button goBackPaymentButton = new Button("Go Back");
            Button selectCheck = new Button("Check");
            Button selectCredit = new Button("Credit Card");
            Button selectCash = new Button("Cash");

            // Drink Menu Buttons

            Button goBackDrinks = new Button("Go Back");
            Button additionalCoke = new Button("+");
            Button lessCoke = new Button("-");
            Button additionalSprite = new Button("+");
            Button lessSprite = new Button("-");
            Button additionalMountainDew = new Button("+");
            Button lessMountainDew = new Button("-");
            Button additionalDietCoke = new Button("+");
            Button lessDietCoke = new Button("-");

            // Credit Card Buttons

            Button goBackCreditCard = new Button("Go Back");
            Button continueToOrderSummaryCreditCard = new Button("Continue to Order Summary");

            // Final Order Scene Buttons

            Button goBackFromOrder = new Button("Go Back");
            Button finalizeOrder = new Button("Submit My Order");

            // Close program button

            Button exitProgram = new Button("Complete");

            // Button Styling
            // Main Menu buttons
            clickAnywhere.setId("red-button");
            newCustomer.setId("green-button");
            returningCustomer.setId("green-button");
            returningCustomer.setMinSize(200,150);
            newCustomer.setMinSize(200,150);
            returningCustomer.setStyle("-fx-font-size: 25px");
            newCustomer.setStyle("-fx-font-size: 25px");

            // Continue new or returning customer
            createAccount.setMinSize(125, 75);
            continueReturningCustomer.setMinSize(125,75);
            createAccount.setId("red-button");

            // Scene 5 Buttons
            pizzaMenuButton.setId("round-red");
            drinkMenuButton.setId("round-red");
            pizzaMenuButton.setMinSize(300,75);
            drinkMenuButton.setMinSize(300,75);
            returnMainMenu3.setMinSize(30,20);
            proceedToCheckOut.setId("green-button");
            proceedToCheckOut.setMinSize(175,75);

            // Customer Confirmation Button Selection Styling
            confirmReturningCustomerButton.setId("round-red");
            confirmReturningCustomerButton.setMinSize(300,75);

            // Pick Carryout Buttons
            beginOrder.setId("round-cyan");
            beginOrder.setMinSize(300,75);
            beginOrder.setGraphic(startOrderText);

            // Payment Options Styling
            selectCheck.setId("round-red");
            selectCredit.setId("round-red");
            selectCash.setId("round-red");
            selectCash.setMinSize(200,200);
            selectCheck.setMinSize(200,200);
            selectCredit.setMinSize(200,200);

            // Credit Card buttons options
            continueToOrderSummaryCreditCard.setId("green-button");
            continueToOrderSummaryCreditCard.setMinSize(150,120);

            // Finalize order summary

            finalizeOrder.setMinSize(150,120);
            finalizeOrder.setId("round-cyan");

            // Button styling final scene

            exitProgram.setMinSize(150,120);
            exitProgram.setId("green-button");

            // Radio Buttons

            // Scene 5 Buttons
            RadioButton smallSizeButton = new RadioButton(" Small");
            RadioButton mediumSizeButton = new RadioButton("Medium");
            RadioButton largeSizeButton = new RadioButton(" Large");
            RadioButton thinCrustButton = new RadioButton("Thin Crust");
            RadioButton regularCrustButton = new RadioButton("Regular Crust");
            RadioButton deepDishCrustButton = new RadioButton("Deep Dish");

            // Carryout scene

            RadioButton carryout = new RadioButton();
            RadioButton delivery = new RadioButton();

            // Scene 5 Radio Button Options
            smallSizeButton.setSelected(true);
            smallSizeButton.setToggleGroup(pizzaSizeGroup);
            mediumSizeButton.setToggleGroup(pizzaSizeGroup);
            largeSizeButton.setToggleGroup(pizzaSizeGroup);

            regularCrustButton.setSelected(true);
            thinCrustButton.setToggleGroup(crustTypeGroup);
            regularCrustButton.setToggleGroup(crustTypeGroup);
            deepDishCrustButton.setToggleGroup(crustTypeGroup);

            // Radio button options for carryout Scene
            delivery.setGraphic(deliveryText);
            carryout.setGraphic(carryoutText);
            delivery.setSelected(true);
            carryout.setToggleGroup(deliveryOrCarryoutGroup);
            delivery.setToggleGroup(deliveryOrCarryoutGroup);

            // Checkboxes
            // Scene 5 Menu Topping Boxes
            CheckBox pepperoniCheckBox = new CheckBox("Pepperoni");
            CheckBox chickenCheckBox = new CheckBox("Chicken");
            CheckBox baconCheckBox = new CheckBox("Bacon");
            CheckBox pineappleCheckBox = new CheckBox("Pineapple");
            CheckBox onionCheckBox = new CheckBox("Onion");
            CheckBox oliveCheckBox = new CheckBox("Olives");
            CheckBox sausageCheckBox = new CheckBox("Sausage");
            CheckBox hamCheckBox = new CheckBox("Ham");

            // SCENE 1, Intro with logo ****************************************************************************************

            // StackPane for the first scene
            StackPane stackPane = new StackPane();
            stackPane.setStyle("-fx-background-color: peachpuff");      // Set Color of Scene 1
            stackPane.getChildren().add(logoView);


            // VBox, for the first scene
            VBox vBox1 = new VBox(20);
            vBox1.setAlignment(Pos.TOP_CENTER);
            vBox1.setPadding(new Insets(20,20,20,20));
            stackPane.getChildren().add(vBox1);
            Text clickContinue = new Text("  137C Mortimier Avenue\n  Rickson, Georgia 30137 \n         (404)137-1337");
            clickContinue.setStyle("-fx-font-size: 25px");
            vBox1.getChildren().add(clickContinue);
            vBox1.getChildren().add(clickAnywhere);

            // SCENE 2					   ********************************************************************************************
            // GridPane for second scene
            GridPane mainMenuGridPane = new GridPane();
            mainMenuGridPane.setStyle("-fx-background-color: peachpuff");      // Set Color of Scene 1
            mainMenuGridPane.setPadding(new Insets(10, 10, 10, 10));
            mainMenuGridPane.setPrefSize(1000,1000);
            mainMenuGridPane.setVgap(25);
            mainMenuGridPane.setHgap(50);
            ColumnConstraints column1 = new ColumnConstraints();
            column1.setPercentWidth(33);
            mainMenuGridPane.getColumnConstraints().add(column1);
            ColumnConstraints column2 = new ColumnConstraints();
            column2.setPercentWidth(33);
            mainMenuGridPane.getColumnConstraints().add(column2);
            ColumnConstraints column3 = new ColumnConstraints();
            column3.setPercentWidth(33);
            mainMenuGridPane.getColumnConstraints().add(column3);

            mainMenuGridPane.add(goBack,0 , 0);
            mainMenuGridPane.add(logoView2, 1, 1);
            mainMenuGridPane.add(newCustomer, 0, 2);
            mainMenuGridPane.add(returningCustomer, 2, 2);
            mainMenuGridPane.setHalignment(logoView2, HPos.CENTER);
            mainMenuGridPane.setHalignment(newCustomer, HPos.CENTER);
            mainMenuGridPane.setHalignment(returningCustomer, HPos.CENTER);
            mainMenuGridPane.setAlignment(Pos.TOP_CENTER);

            // SCENE 3 New Customer	********************************************************************************************

            GridPane newCustomerGridPane = new GridPane();

            newCustomerGridPane.setStyle("-fx-background-color: peachpuff");      // Set Color of Scene 1
            newCustomerGridPane.setPadding(new Insets(10, 10, 10, 10));
            newCustomerGridPane.setPrefSize(1000,1000);
            newCustomerGridPane.setVgap(25);
            newCustomerGridPane.setHgap(50);
            //newCustomerGridPane.setGridLinesVisible(true);

            // Add all the labels to the third scene
            newCustomerGridPane.add(firstNameLabel, 1, 1);
            newCustomerGridPane.add(lastNameLabel, 1, 2);
            newCustomerGridPane.add(houseNumberLabel, 1 , 3);
            newCustomerGridPane.add(cityLabel, 1 , 4);
            newCustomerGridPane.add(stateLabel, 1 , 5);
            newCustomerGridPane.add(zipLabel, 1 , 6);
            newCustomerGridPane.add(subhighwayLabel, 1 , 7);
            newCustomerGridPane.add(phoneLabel, 1 , 8);
            newCustomerGridPane.add(streetNameLabel, 1 , 9);
            newCustomerGridPane.add(chargeLabel, 1 , 10);
            newCustomerGridPane.add(firstNameTextField, 2, 1);
            newCustomerGridPane.add(lastNameTextField, 2, 2);
            newCustomerGridPane.add(houseNumberTextField, 2 , 3);
            newCustomerGridPane.add(cityTextField, 2, 4);
            newCustomerGridPane.add(stateTextField, 2 , 5);
            newCustomerGridPane.add(zipTextField, 2 , 6);
            newCustomerGridPane.add(subhighwayTextField, 2 , 7);
            newCustomerGridPane.add(phoneTextField, 2 , 8);
            newCustomerGridPane.add(streetNameTextField, 2 , 9);
            newCustomerGridPane.add(chargeTextField, 2 , 10);
            newCustomerGridPane.add(createAccount, 4, 5);
            newCustomerGridPane.add(returnMainMenu,0 , 0);
            newCustomerGridPane.add(customerSignUp, 2, 0);
            newCustomerGridPane.add(bottomLogoScene3,2,11);
            // Gripane centering
            newCustomerGridPane.setHalignment(customerSignUp, HPos.CENTER);
            newCustomerGridPane.setAlignment(Pos.TOP_CENTER);

            // Add all the textfields ot the third scene

            // SCENE 4 Existing Customer ***************************************************************************************

            GridPane returningCustomerGridPane = new GridPane();

            returningCustomerGridPane.setStyle("-fx-background-color: peachpuff");      // Set Color of Scene 1
            returningCustomerGridPane.setPadding(new Insets(10, 10, 10, 10));
            returningCustomerGridPane.setPrefSize(1000,1000);
            returningCustomerGridPane.setVgap(50);
            returningCustomerGridPane.setHgap(50);
            returningCustomerGridPane.setAlignment(Pos.TOP_LEFT);
            // Add children
            returningCustomerGridPane.add(currentCustomerSignInLabel, 1, 0);
            returningCustomerGridPane.add(returnMainMenu2,0 , 0);
            returningCustomerGridPane.add(returningPhoneNumber,1,5);
            returningCustomerGridPane.add(returningPhoneNumberTextField,1,6);
            returningCustomerGridPane.add(continueReturningCustomer, 2, 6);
            returningCustomerGridPane.add(bottomLogoReturningCustomerView, 1, 8);
            returningCustomerGridPane.add(returningCustomerError, 1, 7);
            returningCustomerGridPane.setHalignment(returningPhoneNumber, HPos.CENTER);
            returningCustomerGridPane.setHalignment(continueReturningCustomer, HPos.CENTER);
            returningCustomerGridPane.setHalignment(bottomLogoReturningCustomerView, HPos.CENTER);
            returningPhoneNumberTextField.setStyle("-fx-alignment: center");

            // Column Constraints Gripane 4
            ColumnConstraints column4 = new ColumnConstraints();
            column4.setPercentWidth(20);
            returningCustomerGridPane.getColumnConstraints().add(column4);

            // Scene 5 Menu ****************************************************************************************************

            GridPane orderingGridPane = new GridPane();    // Create gridPane for
            HBox pizzaIncrement = new HBox();       // Hbox for pizza increment buttons
            //orderingGridPane.setGridLinesVisible(true);

            // Create Seperator for Scene 5
            Separator dividePizzaAndToppings = new Separator();
            Separator dividePizzaInfo = new Separator();
            Separator dividePizzaAndDrinks = new Separator();

            // Seperator Settings
            dividePizzaInfo.setOrientation(Orientation.HORIZONTAL);
            dividePizzaAndToppings.setOrientation(Orientation.VERTICAL);
            dividePizzaAndDrinks.setOrientation(Orientation.HORIZONTAL);
            dividePizzaAndToppings.setStyle("-fx-background-color: black");
            dividePizzaInfo.setStyle("-fx-background-color: black");
            dividePizzaAndDrinks.setStyle("-fx-background-color: black");

            // Center, add and set tyling for the pizza increment box
            pizzaIncrement.setStyle("-fx-background-color: peachpuff");
            pizzaIncrement.getChildren().addAll(lessPizza, numberOfPizzas, additionalPizza);

            // Style GridePane5
            orderingGridPane.setStyle("-fx-background-color: peachpuff");      // Set Color of Scene 1
            orderingGridPane.setPadding(new Insets(10, 10, 10, 10));
            orderingGridPane.setPrefSize(1000,1000);
            orderingGridPane.setVgap(25);
            orderingGridPane.setHgap(25);
            orderingGridPane.setAlignment(Pos.TOP_LEFT);

            // Add and center children
            // Pizza Side
            orderingGridPane.add(pizzaIncrement, 2, 2);
            orderingGridPane.add(numberOfPizzaLabel, 1, 2);
            orderingGridPane.add(dividePizzaInfo, 1, 1, 4, 1);
            orderingGridPane.add(dividePizzaAndToppings, 3, 1, 1,11);
            orderingGridPane.add(dividePizzaAndDrinks,1,11,4,1 );
            orderingGridPane.add(pizzaMenuButton, 2, 0);
            orderingGridPane.add(drinkMenuButton, 4, 0);
            orderingGridPane.add(returnMainMenu3, 0, 0);
            orderingGridPane.add(crustTypeLabel, 1, 7);
            // Radio Buttons
            // Size Buttons
            orderingGridPane.add(pizzaSizeLabel, 1, 3);
            orderingGridPane.add(largeSizeButton, 2,6);
            orderingGridPane.add(mediumSizeButton, 2, 5);
            orderingGridPane.add(smallSizeButton, 2, 4);
            // Crust Buttons
            orderingGridPane.add(regularCrustButton, 2, 8);
            orderingGridPane.add(thinCrustButton, 2, 9);
            orderingGridPane.add(deepDishCrustButton, 2, 10);
            // Topping Side
            orderingGridPane.add(toppingsLabel, 4, 2);
            orderingGridPane.add(pepperoniCheckBox, 4, 3);
            orderingGridPane.add(baconCheckBox, 4, 4);
            orderingGridPane.add(sausageCheckBox, 4, 5);
            orderingGridPane.add(hamCheckBox, 4, 6);
            orderingGridPane.add(chickenCheckBox, 4, 7);
            orderingGridPane.add(oliveCheckBox, 4, 8);
            orderingGridPane.add(onionCheckBox, 4, 9);
            orderingGridPane.add(pineappleCheckBox, 4, 10);
            orderingGridPane.add(bottomMenu, 2, 12);
            orderingGridPane.add(proceedToCheckOut,4,12);
            // Gridpane children alignment
            orderingGridPane.setHalignment(returnMainMenu3, HPos.LEFT);
            orderingGridPane.setHalignment(drinkMenuButton, HPos.CENTER);
            orderingGridPane.setHalignment(pizzaMenuButton, HPos.CENTER);

            // Returning Customer Data Scene **********************************************************************************************************************

            StackPane returningCustomerBackgroundPane = new StackPane();
            GridPane returningCustomerSelectionPane = new GridPane();
            returningCustomerBackgroundPane.setAlignment(Pos.CENTER);
            returningCustomerBackgroundPane.getChildren().add(userBackgroundImageView);
            returningCustomerBackgroundPane.getChildren().add(returningCustomerSelectionPane);
            returningCustomerBackgroundPane.setStyle("-fx-background-color: peachpuff");      // Set Color of Scene 1
            userBackgroundImageView.setOpacity(.25);


            returningCustomerSelectionPane.setPadding(new Insets(10, 10, 10, 10));
            returningCustomerSelectionPane.setPrefSize(1000,1000);
            returningCustomerSelectionPane.setVgap(25);
            returningCustomerSelectionPane.setHgap(25);
            returningCustomerSelectionPane.setAlignment(Pos.TOP_LEFT);
            returningCustomerSelectionPane.getColumnConstraints().add(column1);
            returningCustomerSelectionPane.getColumnConstraints().add(column2);
            returningCustomerSelectionPane.getColumnConstraints().add(column3);

            returningCustomerSelectionPane.setHalignment(customerFoundLabel, HPos.CENTER);
            returningCustomerSelectionPane.setHalignment(confirmReturningCustomerButton, HPos.CENTER);
            customerFoundLabel.setWrapText(true);
            customerFoundLabel.setAlignment(Pos.CENTER);

            returningCustomerSelectionPane.add(customerFoundLabel, 1, 0);
            returningCustomerSelectionPane.add(confirmReturningCustomerButton, 1, 11);
            returningCustomerSelectionPane.add(returningFirstNameLabel, 1, 1);
            returningCustomerSelectionPane.add(returningLastNameLabel, 1, 2);
            returningCustomerSelectionPane.add(returningHouseNumberLabel, 1 , 3);
            returningCustomerSelectionPane.add(returningCityLabel, 1 , 4);
            returningCustomerSelectionPane.add(returningStateLabel, 1 , 5);
            returningCustomerSelectionPane.add(returningZipLabel, 1 , 6);
            returningCustomerSelectionPane.add(returningSubhighwayLabel, 1 , 7);
            returningCustomerSelectionPane.add(returningPhoneLabel, 1 , 8);
            returningCustomerSelectionPane.add(returningStreetNameLabel, 1 , 9);
            returningCustomerSelectionPane.add(returningChargeLabel, 1 , 10);


            // Carryout Scene **********************************************************************************************************************
            StackPane carryoutStackPane = new StackPane();
            GridPane carryOutGridPane = new GridPane();

            // Add StackPane Itmes and styles
            carryoutStackPane.setPrefSize(1000,1000);
            carryoutStackPane.setAlignment(Pos.CENTER);
            carryoutStackPane.getChildren().add(pizzaBackgroundImageView);
            carryoutStackPane.getChildren().add(carryOutGridPane);
            carryoutStackPane.setStyle("-fx-background-color: peachpuff");      // Set Color of Scene 1

            carryOutGridPane.setPadding(new Insets(10, 10, 10, 10));
            carryOutGridPane.setPrefSize(1000,1000);
            carryOutGridPane.setVgap(100);
            carryOutGridPane.setHgap(50);
            carryOutGridPane.getColumnConstraints().add(column1);
            carryOutGridPane.getColumnConstraints().add(column2);
            carryOutGridPane.getColumnConstraints().add(column3);

            // Add Children to Gridpane carryout

            carryOutGridPane.add(carryOutGoBack, 0, 0);
            carryOutGridPane.add(deliveryOrCarryout, 1, 1);
            carryOutGridPane.add(beginOrder, 1, 4);
            carryOutGridPane.add(carryout, 1,3);
            carryOutGridPane.add(delivery, 1, 2);


            // Drinks Menu ******************************************************************************************************

            StackPane drinksBackgroundPane = new StackPane();
            GridPane drinkOrderPane = new GridPane();

            HBox spriteHbox = new HBox(lessSprite, numberOfSprite, additionalSprite);
            HBox cokeHbox = new HBox(lessCoke, numberOfCoke, additionalCoke);
            HBox dietCokeHbox = new HBox(lessDietCoke, numberOfDietCoke, additionalDietCoke);
            HBox mountainDewHbox = new HBox(lessMountainDew, numberOfMountainDew, additionalMountainDew);

            drinksBackgroundPane.setAlignment(Pos.CENTER);
            drinksBackgroundPane.getChildren().add(drinkBackgroundImageView);
            drinksBackgroundPane.getChildren().add(drinkOrderPane);
            drinksBackgroundPane.setStyle("-fx-background-color: peachpuff");      // Set Color of Scene 1
            drinkBackgroundImageView.setOpacity(.25);

            drinkOrderPane.setPadding(new Insets(10, 10, 10, 10));
            drinkOrderPane.setPrefSize(1000,1000);
            drinkOrderPane.setVgap(50);
            drinkOrderPane.setHgap(25);
            drinkOrderPane.setAlignment(Pos.TOP_LEFT);
            drinkOrderPane.getColumnConstraints().add(column1);
            drinkOrderPane.getColumnConstraints().add(column2);
            drinkOrderPane.getColumnConstraints().add(column3);

            drinkOrderPane.add(selectYourDrinkLabel, 1, 0);
            drinkOrderPane.add(goBackDrinks, 0, 0);
            drinkOrderPane.add(numberOfSpriteLabel, 1, 1);
            drinkOrderPane.add(spriteHbox, 1, 2);
            drinkOrderPane.add(numberOfCokeLabel, 1, 4);
            drinkOrderPane.add(cokeHbox, 1, 5);
            drinkOrderPane.add(numberOfDietCokeLabel, 1, 7);
            drinkOrderPane.add(dietCokeHbox, 1, 8);
            drinkOrderPane.add(numberOfMountainDewLabel, 1, 10);
            drinkOrderPane.add(mountainDewHbox, 1, 11);



            // Payment Screen ****************************************************************************************************

            StackPane moneyBackgroundPane = new StackPane();
            GridPane paymentSelectionPane = new GridPane();
            moneyBackgroundPane.setAlignment(Pos.CENTER);
            moneyBackgroundPane.getChildren().add(cashBackgroundImageView);
            moneyBackgroundPane.getChildren().add(paymentSelectionPane);
            moneyBackgroundPane.setStyle("-fx-background-color: peachpuff");      // Set Color of Scene 1
            cashBackgroundImageView.setOpacity(.25);


            paymentSelectionPane.setPadding(new Insets(10, 10, 10, 10));
            paymentSelectionPane.setPrefSize(1000,1000);
            paymentSelectionPane.setVgap(25);
            paymentSelectionPane.setHgap(25);
            paymentSelectionPane.setAlignment(Pos.TOP_LEFT);
            paymentSelectionPane.getColumnConstraints().add(column1);
            paymentSelectionPane.getColumnConstraints().add(column2);
            paymentSelectionPane.getColumnConstraints().add(column3);

            paymentSelectionPane.add(goBackPaymentButton, 0, 0);
            paymentSelectionPane.add(selectPaymentType, 1,0);
            paymentSelectionPane.add(selectCash, 1,2);
            paymentSelectionPane.add(selectCheck, 1, 3);
            paymentSelectionPane.add(selectCredit, 1, 4);

            paymentSelectionPane.setHalignment(goBackPaymentButton, HPos.LEFT);
            paymentSelectionPane.setHalignment(selectPaymentType, HPos.CENTER);
            paymentSelectionPane.setHalignment(selectCheck, HPos.CENTER);
            paymentSelectionPane.setHalignment(selectCash, HPos.CENTER);
            paymentSelectionPane.setHalignment(selectCredit, HPos.CENTER);
            selectPaymentType.setWrapText(true);

            // Credit Card Info Scene ****************************************************************************************************
            StackPane creditCardBackgroundPane = new StackPane();
            GridPane creditCardInfoPane = new GridPane();
            creditCardBackgroundPane.setAlignment(Pos.CENTER);
            creditCardBackgroundPane.getChildren().add(creditBackgroundImageView);
            creditCardBackgroundPane.getChildren().add(creditCardInfoPane);
            creditCardBackgroundPane.setStyle("-fx-background-color: peachpuff");      // Set Color of Scene 1
            creditBackgroundImageView.setOpacity(.25);

            creditCardInfoPane.setPadding(new Insets(10, 10, 10, 10));
            creditCardInfoPane.setPrefSize(1000,1000);
            creditCardInfoPane.setVgap(35);
            creditCardInfoPane.setHgap(25);
            creditCardInfoPane.setAlignment(Pos.TOP_LEFT);
            creditCardInfoPane.getColumnConstraints().add(column1);
            creditCardInfoPane.getColumnConstraints().add(column2);
            creditCardInfoPane.getColumnConstraints().add(column3);

            creditCardInfoPane.add(goBackCreditCard, 0, 0);
            creditCardInfoPane.add(creditCardInputStatmentLabel, 1, 0);
            creditCardInfoPane.add(creditCardNameTextLabel, 1, 3);
            creditCardInfoPane.add(creditCardNameText, 2, 3);
            creditCardInfoPane.add(creditCardNumberTextLabel, 1, 4);
            creditCardInfoPane.add(creditCardNumberText, 2, 4);
            creditCardInfoPane.add(creditCardExpirationLabel, 1, 5);
            creditCardInfoPane.add(creditCardExpiration, 2, 5);
            creditCardInfoPane.add(creditCardCVVLabel, 1, 6);
            creditCardInfoPane.add(creditCardCVV, 2, 6);
            creditCardInfoPane.add(continueToOrderSummaryCreditCard, 1, 8);

            creditCardInfoPane.setHalignment(goBackCreditCard, HPos.LEFT);
            creditCardInputStatmentLabel.setWrapText(true);

            // Order Scene ****************************************************************************************************

            StackPane finalOrderBackgroundPane = new StackPane();
            GridPane finalOrderInfoPane = new GridPane();
            finalOrderBackgroundPane.setAlignment(Pos.CENTER);
            //finalOrderBackgroundPane.getChildren().add(creditBackgroundImageView);
            finalOrderBackgroundPane.getChildren().add(finalOrderInfoPane);
            finalOrderBackgroundPane.setStyle("-fx-background-color: peachpuff");      // Set Color of Scene 1
            creditBackgroundImageView.setOpacity(.25);

            finalOrderInfoPane.setPadding(new Insets(10, 10, 10, 10));
            finalOrderInfoPane.setPrefSize(1000,1000);
            finalOrderInfoPane.setVgap(35);
            finalOrderInfoPane.setHgap(25);
            finalOrderInfoPane.setAlignment(Pos.TOP_LEFT);
            finalOrderInfoPane.getColumnConstraints().add(column1);
            finalOrderInfoPane.getColumnConstraints().add(column2);
            finalOrderInfoPane.getColumnConstraints().add(column3);





            // Delivery or carryout

            // Order Number

            // Address is Delivery

            // Number and types of drinks

            // Number and types of pizza

            // Sub total

            // Receipt Scene *******************************************************************************************


            StackPane receiptBackgroundPane = new StackPane();
            GridPane receiptInfoPane = new GridPane();
            receiptBackgroundPane.setAlignment(Pos.CENTER);
            receiptBackgroundPane.getChildren().add(logoViewReceipt);
            //receiptBackgroundPane.getChildren().add(creditBackgroundImageView);
            receiptBackgroundPane.getChildren().add(receiptInfoPane);
            receiptBackgroundPane.setStyle("-fx-background-color: peachpuff");      // Set Color of Scene 1
            creditBackgroundImageView.setOpacity(.25);

            receiptInfoPane.setPadding(new Insets(10, 10, 10, 10));
            receiptInfoPane.setPrefSize(1000,1000);
            receiptInfoPane.setVgap(35);
            receiptInfoPane.setHgap(25);
            receiptInfoPane.setAlignment(Pos.TOP_LEFT);
            receiptInfoPane.getColumnConstraints().add(column1);
            receiptInfoPane.getColumnConstraints().add(column2);
            receiptInfoPane.getColumnConstraints().add(column3);


            // Create the scenes and add them to the primary stage ***************************************************************
            Scene startScreen = new Scene(stackPane, 1000, 1000);
            Scene mainMenu = new Scene(mainMenuGridPane, 1000,1000);
            Scene newCustomerScene = new Scene(newCustomerGridPane, 1000,1000);
            Scene returningCustomerScene = new Scene(returningCustomerGridPane, 1000,1000);
            Scene orderMenu = new Scene(orderingGridPane, 1000, 1000);
            Scene drinksOrder = new Scene(drinksBackgroundPane, 1000,1000);
            Scene carryoutOrDeliveryScene = new Scene(carryoutStackPane,1000,1000);
            Scene paymentScene = new Scene(moneyBackgroundPane, 1000, 1000);
            Scene creditCardInfoScene = new Scene(creditCardBackgroundPane, 1000,1000);
            Scene finalOrderScene = new Scene(finalOrderBackgroundPane, 1000, 1000);
            Scene receiptScene = new Scene(receiptBackgroundPane, 1000, 1000);
            Scene returningCustomerConfirmedScene = new Scene(returningCustomerBackgroundPane, 1000, 1000);

            // Spreadsheet Styles for CSS
            startScreen.getStylesheets().add(style);
            mainMenu.getStylesheets().add(style);
            newCustomerScene.getStylesheets().add(style);
            returningCustomer.getStylesheets().add(style);
            orderMenu.getStylesheets().add(style);
            carryoutOrDeliveryScene.getStylesheets().add(style);
            paymentSelectionPane.getStylesheets().add(style);
            creditCardInfoPane.getStylesheets().add(style);
            finalOrderScene.getStylesheets().add(style);
            receiptScene.getStylesheets().add(style);
            returningCustomerConfirmedScene.getStylesheets().add(style);

            primaryStage.setTitle("Grandpa Ricks Pizza");
            primaryStage.setScene(startScreen);
            primaryStage.show();


            // Event Handlers       ********************************************************************************************

            clickAnywhere.setOnAction(e -> {
                stackPane.getChildren().removeAll();
                primaryStage.setScene(mainMenu);
            });

            goBack.setOnAction(e -> {
                        mainMenuGridPane.getChildren().removeAll();
                        primaryStage.setScene(startScreen);
                    }
            );

            returnMainMenu.setOnAction(e -> {
                        primaryStage.setScene(mainMenu);
                    }
            );

            returnMainMenu2.setOnAction(e -> {
                        primaryStage.setScene(mainMenu);
                    }
            );

            newCustomer.setOnAction(e -> {
                mainMenuGridPane.getChildren().removeAll();
                primaryStage.setScene(newCustomerScene);
            });

            confirmReturningCustomerButton.setOnAction(event -> {
                primaryStage.setScene(carryoutOrDeliveryScene);
            });

            continueReturningCustomer.setOnAction(e -> {
                customer1.setPhoneNumber(returningPhoneNumberTextField.getText());
                try {
                    if (customer1.setReturningCustomer()) {
                        returningCustomerSelectionPane.add(new Label(customer1.getFirstName()), 2, 1);
                        returningCustomerSelectionPane.add(new Label(customer1.getLastName()), 2, 2);
                        returningCustomerSelectionPane.add(new Label(customer1.getHouseNumber()), 2 , 3);
                        returningCustomerSelectionPane.add(new Label(customer1.getCity()), 2 , 4);
                        returningCustomerSelectionPane.add(new Label(customer1.getState()), 2 , 5);
                        returningCustomerSelectionPane.add(new Label(customer1.getZipcode()), 2 , 6);
                        returningCustomerSelectionPane.add(new Label(customer1.getSubdivisionHighway()), 2 , 7);
                        returningCustomerSelectionPane.add(new Label(customer1.getPhoneNumber()), 2 , 8);
                        returningCustomerSelectionPane.add(new Label(customer1.getStreetAdress()), 2 , 9);
                        returningCustomerSelectionPane.add(new Label(customer1.getChargeAccount()), 2 , 10);
                        primaryStage.setScene(returningCustomerConfirmedScene);
                    }
                    else
                    {
                        returningCustomerGridPane.setHalignment(returningCustomerError, HPos.CENTER);
                        returningCustomerError.setText("Error in Account Creation");
                    }
                }
                catch (IOException e1)
                {
                    System.exit(99);
                }
            });

            createAccount.setOnAction(e -> {
                customer1.setCity(cityTextField.getText());
                customer1.setFirstName(firstNameTextField.getText());
                customer1.setLastName(lastNameTextField.getText());
                customer1.setCity(cityTextField.getText());
                customer1.setChargeAccount(chargeTextField.getText());
                customer1.setHouseNumber(houseNumberTextField.getText());
                customer1.setState(stateTextField.getText());
                customer1.setSubdivisionHighway(streetNameTextField.getText());
                customer1.setZipcode(zipTextField.getText());
                customer1.setSubdivisionHighway(subhighwayTextField.getText());
                customer1.setPhoneNumber(phoneTextField.getText());
                customer1.setStreetAdress(streetNameTextField.getText());
                try {
                    customer1.addNewCustomer();
                }
                catch (IOException e1)
                {
                    System.exit(99);
                }
                primaryStage.setScene(carryoutOrDeliveryScene);
            });

            returningCustomer.setOnAction(e -> {
                primaryStage.setScene(returningCustomerScene);
            });

            // Credit card info event handelers
            selectCredit.setOnAction(event -> {
                finalOrderInfoPane.getChildren().clear();
                finalOrderInfoPane.add(goBackFromOrder, 0 ,0);
                finalOrderInfoPane.add(new Label("Order Info"), 1, 0);
                finalOrderInfoPane.add(finalizeOrder, 1, 10);
                order1.setFirstName(customer1.getFirstName());
                order1.setLastName(customer1.getLastName());
                order1.setAddress(customer1.getHouseNumber() + " " + customer1.getStreetAdress());
                order1.setCustomerPhoneNumber(customer1.getPhoneNumber());
                order1.setDelivery(delivery.isSelected());
                order1.setOrderNumber();
                pizza1.calcPizzaSubtotal(pizza1.getSize(), pizza1.getQuantity());
                drinks1.calcDrinkSubtotal();
                if(delivery.isSelected()) {
                    finalOrderInfoPane.add(new Label("Type: Delivery"), 1, 1);
                    finalOrderInfoPane.add(new Label(order1.getAddress()), 1, 2);
                    finalOrderInfoPane.add(new Label("Name: " + order1.getFirstName() + " " + order1.getLastName()), 1, 3);
                    finalOrderInfoPane.add(new Label("Phone: " + order1.getCustomerPhoneNumber()), 1, 4);
                    finalOrderInfoPane.add(new Label(pizza1.getQuantity() + " " + pizza1.getSize() + " pizzas at $" + pizza1.getPizzaPrice() + " = $" + String.valueOf((double)Math.round((pizza1.getQuantity() * pizza1.getPizzaPrice() * 100)) / 100)), 1, 5);
                    finalOrderInfoPane.add(new Label(drinks1.getTotalNumberOfDrinks() + " drinks at $1.69 = $" + String.valueOf((double)Math.round((drinks1.getDrinkSubtotal() * 100)) / 100)), 1, 6);
                    finalOrderInfoPane.add(new Label("Subtotal: $" + order1.subtotalCalc(pizza1, drinks1)), 1, 7);
                }
                else
                {
                    finalOrderInfoPane.add(new Label("Type: Carryout"), 1, 1);
                    finalOrderInfoPane.add(new Label("Name: " + order1.getFirstName() + " " + order1.getLastName()), 1, 2);
                    finalOrderInfoPane.add(new Label("Phone: " + order1.getCustomerPhoneNumber()), 1, 3);
                    finalOrderInfoPane.add(new Label(pizza1.getQuantity() + " " + pizza1.getSize() + " pizzas * $" + pizza1.getPizzaPrice() + " = $" + String.valueOf((double)Math.round((pizza1.getQuantity() * pizza1.getPizzaPrice() * 100)) / 100)), 1, 4);
                    finalOrderInfoPane.add(new Label(drinks1.getTotalNumberOfDrinks() + " drinks at $1.69 = $" + String.valueOf((double)Math.round((drinks1.getDrinkSubtotal() * 100)) / 100)), 1, 5);
                    finalOrderInfoPane.add(new Label("Subtotal: $" + order1.subtotalCalc(pizza1, drinks1)), 1, 6);
                }
                setCreditCardBoolean(true);
                receiptInfoPane.getChildren().clear();
                receiptInfoPane.add(orderPlaced, 1, 0);
                receiptInfoPane.add(orderNumberReceiptScene, 1, 2);
                receiptInfoPane.add(exitProgram, 1, 8);
                receiptInfoPane.setHalignment(exitProgram, HPos.CENTER);
                receiptInfoPane.add(new Label(Integer.toString(order1.getOrderNumber())), 1, 4);
                primaryStage.setScene(creditCardInfoScene);
            });

            goBackCreditCard.setOnAction(event -> {
                primaryStage.setScene(paymentScene);
            });

            goBackFromOrder.setOnAction(event -> {
                if(creditCardBoolean)
                {
                    primaryStage.setScene(creditCardInfoScene);
                }
                else
                    primaryStage.setScene(paymentScene);
            });

            finalizeOrder.setOnAction(event -> {
                try {
                    order1.orderOutputIO();
                }
                catch (IOException e2)
                {
                    System.exit(99);
                }
                primaryStage.setScene(receiptScene);
            });

            selectCash.setOnAction(event -> {
                finalOrderInfoPane.getChildren().clear();
                finalOrderInfoPane.add(goBackFromOrder, 0 ,0);
                finalOrderInfoPane.add(new Label("Order Info"), 1, 0);
                finalOrderInfoPane.add(finalizeOrder, 1, 10);
                order1.setFirstName(customer1.getFirstName());
                order1.setLastName(customer1.getLastName());
                order1.setAddress(customer1.getHouseNumber() + " " + customer1.getStreetAdress());
                order1.setCustomerPhoneNumber(customer1.getPhoneNumber());
                order1.setDelivery(delivery.isSelected());
                order1.setOrderNumber();
                pizza1.calcPizzaSubtotal(pizza1.getSize(), pizza1.getQuantity());
                drinks1.calcDrinkSubtotal();
                if(delivery.isSelected()) {
                    finalOrderInfoPane.add(new Label("Type: Delivery"), 1, 1);
                    finalOrderInfoPane.add(new Label(order1.getAddress()), 1, 2);
                    finalOrderInfoPane.add(new Label("Name: " + order1.getFirstName() + " " + order1.getLastName()), 1, 3);
                    finalOrderInfoPane.add(new Label("Phone: " + order1.getCustomerPhoneNumber()), 1, 4);
                    finalOrderInfoPane.add(new Label(pizza1.getQuantity() + " " + pizza1.getSize() + " pizzas at $" + pizza1.getPizzaPrice() + " = $" + String.valueOf((double)Math.round((pizza1.getQuantity() * pizza1.getPizzaPrice() * 100)) / 100)), 1, 5);
                    finalOrderInfoPane.add(new Label(drinks1.getTotalNumberOfDrinks() + " drinks at $1.69 = $" + String.valueOf((double)Math.round((drinks1.getDrinkSubtotal() * 100)) / 100)), 1, 6);
                    finalOrderInfoPane.add(new Label("Subtotal: $" + order1.subtotalCalc(pizza1, drinks1)), 1, 7);
                }
                else
                {
                    finalOrderInfoPane.add(new Label("Type: Carryout"), 1, 1);
                    finalOrderInfoPane.add(new Label("Name: " + order1.getFirstName() + " " + order1.getLastName()), 1, 2);
                    finalOrderInfoPane.add(new Label("Phone: " + order1.getCustomerPhoneNumber()), 1, 3);
                    finalOrderInfoPane.add(new Label(pizza1.getQuantity() + " " + pizza1.getSize() + " pizzas * $" + pizza1.getPizzaPrice() + " = $" + String.valueOf((double)Math.round((pizza1.getQuantity() * pizza1.getPizzaPrice() * 100)) / 100)), 1, 4);
                    finalOrderInfoPane.add(new Label(drinks1.getTotalNumberOfDrinks() + " drinks at $1.69 = $" + String.valueOf((double)Math.round((drinks1.getDrinkSubtotal() * 100)) / 100)), 1, 5);
                    finalOrderInfoPane.add(new Label("Subtotal: $" + order1.subtotalCalc(pizza1, drinks1)), 1, 6);
                }
                setCreditCardBoolean(false);
                receiptInfoPane.getChildren().clear();
                receiptInfoPane.add(orderPlaced, 1, 0);
                receiptInfoPane.add(orderNumberReceiptScene, 1, 2);
                receiptInfoPane.add(exitProgram, 1, 8);
                receiptInfoPane.setHalignment(exitProgram, HPos.CENTER);
                receiptInfoPane.add(new Label(Integer.toString(order1.getOrderNumber())), 1, 4);
                primaryStage.setScene(finalOrderScene);
            });

            selectCheck.setOnAction(event -> {
                finalOrderInfoPane.getChildren().clear();
                finalOrderInfoPane.add(goBackFromOrder, 0 ,0);
                finalOrderInfoPane.add(new Label("Type: Order Info"), 1, 0);
                finalOrderInfoPane.add(finalizeOrder, 1, 10);
                order1.setFirstName(customer1.getFirstName());
                order1.setLastName(customer1.getLastName());
                order1.setAddress(customer1.getHouseNumber() + " " + customer1.getStreetAdress());
                order1.setCustomerPhoneNumber(customer1.getPhoneNumber());
                order1.setDelivery(delivery.isSelected());
                order1.setOrderNumber();
                pizza1.calcPizzaSubtotal(pizza1.getSize(), pizza1.getQuantity());
                drinks1.calcDrinkSubtotal();
                if(delivery.isSelected()) {
                    finalOrderInfoPane.add(new Label("Type: Delivery"), 1, 1);
                    finalOrderInfoPane.add(new Label(order1.getAddress()), 1, 2);
                    finalOrderInfoPane.add(new Label("Name: " + order1.getFirstName() + " " + order1.getLastName()), 1, 3);
                    finalOrderInfoPane.add(new Label("Phone: " + order1.getCustomerPhoneNumber()), 1, 4);
                    finalOrderInfoPane.add(new Label(pizza1.getQuantity() + " " + pizza1.getSize() + " pizzas at $" + pizza1.getPizzaPrice() + " = $" + String.valueOf((double)Math.round((pizza1.getQuantity() * pizza1.getPizzaPrice() * 100)) / 100)), 1, 5);
                    finalOrderInfoPane.add(new Label(drinks1.getTotalNumberOfDrinks() + " drinks at $1.69 = $" + String.valueOf((double)Math.round((drinks1.getDrinkSubtotal() * 100)) / 100)), 1, 6);
                    finalOrderInfoPane.add(new Label("Subtotal: $" + order1.subtotalCalc(pizza1, drinks1)), 1, 7);
                }
                else
                {
                    finalOrderInfoPane.add(new Label("Type: Carryout"), 1, 1);
                    finalOrderInfoPane.add(new Label("Name: " + order1.getFirstName() + " " + order1.getLastName()), 1, 2);
                    finalOrderInfoPane.add(new Label("Phone: " + order1.getCustomerPhoneNumber()), 1, 3);
                    finalOrderInfoPane.add(new Label(pizza1.getQuantity() + " " + pizza1.getSize() + " pizzas * $" + pizza1.getPizzaPrice() + " = $" + String.valueOf((double)Math.round((pizza1.getQuantity() * pizza1.getPizzaPrice() * 100)) / 100)), 1, 4);
                    finalOrderInfoPane.add(new Label(drinks1.getTotalNumberOfDrinks() + " drinks at $1.69 = $" + String.valueOf((double)Math.round((drinks1.getDrinkSubtotal() * 100)) / 100)), 1, 5);
                    finalOrderInfoPane.add(new Label("Subtotal: $" + order1.subtotalCalc(pizza1, drinks1)), 1, 6);
                }
                setCreditCardBoolean(false);
                receiptInfoPane.getChildren().clear();
                receiptInfoPane.add(orderPlaced, 1, 0);
                receiptInfoPane.add(orderNumberReceiptScene, 1, 2);
                receiptInfoPane.add(exitProgram, 1, 8);
                receiptInfoPane.setHalignment(exitProgram, HPos.CENTER);
                receiptInfoPane.add(new Label(Integer.toString(order1.getOrderNumber())), 1, 4);
                primaryStage.setScene(finalOrderScene);
            });

            continueToOrderSummaryCreditCard.setOnAction(event -> {
                primaryStage.setScene(finalOrderScene);
            });

            // Scene 5 Action handlers*******************************
            additionalPizza.setOnAction(e -> {
                numberOfPizzas.setText(String.valueOf(Integer.parseInt(numberOfPizzas.getText()) + 1));
            });

            lessPizza.setOnAction(e -> {
                if(Integer.parseInt(numberOfPizzas.getText()) > 0)
                {
                    numberOfPizzas.setText(String.valueOf(Integer.parseInt(numberOfPizzas.getText()) - 1));
                }
            });

            // Drink Scene Action Handlers **********************
            additionalSprite.setOnAction(event -> {
                numberOfSprite.setText(String.valueOf(Integer.parseInt(numberOfSprite.getText()) + 1));
            });

            lessSprite.setOnAction(e -> {
                if(Integer.parseInt(numberOfSprite.getText()) > 0)
                {
                    numberOfSprite.setText(String.valueOf(Integer.parseInt(numberOfSprite.getText()) - 1));
                }
            });

            additionalMountainDew.setOnAction(event -> {
                numberOfMountainDew.setText(String.valueOf(Integer.parseInt(numberOfMountainDew.getText()) + 1));
            });

            lessMountainDew.setOnAction(e -> {
                if(Integer.parseInt(numberOfMountainDew.getText()) > 0)
                {
                    numberOfMountainDew.setText(String.valueOf(Integer.parseInt(numberOfMountainDew.getText()) - 1));
                }
            });

            additionalDietCoke.setOnAction(event -> {
                numberOfDietCoke.setText(String.valueOf(Integer.parseInt(numberOfDietCoke.getText()) + 1));
            });

            lessDietCoke.setOnAction(e -> {
                if(Integer.parseInt(numberOfDietCoke.getText()) > 0)
                {
                    numberOfDietCoke.setText(String.valueOf(Integer.parseInt(numberOfDietCoke.getText()) - 1));
                }
            });

            additionalMountainDew.setOnAction(event -> {
                numberOfMountainDew.setText(String.valueOf(Integer.parseInt(numberOfMountainDew.getText()) + 1));
            });

            lessMountainDew.setOnAction(e -> {
                if(Integer.parseInt(numberOfMountainDew.getText()) > 0)
                {
                    numberOfMountainDew.setText(String.valueOf(Integer.parseInt(numberOfMountainDew.getText()) - 1));
                }
            });

            additionalCoke.setOnAction(event -> {
                numberOfCoke.setText(String.valueOf(Integer.parseInt(numberOfCoke.getText()) + 1));
            });

            lessCoke.setOnAction(e -> {
                if(Integer.parseInt(numberOfCoke.getText()) > 0)
                {
                    numberOfCoke.setText(String.valueOf(Integer.parseInt(numberOfCoke.getText()) - 1));
                }
            });

            // Go Back Buttons ************************
            goBackDrinks.setOnAction(event -> {
                primaryStage.setScene(orderMenu);
            });

            returnMainMenu3.setOnAction(e -> {
                        primaryStage.setScene(carryoutOrDeliveryScene);
                    }
            );

            beginOrder.setOnAction(e -> {
                        primaryStage.setScene(orderMenu);
                    }
            );

            carryOutGoBack.setOnAction(e -> {
                        primaryStage.setScene(mainMenu);
                    }
            );

            proceedToCheckOut.setOnAction(e -> {
                pizza1.setSize(String.valueOf(pizzaSizeGroup.getSelectedToggle().toString()));
                pizza1.setCrustType(String.valueOf(crustTypeGroup.getSelectedToggle()));
                pizza1.setQuantity(Integer.parseInt(numberOfPizzas.getText()));
                pizza1.setPineapple(pineappleCheckBox.isSelected());
                pizza1.setPepperoni(pepperoniCheckBox.isSelected());
                pizza1.setHam(hamCheckBox.isSelected());
                pizza1.setBacon(baconCheckBox.isSelected());
                pizza1.setOnion(onionCheckBox.isSelected());
                pizza1.setOlive(oliveCheckBox.isSelected());
                pizza1.setChicken(chickenCheckBox.isSelected());
                pizza1.setSausage(sausageCheckBox.isSelected());

                drinks1.setNumberOfCokes(Integer.parseInt(numberOfCoke.getText()));
                drinks1.setNumberOfDietCokes(Integer.parseInt(numberOfDietCoke.getText()));
                drinks1.setNumberOfMountainDews(Integer.parseInt(numberOfMountainDew.getText()));
                drinks1.setNumberOfSprites(Integer.parseInt(numberOfSprite.getText()));
                primaryStage.setScene(paymentScene);
            });

            goBackPaymentButton.setOnAction(e -> {
                        primaryStage.setScene(orderMenu);
                    }
            );

            drinkMenuButton.setOnAction(e -> {
                primaryStage.setScene(drinksOrder);
            });

            exitProgram.setOnAction(event -> {
                Receipt receipt = new Receipt(customer1.getFirstName(), customer1.getLastName(), order1.getSubtotal(), order1.isDelivery());
                receipt.printReceipt(pizza1.getQuantity(), pizza1.getSize(), pizza1, drinks1);
                System.exit(0);
            });


        }

    }
    public void setCreditCardBoolean(boolean tf)
    {
        creditCardBoolean = tf;
    }

    public static void main(String[] args)
    {
        Application.launch();
    }

}
























