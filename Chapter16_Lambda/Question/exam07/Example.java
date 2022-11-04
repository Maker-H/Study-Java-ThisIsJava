package Question.exam07;

public class Example {
    private static int[] scores = { 10, 50, 3 };

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for(int score : scores) {
            result = operator.apply(result, score);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin( (result, score) -> result = (result>score ? result : score) );
        System.out.println("Largest : " + max);

        int min = maxOrMin( (result, score) -> result = (result>score ? score : result));
        System.out.println("Smallest : " + min);

        
    }
}