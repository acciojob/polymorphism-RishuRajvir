package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int ans = p.product(10,15);
        int ans1 = p.product(10,15,20);

        double ans2 = p.product(1.2,2.6,9.8);
        System.out.println(ans+" "+ans2+" "+ans1);
    }


   static class  Product {
        public int product(int x, int y) {
            return x * y;
        }
       public int product(int x, int y, int z) {
           return x*y*z;
       }
       public double product(double x, double y, double z) {
           return x*y*z;
       }

    }
}