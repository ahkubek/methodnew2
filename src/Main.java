public class Main {
    public static void printTask (int TaskCopy) {
        System.out.println(TaskCopy);

    }
    public static void main(String[] args) {
        System.out.println("Задача1");
        int year=2021;
        if (year % 4 == 0 & year % 100 != 0 || year % 400 == 0) {
            System.out.println(year+"год "+" явлется високостным");
        }else{

            System.out.println(year+"год"+"не является високостным");
            printTask(year);


        }
        //task2
        System.out.println("Задача2");

    }
}