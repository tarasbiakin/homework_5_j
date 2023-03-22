package org.example;

import java.util.*;

public class PhoneBook {
    private static int num = 0;
    static HashMap<String, ArrayList<String>> phoneMap = new HashMap<>();



public static void main(String[] args) {

    PhoneBook pb = new PhoneBook();
    pb.add("Светлана Петрова", "8(902)155-25-15");
    pb.add("Кристина Белова", "8(903)125-25-15");
    pb.add("Анна Мусина", "8(805)575-15-35");
    pb.add("Иван Юрин", "8(807)595-35-05");
    pb.add("Иван Юрин", "8(806)552-33-75");
    pb.add("Павел Чернов", "8(903)125-26-55");
    pb.add("Петр Чернышов", "8(903)115-25-35");
    pb.add("Марина Светлова", "8(903)115-25-35");
    pb.add("Мария Федорова", "8(903)715-25-36");
    pb.add("Мария Савина", "8(903)315-22-32");
    pb.add("Мария Рыкова", "8(903)125-27-34");
    pb.add("Марина Лугова", "8(903)115-65-85");
    pb.add("Анна Владимирова", "8(903)415-25-39");
    pb.add("Иван Мечников", "8(983)115-25-30");
    pb.add("Петр Петин", "8(903)125-45-31");
    pb.add("Иван Ежов", "8(903)115-25-32");
    pb.add("Светлана Петрова", "8(902)155-35-15");

//нужно вписать искомое имя
    ArrayList<String> returnList = new ArrayList<>();
    for (String x : pb.get("Иван Юрин")) {
        returnList.add("Иван Юрин");

    }System.out.println(returnList.get(0)+" :количество номеров:"+returnList.size()+","+ "номера: "+ pb.get("Иван Юрин"));

        ArrayList<String> List = new ArrayList<>();
        for (String key: phoneMap.keySet()){
            List.add(String.valueOf(phoneMap.get(key)));
        }
//    System.out.println(List);
        Collections.sort(List);
    System.out.println("Номера телефонов" + List );



//не разобрался
//    List<ArrayList<String>> peopleByAge = new ArrayList<>(phoneMap.values());
//    Collections.sort(peopleByAge, Comparator.comparing(ArrayList<String>::get));
//
//    for (ArrayList<String> p:peopleByAge){
//        System.out.println(p.get() + "\t" + p.get());
//    }
// Collections.sort(listOfPhones);

}



    public ArrayList<String> get(String surname) {
        return phoneMap.get(surname);
    }

    private void add(String surname, String phone) {
        // Создаем отдельный ArrayList.
        ArrayList<String> telNums = phoneMap.get(surname); //Ищу существующую фамилию

        ArrayList<String> listOfPhones = null;
        if (telNums == null) {
            listOfPhones = new ArrayList<>();
            listOfPhones.add(phone);
            phoneMap.put(surname, listOfPhones);
        } else {
            telNums.add(phone);
            phoneMap.put(surname, telNums);
        }

//        return listOfPhones;
//        List<String> listOfPhones1 = new ArrayList<>();
//        listOfPhones1.addAll(listOfPhones);
//        Collections.sort(listOfPhones1);
//        System.out.println(listOfPhones1);
    }
}