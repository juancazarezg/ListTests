import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListTests{
	
	// Unit testing 1 for list size
	@Test
    public void getSizeOfList() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        

        // ¿qué es lo que queremos probar?
        assertEquals(4, list.size());
    }
    
    // Unit testing 2 for list size
	@Test
    public void getSizeOfList2() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(0);
        

        // ¿qué es lo que queremos probar?
        assertEquals(3, list.size());
    }
    
    // Unit testing 3 for list size
	@Test
    public void getSizeOfList3() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.remove(0);
        

        // ¿qué es lo que queremos probar?
        assertEquals(0, list.size());
    }
    
    
    // Unit testing 1 for clearing list
	@Test
    public boolean getListCleared1() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.remove(0);
        

        // ¿qué es lo que queremos probar?
    	return list.isEmpty() ;
    }
    
    // Unit testing 2 for clearing list
	@Test
    public boolean getListCleared2() {
        // Inicialización/escenario
        List<String> list = new ArrayList<>();
        list.add("hola");
        list.remove(0);
        
        // ¿qué es lo que queremos probar?
    	return list.isEmpty() ;
    }
    
    // Unit testing 3 for clearing list
	@Test
    public boolean getListCleared3() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.clear();
        

        // ¿qué es lo que queremos probar?
    	return list.isEmpty() ;
    }
    
    // Unit testing 1 for adding items
	@Test
    public boolean geItemsAdded1() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        

        // ¿qué es lo que queremos probar?
    	return list.size() > 0;
    }
    
    // Unit testing 2 for adding items
	@Test
    public boolean geItemsAdded2() {
        // Inicialización/escenario
        List<String> list = new ArrayList<>();
        list.add("hola");
        list.add("como");
        

        // ¿qué es lo que queremos probar?
    	return list.size() > 0;
    }
    
    // Unit testing 3 for adding items
	@Test
    public boolean geItemsAdded3() {
        // Inicialización/escenario
        List<List> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(list2);
        

        // ¿qué es lo que queremos probar?
    	return list.size() > 0;
    }
    
    // Unit testing 1 for checking existence of items
	@Test
    public boolean geItemsChecked1() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // ¿qué es lo que queremos probar?
    	return list.contains(2);
    }
    
    // Unit testing 2 for checking existence of items
	@Test
    public boolean geItemsChecked2() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);

        // ¿qué es lo que queremos probar?
    	return !list.contains(2);
    }
    
    // Unit testing 3 for checking existence of items
	@Test
    public boolean geItemsChecked3() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.clear();

        // ¿qué es lo que queremos probar?
    	return !list.contains(2);
    }
    
    // Unit testing 1 for getting elements by index
	@Test
    public boolean getByIndex1() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // ¿qué es lo que queremos probar?
    	return 2 == list.get(1);
    }
    
    // Unit testing 2 for getting elements by index
	@Test
    public boolean getByIndex2() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);

        // ¿qué es lo que queremos probar?
    	return 3 == list.get(1);
    }
    
    // Unit testing 3 for getting elements by index
	@Test
    public boolean getByIndex3() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.clear();
        list.add(1);
        list.add(2);

        // ¿qué es lo que queremos probar?
    	return 2 == list.get(1);
    }
    
    // Unit testing 1 for getting index of an object
	@Test
    public boolean getIndexByOject1() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.clear();
        list.add(1);
        list.add(2);

        // ¿qué es lo que queremos probar?
    	return 1 == list.indexOf(2);
    }
    
    // Unit testing 2 for getting index of an object
	@Test
    public boolean getIndexByOject2() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(2);

        // ¿qué es lo que queremos probar?
    	return 2 == list.indexOf(2);
    }
    
    // Unit testing 3 for getting index of an object
	@Test
    public boolean getIndexByOject3() {
        // Inicialización/escenario
        List<String> list = new ArrayList<>();
        list.add("Hola");
        list.add("Como");
        list.add("Estas");

        // ¿qué es lo que queremos probar?
    	return 2 == list.indexOf("Estas");
    }
    
    // Unit testing 1 for removing by index
	@Test
    public boolean getRemoveByIndex1() {
        // Inicialización/escenario
        List<String> list = new ArrayList<>();
        list.add("Hola");
        list.add("Como");
        list.remove(1);

        // ¿qué es lo que queremos probar?
    	return !list.contains("Como");
    }
    
    // Unit testing 2 for removing by index
	@Test
    public boolean getRemoveByIndex2() {
        // Inicialización/escenario
        List<String> list = new ArrayList<>();
        list.add("Hola");
        list.add("Como");
        list.remove(0);

        // ¿qué es lo que queremos probar?
    	return list.size() == 1;
    }
    
    // Unit testing 3 for removing by index
	@Test
    public boolean getRemoveByIndex3() {
        // Inicialización/escenario
        List<String> list = new ArrayList<>();
        list.add("Hola");
        list.add("Como");

        // ¿qué es lo que queremos probar?
    	return list.remove(1).equals("Como");
    }

}
