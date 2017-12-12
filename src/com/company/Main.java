package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int publicMod; //public modulus
        int publicKey; //alice
        int publicNum; //bob

        int privateA = 0;
        int privateB = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("What is the public modulus?");
        publicMod = in.nextInt();
        System.out.println("What is Alice's public key?");
        publicKey = in.nextInt();
        System.out.println("What is Bob's public number?");
        publicNum = in.nextInt();

        for (int i = 0; i < publicMod; i++)
        {
            if((publicKey * i) % publicMod == 1)
            {
                privateA = i;
            }
            if((publicKey * i) % publicMod == publicNum)
            {
                privateB = i;
            }
            if(privateA != 0 && privateB != 0)
                break;
        }

        System.out.println("Alice's private key is " + privateA + " and Bob's private key is " + privateB);
    }
}
