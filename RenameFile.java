package expeirments;

import java.io.File;

public class RenameFile {
	public static void main(String[] args) throws Exception{
		String path = "F:\\ss\\New folder (2)";
		File fileLoc = new File(path);
		File newFile;
		File oldFile;
		String str[] = fileLoc.list();
		int count = 0;
		for(int i=0; i<str.length; i++){
			oldFile = new File(path+"\\"+str[i]);
			newFile = new File(path+"\\"+str[i]+".jpg"); //change the file name(str[i]) and extension 
			oldFile.renameTo(newFile);
			count++;
			System.out.println(str[i]+" Changed to "+str[i]+".jpg");
		}
		System.out.println("Total File Rename: "+count);	
	}
}
