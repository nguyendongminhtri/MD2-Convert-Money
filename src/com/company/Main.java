package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền cần đổi: ");
        double money;
        money = scanner.nextDouble();
        int choose;
        System.out.println("Lựa chọn 1: Đổi USD sang VNĐ"+"\nLựa chọn  2: Đổi VNĐ sang USD");
        choose = scanner.nextInt();
        switch (choose){
            case 1:
                System.out.println(money+" USD đổi sang VNĐ: "+money*23000+" VNĐ");
                break;
            case 2:
                System.out.println(money+" VNĐ đổi sang USD: "+money/23000+ "$");
                break;
        }
    }
}
