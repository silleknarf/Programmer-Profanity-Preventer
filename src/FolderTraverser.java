/* This file is part of the Programmer Profanity Preventer.

Programmer Profanity Preventer is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Programmer Profanity Preventer is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Programmer Profanity Preventer.  If not, see <http://www.gnu.org/licenses/>. */

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
