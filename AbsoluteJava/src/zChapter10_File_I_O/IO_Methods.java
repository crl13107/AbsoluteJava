package zChapter10_File_I_O;

public class IO_Methods {

	public static void intrdocution() {
		System.out.println(
				"A stream is an object that allows for the flow of data bewtween your program and some I/O device/file.");
		System.out.println("Input stream - flowing into your program.");
		System.out.println("Output stream - flowing out of your program.");
		System.out.println("Streams are often used for both console/I/O.");
		System.out.println("Text files are sometimes called ASCII files. Binary files can only handle binary digits.");
		System.out.println("Text files are desgined to be read by humans and are compatible across machines.");
		System.out.println(
				"Binary files are read by machines and not always compatible. Has to be same type of computer/programming languange.");
		System.out.println("Binary files are more effecient to be processed.");
		System.out.println("Java converts byte files to be compatable. ");
		System.out.println("So unlike other languages, you can share it between computers.");
	}

	public static void textFiles() {
		System.out.println("PrintWriter is the preffered stream for text files. It has print and println methods.");
		System.out.println("All of the classes in this chapter are found in java.io.");
		System.out.println("You connect an outputstream you create to a file. This is called opening the file.");
		System.out.println(
				"PrintWriter has no constructor that takes a file name as its argument, so we use a variable to create a fileoutputstream");
		System.out.println(
				"We define the outputstream outside of the block because everything is local inside of the block.");
		System.out.println(
				"File naming depends on your OS, java will print to any file that contains the string name you insert.");
		System.out.println(
				"Every input file used by your program has 2 names. 1) the real file name used by OS. 2) the name of the stream that is connected to the file.");
		System.out.println("FileNotFoundException is poorly named and means the file could not be created.");
		System.out.println("I/O is the base class of our exceptions that get thrown using input and outputstreams.");
		System.out.println("Java will close your files when program ends, but you should manually do it.");
		System.out.println("Output streams connected to tiles are often buffered.");
		System.out.println("You can use the flush method to force the buffer to print to the file automatically.");
		System.out.println("To save effeciency, it normally only physically writes after the buffer is so long.");
		System.out.println("Another reason to close the file right away is for abnormal ends.");
		System.out.println("Java also closes the output stream before it opens an input stream from it.");
	}

	public static void pitFallsOne() {
		System.out.println("A try block is a block.");
		System.out.println("If you declare a stream inside a block, it is then local to that block.");
		System.out.println("outputstream = new PrintWriter(new FileOutputStream(\"stuff.txt\")); ");
		System.out.println("Appending to a file shows you how to do this without wiping the data every time.");
		appendingToATextFile();
	}

	private static void appendingToATextFile() {
		
		
	}
}
