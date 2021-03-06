public class HelloWorld {
    public static void main(String[] args) {
        // The first printing sentence.
        System.out.println("Hello, World!");

        int age = 20;
        double height = 173.5;
        final String NAME = "채민석";

        System.out.printf("이름은 %s\n\t나이는 %d, 키는 %f\n", NAME, age, height);

        age = age + 1;
        height = height - 0.01;
        System.out.printf("내년에는 이름은 %s\n\t나이는 %d, 키는 %f\n", NAME, age, height);
    }
}