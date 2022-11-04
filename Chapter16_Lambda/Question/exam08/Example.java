package Question.exam08;

public class Example {
    private static Student[] students = {
        new Student("heesom", 100, 100),
        new Student("java", 96, 93)
    };

    public static double avg(Function<Student> function) {
        int sum = 0;

        for(Student student : students) {
            sum += function.apply(student);        
        }
        
        return sum/students.length;
    }

    public static void main(String[] args) {
        double englishAvg = avg( s-> s.getEnglishScore() );
        //double englishAvg = avg( Student :: getEnglishScore );
        System.out.println("average english score : " + englishAvg);

        double mathAvg = avg ( s -> s.getMathScore() );
        double mathAvg = avg ( Student :: getMathScore );
        System.out.println("average math score : " + mathAvg);

    }
}
