public class Ch6_MemberServiceExample{
    public static void main(String[] args){ 
        Lib_MemberService memberService = new Lib_MemberService();
        boolean result = memberService.login("hong","12345");
        if(result) {
            System.out.println("Login");
            memberService.logout("hong");
        } else {
            System.out.println("Id or Passward is incorrect");
        }
    }
}//end of class
