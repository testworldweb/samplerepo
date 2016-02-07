package com.testworldweb.permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DisasterRecovery {

	public static void main(String[] args) {

		System.out.println("Enter the number of Servers to be recovered ! ");
		Scanner in = new Scanner(System.in);
		String servers = in.nextLine();

		System.out
				.println("Enter the Server with downtime , separated by the space ! ");
		String input = in.nextLine();
		in.close();
		List<Integer> cost = new ArrayList<Integer>();

		for (String s : input.split("\\s")) {
			cost.add(Integer.parseInt(s));
		}

		System.out.println(" Printed");
		HashMap<String, Long> hm = new HashMap<String, Long>();
		System.out.println(mincost(cost, 0, cost.size() - 1, 1, hm));
	}

	public static long mincost(List<Integer> cost, int start, int end,
			int multiplier, HashMap<String, Long> hm) {
		if (hm.containsKey(start + "," + end + "," + multiplier)) {
			return hm.get(start + "," + end + "," + multiplier);
		}

		if (start == end)
			return (multiplier * cost.get(start));
		long c1 = (multiplier * cost.get(start))
				+ mincost(cost, start + 1, end, multiplier + 1, hm);
		long c2 = (multiplier * cost.get(end))
				+ mincost(cost, start, end - 1, multiplier + 1, hm);
		if (c1 < c2) {
			hm.put(start + "," + end + "," + multiplier, c1);
			return c1;
		} else {
			hm.put(start + "," + end + "," + multiplier, c2);
			return c2;
		}

	}

}