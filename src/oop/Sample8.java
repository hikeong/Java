package oop;

public class Sample8 {

    Question q1 = new Question();
        q1.setId(1);
        q1.setSubject("안녕하세요");
        q1.setContent("가입 인사드립니다 ^^");
        this.questionRepository.save(q1);

        Question q2 = new Question();
        q2.setId(2);
        q2.setSubject("질문 있습니다");
        q2.setContent("ORM이 궁금합니다");
        this.questionRepository.save(q2);
}
