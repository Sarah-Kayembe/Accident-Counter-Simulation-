/**
 * Assignment 4: Task 2
 * This file contains the definition of the AccidentReader class, which provides methods to read accident report data
 * from a CSV file and parse it into a list of AccidentReport objects.
 * 
 * DISCLAIMER: I utilized ChatGPT, Stack Overflow, GeeksforGeeks, and various other online resources
 * to develop this program and generate comments. 
 * 
 * @author sarahkayembe
 * @version 1.0
 */

package accidentpack;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;


public class AccidentReader {
	/**
	 * Reads accident report data from a CSV file and returns a list of AccidentReport objects.
	 *
	 * @param csvFilePath The path to the CSV file containing accident report data.
	 * @return A list of AccidentReport objects parsed from the CSV file.
	 */
    public static List<AccidentReport> readAccidents(String csvFilePath) {
        List<AccidentReport> accidents = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            br.readLine(); // Skip header line
            
            accidentReport(accidents, br);
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        return accidents;
    }

    /**
     * Parses accident report data from a BufferedReader and adds parsed AccidentReport objects to the provided list.
     *
     * @param accidents              The list to which parsed AccidentReport objects will be added.
     * @param br                     The BufferedReader from which accident report data will be read.
     * @throws IOException           If an I/O error occurs while reading from the BufferedReader.
     * @throws NumberFormatException If a number cannot be parsed from a string in the accident report data.
     */
	private static void accidentReport(List<AccidentReport> accidents, BufferedReader br)
			throws IOException, NumberFormatException {
		String line;
		while ((line = br.readLine()) != null) {
			if (line.trim().isEmpty()) {
		        // Skip empty lines
		        continue;
		    }
		    String[] data = line.split(",");
		    if (data.length < 14) {
		        // Skip lines with incomplete data
		        continue;
		    }
		    
		    String id = data[0].trim();
		    int severity = Integer.parseInt(data[1].trim());
		    LocalDateTime startTime = parseDateTime(data[2].trim());
		    LocalDateTime endTime = parseDateTime(data[3].trim());
		    String street = data[4].trim();
		    String city = data[5].trim();
		    String county = data[6].trim();
		    String state = data[7].trim();
		    double temperature = Double.parseDouble(data[8].trim());
		    double humidity = Double.parseDouble(data[9].trim());
		    double visibility = Double.parseDouble(data[10].trim());
		    String weatherCondition = data[11].trim();
		    boolean crossing = Boolean.parseBoolean(data[12].trim());
		    String sunriseSunset = data[13].trim();

		    AccidentReport accident = new AccidentReport(id, severity, startTime, endTime, street, city, county, state, temperature, humidity, visibility, weatherCondition, crossing, sunriseSunset);
		    accidents.add(accident);
		}
	}

	/**
	 * Parses a date and time string into a {@code LocalDateTime} object.
	 * 
	 * @param dateTimeStr the date and time string to be parsed
	 * @return the parsed {@code LocalDateTime} object
	 * @throws DateTimeParseException if the input string cannot be parsed into a {@code LocalDateTime} object
	 */
    private static LocalDateTime parseDateTime(String dateTimeStr) {
        try {
            // Try parsing with milliseconds format
            return LocalDateTime.parse(dateTimeStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSSSSS"));
        } catch (DateTimeParseException e1) {
            try {
                // If parsing with milliseconds fails, try parsing with microseconds format
                return LocalDateTime.parse(dateTimeStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS"));
            } catch (DateTimeParseException e2) {
                try {
                    // If parsing with microseconds fails, try parsing without milliseconds
                    return LocalDateTime.parse(dateTimeStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                } catch (DateTimeParseException e3) {
                    // Log the input string that caused the error
                    System.err.println("Error parsing date and time: " + dateTimeStr);
                    throw e3;
                }
            }
        }
    }




}
