package oop.setter2;
//다음 요구사항에 맞게 데이터를 객체로 구현하고 정보를 출력
// 학원 강의 요금표
// 강좌명	강의시간	수강료	구분
//자바 마스터과정	90	1000000	온라인
//파이썬 기초	60	600000	온라인
//웹 개발자 단기완성	120	1200000	오프라인

//강의시간은 30시간 단위로만 구성할 수 있습니다
//수강료는 음수가 될 수 없습니다
//구분은 온라인과 오프라인, 혼합 셋 중 하나로 설정할 수 있습니다
public class Test02 {
public static void main(String[] args) {
	
	Academy a = new Academy("자바 마스터과정",	90,1000000,	"온라인");
	Academy b = new Academy("파이썬 기초	",60,	600000,	"온라인");
    Academy c = new Academy("웹 개발자 단기완성",120,1200000,"오프라인");
    
	a.print();
	b.print();
    c.print();
}
}
