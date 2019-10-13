package bsu.rfe.java.group6.lab1.Korobkin.varC1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
	static boolean sort = false;
	static boolean bCalories = false;
	public static void main(String[] args)throws IllegalAccessException,
	InvocationTargetException, InstantiationException {
		Food[] breakfast = new Food[20];
		int i = 0;
		try {
			for (String arg: args) {       
				String[] parts = arg.split("/");
				if(!arg.startsWith("-")) continue;
				if (parts[0].equals("-sort")) { 
					sort = true; 
					continue;
				} 
				if (parts[0].equals("-calories")) { 
					bCalories = true; 
					continue;
				} 
				Class<?> myClass = Class.forName("bsu.rfe.java.group6.lab1.Korobkin.varC1." + parts[0].substring(1));

				if (parts.length == 1) {
					Constructor<?> constructor = myClass.getConstructor();
					breakfast[i] = (Food) constructor.newInstance();
				} else if (parts.length == 2) {
					Constructor<?> constructor = myClass.getConstructor(String.class);
					breakfast[i] = (Food) constructor.newInstance(parts[1]);
				} else if (parts.length == 3) {
					Constructor<?> constructor = myClass.getConstructor(String.class, String.class);
					breakfast[i] = (Food) constructor.newInstance(parts[1], parts[2]);
				}
				i++;
			}   
		}
		catch(ClassNotFoundException err){
			System.out.println("класс не найден."+err);
		}
		catch(NoSuchMethodException err){
			System.out.println("метод не найден.");
		}
		if(sort) {
			Arrays.sort(breakfast, new Comparator<Object>() {
				public int compare(Object o1, Object o2) {

					if (o1 == null || ((Food) o1).getName().length() > ((Food) o2).getName().length())
						return 1;
					if (o2 == null || ((Food) o1).getName().length() < ((Food) o2).getName().length())
						return -1;
					else return 0;
				}
			});
		}

		int iCalories = 0;
		System.out.println("Ваш завтрак:");
		for(Food j:breakfast) {
			if(j == null) break;
			System.out.println(j);
			iCalories += j.calculateCalories();
		}
		if(bCalories) System.out.println("общая калорийность завтрака " + iCalories + " кал");
		System.out.flush();

	}

}