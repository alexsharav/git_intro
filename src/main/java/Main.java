interface Land {
  void walk();
}

interface Water {
  void swim();
}

interface Sky {
  void fly();
}

interface Food {
  void eat(String food);
}

class Horse implements Land, Food {
  static String name = "Лошадь";

  public void walk() {
    System.out.println(name + " ходит.");
  }

  public void eat(String food) {
    if (food.equals("траву")) {
      System.out.println(name + " ест " + food);
    } else {
      System.out.println(name + " не ест " + food + ", она ест только траву.");
    }
  }
}

class Tiger implements Land, Food {
  static String name = "Тигр";

  public void walk() {
    System.out.println(name + " ходит.");
  }

  public void eat(String food) {
    if (food.equals("говядину")) {
      System.out.println(name + " ест " + food);
    } else {
      System.out.println(name + " не ест " + food + ", он ест только мясо.");
    }
  }
}

class Dolphin implements Water, Food {
  static String name = "Дельфин";

  public void swim() {
    System.out.println(name + " плывёт.");
  }

  public void eat(String food) {
    if (food.equals("рыбу")) {
      System.out.println(name + " ест " + food);
    } else {
      System.out.println(name + " не ест " + food + ", он ест только рыбу.");
    }
  }
}

class Eagle implements Sky, Food {
  static String name = "Орел";

  public void fly() {
    System.out.println(name + " летит.");
  }

  public void eat(String food) {
    if (food.equals("мясо")) {
      System.out.println(name + " ест " + food);
    } else {
      System.out.println(name + " не ест " + food + ", он ест только мясо.");
    }
  }
}

class Camel implements Land, Food {
  static String name = "Верблюд";

  public void walk() {
    System.out.println(name + " ходит.");
  }

  public void eat(String food) {
    if (food.equals("траву")) {
      System.out.println(name + " ест " + food);
    } else {
      System.out.println(name + "не ест " + food + ", он ест только траву.");
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Horse horse = new Horse();
    Tiger tiger = new Tiger();
    Dolphin dolphin = new Dolphin();
    Eagle eagle = new Eagle();
    Camel camel = new Camel();
    horse.walk();
    horse.eat("траву");

    tiger.walk();
    tiger.eat("чипсы");

    dolphin.swim();
    dolphin.eat("рыбу");

    eagle.fly();
    eagle.eat("бутерброды");

    camel.walk();
    camel.eat("Олега");
  }
}
