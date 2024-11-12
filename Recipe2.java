package org.example;

import java.util.*;

public class Recipe2 {
    public static void main(String[] args) {
        System.out.println(">>");
        Scanner sc = new Scanner(System.in);


        ArrayList<String> list = new ArrayList<String>();
        Set<String> set = new HashSet<String>();
        Map<Integer, String> map = new HashMap<Integer, String>();


        String type = sc.nextLine();
        String title = "[" + sc.nextLine() + "]";
        int i = 0;


        if (type.equalsIgnoreCase("list")) {
            while (sc.hasNext()) {
                String recipe = sc.nextLine();
                if(recipe.equals("끝"))
                    break;
                list.add(recipe);
            }
            System.out.println(title);
            Iterator<String> it = list.iterator();

            while (it.hasNext()) {
                System.out.println(++i + "." + it.next());
            }
        } else if (type.equalsIgnoreCase("set")) {
            while(sc.hasNext()){
                String recipe = sc.nextLine();
                if(recipe.equals("끝"))
                    break;
                set.add(recipe);
            }
            System.out.println(title);
            Iterator it = set.iterator();

           while(it.hasNext()){
                System.out.println(++i + "." + it.next());
            }

        } else if (type.equalsIgnoreCase("map")) {
            while(sc.hasNext()){
                String recipe = sc.nextLine();
                 if(recipe.equals("끝"))
                     break;
                map.put(++i,recipe);
            }
            System.out.println(title);

            Set<Integer>  ms = map.keySet();
            Iterator<Integer> e = ms.iterator();


            while(e.hasNext()){
                int key=e.next();
                System.out.println(key+"."+map.get(key));
            }
            }
        }
    }

