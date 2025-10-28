package classandobjects;

import java.util.ArrayList;

//Jan_15_MethodsExamplesWithArrayList_MethodOverloading_CompileTimePolymorphism
//Program no - 2
public class Browser {
    //WAF:(write a function)
    //WAF-getEmployeeDevices(String empName)
    //you have to collect all the devices employee have and return(multiple values)
    //Return: ArrayList<String> (To store values of all the devices)

    //1 copy of this function will be given to/stored inside the object( when we create it) and object is inside the heap
    public ArrayList<String> getEmployeeDevices(String empName) {
        System.out.println("getting the device list for : " + empName); // Nice message

        empName = empName.trim().toLowerCase();  //Remove spaces and convert it to lowercase
        ArrayList<String> devicesList = new ArrayList<String>();//pc=0

        if(empName.equals("vinayak")) {
            //iphon14,macbook pro,airtel sim, mouse (Vinayak having these devices)
            devicesList.add("iphone 14");
            devicesList.add("Macbook Pro");
            devicesList.add("Airtel SIM");
            devicesList.add("Apple Mouse");
        }
        else if(empName.equals("waseem")) {
            //samsng,mouse(waseem having these devices)
            devicesList.add("samsung s13");
            devicesList.add("HP Mouse");
        }
        else if(empName.equals("prashant")) {
            //samsng,mouse, keyboard (prashant having these devices)
            devicesList.add("Macbook Air");
            devicesList.add("Apple Mouse");
            devicesList.add("Apple Keyboard");

        }
        else {
            System.out.println("Plz pass the right emp name...emp is not found....");
        }

        return devicesList;
    //    return Apple Mouse,Apple Keyboard;
        //We can return the multiple values but we have to COLLECT it first by using COLLECTION or any DATA STRUCTURE

    }



    public static void main(String[] args) {

        Browser obj = new Browser();
        ArrayList<String> devList= obj.getEmployeeDevices("prashant"); //devList is holding parameter
        System.out.println(devList);

        //We can use the returned value which is stored in(devList) for some other purpose. PLease check below
        System.out.println("total number of devices:" + devList.size()); // Showing that how many devices specific employee have, This is showing advantage of using returned value

    }
}

//Function will always return single entity. It depend which entity
//Here we are not returning multiple list , we are returning single ARRAYLIST
//We can not return multiple entities/values.
// If you really want to return multiple values than first store it in some collection and than return that collection