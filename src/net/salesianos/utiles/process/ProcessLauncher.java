package net.salesianos.utiles.process;

import java.io.File;
import java.io.IOException;

public class ProcessLauncher {
    public static Process initContadorProcess(String inputFile, String carac, String outputFileName) throws IOException {
        String progrmanRpute = "./src/net/salesianos/utiles/counter/Counter.java";
        ProcessBuilder builder = new ProcessBuilder("java", progrmanRpute, inputFile, carac);   
        builder.redirectOutput(new File("./src/net/salesianos/files/output/" + outputFileName));
        builder.redirectError(new File("./src/net/salesianos/files/errors/error.txt"));
        return builder.start();
    }

}