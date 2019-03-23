package com.example.hopperhacks;

import java.util.ArrayList;

public class HopperHacks {
	public static ArrayList<Shelter> unsorted = new ArrayList<Shelter>();
	public static ArrayList<Shelter> homeless = new ArrayList<Shelter>();
	public static ArrayList<Shelter> hurricane = new ArrayList<Shelter>();
	public static ArrayList<Shelter> pet = new ArrayList<Shelter>();
	public static ArrayList<Shelter> earthquake = new ArrayList<Shelter>();
	public static ArrayList<Shelter> food = new ArrayList<Shelter>();
	public static ArrayList<Shelter> toiletries = new ArrayList<Shelter>();
	public static ArrayList<Shelter> blankets = new ArrayList<Shelter>();
	public static ArrayList<Shelter> water = new ArrayList<Shelter>();
	public static ArrayList<Shelter> clothes = new ArrayList<Shelter>();
	//public static ArrayList<Shelter> fire;
	
	public static void main (String[] argz) {
		Shelter a = new Shelter(5, "Cupertino, California", "homeless", "food", "Bil Wilson Center");
		unsorted.add(a);
		Shelter b = new Shelter(10, "Sunnyvale, California", "homeless", "toiletries", "Sunnyvale County Winter Shelter");
		unsorted.add(b);
		Shelter c = new Shelter(15, "Fremont, California", "homeless", "blankets", "Cityteam");
		unsorted.add(c);
		Shelter d = new Shelter(20, "San Jose, California", "homeless", "water", "LiveMoves");
		unsorted.add(d);
		Shelter e = new Shelter(25, "San Francisco, California", "homeless", "clothes", "Heritage Home");
		unsorted.add(e);
		Shelter f = new Shelter(5, "Cupertino, California", "hurricane", "clothes", "Rescue Wing");
		unsorted.add(f);
		Shelter g = new Shelter(10, "Sunnyvale, California", "hurricane", "water", "Emergency Management");
		unsorted.add(g);
		Shelter h = new Shelter(15, "Fremont, California", "hurricane", "blankets", "CERT USA");
		unsorted.add(h);
		Shelter i2 = new Shelter(20, "San Jose, California", "hurricane", "toiletries", "Hurricane Shelter");
		unsorted.add(i2);
		Shelter j = new Shelter(25, "San Francisco, California", "hurricane", "food", "Safe shelter");
		unsorted.add(j);
		Shelter k = new Shelter(5, "Cupertino, California", "pet", "blankets", "Care Companion");
		unsorted.add(k);
		Shelter l = new Shelter(10, "Sunnyvale, California", "pet", "water", "Safe Haven Animal Sanctuary");
		unsorted.add(l);
		Shelter m = new Shelter(15, "Fremont, California", "pet", "blankets", "Humane Society");
		unsorted.add(m);
		Shelter n = new Shelter(20, "San Jose, California", "pet", "food", "Cat Rescue");
		unsorted.add(n);
		Shelter o = new Shelter(25, "San Francisco, California", "pet", "food", "Pets In Need");
		unsorted.add(o);
		Shelter p = new Shelter(5, "Cupertino, California", "earthquake", "water", "Quake Safe");
		unsorted.add(p);
		Shelter q = new Shelter(10, "Sunnyvale, California", "earthquake", "clothes", "Disaster Free");
		unsorted.add(q);
		Shelter r = new Shelter(15, "Fremont, California", "earthquake", "toiletries", "Shake Shelter");
		unsorted.add(r);
		Shelter s = new Shelter(20, "San Jose, California", "earthquake", "food", "Earthquake Shelter");
		unsorted.add(s);
		Shelter t = new Shelter(25, "San Francisco, California", "earthquake", "blankets", "Emergency Shelter");
		unsorted.add(t);
		
		sortIntoTypes(unsorted);
		sortIntoNeeds(unsorted);
		insertionSort(homeless);
		insertionSort(hurricane);
		insertionSort(pet);
		insertionSort(earthquake);
		insertionSort(food);
		insertionSort(toiletries);
		insertionSort(blankets);
		insertionSort(water);
		insertionSort(clothes);
		System.out.println("Homeless Shelters near you: \n");
		for (int i = 0; i < homeless.size(); i++) {
			System.out.print("\t" + homeless.get(i).toString());
		}
		System.out.println("Hurricane Shelters near you: \n");
		for (int i = 0; i < hurricane.size(); i++) {
			System.out.print("\t" + hurricane.get(i).toString());
		}
		System.out.println("Pet Shelters near you: \n");
		for (int i = 0; i < pet.size(); i++) {
			System.out.print("\t" + pet.get(i).toString());
		}
		System.out.println("Earthquake Shelters near you: \n");
		for (int i = 0; i < earthquake.size(); i++) {
			System.out.print("\t" + earthquake.get(i).toString());
		}
		
		
		
		System.out.println("Shelters that need food near you: \n");
		for (int i = 0; i < food.size(); i++) {
			System.out.print("\t" + food.get(i).toString());
		}
		System.out.println("Shelters that need toiletries near you: \n");
		for (int i = 0; i < hurricane.size(); i++) {
			System.out.print("\t" + hurricane.get(i).toString());
		}
		System.out.println("Shelters that need blankets near you: \n");
		for (int i = 0; i < blankets.size(); i++) {
			System.out.print("\t" + blankets.get(i).toString());
		}
		System.out.println("Shelters that need water near you: \n");
		for (int i = 0; i < water.size(); i++) {
			System.out.print("\t" + water.get(i).toString());
		}
		System.out.println("Shelters that need clothes near you: \n");
		for (int i = 0; i < clothes.size(); i++) {
			System.out.print("\t" + clothes.get(i).toString());
		}
	}
	public static void sortIntoNeeds(ArrayList<Shelter> types) {
		for (int i = 0; i < types.size(); i++) {
			if (types.get(i).getNeeds().equals("food")) {
				food.add(types.get(i));
			}
			if(types.get(i).getNeeds().equals("toiletries")) {
				toiletries.add(types.get(i));
			}
			if (types.get(i).getNeeds().equals("blankets")) {
				blankets.add(types.get(i));
			}
			if (types.get(i).getNeeds().equals("water")) {
				water.add(types.get(i));
			}
			if (types.get(i).getNeeds().equals("clothes")) {
				clothes.add(types.get(i));
			}
		}
	}
	public static void sortIntoTypes(ArrayList<Shelter> types) {
		for (int i = 0; i < types.size(); i++) {
			if (types.get(i).getType().equals("homeless")) {
				homeless.add(types.get(i));
			}
			if (types.get(i).getType().equals("hurricane")) {
				hurricane.add(types.get(i));
			}
			if (types.get(i).getType().equals("pet")) {
				pet.add(types.get(i));
			}
			if (types.get(i).getType().equals("earthquake")) {
				earthquake.add(types.get(i));
			}
		}
	}
	public static void insertionSort (ArrayList <Shelter> arr) {
		for (int i = 1; i < arr.size(); i++) {
			Shelter temp = arr.get(i);
			boolean shift = false;
			for (int j = i-1; j >= 0; j--) {
				if (temp.compareTo(arr.get(j)) < 0) {
					arr.set(j+1, arr.get(j));
					shift = true;
				} else {
					if (shift)
						arr.set(j+1, temp);
					break;
				}
				if (j == 0 && shift)
					arr.set(j, temp);
			}

		}
	}
}
