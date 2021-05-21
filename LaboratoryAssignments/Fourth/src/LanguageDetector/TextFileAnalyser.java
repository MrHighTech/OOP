package LanguageDetector;

import java.io.*;
import java.nio.file.*;
import java.util.Arrays;


public class TextFileAnalyser {
    public static Language detectLanguage(Path file) throws IOException {
        String read = Files.readAllLines(file).toString();
        Boolean isHR = false, isDE = false, isEN = false;
        int i = 0;
        String[] hr = "šđčćžŠĐČĆŽ".split("(?!^)");
        String[] de = "äöüÄÖÜß".split("(?!^)");
        String[] en = "abcdefghijklmnopqrstuvwxyz".split("(?!^)");

        while (!isHR && i < hr.length) {
            if (read.contains(hr[i])) {
                isHR = true;
            }
            i++;
        }
        i = 0;
        while (!isDE && i < de.length) {
            if (read.contains(de[i])) {
                isDE = true;
            }
            i++;
        }
        i = 0;
        while (!isEN && i < en.length) {
            if (read.contains(en[i])) {
                isEN = true;
            }
            i++;
        }


        if (!isHR && !isDE && !isEN || (isHR && isDE)) return Language.UNKNOWN;

        if (isDE && !isHR) return Language.DE;

        if (isHR || isHR & isEN) return Language.HR;

        if (isEN && (!isDE && !isHR)) return Language.EN;
        return Language.UNKNOWN;
    }

    public static void main(String[] args) throws IOException {
        Path inputFile = Path.of("D:\\FER\\2. semestar\\OOP\\LaboratoryAssignments\\Fourth\\src\\LanguageDetector\\example.txt");
        Language lan = TextFileAnalyser.detectLanguage(inputFile);
        System.out.println(lan);
    }
}
