import java.io.*;
import java.util.Scanner;

class Student {
    public int roll_no;
    public String name;
    Student(int roll_no,String name){
        this.name = name;
        this.roll_no = roll_no;
    }
}
public class PeakElement {
    public static void main(String[] args) {
       int arr[] = {0,0,0,1,1,1};
       int n = arr.length;
        System.out.println("The N value is : " + n);

        int start = 0;
       int end = n-1;
        System.out.println("The end value is : " + end);

        int flag = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            System.out.println("The mid value is : " + mid);

        }
    }
}