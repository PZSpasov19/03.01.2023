import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
      //int[] ints = new int[5];

      //String[] names = {"Gosho", "Ivan"};
      //  for (int i = 0; i< names.length; i++)
      //  {
      //      System.out.println(names[i] + ", ");
      //  }
//
       //for (String name : names)
       //{
       //    if(name.equals("Ivan"))
       //    {
       //        name = "Oragan";
       //    }
       //}

       //for (int i = 0, i < names.length; i++)
       //{
       //
       //}
        //Scanner scanner = new Scanner(System.in);
        //String input = scanner.nextLine();
        //String[] tokens = input.split("\\s+");
        //for (int i = 0; i < tokens.length / 2; i++)
        //{
        //    String temp =tokens[i];
        //    tokens[i] = tokens[tokens.length - 1 - i];
        //    tokens[tokens.length - 1 - i] = temp;
        //}
        //List<String> names = newArrayList<>();
        //names.add("Ivan");
        //names.add("Dragan");
        //names.add("Gosho");
        ////System.out.println(String.join(" ", tokens));

        List<Integer> ints = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        List<String> Linked = new LinkedList<>();
//
        //ints.add(10);
        //ints.add(10);
        //ints.add(10);
//
        //ints.remove(Integer.valueOf(10));
        //for (int i = 0; i< ints.size(); i++)
        //{
        //    System.out.println(ints.get(i));
        //}
//
        //strings.add("Gosho");
        //strings.add("Tosho");
        //strings.add("Ivan");
        //strings.remove("Gosho");
        //strings.remove(1);
//
        //strings.add("Dragan");
        //strings.add(1, "Doncho");
//
        //strings.set(0, "Test");
        //System.out.println();
//
        //for (int i = 0; i < strings.size(); i++)
        //{
        //    System.out.println(strings.get(i));
        //}
//
        //System.out.println(strings.contains("Tosho"));
        //System.out.println(strings.contains("Gosho"));

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        strings.add("adsa");
        strings.add("second");
        strings.add("third");
        System.out.println(String.join(", ", strings));
        Collections.sort(strings);
        System.out.println(String.join(", ", strings));
        ints = Arrays.stream(input.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.reverse(strings);
        System.out.println(String.join(", ", strings));
        String[] tokens = input.split("\\s");
        //System.out.println(tokens[1]);
        //tokens[1] = "Index1";
        //System.out.println(tokens[1]);
        for (int i = 0; i < tokens.length; i++);
        {
            int element = Integer.parseInt(tokens[i]);
            ints.add(element);
        }

        for (int i = 0; i < ints.size(); i++)
        {
            System.out.println(ints.get(i) + " ");
            ints.set(i, 10);
        }
    }
}
