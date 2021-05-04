# PTJAK_JAVA
Here I have uploaded task 6



[e06.pdf](https://github.com/CHINALUKHI12/PTJAK_JAVA/files/6421061/e06.pdf)

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
