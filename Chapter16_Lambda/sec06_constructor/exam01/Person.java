package sec06_constructor.exam01;

public class Person {
    public Member getMember1(Creatable1 creatable1) {
        String id = "winter";
        Member member = creatable1.create(id); //create가 ㅔ뭔지 모르는 상태
        return member;
    }

    public Member getMember2(Creatable2 creatable2) {
        String id = "winter";
        String name = "한겨울";
        Member member = creatable2.create(id, name); //create가 뭔지 모르는 상태
        return member;
    }

}
