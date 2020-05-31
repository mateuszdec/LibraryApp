package library.io.file;

import library.exception.DataExportException;
import library.model.Library;
import library.model.Publication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CsvFileManager implements FileManager {
    private static final String FILE_NAME = "Library.csv";

    @Override
    public Library importData() {
        return null;
    }

    @Override
    public void exportData(Library library) {
        Publication[] publications = library.getPublications();
        try (var fileWriter = new FileWriter(FILE_NAME);
        var bufferedWritter = new BufferedWriter(fileWriter)) {
            for (Publication publication : publications) {
                bufferedWritter.write(publication.toCsv());
                bufferedWritter.newLine();
            }
        } catch (IOException e) {
            throw new DataExportException("Błąd zapisu danych do pliku " + FILE_NAME);
        }
    }
}
