package homeworks1;

import com.sun.tools.javac.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите Ваше имя");
        int age = Integer.parseInt(reader.readLine());

        class Main {
            String a = "Вася";
            String b = "Анастасия";
            

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                    System.out.println("Привет!");
                    System.out.println("Я тебя так долго ждал");
                if (o == null || getClass() != o.getClass()) return false;
                Main main = (Main) o;
                return Objects.equals(a, main.a) && Objects.equals(b, main.b);
            }


            @Override
            public int hashCode() {
                return Objects.hash(a, b);


                }


            }
        }
        }