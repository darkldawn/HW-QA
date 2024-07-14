public class lesson7 {
    public static void main(String[] args) {
        // Создаем массив из 5 сотрудников
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Кузнецова Ева", "Инженер", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Алексеев Даниил", "Менеджер", "petrov@mailbox.com", "892312313", 40000, 35);
        employees[2] = new Employee("Петров Иван", "Разработчик", "sidorov@mailbox.com", "892312314", 50000, 28);
        employees[3] = new Employee("Гаврилов Костантин", "Аналитик", "smirnov@mailbox.com", "892312315", 35000, 40);
        employees[4] = new Employee("Лиманов Илья", "Дизайнер", "kuznetsov@mailbox.com", "892312316", 45000, 25);
        for (Employee employee : employees) {
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