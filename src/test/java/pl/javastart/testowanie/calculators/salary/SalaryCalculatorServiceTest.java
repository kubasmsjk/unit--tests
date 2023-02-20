package pl.javastart.testowanie.calculators.salary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

class SalaryCalculatorServiceTest {

    @Mock
    TaskManagementSystem taskManagementSystem;
    private SalaryCalculatorService salaryCalculatorService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        salaryCalculatorService = new SalaryCalculatorService(taskManagementSystem);
    }

    @Test
    void shouldHaveNoBonus() {

        //given
        Employee employee = Mockito.mock(Employee.class);
        when(employee.getBaseSalary()).thenReturn(BigDecimal.valueOf(2000));
        when(taskManagementSystem.countFinishedTasksForEmployee(employee)).thenReturn(9);

        //when
        BigDecimal salary = salaryCalculatorService.calculateSalary(employee);

        //then
        assertThat(salary).isEqualTo(BigDecimal.valueOf(2000));
    }

    @Test
    void shouldHave500Bonus() {

        //given
        Employee employee = Mockito.mock(Employee.class);
        when(employee.getBaseSalary()).thenReturn(BigDecimal.valueOf(2000));
        when(taskManagementSystem.countFinishedTasksForEmployee(employee)).thenReturn(19);

        //when
        BigDecimal salary = salaryCalculatorService.calculateSalary(employee);

        //then

        assertThat(salary).isEqualTo(BigDecimal.valueOf(2500));
    }

    @Test
    void shouldHave500BonusFor10Tasks() {

        //given
        Employee employee = Mockito.mock(Employee.class);
        when(employee.getBaseSalary()).thenReturn(BigDecimal.valueOf(2000));
        when(taskManagementSystem.countFinishedTasksForEmployee(employee)).thenReturn(10);

        //when
        BigDecimal salary = salaryCalculatorService.calculateSalary(employee);

        //then

        assertThat(salary).isEqualTo(BigDecimal.valueOf(2500));
    }

    @Test
    void shouldHave1000Bonus() {

        //given
        Employee employee = Mockito.mock(Employee.class);
        when(employee.getBaseSalary()).thenReturn(BigDecimal.valueOf(2000));
        when(taskManagementSystem.countFinishedTasksForEmployee(employee)).thenReturn(20);

        //when
        BigDecimal salary = salaryCalculatorService.calculateSalary(employee);

        //then

        assertThat(salary).isEqualTo(BigDecimal.valueOf(3000));
    }

}