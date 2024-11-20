public class DeveloperFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new Developer();
    }
}
