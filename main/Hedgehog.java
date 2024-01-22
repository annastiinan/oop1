package main;

//Annastiina
 

class Hedgehog {
     
    private String name;
    private int age;

    //tätä en ymärä tho
    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //speak method - parametrinä stringmuuttuja, tulostaa siilin nimi:teksti
    public void speak(String message) {
        System.out.println(name + ": " + message);
    }

    //run method - parametrinä kokonaisluku, tulostaa tektsin i kertaa valikon mukaan
    public void run(int rounds) {
        for (int i =0; i<rounds; i++) {
            System.out.println(name + " juoksee kovaa vauhtia!");
        }
    }

    // input
    public void askForInput() {
        System.out.println("Olen " + name + " ja ikäni on " + age + " vuotta, mutta antaisitko silti syötteen?");

    }
}
