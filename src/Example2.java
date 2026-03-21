import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.*;
import java.util.Iterator;

public class Example2{
  public static void main(String[] args){
        //ArrayList
        List<String> list = new ArrayList<>();
        list.add("Python");
        list.add("Java"); //1
        System.out.println(list);
        list.addFirst("HTML"); //2
        list.addLast("SQL"); //3
        System.out.println(list);
        list.add(2,"PHP"); //4
        System.out.println(list);
        list.remove(0); //5
        System.out.println(list);
        list.add("Python");
        System.out.println(list);
        System.out.println(list.get(1)); //6
        list.set(1,"MongoDB");
        System.out.println(list);
        System.out.println(list.indexOf("Java")); //7
        System.out.println(list.lastIndexOf("Python")); //8
        System.out.println(list.isEmpty()); //9

        list.clear(); //10 : Removes all elements
        System.out.println(list);

        List<String> list2 = new ArrayList<>();
        list2.add("Hi");
        list2.add("Hello");
        list2.add("Nice");
        list.addAll(list2); //11
        System.out.println(list);

        list.toArray(); //12
        System.out.println(list);


        List<Integer> list3 = new ArrayList<>();
        list3.add(20);
        list3.add(10);
        list3.add(40);
        list3.add(70);

        System.out.println(list3);
        list3.sort(null); //13
        System.out.println(list3);
        list3.sort(Comparator.reverseOrder());
        System.out.println(list3); //14

        
        
        //LinkedList
        List<Integer> l_list=new LinkedList<>();
        l_list.addFirst(50);//1
        System.out.println(l_list);
        l_list.addLast(90);//2
        l_list.addLast(100);
        System.out.println(l_list);
        l_list.removeLast();//3
        System.out.println(l_list);
        System.out.println(l_list.peekFirst());//4
        System.out.println(l_list.getFirst());//5
        System.out.println(l_list.removeFirst());//6
        l_list.add(1,30);
        l_list.add(2,70);
        l_list.removeFirst();
        l_list.removeLast();//7
        System.out.println(l_list);
    

       
        //ArrayList
        List<String> f_list=new ArrayList<>();
        f_list.add("Riya");
        f_list.add("Sara");
        f_list.add("Ram");
        f_list.add("Sham");*/

        //To print elements in Collections (3 ways)

        for(int i=0;i<f_list.size();i++){
            System.out.println(f_list.get(i));//1
        }

        for(String ele:f_list){
            System.out.println(ele);//2
        }

        Iterator<String> ele=f_list.iterator();
        while(ele.hasNext()){
            System.out.println(ele.next());//3
        }

        
    
        //Vector
        Vector<String> mammals= new Vector<>();
        mammals.add("Horse");
        mammals.add("Tiger");//1

        mammals.add(1,"Cat");
        System.out.println(mammals);

        Vector<String> animals =new Vector<>();
        animals.addAll(mammals);//2
        System.out.println(animals);

        animals.remove("Horse");
        System.out.println(animals);

        animals.remove(1);//3
        System.out.println(animals);

        System.out.println(mammals.toString());


        //Stack
        Stack<String> animals=new Stack<>();
        animals.push("Horse");//1
        animals.push("Tiger");
        animals.push("Cat");
        System.out.println(animals);
        animals.pop();//2
        System.out.println(animals);
        animals.remove(1);//3
        System.out.println(animals);
        animals.push("Dog");
        animals.push("Elephant");
        System.out.println(animals.peek());//Latest element
        System.out.println(animals);
        System.out.println(animals.search("Elephant"));//check

        System.out.println(animals.empty());

        
    
        //Set (no order)
        Set<String> set =new HashSet<>();
        set.add("Dog");//1
        set.add("Cat");
        set.add("Horse");
        set.add("Cat");
        set.add(null);
        System.out.println(set);

        Set<String> b=new HashSet<>();
        b.add("Frog");
        set.addAll(b);//Union
        System.out.println(set);
        set.retainAll(b);//Intersection
        System.out.println(set);
        set.removeAll(b);//Difference
        System.out.println(set);

        
        
        //Trees ( no order but automatically rearranges itself)
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(50);ts.add(10);ts.add(70);
        System.out.println(ts);
        System.out.println(ts.first());
        System.out.println(ts.last());

        System.out.println(ts.floor(25)); //<=25
        System.out.println(ts.ceiling(25));//>=25
        System.out.println(ts.lower(50));//<50
        System.out.println(ts.higher(50));//>50

        System.out.println(ts.headSet(50));//Till 50
        System.out.println(ts.tailSet(50));//50 and After 50
        System.out.println(ts.subSet(10,50));
        System.out.println(ts.descendingSet());

        
        
        //Map-HashMap
        Map<Integer,String> Lang=new HashMap<>();
        Lang.put(101,"Java");//1
        Lang.put(102,"Python");
        Lang.put(103,"SQL");
        System.out.println(Lang);

        Map<Integer,String> Res = new HashMap<>();
        Res.put(101,"HTML");//Older value will be replaced by newer one
        Res.put(106,"PHP");
        Res.put(107,null);

        Lang.putAll(Res);//2
        System.out.println(Lang);
        Lang.remove(101);//3
        System.out.println(Lang);

        
          
        //TreeMap
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("Banana",1);//1
        tm.put("Apple",2);
        tm.put("Cherry",3);

        System.out.println(tm);
        System.out.println(tm.firstKey());//2
        System.out.println(tm.lastKey());//3

        System.out.println(tm.floorKey("B"));
        System.out.println(tm.ceilingKey("B"));
        System.out.println(tm.lowerKey("Banana"));
        System.out.println(tm.higherKey("Banana"));
        System.out.println(tm.headMap("Cherry"));
        System.out.println(tm.subMap("Apple","Cherry"));
        System.out.println(tm.descendingMap());

        
        
        //Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(5);        pq.offer(6);        pq.offer(7);//1
        System.out.println(pq.peek());//2
        System.out.println(pq.poll());//3
        System.out.println(pq.poll());//4
  }
}

  

