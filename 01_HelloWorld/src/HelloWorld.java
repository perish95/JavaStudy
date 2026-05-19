public class HelloWorld {
    public static void main(String[] args) throws Exception {
        String name = "이경석";
        int age = 32;
        double height = 170;
        char gender = 'm';
        Oper a = new Oper(4, 2, 253);

        // System.out.println(name);
        // System.out.println(age);
        // System.out.println((long)height);
        // System.out.println(gender);
        a.printOper();
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
        boolean tf = number % 2 == 0 ? true : false;
        // 7
        max = a >= b ? a : b;
        max = max >= c ? max : c;
        // 8
        if (month >= 3 && month <= 5)
            System.out.println("봄");
        else if (month >= 6 && month <= 8)
            System.out.println("여름");
        else if (month >= 9 && month <= 11)
            System.out.println("가을");
        else // 이렇게하면 안되기는 함 ㅇㅇ
            System.out.println("겨울");

        System.out.println("1. " + sum + " " + diff);

    }
}
