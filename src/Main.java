/*
Project: Team Project 1
Purpose Details: Car dealership
Course: IST 242
Author: Team 2
Date Developed: 6/2/19
Last Date Changed: 6/2/19
Revision: 1
*/

import java.util.ArrayList;

class Dealership{

    private String dealershipName;

    private String dealershipAddress;

    private int dealershipID;




    public String getDealershipName() {

        return dealershipName;

    }



    public void setDealershipName(String dealershipName) {

        this.dealershipName = dealershipName;

    }



    public String getDealershipAddress() {

        return dealershipAddress;

    }


    public void setDealershipAddress(String dealershipAddress) {

        this.dealershipAddress = dealershipAddress;

    }



    public int getDealershipID() {

        return dealershipID;

    }



    public void setDealershipID(int dealershipID) {

        this.dealershipID = dealershipID;

    }


    public String toString()

    {

        return String.format("%30s%30s%30d%30s\n", dealershipName, dealershipAddress, dealershipID);

    }

}

class Salesperson{

    private String salespersonName;

    private int salespersonPassword;

    private int salespersonID;




    public String getSalespersonName() {

        return salespersonName;

    }



    public void setSalespersonName(String salespersonName) {

        this.salespersonName = salespersonName;

    }



    public int getSalespersonPassword() {

        return salespersonPassword;

    }


    public void setSalespersonPassword(int salespersonPassword) {

        this.salespersonPassword = salespersonPassword;

    }



    public int getSalespersonID() {

        return salespersonID;

    }



    public void setSalespersonID(int salespersonID) {

        this.salespersonID = salespersonID;

    }


    public String toString()

    {

        return String.format("%30s%30s%30d%30s\n", salespersonName, salespersonPassword, salespersonID);

    }

}


class SalesLeads{

    private String leadName;

    private int leadID;

    private int numberSold;






    public String getLeadName() {

        return leadName;

    }



    public void setLeadName(String leadName) {

        this.leadName = leadName;

    }



    public int getLeadID() {

        return leadID;

    }


    public void setLeadID(int leadID) {

        this.leadID = leadID;

    }



    public int getNumberSold() {

        return numberSold;

    }



    public void setNumberSold(int numberSold) {

        this.numberSold = numberSold;

    }


    public String toString()

    {

        return String.format("%30s%30s%30d%30s\n", leadName, leadName, numberSold);

    }

}


class Customer{

    private String customerName;

    private int customerSSN;

    private int customerID;






    public String getCustomerName() {

        return customerName;

    }



    public void setCustomerName(String customerName) {

        this.customerName = customerName;

    }



    public int getCustomerSSN() {

        return customerSSN;

    }


    public void setCustomerSSN(int customerSSN) {

        this.customerSSN = customerSSN;

    }



    public int getCustomerID() {

        return customerID;

    }



    public void setCustomerID(int customerID) {

        this.customerID = customerID;

    }


    public String toString()

    {

        return String.format("%30s%30s%30d%30s\n", customerName, customerSSN, customerID);

    }

}

class Inventory {

    private String inventoryName;

    private int numberSold;

    private int inventoryID;




    public String getInventoryName() {

        return inventoryName;

    }



    public void setInventoryName(String inventoryName) {

        this.inventoryName = inventoryName;

    }



    public int getNumberSold() {

        return numberSold;

    }


    public void setNumberSold(int numberSold) {

        this.numberSold = numberSold;

    }



    public int getInventoryID() {

        return inventoryID;

    }



    public void setInventoryID(int inventoryID) {

        this.inventoryID = inventoryID;

    }


    public String toString()

    {

        return String.format("%30s%30s%30d%30s\n", inventoryName, numberSold, inventoryID);

    }

}


class Vehical extends Inventory {
    private String carMake;

    private String carModel;

    private int carID;




    public String getCarMake() {

        return carMake;

    }



    public void setCarMake(String carMake) {

        this.carMake = carMake;

    }



    public String getCarModel() {

        return carModel;

    }


    public void setCarModel(String carModel) {

        this.carModel = carModel;

    }



    public int getCarID() {

        return carID;

    }



    public void setCarID(int carID) {

        this.carID = carID;

    }


    public String toString()

    {

        return String.format("%30s%30s%30d%30s\n", carMake, carModel, carID);

    }

}

class Parts extends Inventory {
    private String partsName;

    private int partsSold;

    private int partsID;




    public String getPartsName() {

        return partsName;

    }



    public void setPartsName(String partsName) {

        this.partsName = partsName;

    }



    public int getPartsSold() {

        return partsSold;

    }


    public void setPartsSold(int partsSold) {

        this.partsSold = partsSold;

    }



    public int getPartsID() {

        return partsID;

    }



    public void setPartsID(int partsID) {

        this.partsID = partsID;

    }


    public String toString()

    {

        return String.format("%30s%30s%30d%30s\n", partsName, partsSold, partsID);

    }

}

public class Main {

    public static void main(String[] args) {

        Dealership one=new Dealership();

        one.setDealershipName("Cars4Sale");

        one.setDealershipAddress("123 Cars Road");

        one.setDealershipID(123456);

        System.out.println(one.getDealershipAddress() + " " + one.getDealershipName() + " " + one.getDealershipID());

        Salesperson two=new Salesperson();

        two.setSalespersonName("Sam");

        two.setSalespersonPassword(1111);

        two.setSalespersonID(2222);

        SalesLeads three=new SalesLeads();

        three.setLeadName("Sam");

        three.setLeadID(3333);

        three.setNumberSold(100);

        Customer four=new Customer();

        four.setCustomerName("Max");

        four.setCustomerSSN(111111111);

        four.setCustomerID(4444);

        Inventory five=new Inventory();

        five.setInventoryName("Used Cars");

        five.setNumberSold(200);

        five.setInventoryID(5555);

        Vehical six= new Vehical();

        six.setCarMake("Ford");

        six.setCarModel("Focus");

        six.setCarID(6666);

        Parts seven= new Parts();

        seven.setPartsName("Tires");

        seven.setPartsSold(300);

        seven.setPartsID(7777);


    }

}