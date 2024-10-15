import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;
import java.io.FileReader;
import net.salesianos.utiles.process.ProcessLauncher;

public class App {
    public static void main(String[] args) throws Exception {

        String texto = " ";
        BufferedReader reader = new BufferedReader(new FileReader("./src/data/text.txt", StandardCharsets.UTF_8));
        String linea = reader.readLine();
        while (linea != null) {
            texto += linea;
            linea = reader.readLine();
        }
        reader.close();

        Process subProcessComa = ProcessLauncher.initContadorProcess(texto, ",", "totalComa.txt");
        Process subProcessPunto = ProcessLauncher.initContadorProcess(texto, ".", "totalPunto.txt");
        Process subProcessDosPuntos = ProcessLauncher.initContadorProcess(texto, ":", "totalDosPuntos.txt");
        Process subProcessPuntoYComa = ProcessLauncher.initContadorProcess(texto, ";", "totalPuntoyComa.txt");
        subProcessComa.waitFor();
        subProcessPunto.waitFor();
        subProcessDosPuntos.waitFor();
        subProcessPuntoYComa.waitFor();

    }
}