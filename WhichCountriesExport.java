
import edu.duke.*;
import org.apache.commons.csv.*;

public class WhichCountriesExport
{
    public void countryInfo (CSVParser parser, String exportOfInterest)
    {
        String country = "";
        for(CSVRecord record : parser)
        {
           String export = record.get("Exports"); 
           if(export.contains(exportOfInterest))
           {
               country = record.get("Country");
               System.out.println(country);  
           }
          
        }  
    }
    
    public void whoExportGold()
    {
       
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        
        countryInfo(parser, "Country");
        
    }
    
      
}
