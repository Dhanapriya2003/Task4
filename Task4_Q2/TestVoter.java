package Task4_Q2;

public class TestVoter {
    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter(101, "Alice", 25);
            System.out.println(voter1);

            // This will throw InvalidVoterAgeException
            Voter voter2 = new Voter(102, "Bob", 16);
            System.out.println(voter2);
        } catch (InvalidVoterAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}

