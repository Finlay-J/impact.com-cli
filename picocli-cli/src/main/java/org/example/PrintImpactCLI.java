package org.example;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "printImpact", mixinStandardHelpOptions = true, version = "1.0",
        description = "Prints 'impact.com'")
public class PrintImpactCLI implements Runnable {

    @Override
    public void run() {
        String message = "impact.com";
        System.out.println("\033[1;31m" + message + "\033[0m");  // Bold and Red
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new PrintImpactCLI()).execute(args);
        System.exit(exitCode);
    }
}