package Java0528_01;

public class AnimalInfo {
	void animalSound(Animal an) {
		an.sound();
		// cat.sound(); 이 될거임
		// an로 지정한 이유는 dog와 cat을 포괄하는 개념이 있으면 둘다 사용 가능.
	}
}
