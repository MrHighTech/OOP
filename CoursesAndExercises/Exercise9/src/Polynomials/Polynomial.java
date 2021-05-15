package Polynomials;

import java.util.*;

public class Polynomial {
    private TreeMap<Integer, Integer> map = new TreeMap<>();

    private Polynomial() {

    }

    public Polynomial(int... elements) {
        for (int i = 0; i < elements.length; i += 2) {
            map.put(elements[i + 1], elements[i]);
        }
    }

    public Polynomial plus(Polynomial p2) {
        Polynomial p3 = new Polynomial();

        for (Map.Entry<Integer, Integer> entry : this.map.entrySet()) {
            p3.map.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<Integer, Integer> entry : p2.map.entrySet()) {
            int curr = this.map.getOrDefault(entry.getKey(), 0);
            int val = entry.getValue();
            if (curr + val == 0) {
                p3.map.remove(entry.getKey());
            } else {
                p3.map.put(entry.getKey(), curr + val);
            }
        }

        return p3;
    }

    @Override
    public String toString() {
        String s = "";
        boolean previousWasPositive = true;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {	//ordered by power (ascending)
            String current = "";
            if (entry.getKey() == 0) {
                current = entry.getValue().toString();
            }
            else if (entry.getKey() == 1) {
                int val = entry.getValue();
                current = val != 1 ? val + "x" : "x";
            }
            else {
                int val = entry.getValue();
                if (val != 1) {
                    current = entry.getValue() + "x^" + entry.getKey();
                }
                else {
                    current = "x^" + entry.getKey();
                }
            }

            if (s.length() == 0) {
                s = current;
            }
            else {
                if (previousWasPositive) {
                    s = current + "+" + s;
                }
                else {
                    s = current + s;
                }
            }

            previousWasPositive = entry.getValue() > 0;

        }
        return s;
    }
}
