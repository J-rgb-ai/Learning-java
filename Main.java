
public class Main 
{
    publicstatic void main(String[] args)
    {
        System.out.println("Hello World\n367\n" + (3+ 6) + "\n" + (6 * 7));
 
        //Declaring variables: type variableName = value;
        String name = "John";
        int myNum =15;
    

        System.out.println(name);
        System.out.println(myNum);


        //displaying variables
        String name= "Mary";
        System.out.println("Hello " + name);


        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName +  lastName;
        System.out.println(fullname);


        //java type casting- assigning a value of one primitive data type to another type
        //1.widening casting
        int myInt = 9;
        double myDouble = myInt; //AUTOMATIC CASTING int to double
        
        System.out.println(myInt);
        System.out.println(myDouble);
        
        //2.narrowing casting
         double myDouble = 9.78d;
         int myInt = (int) myDouble;

         System.out.println(myDouble);
         System.out.println(myInt);
       
        //strings methods
        String txt = "Hello World";
        System.out.println(txt.toUppercase());
        System.out.println(txt.toLowercase());

        
    }