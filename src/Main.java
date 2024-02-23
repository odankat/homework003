public class Main {
    public static void main(String[] args) {

        // Задание 1

        int age1 = 17;
        if ( age1 >= 18 ) {
            System.out.println("Человек совершеннолетний");} else {
            System.out.println("Он не достиг совершеннолетия, нужно подождать");}

        // Задание 2

        int temp = 5;
        if ( temp < 5 ) {
            System.out.println("На улице " + temp + " градусов, нужео надеть шапку!");} else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки!");}

        // Задание 3

        int speed = 60;
        if ( speed > 60 ) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");}
        else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");}

        // Задание 4

        int age = 2;
        if ( age >= 2 && age <= 6) {
            System.out.println("Если ворзраст человека равен " + age + ", то ему нужно ходить в детский сад");}
        else if ( age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");}
        else if ( age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в универ");}
        else if ( age > 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходжить на работу");}

        // Задание 5

        int ageChild = 14;
        if ( ageChild < 5 ) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на атракционе");}
        else if ( ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься в сопровождение взрослого");}
        else if ( ageChild >= 14 ){
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься самостоятельно");}

         // Задание 6

        int peopleInWagon = 102;
        int seatsPeople = 60;
        int standingPeople = peopleInWagon - seatsPeople ;
        int people = 102;
        if (people <= seatsPeople && people >= 0 ) {
            System.out.println("Сидячих мест осталось " + (seatsPeople - people) );}
        else if (people > seatsPeople && people < peopleInWagon) {
            System.out.println("Стоячих мест осталось " + (peopleInWagon - people));
        }
        else {
            System.out.println("Мест в вагоне не осталось");}

        // Задание 7

        int one = 1;
        int two = 2;
        int three = 3;
        if ( one > two && one > three ) {
            System.out.println("самое большое число - one");}
        else if ( two > one && two > three ) {
            System.out.println("самое больше число - two");}
        else if ( three > one && three > two ) {
            System.out.println("самое больше число - three");}





    }
}
