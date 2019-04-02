package zChapter11_Recursion;

import java.io.File;

public class FindFile {

	public static String searchForFile(File dir, String target) {
		String result = "";
		if (!dir.isDirectory())
			return "Path is not a directory.";
		for (File folderItem : dir.listFiles()) {
			if (folderItem.isDirectory()) {
				result = searchForFile(folderItem, target);

				if (result.equals(""))
					return result;
			}

			else {
				if (folderItem.getName().equals(target))
					return folderItem.getAbsolutePath();
			}
		}
		//nothing found it we get here
		return "";
	}

	public static void main(String[] args) {
		//root file, the beginning file for the search
		File rootFolder = new File("C:\\");
		String result = searchForFile(rootFolder, "test.txt");
		if (!result.equals(""))
			System.out.println(result);
		else
			System.out.println("File not found.");
	}
}
