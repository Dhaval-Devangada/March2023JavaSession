package ExceptionHandling.videoNo25.customExceptionHandling.example;

public class FinallyBlockExample {
    public static void main(String[] args) {
/**
 * Normal flow
 * make the connection - DB -- un/pwd/ip:port
 * hit the SQL
 * get the results -- And this line is giving you the exception/sql exception[Data/table not found] while
 * use the results
 */

/**
 * So here we are getting the exception while executing the "get the results" line,
 * So we will surround that line with try-catch block
 * try(){
 *     get the results - exception
 * }catch(){
 *
 * }
 * While getting the result we are getting the exception , but connection is already established/connection is still open
 * So we are getting the exception but connection is still established, we can not keep the db connection open
 * so to close the connection we can use finally block
 * Dosen't matter exception is coming or not your connection with the database should be closed
 * Otherwise what will be the issue
 * Think like big application amazon, where 50000 customers are there which are hitting our application
 * and everyone is performing the search and try to get connection with DB
 * and out of 50000 customer, 10,000 are getting connection failure issue internally
 * But don't you that they have already established the connection
 * 10,000 connection are open with the database but user is logged out from app
 * But internally there is so much load on database because unnecessary connection are established
 * So in those cases we need to close the connection, dosen't matter exception is coming or not
 * Once you get the results plz close the connection
 * Even if you are getting the result you need to close the connection
 * So in positive and in negative, in both the cases we need to close the connection, so that there is no unnecessary load on the database
 * so whenever database connectivity, or reading the data from excel at that time we need to close the connection
 * Google - finally block in java with db connection
 */

        //make the connection - DB -- un/pwd/ip:port
        //hit the SQL

        //try
        //get the results -- exception
//		//db connection should be closed

//		}
//		catch() {
//		//db connection should be closed
//		finally {
//			//db connection should be closed
//		}

        //use the results


    }
}
/**
 * Final - is to provide constant value, to prevent inheritance, to prevent method overriding
 * Finally - use with/for try-catch block, dosen't matter exception is coming or not finally block will be executed
 */