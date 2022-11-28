public class Addition implements Runnable {
    private int num1;
    private int num2;
    private int sum;

    public Addition(int firstNumb, int secondNumb) {
        this.num1 = num1;
        this.num2 = num2;
    }


    public void setFirstNumb(int firstNumb) {
        this.num1 = num1;
    }

    public void setSecondNumb(int secondNumb) {
        this.num2 = num2;
    }

    @Override
    public void run() {
        System.out.println("Запускаем многопоточный режим ");
        System.out.println(Thread.currentThread());
        System.out.println("Сумма введенных чисел: " + (sum = num1 + num2));
    }
}