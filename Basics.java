import java.util.*;
class Basics {
    public static void main(String[] args){
        System.out.println("Java Basics");

        // int, float, char, string, long, double,boolean
        int marks=18;
        float average=19.345f;
        char grade = 'A';
        String name="shrey";
        boolean isValid=false;
        long bigNumber=98978677564645646l;
        System.out.println(marks);
        System.out.println(average);
        System.out.println(grade);

        // Operators
        // Arithmetic operators +,-,*,%,++,--
        int firstNum=123;
        int secondNum=234;

        int sum=firstNum+secondNum;
        double divide=(double)firstNum/(double)secondNum;
        System.out.println(sum);
        System.out.println(divide);

        int a=34;
        int b=12;
        System.out.println(a);
        System.out.println(b);
        a++;
        b++;
        System.out.println(a);
        System.out.println(b);
        a--;
        b--;
        System.out.println(a--);
        System.out.println(b--);

        // User Input in Java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number=sc.nextInt();
        System.out.println(number);
        System.out.println(2*number);

        // Conditional Statements
        // Conditional operators
        // >, <, >=, <=, ==, !=
        if(number>20){
            System.out.println("The number is greater than 20");
        }
        else{
            System.out.println("The number is less than 20");
        }
        int first=12;
        if(first!=11){
            System.out.println("The first number is not equal to 11");
        }

        // Switch-case in Java
        char mark='A';
        switch(mark){
            case 'A':
                System.out.println("Very Good!");
                break; 
            case 'B':
                System.out.println("Keep Learning");
                break;
            case 'C':
                System.out.println("Try Again");
                break;
            default:
                System.out.println("wrong argument");
        }

        // Logical operators
        // &&,||,!
        int Age=52;
        if(Age >18 || Age<50){
            System.out.println("You can vote");
        }else{
            System.out.println("You cannot vote");
        }

        // Loops in Java
        // For,while,do-while
        int nums=0;
        while(nums<101){
            nums++;
            System.out.println(nums);
        }

        for(int i=0; i<901; i++){
            System.out.println(i);
        }

        for(int e=0; e<11; e++){
            System.out.println("Shrey Soral" + e);
        }

        //int z=23;
        //do{
            //System.out.println(z);
            //z++;
        //}while(z<101);

        int c=22;
        while(c<=100){
            c++;
            if(c==65) continue;
            System.out.println(c);
        }

        // Arrays in Java
		// 23,12,56,34,99
		int numbers[]=new int[5];
		numbers[0]=23;
		numbers[1]=12;
		numbers[2]=56;
		numbers[3]=34;
		numbers[4]=99;
		System.out.println(numbers);
		for(int i=0; i<numbers.length;i++){
			System.out.println(numbers[i]);
		}
		
		//Matrix in java(2d array)
		int z[][]=new int[2][3];
		z[0][0]=1;
		z[0][1]=2;
		z[0][2]=3;
		z[1][0]=4;
		z[1][1]=5;
		z[1][2]=6;
		
		for(int k=0;k<2;k++){
			for(int l=0;l<3;l++){
				System.out.print(z[k][l]+ " ");
			}
			System.out.println();
		}
        System.out.println(average(3,6));
        // Exception handling in Java
        int d[]=new int[3];
        try{
            System.out.println(d[4]);
            System.out.println(2/0);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error");
            System.out.println(e.getLocalizedMessage());
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        System.out.println("next line");
    }
    // Methods in java
    //return type function name(args){code}
    static int average(int firstNumber,int secondNumber){
        int sum = firstNumber+secondNumber;
        return sum/2;
    }
}