package study3;

import java.util.Arrays;
import java.util.List;

public class ResultView {
	
	Car car = new Car();
	public ResultView() {
		System.out.println("실행결과");
	}

	public void outputResult(List<Car> carList) {
		for (Car car : carList) {
			car.outputnumCarResult(car);
		}
		System.out.println();
	}
}