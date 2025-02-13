import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.m3dz5_1.services.RestService;

public class RestServiceTest {

    @Test
    void calculationOfRestMonths() {
        RestService service = new RestService();

        // подготавливаем данные:
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 4;

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
        int expenses = 50000;
        int threshold = 250000;
        int expected = 2;

        // вызываем целевой метод:
        int actual = service.calcRest(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
