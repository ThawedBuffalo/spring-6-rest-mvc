package tbs.spring6restmvc.services;

import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Service;
import tbs.spring6restmvc.model.BeerCSVRecord;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class BeerCsvServiceImpl implements BeerCsvService {

    @Override
    public List<BeerCSVRecord> convertCSV(File csvFile) {

        try {
            List<BeerCSVRecord> records = new CsvToBeanBuilder<BeerCSVRecord>(new FileReader(csvFile))
                    .withType(BeerCSVRecord.class)
                    .build().parse();
            return records;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
