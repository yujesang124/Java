package Java0527;

public class IciaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IciaInfo info = new IciaInfo();
		
		IciaPerson icia = new IciaPerson();
		
		IciaStudent student = new IciaStudent();
		IciaTeacher teacher = new IciaTeacher();
		IciaWorker worker = new IciaWorker();
		// 똑같은 타입의 메소드에 출력을 했는데 우리가 넣어주는 매개변수에 따라서 각각 다른 결과가 나온다. 
		// finish()를 사용해서 매개변수를 다르게 했을때 다른 결과값이 나온다. ex) Info라는 객체가 icia,student,teacher,worker을 참조함.
		
		info.finishType(icia);
		info.finishType(student);
		info.finishType(teacher);
		info.finishType(worker);
		
//		icia.finish();
//		student.finish();
//		teacher.finish();
//		worker.finish();
	}

}

