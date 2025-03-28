package javasessions.Java_06_SwitchCase_UseCases_StringQuotesHandling_FinalKeyword_StaticArrayConcept;

public class ArraysConcept {

    public static void main(String[] args) {
        //where you are going to use static array -> where the data is always fixed [month array] [weekdays] [flight ticket booking] [movie ticket booking] [red bus]

        //Why don't we store, 10,20,30,40

        //static Array: size is fixed
        //limitation: can store only similar type of data:
        //limitation:wasting of memory (if size is 500 and if we store only 50 values)
        //limitation: liminatati of the memory (if the size is 50 than we can not store the more than 50 values)
        //limitation: we can not increase or decrease the size
        // to solve above problem we need flixibility  -> Array list

        //int array:
        int k[] = new int[4];// We need to tell in advance that how many segment do you really want to take in the memory
        // new keyword say I really want to allocate 4 segments inside the memory so give me new memory inside the memory
        // Total bytes taken 4 bytes * 4 = 16 bytes
        //li = 0
        //highest index = length(4)-1= 3
        //length = 4 --> hi+1
        //range: 0(lowest index) to 3(Highest index)

        //Amazon - 50 products - 0-49 - Maximum value we can store is 50 only

        //k[-1] = 60;//AIOB // There is no concept of negative indexing
        k[0] = 10;
        k[1] = 20;
        k[2] = 30;
        k[3] = 40;
        //k[4] = 50;//ArrayIndexOutOfBoundsException -- AIOB // At compile time this will not give any error but at run time it will give an error
        //Here the 4th index does not exists inside the memory
        //compiler most of time will give syntax based error


        System.out.println(k[0]);
        System.out.println(k[3]);
        //System.out.println(k[4]);//AIOB

        //2. double array:
        double d[] = new double[2];
        d[0] = 12.33;
        d[1] = 34.44;

        //3. char array:
        char c[] = new char[3];
        c[0] = 'a';
        c[1] = 'A';
        c[2] = '0';

        //String array:
        String browsers[] = new String[4];
        browsers[0] = "chrome";
        browsers[1] = "firefox";
        browsers[2] = "safari";
        browsers[3] = "safari";

        // I want to print the array
        System.out.println(browsers[0]);
        System.out.println(browsers[2]);
        System.out.println(browsers[3]);

    }

  /*  amazon
    sept - 50 products - Initially we have created array of 50(0-49)
    nov - 500 - in this month - we don't have space left in above array - so for this we need to change the code - > then deploy -> test -> restart server -> will take around 30 min -> revenue down
    diwali -5000
    new year - 10000*/

    // sometime we will waste the memory
    //sometimes we will need code change when we need more memory

}
