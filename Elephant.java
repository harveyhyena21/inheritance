public class Elephant extends Animal {
    public Elephant (String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("An elephant arrives at the zoo.");
    }
    public Elephant() {
        
    }
    public void trumpet() {
        System.out.println("The elephant trumpets.");
    }
    public void forage() {
        System.out.println("The elephant forages.");
    }
}
