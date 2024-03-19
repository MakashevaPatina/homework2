public class Main {
    public static void main(String[] args) {
        //Task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + " " + cat + " " + paper);
        //Task 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + " " + cat + " " + paper);
        //Task 3
        dog = dog -3.5;
        cat = cat -1.6;
        paper = paper -7639;
        System.out.println(dog + " " + cat + " " + paper);
        //Task 4
        var friend = 19;
        var friendAdd = friend + 2;
        var friendDiv = friendAdd/7;
        System.out.println(friend + " " + friendAdd + " " + friendDiv);
        //Task 5
        var frog = 3.5;
        var frogMultiply = frog * 10;
        var frogDiv = frogMultiply/7;
        var frogAdd = frogDiv + 4;
        System.out.println(frog+ " " + frogMultiply + " " + frogDiv + " " + frogAdd);
        //Task 6
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("Масса двух бойцов = " + (boxer1Weight + boxer2Weight));
        System.out.println("Разница между массами бойцов = " + (boxer2Weight - boxer1Weight));
        //Task 7
        var overLoad = (boxer1Weight+boxer2Weight)%boxer1Weight;
        System.out.println(overLoad);
        //Task 8
        var allTime = 640;
        var oneWorkerTime = 8;
        var workers = allTime/oneWorkerTime;
        System.out.println("Всего работников в компании — " + workers);
        System.out.println("Если в компании работает " + (workers + 94) + " человека, то всего " + (workers*oneWorkerTime) + " часов работы может быть поделено между сотрудниками.");


    }
}