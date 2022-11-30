package com.driver;

//public class Pizza {
//
//    private int price;
//    private Boolean isVeg;
//    private String bill="";
//   Boolean isCheese=false;
//    Boolean isTopping=false;
//    Boolean isTakeaway=false;
//    Boolean BillGenerate=false;
//    public Pizza(Boolean isVeg){
//        this.isVeg = isVeg;
//        // your code goes here
//        if(this.isVeg==true){
//            this.price=300;
//        }
//        else{
//            this.price=400;
//        }
//        bill+="Base Price Of The Pizza:"+price+"\n";
//    }
//
//    public int getPrice(){
//        return this.price;
//    }
//
//    public void addExtraCheese() {
//        // your code goes here
//        if (!isCheese){
//            isCheese=true;
//            this.price += 80;
//            bill+="Extra Cheese Added:" + "80"+"\n";
//        }
//    }
//
//    public void addExtraToppings(){
//        // your code goes here
//
//        if(!isTopping) {
//            if (isVeg) {
//                isTopping=true;
//                bill+="Extra Toppings Added: 70"+"\n";
//                this.price += 70;
//
//            } else {
//                isTopping=true;
//                System.out.println("Extra Toppings Added: 120");
//                this.price += 120;
//            }
//
//        }
//    }
//
//    public void addTakeaway(){
//        // your code goes here
//        if(!isTakeaway) {
//            isTakeaway=true;
//            bill+="Paper bag Added: 20"+"\n";
//            this.price += 20;
//        }
//
//
//    }
//
//    public String getBill(){
//        // your code goes here
//        if(!BillGenerate){
//            BillGenerate=true;
//            bill+="Total Price:"+ price+"\n";
//        }
//        return  this.bill;
//    }
public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill = "";
    private int extraToppings;
    private int extraCheese = 80;
    private int paperBag = 20;

    boolean visitedExtraCheese = false;
    boolean visitedExtraToppings = false;
    boolean visitedExtraBag = false;
    boolean billGenerated = false;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        if (isVeg)
            price = 300;
        else
            price = 400;

        bill += "Base Price Of The Pizza: " + price + "\n";
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (!visitedExtraCheese) {
            visitedExtraCheese = true;
            price += extraCheese;
            bill += "Extra Cheese Added: " + extraCheese + "\n";
        }
    }

    public void addExtraToppings() {
        if (!visitedExtraToppings) {
            visitedExtraToppings = true;
            if (isVeg)
                extraToppings = 70;
            else
                extraToppings = 120;

            price += extraToppings;
            bill += "Extra Toppings Added: " + extraToppings + "\n";
        }}
    public void addTakeaway() {
        if (!visitedExtraBag) {
            visitedExtraBag = true;
            price += paperBag;
            bill += "Paperbag Added: " + paperBag + "\n";
        }
    }

    public String getBill() {
        if (!billGenerated) {
            billGenerated = true;
            bill += "Total Price: " + price + "\n";

        }
        return this.bill;
}
}