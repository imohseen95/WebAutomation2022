package datafetch;

import database.ConnectToExcelFile;

import java.io.IOException;

public class FetchTheSteps {

    ConnectToExcelFile  excelFile = new ConnectToExcelFile();
    public String[] getDataFromExcelFile() throws IOException {
        String path = "/Users/rejuanaahmed/IdeaProjects/WebAutomation2022/NYP/data/nyp-test-steps.xls";
        String[] data = excelFile.fileReader2(path,0);
        return data;
    }
}
