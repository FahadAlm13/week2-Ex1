import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> number = new ArrayList<>();
        number.add(11);
        number.add(-20);
        number.add(0);
        number.add(15);
        number.add(40);
        number.add(27);
        number.add(50);

        //Q1) Write a Java program to test if the first and the last element of an array of
        //integers are same. The length of the array must be greater than or equal to 2 :


//        boolean result = number.size() >= 2 && number.getFirst().equals(number.getLast());
//        System.out.println(result);

        //Q2) Write a Java program to find the numbers greater than the average of the
        //numbers of a given array.

//        double avr = 1;
//        for (int i = 0; i < number.size();i++){
//            avr += number.get(i);
//        }
//        avr /= number.size();
//        System.out.println(avr);
//        for (int i = 0; i<number.size();i++){
//            if (number.get(i) < avr){
//                continue;
//            } else System.out.print(" " + number.get(i));
//        }

        //Q3) Write a Java program to get the larger value between first and last
        //element of an array of integers.

//         int largest = number.getFirst();
//         if(number.getLast() > largest){
//             System.out.println(number.getLast());
//         } else System.out.println(largest);

        //Q4) Write a Java program to swap the first and last elements of an array and
        //create a new array.

//        ArrayList<Integer> newArray = new ArrayList<>(number);
//        int temp = newArray.getFirst();
//        newArray.set(0, newArray.getLast());
//        newArray.set(newArray.size() - 1, temp);
//
//        System.out.print("New array after swapping the first and last elements: ");
//        for (int num : newArray) {
//            System.out.print(num + " ");
//        }

        //Q5) Write a program that places the odd elements of an array before the
        //even elements.

//        ArrayList<Integer> evenFirst = new ArrayList<>();
//
//        for (int num : number) {
//            if (num % 2 == 0) {
//                evenFirst.add(num);
//            }
//        }
//        for (int num2 : number) {
//            if (num2 % 2 != 0) {
//                evenFirst.add(num2);
//            }
//        }
//        System.out.println(evenFirst);

        //Q6) Write a program that test the equality of two arrays.
        //[2,3,6,6,4] [2,3,6,6,4]

//        ArrayList<Integer> array1 = new ArrayList<>();
//        ArrayList<Integer> array2 = new ArrayList<>();
//
//        array1.add(2);
//        array1.add(3);
//        array1.add(6);
//        array1.add(6);
//        array1.add(4);
//
//        array2.add(2);
//        array2.add(3);
//        array2.add(6);
//        array2.add(6);
//        array2.add(4);
//
//        boolean areEqual = array1.size() == array2.size();
//        if (areEqual) {
//            for (int i = 0; i < array1.size(); i++) {
//                if (!array1.get(i).equals(array2.get(i))) {
//                    areEqual = false;
//                    break;
//                }
//            }
//        }
//        System.out.println(areEqual);
    }
}
