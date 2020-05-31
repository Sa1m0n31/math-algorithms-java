package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int a, i, j, k, m1, n1, m2, n2, sum;
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        ArrayList<ArrayList<Integer>> matrixB = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> rowToWork;

        /* Input dimensions of matrices */
        System.out.println("Dimensions of first matrix (rows, columns): ");
        m1 = scan.nextInt();
        n1 = scan.nextInt();
        System.out.println("Dimensions of second matrix (rows, columns): ");
        m2 = scan.nextInt();
        n2 = scan.nextInt();

        if(n1 != m2)
            /* Can't multiply - wrong dimensions */
            System.out.println("Can't multiply this two matrices");
        else
        {
            /* Input matrices */
            System.out.println("Load first matrix (by rows): ");
            for(i=0; i<m1; i++)
            {
                ArrayList<Integer> tmp = new ArrayList<>();
                for(j=0; j<n1; j++)
                {
                    a = scan.nextInt();
                    tmp.add(a);
                }
                matrixA.add(tmp);
            }
            System.out.println("Load second matrix (by rows): ");
            for(i=0; i<m2; i++)
            {
                ArrayList<Integer> tmp = new ArrayList<>();
                for(j=0; j<n2; j++)
                {
                    a = scan.nextInt();
                    tmp.add(a);
                }
                matrixB.add(tmp);
            }

            /* Calculations */
            for(k=0; k<m1; k++)
            {
                rowToWork = matrixA.get(k);
                ArrayList<Integer> resRow = new ArrayList<>();
                for(i=0; i<n2; i++)
                {
                    sum = 0;
                    for(j=0; j<m2; j++)
                    {
                        sum += rowToWork.get(j) * matrixB.get(j).get(i);
                    }
                    resRow.add(sum);
                }
                result.add(resRow);
            }

            /* Output */
            System.out.println("Result:");
            for(i=0; i<m1; i++)
            {
                for(j=0; j<n2; j++)
                    System.out.printf("%10d", result.get(i).get(j));
                System.out.println();
            }
        }
    }
}
