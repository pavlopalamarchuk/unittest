package ua.pavlo.calc;
import java.util.Scanner;
public class Reader {
    int a;
    int b;
    int s;
    public void Scan(){
        System.out.print("ввелите первое число");
        Scanner scn = new Scanner(System.in);
        a = scn.nextInt();
        System.out.print("введите второе число");
        b = scn.nextInt();
        System.out.print("введите действие +,-,*,/");
        s = scn.nextInt();

    }}