package tdd.exercise;

public class Game
{
    public static void main( String[] args )
    {
        new Game().printNumbers();
    }

    private void printNumbers() {
        for(int i = 1; i <= 100; i++) {
            System.out.println(resultFor(i));
        }
    }

    String resultFor(int number) {
        return String.valueOf(number);
    }
}
