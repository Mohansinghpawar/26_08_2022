class Base {
    //  Declare and Instantiate data member  
    String str = "We are in Parent class";
    }

    class Derived extends Base {
	    //  Declare and Instantiate data member  
	    String str = "We are in Child class";
	}
public class SupSub {
	public static void main(String[] args) {
        // Creating a Base class object
        Base base = new Base();
        // Invoked Base class data member with Base class object.
        System.out.println("Base class reference can access only base class member :" + " " + base.str);

        // Creating a Derived class object
        Derived derived = new Derived();

        // Invoked Derived class data member with Derived class object.
        System.out.println("Derived class reference can access both Base and Derived class member : " + " " + derived.str);

        // Here Base class reference holding an object of
        // Derived class and it is perfectly valid
        base = new Derived();

        // Base class reference can access only Base class 
        // data member whether it is holding an object is of 
        // Base class or Derived class.
        System.out.println("Base class reference holding an object of Derived class but it can access only Base class data member :" + " " + base.str);

        // we don't need to include the below code ….
        /*
        // Here Derived class reference holding an object of
        // Base class and it is perfectly invalid
        derived = new Base();

        // If Derived class reference hold an object of Base 
        // class then we will get compile time error
        System.out.println("We will get compile time error");
        */
        }
 }
