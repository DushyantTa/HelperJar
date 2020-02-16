package com.company;

import com.arithmatic.Sum;

import static com.read.InputHelper.readInt;
import static com.read.InputHelper.readLine;

public class Main {

    public static void main(String[] args) {
        String _value_1;
        int _val_2;
        _value_1 = readLine("Enter String value: ");
        System.out.println(_value_1);
        _val_2 = readInt("Enter Integer value: ");
        System.out.println(_val_2);

        Sum sum = new Sum();
        sum.addNo(_val_2);
        System.out.println(sum.getTotal());
        sum.subNo(_val_2 + +_val_2);
        System.out.println(sum.getTotal());
    }
}
