public class Main {
    public static void main(String[] args) {
        // Задача 1
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        // Задача 2
        System.out.println("Данный фио сотрудника для заполнения отчета - " + fullName.toUpperCase());
        //Задача 3
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullName.replace("ё","е"));
        
    }
}