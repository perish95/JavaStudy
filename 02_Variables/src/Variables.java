public class Variables {
    public static void main(String[] args) throws Exception {
        // boolean, int, char, double, long, byte
        // boolean hasPen = false;
        // byte a = 127;
        // int b = 1;
        // long c = 1000000000L;
        // double d = 1;
        // char name = 'L';

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        // System.out.println(hasPen);
        // System.out.println(name);

        // int n1 = 1;
        // long n2 = n1;
        // System.out.println(n2);

        // int i = 256;
        // byte j = (byte) i;
        // System.out.println(i);
        // System.out.println(j);
        String name = "이경석";
        int age = 32;
        double height = 170;
        char gender = 'm';

        System.out.println(name);
        System.out.println(age);
        System.out.println((long) height);
        System.out.println(gender);

        // 03 operation
        Oper a = new Oper(4, 2, 253);

    }
}

class Oper {
    int a, b, c, number;
    int sum;
    int diff;
    double prod;
    double quot;
    int tens, units, hundreds;
    int month = 0;
    int max;

    Oper(int a, int b, int number) {
        this.a = a;
        this.b = b;
        this.number = number;
    }

    public void printOper() {
        int temp = 0;
        // 1
        sum = a + b;
        diff = a - b;
        // 2
        prod = a * b;
        quot = a / b;
        // 3
        tens = number / 10;
        units = number % 10;
        // 4
        hundreds = number / 100;
        tens = (number % 100) / 10;
        units = number % 10;
        // 5
        temp = b;
        b = a;
        a = temp;
        // 6
        boolean tf = number % 2 == 0; // 비트연산으로 홀짝 확인하는 것도 하나의 방법이다. -> 1의 자리가 1이면 홀수
        // 7
        max = a >= b ? a : b;
        max = max >= c ? max : c;
        // 8
        String[] season = { "겨울", "봄", "여름", "가을" };
        System.out.println(season[(month % 12) / 3]);
        // 9
        int data = number & 0;
        // 10
        int data2 = 255 >> 4;

        System.out.println("1. " + sum + " " + diff);

    }
}
