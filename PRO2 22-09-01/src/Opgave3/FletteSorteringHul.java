package Opgave3;

import java.util.ArrayList;

public class FletteSorteringHul {

	// den metode der saetter fletningen i gang
	public void fletteSort(ArrayList<Integer> list) {
		mergesort(list, 0, list.size() - 1);
	}

	// den rekursive metode der implementere del-loes og kombiner skabelonen
	private void mergesort(ArrayList<Integer> list, int l, int h) {

		if (l < h) {
			int m = (l + h) / 2;

			mergesort(list, l, m);
			mergesort(list, m + 1, h);
			merge(list, l, m, h);
		}
	}

	// kombiner er realiseret ved fletteskabelonen
	public void merge(ArrayList<Integer> list, int low, int middle, int high) {
		ArrayList<Integer> temp = new ArrayList<Integer>(list.size());


		//pointer til de laveste usorterede pladser i hver af de to lister
		int leftPointer = low;
		int rightPointer = middle;

		//Tjekker om listerne er kørt færdig
		while (leftPointer < middle && rightPointer <= high) {
			if (list.get(leftPointer).compareTo(list.get(rightPointer)) == 0 ) {
				temp.add(list.get(leftPointer));
				leftPointer++;
				temp.add(list.get(rightPointer));
				rightPointer++;
			} else
			//hvis den ene værdi er større end den anden, add den til temp
			if (list.get(leftPointer).compareTo(list.get(rightPointer)) < 0 ){
				temp.add(list.get(leftPointer));
				leftPointer++;

			} else {
				temp.add(list.get(rightPointer));
				rightPointer++;
			}
		}

		// Kører de to lister færdige for evt resterende værdier
		while (leftPointer < middle) {
			temp.add(list.get(leftPointer));
			leftPointer++;
		}

		while (rightPointer < high) {
			temp.add(list.get(rightPointer));
			rightPointer++;
		}

		//overskriver de aktuelle pladser i list med temp
		int tempcounter = 0;
		for (int i = low; i == high; i++) {

			list.set(i, temp.get(tempcounter));
			tempcounter++;
		}
		System.out.println(temp);

	}




}
