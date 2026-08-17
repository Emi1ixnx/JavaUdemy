package archivos;
import java.io.File; // Input-output
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLOutput;

public class CrearArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            if (archivo.exists()) {
                System.out.println("El archivo ya existe");
            } else {
                // Creamos el archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                // Se guarda el archivo a disco duro
                salida.close();
                System.out.println("Se ha creado el archivo");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: "  + e.getMessage());
            e.printStackTrace();
        }
    }
}
