import java.io.File;
import java.util.List;

public class SearchFiles {
    public List<File> searchFile(File rootFile, List<File> fileList){
        if(rootFile.isDirectory()){
            File[] diretcoriFiles = rootFile.listFiles();
            if (diretcoriFiles != null){
                for(File file: diretcoriFiles){
                    if(file.isDirectory()){
                        searchFile(file,fileList);

                    }
                    else {
                        if(file.getName().toLowerCase().endsWith(".json")
                                & !file.getName().startsWith(".")
                                & !file.getName().startsWith("_")){
                            fileList.add(file);
                            System.out.println(file.getName());
                            System.out.println(file);
                        }
                        if(file.getName().toLowerCase().endsWith(".csv")
                                & !file.getName().startsWith(".")
                                & !file.getName().startsWith("_")){
                            fileList.add(file);

                            System.out.println(file.getName());
                            System.out.println(file);
                        }

                    }
                }
            }
        }
        return fileList;
    }

}
