package fundamentals;

import java.util.*;

public class Rank {
    public static String nthRank(String st, Integer[] we, int n) {
        Map<Character, Integer> rank = Rank.rank();
        if(st.equals("")) {
            return "No participants";
        }
        String[] names = st.split(",");
        if(names.length < n) {
            return "Not enough participants";
        }

        int count = 0;
        String duplicate = "";
        int duplicateNumber = 0;
        Map<Integer, String> list = new TreeMap<Integer, String>();
        List<Integer> nums = new ArrayList<Integer>();
        for(String name: names) {
            if(list.get(Rank.winningNumber(name, we[count], rank)) == null) {
                list.put(Rank.winningNumber(name, we[count], rank), name);
                nums.add(Rank.winningNumber(name, we[count], rank));
            } else {
                duplicateNumber = Rank.winningNumber(name, we[count], rank);
                duplicate = list.get(duplicateNumber);
                list.put(Rank.winningNumber(name, we[count], rank), name);
                if(name.charAt(0) > duplicate.charAt(0)) {
                    list.put(duplicateNumber+1, duplicate);
                    nums.add(duplicateNumber+1);
                } else {
                    list.put(duplicateNumber-1, duplicate);
                    nums.add(duplicateNumber-1);
                }
            }
            count++;
        }
        Collections.sort(nums);
        Collections.reverse(nums);
        System.out.println("Nums: " + nums);
        System.out.println("List: " + list);
        System.out.println(list.get(nums.get(n-1)));

        return list.get(nums.get(n-1));
    }

    private static Map<Character, Integer> rank() {
        Map<Character, Integer> rank = new HashMap<Character, Integer>();
        int count = 1;
        Character[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for(Character letter: letters) {
            rank.put(letter, count);
            count++;
        }
        return rank;
    }

    private static int winningNumber(String name, int weight, Map<Character, Integer> rank) {
        int count = 0;
        for(Character c: name.toLowerCase().toCharArray()) {
            count += rank.get(c);
        }
        return (count + name.length()) * weight;
    }
}

//        To participate in a prize draw each one gives his/her firstname.
//
//        Each letter of a firstname has a value which is its rank in the English alphabet.
//        A and a have rank 1, B and b rank 2 and so on.
//
//        The length of the firstname is added to the sum of these ranks hence a number n.
//        An array of random weights is linked to the firstnames and each n
//        is multiplied by its corresponding weight to get what they call a winning number.
//
//        Example: names: COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH weights: [1, 4, 4, 5, 2, 1]
//
//        PAUL -> n = length of firstname + 16 + 1 + 21 + 12 = 4 + 50 -> 54
//        The weight associated with PAUL is 2 so Paul's winning number is 54 * 2 = 108.
//
//        Now one can sort the firstnames in decreasing order of the winning numbers.
//        When two people have the same winning number sort them alphabetically by their firstnames.
//
//        #Task:
//
//        parameters: st a string of firstnames, we an array of weights, n a rank
//
//        return: the firstname of the participant whose rank is n (ranks are numbered from 1)
//
//        #Example: names: COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH weights: [1, 4, 4, 5, 2, 1] n: 4
//
//        The function should return: PauL
