package johnrsparks;

public class Fibonacci {
private int number;

public Fibonacci(int number){
this.number = number;
}

public void fibonacciCalulator(){
int fibOne = 0;
int fibTwo = 1;

if (number < 0){
    System.out.println("0, 1");
}

while (fibOne <= number){
    System.out.print(fibOne + ", ");
    int total = fibOne + fibTwo;
    fibOne = fibTwo;
    fibTwo = total;
}

    if (number == 0){
        System.out.println("1");
    }

}
}

