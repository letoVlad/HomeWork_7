public class Main {
    public static void main(String[] args) {
        //1 задача
        int arrayOne[] = new int[3];
        arrayOne[0] = 1;
        arrayOne[1] = 2;
        arrayOne[2] = 3;
        double arrayTwo[] = {1.57, 7.654, 9.986};
        int arrayThree[] = {4, 5, 6, 7, 0};

        //2 задача
        for (int i = 0; i < arrayOne.length; i++) {
            if (i < arrayOne.length - 1) {
                System.out.print(arrayOne[i] + ", ");
            } else {
                System.out.println(arrayOne[i]);
            }
        }
        for (int i = 0; i < arrayTwo.length; i++) {
            if (i < arrayTwo.length - 1) {
                System.out.print(arrayTwo[i] + ", ");
            } else {
                System.out.println(arrayTwo[i]);
            }
        }
        for (int i = 0; i < arrayThree.length; i++) {
            if (i < arrayThree.length - 1) {
                System.out.print(arrayThree[i] + ", ");
            } else {
                System.out.println(arrayThree[i]);
            }
        }
        //3 задача
        for (int i = arrayOne.length - 1; i >= 0; i--) {
            if (i < arrayOne.length && i != 0) {
                System.out.print(arrayOne[i] + ", ");
            } else {
                System.out.println(arrayOne[i]);
            }
        }
        for (int i = arrayTwo.length - 1; i >= 0; i--) {
            if (i < arrayTwo.length && i != 0) {
                System.out.print(arrayTwo[i] + ", ");
            } else {
                System.out.println(arrayTwo[i]);
            }
        }
        for (int i = arrayThree.length - 1; i >= 0; i--) {
            if (i < arrayThree.length && i != 0) {
                System.out.print(arrayThree[i] + ", ");
            } else {
                System.out.println(arrayThree[i]);
            }
        }
        //4 задача
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 != 0) {
                System.out.print(arrayOne[i] + 1 + ", ");
            }
        }
    }
}