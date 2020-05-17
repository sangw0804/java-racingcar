package step3.racingcar;

import java.util.List;

public class ResultViewProcessor {

    private static final String POSITION_MARK = "-";

    private ResultViewProcessor() {
    }

    public static void printResult(List<Car> cars) {
        cars.forEach(ResultViewProcessor::printCurrentPosition);
        System.out.println();
    }

    public static void printResultHeader(String headerMessage) {
        System.out.println(headerMessage);
    }

    private static void printCurrentPosition(Car car) {
        int currentPosition = car.getPosition();
        for (int i = 0; i < currentPosition; i++) {
            System.out.print(POSITION_MARK);
        }
        System.out.println();
    }
}