package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Student s = Student.builder()
                        .name("Y")
                        .department("CNU")
                        .no(1)
                        .build();
    }
}
