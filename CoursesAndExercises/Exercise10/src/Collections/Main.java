package Collections;

import Utils.PointsUtil;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        Map<String, Integer> standings = PointsUtil.getForYear(year);
        System.out.println(StandingsUtil.orderByPoints(standings));
    }
}
