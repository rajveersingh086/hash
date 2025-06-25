import java.util.*;

class candies {
    public int distributeCandies(int[] candyType) {
        // Store unique candy types only
        Set<Integer> uniqueTypes = new HashSet<>();
        for (int candy : candyType) {
            uniqueTypes.add(candy);
            // Early exit: if unique types exceed n / 2, no need to add more
            if (uniqueTypes.size() > candyType.length / 2) {
                return candyType.length / 2;
            }
        }
        return uniqueTypes.size();
    }
}
