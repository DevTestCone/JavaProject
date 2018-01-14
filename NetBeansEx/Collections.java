
package collectionsintro;
import java.util.*;

public class CollectionsIntro {

    public static void main(String[] args) {
        // TODO code application logic here
        String things[] = {"eggs", "lasers", "hats", "pie"};
        List<String> listThings = new ArrayList<>();

        //  ADD ARRAY ITEMS TO LIST       
        listThings.addAll(Arrays.asList(things)); // THIS OR DOWN

        String moreThings[] = {"lasers", "hats"};
        List<String> listMoreThings = new ArrayList<>();

        //  ADD ARRAY ITEMS TO LIST     
        for (String x : moreThings) {  // OR LIKE THIS
            listMoreThings.add(x);
        }

        for (int i = 0; i < listThings.size(); i++) {
            System.out.printf("%s ", listThings.get(i));
        }

        //    EDIT LIST  THINGS
        editList(listThings, listMoreThings);
        System.out.println();

        for (int i = 0; i < listThings.size(); i++) {
            System.out.printf("%s ", listThings.get(i));
        }

    }

    //    EDIT LIST THINGS
    private static void editList(Collection<String> x, Collection<String> y) {
        //   GO THROUGH ARRAY
        Iterator<String> it = x.iterator();

        while (it.hasNext()) {
            //    IF ARRAY X HAS SAME THINGS LIKE ARRAY Y 
            if (y.contains(it.next())) {
                //    DELETE ITEM
                it.remove();
            }
        }
    }
}
