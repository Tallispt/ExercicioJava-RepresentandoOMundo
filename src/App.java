public class App {
    public static void main(String[] args) throws Exception {
        User user = new User();

        user.setCpf("123.456.789-10");
        user.setEmail("email@gmail.com");
        user.setPassword("****");
        user.name = "Name";

        System.out.println(user.getCpf());
        System.out.println(user.getEmail());
        System.out.println(user.name);


        Subject math = new Subject();
        math.name = "Math";
        math.type = "Exacts";

        Exam firstExam = new Exam();
        firstExam.name = "Prova de matemática";
        firstExam.numberQuestions = 2;
        firstExam.user = user;
        firstExam.totalValue = 10;
        firstExam.subject = math;
    }
}
