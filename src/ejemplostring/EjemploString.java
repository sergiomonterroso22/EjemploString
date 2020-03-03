
package ejemplostring;

public class EjemploString {

    
    public static void main(String[] args) {
        
     String cadena1 = "Guatemala";
     String cadena2 = "El Salvador";
     String cadena3 = "Honduras";
     String cadena4 = "Guatemala";
     int poblacion = 8745123;
     
     //Union o concatenación de texto y variables
        System.out.println("Los paises de Centro America: " + cadena1 +" "+ cadena2); //Unir o concatenar
        System.out.println("La población de " + cadena3 + " es " + poblacion); //Concatenado texto plano, string y entero
     
     //Conteo de cadena de caracteres
        System.out.println(cadena4.length()); //colocando . son metodos de la clase String
        System.out.println(cadena2.length()); //java docs sirve para ver los metodos de la clase
     
    //Remplazar cadenas de caracteres
        System.out.println(cadena1.replace("mala", "buena"));
        System.out.println(cadena2.replace("El", "Don"));
        
    //Extraer una porción de texto
        System.out.println(cadena3.substring(4)); //Extrae lo del caracter 4 en adelante
        System.out.println(cadena3.substring(0, 5)); // Extrae lo que esta dentro del limite de caracteres especificados
    
    //Comparar cadenas
        System.out.println(cadena1.equals(cadena2));
        System.out.println(cadena1.equals(cadena4));
    
    //Cambiar de mayusculas a minusculas
        System.out.println(cadena3.toLowerCase()); //minusculas
        System.out.println(cadena3.toUpperCase()); //mayusculas
    }
    
}
