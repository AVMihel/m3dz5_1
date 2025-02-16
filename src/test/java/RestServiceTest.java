import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.m3dz5_1.services.RestService;

public class RestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rest.csv")
    void calculationOfRestMonths(int income, int expenses, int threshold, int expected) {
        RestService service = new RestService();

        int actual = service.calcRest(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculationOfRestMonths() {
        RestService service = new RestService();

        // подготавливаем данные:
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;

        // вызываем целевой метод:
        int actual = service.calcRest(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculationOfBigRestMonths() {
        RestService service = new RestService();
        // подготавливаем данные:
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;

        // вызываем целевой метод:
        int actual = service.calcRest(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
