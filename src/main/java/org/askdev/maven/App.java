package org.askdev.maven;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws IOException {

        String csvFile = "C:\\Users\\kabhi\\IdeaProjects\\csnjsonconversion\\src\\main\\java\\org\\askdev\\maven\\sample.csv";

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        CSVReader reader = null;

        StringBuilder op = new StringBuilder();
        op.append("[\n");
        try {
            reader = new CSVReader(new FileReader(csvFile));
            String[] line;
            while ((line = reader.readNext()) != null) {

                Address addr1 = new Address(line[2], line[3]);

                Student s1 = new Student(Integer.parseInt(line[0]), line[1], addr1);

                op.append(gson.toJson(s1));
                op.append(",\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        op.deleteCharAt(op.length() - 2);
        op.append("]");

        PrintWriter out = new PrintWriter(new FileWriter("output.txt", true), true);
        out.write(op.toString());
        out.close();

    }

}
