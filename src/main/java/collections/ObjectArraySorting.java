package collections;

import java.util.Arrays;
import java.util.Scanner;

class Item implements Comparable<Item> {
	public int itemId;
	public String itemName;
	public int quantity;
	public double price;

	public Item(int itemId, String itemName, int quantity, double price) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

	public String toString() {
		return itemId + "\t" + itemName + "\t" + quantity + "\t" + price;
	}

	public int compareTo(Item i) {
//		if (itemId > i.itemId) {
//			return -1;
//		} else if (itemId < i.itemId) {
//			return 1;
//		} else {
//			return 0;
//		}
		return i.itemName.compareTo(itemName);
	}

}

public class ObjectArraySorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Array Size ?");
		int size = sc.nextInt();
		// based on size we need to create product array
		Item[] items = new Item[size];
		Item item = null;
		System.out.println("Enter Number of Product Elements ?");
		for (int i = 0; i < size; ++i) {
			System.out.println("Enter Item Id ?");
			int itemId = sc.nextInt();
			System.out.println("Enter Item Name ?");
			String name = sc.next();
			System.out.println("Enter Item Quantity ?");
			int qty = sc.nextInt();
			System.out.println("Enter Item Price ?");
			double price = sc.nextDouble();
			item = new Item(itemId, name, qty, price);// based on values created one item object
			items[i] = item;
		}
		System.out.println("Items List");
		System.out.println("ITEM-ID" + "\t" + "ITEM-NAME" + "\t" + "QTY" + "\t" + "PRICE");
		System.out.println("------------------------------------------------");
		for (Item itemValue : items) {
			System.out.println(itemValue);

		}
		Arrays.sort(items);
		System.out.println("After Sorting Product List");
		for (Item itemValue : items) {
			System.out.println(itemValue);

		}

	}

}
