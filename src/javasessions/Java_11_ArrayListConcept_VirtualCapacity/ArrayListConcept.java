package javasessions.Java_11_ArrayListConcept_VirtualCapacity;

import java.util.ArrayList;

public class ArrayListConcept {

    public static void main(String[] args) {

        //ArrayList class - in built  class -- default
        //dynamic array
        // more and more elements you add, it will automatically grow

        //create the object of ArrayList class using new keyword

        //index based/order based array:
        ArrayList ar = new ArrayList(); //vc=10,pc=0
        //here ArrrayList is a rawtype
        System.out.println(ar.size());//pc=0

        ar.add(100);//0
        ar.add(200);//1
        ar.add(300);//2

        System.out.println(ar.size());//pc=3,vc=7

        ar.add(400);//3
        ar.add(500);//4
        System.out.println(ar.size());

        ar.add(600);//5
        ar.add(700);//6
        System.out.println(ar.size());

        ar.add("Naveen");//7
        ar.add(12.33);//8
        ar.add(1000);//9
        System.out.println(ar.size()); //pc=10 vc=0

        System.out.println(ar.get(0));
        System.out.println(ar.get(8));
        //System.out.println(ar.get(-1));//IOB
        //System.out.println(ar.get(9));//IOB

        ar.add(1100);

        //restrict the arraylist: Generics in AL // need to define the type of data we want to store in array list

        //integer data : AL:

        ArrayList<Integer> marksList = new ArrayList<Integer>();//vc=10, pc=0
        marksList.add(100);
        marksList.add(1200);

        ArrayList<Double> bmiList = new ArrayList<Double>();//vc=10, pc=0
        bmiList.add(12.33);
        bmiList.add(100.0);

        //int ---> Integer
        //double --> Double

        //diff types of data in AL:

        ArrayList<Object> empDataList = new ArrayList<Object>(); //vc=10,pc=0
        empDataList.add("Manisha");
        empDataList.add(25);
        empDataList.add(34.55);
        empDataList.add('f');
        empDataList.add(true);

        ArrayList<String> monthsList = new ArrayList<String>();//vc=10, pc=0
        monthsList.add("JAN");
        monthsList.add("FEB");


        //50 products -- sept
        //nov month we need to add -- 1000 products -- 5000 products
        // Then which one we should prefer array or arrayLis?
    }
}