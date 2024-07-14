public class lesson7 {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "892312313", 40000, 35);
        persArray[2] = new Employee("Sidorov Sidr", "Developer", "sidorov@mailbox.com", "892312314", 50000, 28);
        persArray[3] = new Employee("Smirnov Smir", "Analyst", "smirnov@mailbox.com", "892312315", 35000, 40);
        persArray[4] = new Employee("Kuznetsov Kuz", "Designer", "kuznetsov@mailbox.com", "892312316", 45000, 25);
        for (Employee employee : persArray) {
            employee.printInfo();
        }
        Park park = new Park();
        Park.Attraction attraction = park.new Attraction("Свободное падение", "10:00 - 18:00", 500);
        attraction.printInfo();
    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo() {
        System.out.println("Name: " + name + ", Position: " + position + ", Email: " + email +
                ", Phone: " + phone + ", Salary: " + salary + ", Age: " + age);
    }
}
class Park {
    class Attraction {
        private String name;
        private String workingHours;
        private int cost;
        public Attraction(String name, String workingHours, int cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }
        public void printInfo() {
            System.out.println("Attraction: " + name + ", Working Hours: " + workingHours + ", Cost: " + cost);
        }
    }
}