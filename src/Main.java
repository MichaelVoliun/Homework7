public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание урока 1.7. Строки");
        System.out.println();
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName +  " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();

        System.out.println("Задание 2");
        String ignoreCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + ignoreCase);
        System.out.println();

        System.out.println("Задание 3");
        String fullNameRussian = fullName.replace(fullName,"Иванов Семён Семёнович");
        String fullNameNoE = fullNameRussian.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullNameNoE);
    }
}