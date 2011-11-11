import java.io.File;
import java.util.ArrayList;


public class FolderTraverser {

	
    private File fileObject;
    Regexes reg = new Regexes();
    ArrayList<File> srcFiles = new ArrayList<File>();
    
    public FolderTraverser(File fileObject)
    {
        this.fileObject = fileObject;
    }

    public File[] traverse()
    {
       recursiveTraversal(fileObject);
       File[] srcArray = new File[srcFiles.size()];
       return srcFiles.toArray(srcArray);
    }
	

    public void recursiveTraversal(File fileObject){	
    	
        if (fileObject.isDirectory()){
            //System.out.println(fileObject.getName());
            File allFiles[] = fileObject.listFiles();
            if (allFiles != null) {
	            for(File aFile : allFiles) {
	                recursiveTraversal(aFile);
	            }
        }
        }else if (fileObject.isFile()){
        	if (reg.isSource(fileObject.getName()))
        		srcFiles.add(fileObject);
        }		
    }	
}
