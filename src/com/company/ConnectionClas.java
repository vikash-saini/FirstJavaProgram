package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConnectionClas {

    public static void main(String[] args) {

//        Operation 1: Adding elements to the Collections class object
        ArrayList<String> item = new ArrayList<>();
        item.add("Shoes");
        item.add("Toys");

        Collections.addAll(item,"Fruits", "Bat", "Ball");
        System.out.println(item);

//        Operation 2: Sorting a Collection
        Collections.sort(item);
        System.out.println("sorting: "+item);
//        reverswe sort
        Collections.sort(item,Collections.reverseOrder());
        System.out.println("reverse sort: "+item);
        Collections.sort(item);
//        Operation 3: Searching in a Collection
//        java.util.Collections.binarySearch() method returns the position of an object in a sorted list.
//        To use this method, the list should be sorted in ascending order, otherwise, the result returned from the method will be wrong.
//        If the element exists in the list, the method will return the position of the element in the sorted list,
//        otherwise, the result returned by the method would be the – (insertion point where the element should have been present if exist)-1).
        System.out.println("The index of Fruits is :"+Collections.binarySearch(item,"Shoes"));
        System.out.println("The index of Fruits is :"+Collections.binarySearch(item,"Dog"));

//        Operation 4: Copying Elements
//        The copy() method of java.util.Collections class is used to copy all the elements from one list into another.
//        After the operation, the index of each copied element in the destination list will be identical to its index in the source list.
//        The destination list must be at least as long as the source list.
//        If it is longer, the remaining elements in the destination list are unaffected.

        // Create destination list
        List<String> destination_List = new ArrayList<>();

        // Add elements
        destination_List.add("Shoes");
        destination_List.add("Toys");
        destination_List.add("Horse");
        destination_List.add("Tiger");

        // Print the elements
        System.out.println(
                "The Original Destination list is "+destination_List);

        // Create source list
        List<String> source_List = new ArrayList<>();

        // Add elements
        source_List.add("Bat");
        source_List.add("Frog");
        source_List.add("Lion");

        // Copy the elements from source to destination
        Collections.copy(destination_List, source_List);

        // Printing the modified list
        System.out.println(
                "The Destination List After copying is "+destination_List);

//        Operation 5: Disjoint Collection
//        java.util.Collections.disjoint() is used to check whether two specified collections are disjoint or not.
//        More formally, two collections are disjoint if they have no elements in common.
//        It returns true if the two collections do not have any element in common.

        System.out.println(Collections.disjoint(destination_List,source_List));

    }
}
