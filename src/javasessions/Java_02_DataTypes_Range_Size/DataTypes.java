package javasessions.Java_02_DataTypes_Range_Size;

public class DataTypes {
    public static void main(String[] args) {

        //strict data types:

        //1. primitive data types:
        // It will just take some space(in the form of bytes and bits) in the memory
        // no need to create object of the class or don't need to use any oops concept
        // Primitive is divided into two parts
        //1. Numeric:
        //Integral:
        //1.Integer: byte,short,int,long (4 brothers)
        //2.Floating-point: float,double (2 brothers)
        // Chr: char
        //2. Boolean: true/false
        //2. Non primitive data types:
        // Any kind of String,Class, Interface, Arrays,Abstract Class that we create
        // We need to create some object to access non-primitive data types

        //Unit of memory is byte and bits
        // we need to write optimize code

        //1. byte:
        // 1 byte = 8 bits

        byte b = 10; // 1 byte = 8 bits
        //  byte b = 20; // error - Because we already have "b" in the memory / we can not declare the same variable
        b = 50; // Don't create new variable just replace the value of existing variable
        //Age,Month,Passing Marks

        //2.short
        //Range: -32768 tp 32767
        //size: 2 bytes = 2*8=16 bits


        //long:
        //8 bytes =8*8=64 bytes
        //we have limited ram. So memory does matter. Our app might crash if our memory gets full
    }
}
