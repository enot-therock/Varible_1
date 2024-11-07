public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача №2");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача №3");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача №4");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача №5");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача №6");

        var boxerMax = 78.2;
        var boxerBill = 82.7;
        System.out.println("Вес боксера Макса = " + boxerMax + " кг.");
        System.out.println("Вес боксера Билла = " + boxerBill + " кг.");
        var totalWeight = boxerMax + boxerBill;
        System.out.println("Общий вес бойцов = " + totalWeight + " кг");
        var differenceWeight = boxerBill - boxerMax;
        System.out.println("Разница в весе бойцов = " + differenceWeight + " кг");

        System.out.println("Задача №7");

        var overweight = boxerBill % boxerMax;
        System.out.println(overweight);

        System.out.println("Задача №8");

        var allTimes = 640;
        System.out.println("Время работы всех сотрудников кампании в день = " + allTimes + " часов.");
        var timeWorkingOnePerson = 8;
        System.out.println("Время работы одного сотрудника = " + timeWorkingOnePerson + " часов.");
        var person = allTimes / timeWorkingOnePerson;
        System.out.println("Всего работников в компании - " + person + " человек.");

        person = person + 94;
        allTimes = person * timeWorkingOnePerson;
        System.out.println("Если в компании работает " + person + " человека, то всего " + allTimes + " часа работы может быть поделено между сотрудниками.");
    }

}