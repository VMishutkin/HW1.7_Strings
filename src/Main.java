import java.util.Arrays;
        public class Main {
            public static void main(String[] args) {
        /*
        Задание 4
К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
В качестве исходных данных используйте:
Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
переменная firstName — для хранения имени;
переменная middleName — для хранения отчества;
переменная lastName — для хранения фамилии.
Решите задание с помощью метода substring().
Результат программы выведите в формате:
“Имя сотрудника — …”
“Фамилия сотрудника — …”
“Отчество сотрудника — ...”
:лампочка: Важно: «в голове» высчитывать позиции пробелов и параметров для обрезания строки запрещено. Их должен вычислить компьютер.
:sos: Подсказка - Определить индексы символов помогут методы indexOf() и lastIndexOf().
         */
                String fullName = "Ivanov Ivan Ivanovich";
                String firstName = fullName.substring(0, fullName.indexOf(" "));
                String lastName = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));
                //Через substring и indexOf
                String middleName = fullName.substring(fullName.lastIndexOf(" ") + 1);
                System.out.printf("Имя - %s, Фамилия - %s, Отчество - %s\n", firstName, lastName, middleName);
                // По человечески
                String[] subNames = fullName.split(" ");
                System.out.printf("Имя - %s, Фамилия - %s, Отчество - %s\n", subNames[0], subNames[1], subNames[2]);
        /*
        Задание 5
Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О. в правильный формат.
В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“, которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв — …”
:sos: Подсказка 1
Метод toCharArray() может быть полезен.
:sos: Подсказка 2
Для преобразования символа в верхний регистр следует использовать метод Character.toUpperCase(c), где c — символ.
         */
                //Способ 1
                fullName = "ivanov ivan ivanovich";
                lastName = fullName.substring(0, fullName.indexOf(" "));
                firstName = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));
                middleName = fullName.substring(fullName.lastIndexOf(" ") + 1);
                char[] lastNameToCharArray = lastName.toCharArray();
                lastNameToCharArray[0] = Character.toUpperCase(lastNameToCharArray[0]);
                char[] firstNameToCharArray = firstName.toCharArray();
                firstNameToCharArray[0] = Character.toUpperCase(firstNameToCharArray[0]);
                char[] middleNameToCharArray = middleName.toCharArray();
                middleNameToCharArray[0] = Character.toUpperCase(middleNameToCharArray[0]);
                fullName = new String(lastNameToCharArray)+ " " + new String(firstNameToCharArray) + " " + new String(middleNameToCharArray);
                System.out.printf("Верное написание Ф.И.О. сотрудника с заглавных букв - %s\n", fullName);
                //способ 2
                fullName = "ivanov ivan ivanovich";
                lastName = fullName.substring(0, fullName.indexOf(" "));
                firstName = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));
                middleName = fullName.substring(fullName.lastIndexOf(" ") + 1);
                char firstLetter = Character.toUpperCase(firstName.charAt(0));
                firstName = Character.toString(firstLetter) + firstName.substring(1);
                firstLetter = Character.toUpperCase(lastName.charAt(0));
                lastName = Character.toString(firstLetter) + lastName.substring(1);
                firstLetter = Character.toUpperCase(middleName.charAt(0));
                middleName = Character.toString(firstLetter) + middleName.substring(1);
                fullName = lastName+ " " + firstName + " " + middleName;
                System.out.printf("Верное написание Ф.И.О. сотрудника с заглавных букв - %s\n", fullName);
        /*
        Задание 6
Имеется две строки.
Первая: "135"
Вторая: "246"
Соберите из двух строк одну, содержащую данные "123456".
Использовать сортировку нельзя.
Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
Выведите результат в консоль в формате: “Данные строки — ….”
         */
                String firstString = "135";
                String secondString = "246";
                StringBuilder resultString = new StringBuilder();
                int curChar = 0;
                //модернизировал цикл чтобы можно было перемешивать строки любого размера
                while (curChar < (firstString.length()> secondString.length() ? firstString.length() : secondString.length())){
                    if (curChar<firstString.length()){
                        resultString.append(firstString.charAt(curChar));
                        System.out.print(firstString.charAt(curChar));
                    }
                    if (curChar< secondString.length()){
                        resultString.append(secondString.charAt(curChar));
                        System.out.print(secondString.charAt(curChar));
                    }
                    curChar++;
                }
                System.out.println();
        /*
        Старая рабочая версия для строк одного размера
        for (int i = 0; i < firstString.length() && i<secondString.length(); i++) {
            resultString.append(firstString.charAt(i));
            resultString.append(secondString.charAt(i));
        }*/
                //System.out.println(resultString);

        /*
        Задание 7
Дана строка из букв английского алфавита "aabccddefgghiijjkk".
Нужно найти и напечатать буквы, которые дублируются в строке.
Обратите внимание, что строка отсортирована, т. е. дубли идут друг за другом.
В итоге в консоль должен быть выведен результат программы: "acdgijk".
Критерии оценки
– Данные в строке отсортированы корректно.
– При изменении содержания строки результат программы выполняется.
– Результат программы выведен в консоль согласно условиям задачи. (отредактировано)
         */
                String exersizeString = "aabccddefgghiijjkk";
                for (int i = 0; i < exersizeString.length()-1; i++) {
                    if(exersizeString.charAt(i)==exersizeString.charAt(i+1)){
                        System.out.print(exersizeString.charAt(i));
                        i++;
                    }
                }


            }
        }
        
