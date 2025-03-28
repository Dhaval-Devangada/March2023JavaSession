package javasessions.Java_12_ArrayListMethods_Add_Remove_Literals_Sort_Swap_Replace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {


        ArrayList<String> ar = new ArrayList<String>(5);// for better memory optimization we can reduce VC (if we know that we are going to store less than 10 values)
        //load factor = vc=5, pc=0
        //load factor = 5/2 = 2

        ArrayList<Integer> marksList = new ArrayList<Integer>();
        marksList.add(1);//0
        marksList.add(2);//1
        marksList.add(3);//2
        marksList.add(4);//3

        //remove(int index) remove the value on the basis of index
        //remove(Object o) remove the value on the basis of value (Object means value we can pass)

        // marksList.remove(2); // based on index value will be removed
        marksList.remove((Object)2); // here we need to pass object type of value, so we are instructing java that remove value based on index
        System.out.println(marksList);

        //ArrayList Literals:
        // if we know the data then we can use arrayLiterals
        // we don't want to write .add() multiple times

        ArrayList<String> browserList = new ArrayList<String>(Arrays.asList("chrome", "firefox", "edge"));
        System.out.println(browserList);
        System.out.println(browserList.size());//pc=3,vc=7
        System.out.println(browserList.get(0));
        for(String e : browserList) {
            System.out.println(e);
        }

        // I want to print in the reverse order
        ArrayList<String> empList = new ArrayList<String>(Arrays.asList("Tom", "Peter", "Ravi", "Shubham", "Sagar"));
        System.out.println(empList);//normal list
//		Collections.reverse(empList); //reversed
//		System.out.println(empList); //reversed list

//      can we print reverse order with for-each loop- YES
//		for(String e : empList) {
//			System.out.println(e);
//		}

        //reverse without using built-in methods
        for(int i = empList.size()-1; i>=0; i--) {
            System.out.println(empList.get(i));
        }

        //ArrayList literals for the integer
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(10,20,30,50,90,900));
        System.out.println(numList);
        Collections.reverse(numList);
        System.out.println(numList);

        //static array
        int numWithPrimitiveDataType[] = {12,34,55,11,22,33}; // If our data-type is primitive then we will get sizes of of array not values
        List<int[]> numbers = Arrays.asList(numWithPrimitiveDataType); // Here we don't need "new" keyword. We need it when we write it in the form of Literals
        System.out.println(numbers.size()); // This will return 1 , as "arrays.asList(numWithPrimitiveDataType)" retuning "List<int[]>" and we don't want how many array got stored. we want array values

        Integer num[] = {12,34,55,11,22,33}; // changed data type to non-primitive "Integer". When we convert at that time this will give us values
        //array to arraylist: (static array to dynamic array)
        List<Integer> numbersList = Arrays.asList(num); // This will return the List<Integer> and not ArrayList<Integer>
        System.out.println(numbersList.size());
        //Arrays.asList(num); returns the list of Arrays(will store the static arrays) and not list of array values
        //so whenever we want to convert from array to arrayList , we will always declare array with "Integer" class/Non primitive data-type

        // For String we don't have any primitive and non-primitive
        String browser[] = {"chrome", "firefox", "edge"};
        List<String> browserNamesList = Arrays.asList(browser);
        System.out.println(browserNamesList.size());//3

        //Another way of declaring arrayList
        ArrayList<String> list = new ArrayList<String>() {
            {
                add("Java");
                add("Python");
                add("Ruby");
            }
        };
        System.out.println(list.size());
        list.add("C#");
        System.out.println(list.size());

        //List is an Interface(Having methods but does not have any method body)
        //JDK 1.9
        //Immutable List -- > can not be changed now - no add/remove
        List<Integer> nList = List.of(1,2,3,4,5);//5
        System.out.println(nList.size());
//		nList.add(6);
//		System.out.println(nList.size());
//		nList.remove(1);
//		System.out.println(nList.size());

        //
        ArrayList<String> monthsList = new ArrayList<String>();//vc=10, pc=0
        monthsList.add("JAN");
        monthsList.add("FEB");
        monthsList.add("MARCH");
        monthsList.add("APRIL");
        monthsList.add("May");
        monthsList.add("JUNE");
        //vc=4, pc=6

        monthsList.trimToSize(); //trim the VC to the current pc
        //vc=6,pc=6
        //vc=6/2=3


        //
        monthsList.add(0, "Month");
        //monthsList.add(10,"July");//IOB
        System.out.println(monthsList);

        Collections.swap(monthsList, 0, 1);
        System.out.println(monthsList);

        Collections.reverse(monthsList);
        System.out.println(monthsList);

        List<Object> ls = Collections.emptyList();
        System.out.println(ls.size());

        Collections.sort(monthsList);
        System.out.println(monthsList);

        //create a number list---1,4,11,22,2,34
        //print in sorting --> asc order
        //print in sorting --> desc

        //add a value in the middle of the list:
        //1,2,3,??,4,5,6,7
        //mid = size()/2
        //add(mid,30)

        ArrayList<Integer> ll = new ArrayList<Integer>();
        ll.add(1);//0
        ll.add(2);//1
        ll.add(3);//2
        ll.add(4);//3
        ll.add(5);//4
        ll.add(6);//5
        ll.add(7);//6

//		int mid = ll.size()/2; //7/2 = 3
//		ll.add(mid, 30);
        System.out.println(ll);

        ll.set(6, 60);
        System.out.println(ll);





    }
}
