class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
    

/*  
    Challenge 1:
    Create two integer variables and Assign values to them. 
    Calculate the sum of the two numbers and store the 
    calculated sum and then display it.
    
*/    
    int num1 = 2;
    int num2 = 1;
    float sum = num1 + num2;
    System.out.println(sum);


/*  
    Challenge 2:
    Create three variables to assign three grades and Assign values to each grade. 
    Calculate the sum of the three grades and store the 
    calculated sum and then display it.
    
*/
    float g1 = 95;
    float g2 = 90;
    float g3 = 78;
    float total = g1 + g2 + g3;
    System.out.println(total);



/*  
    Challenge 3:
    Calculate the average from the three grades from challenge 2,
    store the value and then display it.
    Declare and assign values to any new variables
    NOTE: Does it look correct, check with a calculator?
*/

    float avg = total / 3;
    System.out.println(avg);

/*  
    Challenge 4:
    Write the following equation in EQ1.PNG file in Java; store the result and the display it:
    Declare and assign values to any new variables

*/
    double A = 9;
    double x = 8;
    double y = A/(x+1.0);
    System.out.println(y);

/*  
    Challenge 5:
    Using the variables same variables from challenge4 above, write the following equation in EQ2.PNG file in Java, store the result and the display it:

    Declare and assign values to any new variables

*/
    double Y = ((2.0 * x)*(x+1.0)*(-x/2.0))/A;
    System.out.println(Y);





/*  
    Challenge 6:
    Create the variables and write the equation in
    file  EQ3.PNG

    Declare and assign values to any new variables
*/
 
    double base = 9;
    double height = 4;
    double area = 1.0/2.0 * base * height;
    System.out.println(area);




/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.

    1) Write the java code that will calcute how many baskets
    of 12 eggs can we fill fully.

    HINT: What do we get when we divide an integer by 
    an integer in Java

    2) Write the java code that will calculate how many eggs
    are left over after we filled as many baskets of 12 eggs.
*/

    int eggs = 100;
    int basket = 12;
    int num = eggs/basket;
    System.out.println(num);
    int left = 100 % 12;
    System.out.println(left);




    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}