package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    int count=0;
    int topping=0;
    int cheese=0;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg==true){
            System.out.println("Base Price Of The Pizza: 300");
            this.price=300;
        }
        else{
            System.out.println("Base Price Of The Pizza: 400");
            this.price=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        cheese++;
        if (cheese <= 1){
            System.out.println("Extra Cheese Added: 80");
            this.price += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        topping++;
        if(topping<=1) {
            if (isVeg) {
                System.out.println("Extra Toppings Added: 70");
                this.price += 70;

            } else {
                System.out.println("Extra Toppings Added: 120");
                this.price += 120;
            }

        }
    }

    public void addTakeaway(){
        // your code goes here
        count++;
        if(count<=1) {
            System.out.println("Paper bag Added: 20");


            this.price += 20;
        }


    }

    public String getBill(){
        // your code goes here
        this.bill= Integer.toString(this.price);
        return "Total Price: "+ this.bill;
    }
}