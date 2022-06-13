
public interface Printer {
  void print(String message);
  
  default void printTwice(String message)
  {
	  System.out.println("1"+message);
	  System.out.println("1"+message);
  }
  // normally if we dont mention the access specifier to access specifier is default. but for interface we cannot 
//  provide implementation so if we want to have implementation then we need to mention default access specifier
  
}
