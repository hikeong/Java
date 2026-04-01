package oop;

public class Sample4 {
    void sayNick(String nick) {
        if ("바보".equals(nick)) {
            return;
        }
        System.out.println("나의 별명은 "+nick+" 입니다.");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.sayNick("야호");
        sample.sayNick("바보");  //출력 xx
    }
}
