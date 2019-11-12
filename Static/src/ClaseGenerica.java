class ClaseGenerica<T> {
  T obj;
 
  public ClaseGenerica(T o) {
    obj = o;
  }
 
  public void classType() {
    System.out.println("El tipo de T es " + obj.getClass().getName());
  }
}

public class Class {
  public static void main(String args[]) {
    // Creamos una instancia de ClaseGenerica para Integer.
    ClaseGenerica<Integer> intObj = new ClaseGenerica<Integer>(88);
    intObj.classType();
 
    // Creamos una instancia de ClaseGenerica para String.
    ClaseGenerica<String> strObj = new ClaseGenerica<String>("Test");
    strObj.classType();
 
  }
}

// En Java, cuando definimos una nueva clase, debemos conocer el tipo de dato con el que trabajaremos. 
// Si queremos realizar una operación específica dentro de esta nueva clase, 
// sea cual sea el tipo de datos que va a recibir, podemos hacer uso de los tipos genéricos. 
// Este tipo genérico asumirá el tipo de dato que realmente le pasaremos a la clase.