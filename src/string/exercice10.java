package string;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Write a Java program to print the current date and time in the specified format
public class exercice10 {

    public static void main(String[] args) {
        
        DateTimeFormatter dat= DateTimeFormatter.ofPattern("E MMMM dd yyyy HH:mm:ss");
        LocalDateTime today= LocalDateTime.now();
        System.out.println(today.format(dat));
    }
    
}
