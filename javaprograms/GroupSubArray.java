package com.techjivaa.fhirR4JsonConverter.javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupSubArray {
    public static void main(String[] args) {

        String s=null;
        if(s.equals("a")){
            System.out.println("correct");
        }else{
            System.out.println("not correct");
        }

//        List<Integer> inputList = Arrays.asList(11, 1000, 1004, 1275, 10005, 10177, 10240, 10641, 10903, 11495, 11628, 15629, 18630, 21631, 21680, 23745, 24827, 28828, 33955, 44087, 48755, 50073);
//        List<List<Integer>> outputSubarrays = groupSubarraysWithRange(inputList);
//        System.out.println(outputSubarrays);
    }

    public static List<List<Integer>> groupSubarraysWithRange(List<Integer> inputList) {
        List<List<Integer>> subarrays = new ArrayList<>();
        int start = 0;
        int end = 0;
        while (end < inputList.size()) {
            if (inputList.get(end) < 500) {  // Check if the current element is less than 500
                end++;
            } else {
                int rangeStart = 500 * (subarrays.size() + 1);
                if (end < inputList.size() && inputList.get(end) < rangeStart) {
                    subarrays.add(inputList.subList(start, end));
                } else {
                    subarrays.add(inputList.subList(start, inputList.size()));
                    start = end;
                }
                end = start;
                while (end < inputList.size() && inputList.get(end) < rangeStart) {
                    end++;
                }
            }
        }
        if (subarrays.size() > 0 && subarrays.get(subarrays.size() - 1).size() == 0) {
            subarrays.remove(subarrays.size() - 1);
        }
        return subarrays;
    }
}