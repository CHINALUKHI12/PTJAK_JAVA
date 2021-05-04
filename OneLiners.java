import java.util.Scanner;

public class OneLiners {

        public static boolean hasTwoRoots(double a, double b, double c) {
            if(a==0||b==0||c==0){
                return  false;
            }
            if ((b * b) - (4 * a * c) > 0) {
                //for two solution
                System.out.println("2 solutions");
                return true;
            }
            else if ((b * b) - (4 * a * c) == 0){
                //for one solution
                System.out.println("1 solution");
                 return false;}
            else{
                //for no solution
                System.out.println("No solutions");
                return false;
        }
        }

        public static boolean monot(double a, double b, double c) {

      double[] result={a,b,c};

            boolean inc=true,dec=true;
            for(int i=1;i<result.length;i++){
                if(result[i]<result[i-1]) inc=false;
                if(result[i]>result[i-1]) dec=false;
            }
            return inc || dec;


        }
    public static double maxEl(double a, double b, double c) {
        double result = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        return  result;
    }

        public static int numPos(double a, double b, double c) {

            int countp = 0, i;
            double arr[] = {a,b,c};
            for (i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                  countp++;
                }

            }  return countp;
        }

        public static void main(String[] args) {
            double a = 2, b = 3, c = 1;

            System.out.println("(a, b, c,)=(" + a + ", " +
                    b + ", " + c + "): hasTwoRoots? " +
                    hasTwoRoots(a,b,c));

            a = 0; b = 2; c = 1;
            System.out.println("(a, b, c,)=(" + a + ", " +
                    b + ", " + c + "): hasTwoRoots? " +
                    hasTwoRoots(a,b,c));


            a = 2; b = 1; c = -1;
            System.out.println("(a, b, c,)=(" + a + ", " +
                    b + ", " + c + "): monot? " +
                    monot(a,b,c));
            a = 2; b = 1; c = 2;
            System.out.println("(a, b, c,)=(" + a + ", " +
                    b + ", " + c + "): monot? " +
                    monot(a,b,c));

            a = 2; b = 1; c = 2;
            System.out.println("(a, b, c,)=(" + a + ", " +
                    b + ", " + c + "): maxEl = " +
                    maxEl(a,b,c));
            a = 2; b = 2; c = 4;
            System.out.println("(a, b, c,)=(" + a + ", " +
                    b + ", " + c + "): maxEl = " +
                    maxEl(a,b,c));

            a = -2; b = 1; c = -3;
            System.out.println("(a, b, c,)=(" + a + ", " +
                    b + ", " + c + "): numPos = " +
                    numPos(a,b,c));
            a = -2; b = 1; c = 3;
            System.out.println("(a, b, c,)=(" + a + ", " +
                    b + ", " + c + "): numPos = " +
                    numPos(a,b,c));
        }

    }

