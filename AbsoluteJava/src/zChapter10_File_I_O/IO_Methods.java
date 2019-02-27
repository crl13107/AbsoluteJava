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
		System.out.println("You have to append to the file if you don't want to reset the contents.");
		System.out.println("You do this by adding a , true) after you declear the input stream.");
		System.out.println("The constructor has a boolean equation that is false for no append, true for append.");
		System.out.println("You can append objects to text files if they have a proper toString() method.");
	}

	public static void readingFromTextFile() {
		System.out.println("follow examples.");
		usingBufferedReader();
	}

	private static void usingBufferedReader() {
		System.out.println("skip() method skips the inserted amount of chars");
		System.out.println("read() read prints out the next char in byte code");
		System.out.println("char next = (char)(inputStream.read()) to convert it into a char");
		System.out.println("Buffered reader has no read next numeric type methods.");
		System.out.println("Instead you have to write your own methods, or convert it using Integer.parstInt,"
				+ " Double.parseDouble and the stringTokenizer");
		System.out.println("It uses null to represent there is nothing else in the file.");
		System.out.println("So you can use while nextline != null, keep printing to print out the entire file.");
		System.out.println("The method read prints -1, so you can find the end of a text file.");
	}
	
	public static void pathNames() {
		System.out.println("When you give a file with no directory, is assume the file is in the current directory.");
		System.out.println("A path name gives the file name and the directory to find the file.");
		System.out.println("A full path name gives a complete path starting from the root directory.");
		System.out.println("A relative path name gives the path to the file starting with the current directory your program is in.");
		System.out.println("C:\\Users\\Colten\\Documents\\School\\absoluteJava.txt");
		System.out.println("You have to use \\ for java. Most IDe do this by default when you copy and paste.");
		System.out.println("Java will accept windows and unix format for any computer.");
		System.out.println("So you may use / for windows computers as well.");
		nestedConstructorInvocations();
	}

	private static void nestedConstructorInvocations() {
		System.out.println("new BufferedReader (new FileReader(\"orignal.txt\"");
		System.out.println("This gives an object of filereader with very primitive methods.");
		System.out.println("It then type casts into BufferedReader to give it a richer collections of methods.");
		System.out.println("java gives system.in, out, and err by default.");
		System.out.println("err is used for errors. One way to use this is to set up a different file to hold errors.");
	}
	
	public static void fileClass() {
		System.out.println("File class isn't I/O, but it is so needed that it is in java.io package.");
		System.out.println("File allows you to use simple methods to check properties of a file");
		System.out.println("File constructor takes an abstract name as a string argument.");
		System.out.println("the abstract name can be a direcotry for example. So isDirectory() method will tell you if it is a directory.");
		System.out.println("The File class is a wrapper class for file names");
		System.out.println("The constructor creates an object of type file with that name.");
	}
	
	public static void binaryFiles() {
		System.out.println("Binary files store data int he same format used in the computer's memory to store the value of variables.");
		System.out.println("No converesion is needed for the computer to handle it, so it is more effecient.");
		System.out.println("Unlike other byte files, java byte files work across computers and OS.");
		System.out.println("ObjectInput/Output Stream is the preferred way for byte files.");
		System.out.println("Both have methods to read and write 1 one byte of data at atime.");
		System.out.println("It also can automatically convert number/chars into byte code.");
		System.out.println("This is the best way to write to files and read them if you don't need to acess the file using an editor.");
		writingToBinaryFiles();
	}

	private static void writingToBinaryFiles() {
		
		
	}

}
