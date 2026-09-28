
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/

    System.out.println("Enter value: ");
    double x = Input.readDouble();
    double y = Math.pow(x, 7);
    System.out.println("Y: " + y);

/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
  
    System.out.println("Enter value: ");
    double z = Input.readDouble();
    double q = Math.pow(x, 3) + 5;
    System.out.println("Q: " + q);

/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/

    System.out.println("Enter value t: ");
    double t = Input.readDouble();
    System.out.println("Enter value r: ");
    double r = Input.readDouble();
    double s = Math.pow(t, 5) * Math.pow((r+2),4);
    System.out.println("S: " + s);

/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/
    System.out.println("Enter value A: ");
    double a = Input.readDouble();
    System.out.println("Enter value B: ");
    double b = Input.readDouble();
    double c = Math.sqrt(a + b);
    System.out.println("C: " + c);

/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/

    System.out.println("Enter value x1: ");
    double x1 = Input.readDouble();
    System.out.println("Enter value x2: ");
    double x2 = Input.readDouble();
    System.out.println("Enter value y1: ");
    double y1 = Input.readDouble();
    System.out.println("Enter value y2: ");
    double y2 = Input.readDouble();
    double d = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2-y1),2));
    System.out.println("D: " + d);


/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/

    System.out.println("Enter degree: ");
    double deg = Input.readDouble();
    double g = Math.sin(deg);
    System.out.println("Degree: " + g);



/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/

    System.out.println("Enter value m: ");
    double m = Input.readDouble();
    System.out.println("Enter value n: ");
    double n = Input.readDouble();
    double k = Math.pow(m,5) / Math.sqrt(n + 1);
    System.out.println("K: " + k);


/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/



    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}