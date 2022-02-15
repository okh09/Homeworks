package lesson5;

public class HomeworkLesson5 {

    public static void main(String[] args) {

        Personal[] personArray = new Personal[5];
        personArray[0] = new Personal("Александр Петров Дмитриевич", "sasha77@mail.ru", "Бухгалтер", "89001634422",41, 50000);
        personArray[1] = new Personal("Петр Иванов Константинович", "petya9@mail.ru", "Кассир", "89001856000", 35, 40000);
        personArray[2] = new Personal("Владимир Путин Владимирович", "putin@yandex.ru", "Директор", "89001800875",65, 100000);
        personArray[3] = new Personal("Леонид Волков Евгениевич", "samuray8@gmail.com", "Инженер", "89001958197",45, 80000);
        personArray[4] = new Personal("Ксения Собчак Анатолиевна", "sobchak01@mail.ru", "Кассир", "89001556677", 33, 50000);

        for (int i = 0; i < personArray.length; i++) {
            Personal personal = personArray[i];
            if (personal.getAge() > 40)
                System.out.println(personal);

        }
    }


}
