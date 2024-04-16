import java.util.*;

public class UniquePairsCounter {

    static class Pair {
        String first;
        String second;

        Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Pair other = (Pair) obj;
            return (Objects.equals(first, other.first) && Objects.equals(second, other.second)) ||
                   (Objects.equals(first, other.second) && Objects.equals(second, other.first));
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second) + Objects.hash(second, first);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        scanner.nextLine(); 

        Set<Pair> uniquePairs = new HashSet<>();
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] pair = line.split(" ");

            Pair currentPair = new Pair(pair[0], pair[1]);

            if (!uniquePairs.contains(currentPair)) {
                uniquePairs.add(currentPair);
            }

            results.add(uniquePairs.size());
        }

        for (int result : results) {
            System.out.println(result);
        }

        scanner.close();
    }
}
