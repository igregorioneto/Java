package org.study;

class Animal {
    public String getTipo() {
        return "Animal";
    }
}

class Mamifero extends Animal {
    public String getTipo() {
        return "Mamifero";
    }
}

class Gato extends Mamifero {
    public String getTipo() {
        return "Gato";
    }
}

class Golfinho extends Mamifero {
    public String getTipo() {
        return "Golfinho";
    }
}

public class AnimalTeste {
    public static void main(String[] args) {
        Mamifero m = new Gato();
        Animal a = m;
        System.out.println(a.getTipo());
        Golfinho g = (Golfinho)a;
    }
}
