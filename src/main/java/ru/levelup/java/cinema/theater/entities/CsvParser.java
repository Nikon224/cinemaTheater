//package ru.levelup.java.cinema.theater.entities;
//
//import org.supercsv.cellprocessor.Optional;
//import org.supercsv.cellprocessor.constraint.NotNull;
//import org.supercsv.cellprocessor.constraint.UniqueHashCode;
//import org.supercsv.cellprocessor.ift.CellProcessor;
//import org.supercsv.io.CsvBeanReader;
//import org.supercsv.io.ICsvBeanReader;
//import org.supercsv.prefs.CsvPreference;
//
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class CsvParser {
//
//    public static void main(String[] args) throws IOException {
//
//        List<Hall> hallList = new ArrayList<>();
//        ICsvBeanReader csvBeanReader = new CsvBeanReader(new FileReader("/Users/nikitaorunov/Google Drive/LevelUP/cinemaTheater_mac/cinemaTheater/src/main/java/ru/levelup/java/cinema/theater/entities/action.csv"), CsvPreference.STANDARD_PREFERENCE);
//
//        // указываем как будем мапить
//        String[] mapping = new String[]{ "name", "amountOfPlace"};
//
//        // получаем обработчики
//        CellProcessor[] procs = getProcessors();
//        Hall hall;
//        // обходим весь csv файлик до конца
//        while ((hall = csvBeanReader.read(Hall.class, mapping, procs)) != null) {
//            hallList.add(hall);
//        }
//        System.out.println(hallList);
//        csvBeanReader.close();
//    }
//
//    /**
//     * Задаем обработчики ячеек
//     */
//    private static CellProcessor[] getProcessors() {
//        return new CellProcessor[]{
//                new UniqueHashCode(), // для идентификатора (id)
//                new NotNull(), // name не должно быть null
//                new Optional(), // указываем, что это необязательное поле role
//                new NotNull() // salary также не должно быть null
//        };
//    }
//}