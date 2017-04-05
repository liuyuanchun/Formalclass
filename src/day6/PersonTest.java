package day6;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Teacher();
		if(p instanceof Student){
			Student s = (Student)p;
			p.name = "张三";
			p.age = 18;
			p.sex = '女';
			s.grade = "java1703";
			p.show();
			s.study();
		}else if(p instanceof Teacher ){
			Teacher t = (Teacher)p;
			p.name = "李四";
			p.age = 23;
			p.sex = '男';
			t.salary = 5000;
			p.show();
			t.teach();
		}
	}
}
