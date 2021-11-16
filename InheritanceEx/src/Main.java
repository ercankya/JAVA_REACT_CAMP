public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Employer employer = new Employer();
        CustomerService customerService=new CustomerService();
        EmployerService employerService=new EmployerService();
        PersonService personService=new PersonService();
        personService.Add();
        customerService.BestSalary();
        employerService.BestEmployer();

    }
}
