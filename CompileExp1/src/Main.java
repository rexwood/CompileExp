import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;  

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		String inputFile = "src\\input.txt";
		String outputFile = "src\\output.txt";
		
		InputStream is = System.in;
		if(inputFile!=null) is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		tLexer lexer = new tLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		tParser parser = new tParser(tokens);
		ParseTree tree = parser.prog();
		EvalVisitor eval = new EvalVisitor();
		eval.visit(tree);
		
		buffer = (ArrayList<String>) eval.buffer.clone();
		FileWriter fw = new FileWriter(outputFile,false);  
		while(index < buffer.size()) {
			System.out.println("按Enter键执行一次scan()函数:");
			while(System.in.read() != 13) {
				
			}
			String outputToken = scan();
			System.out.println(outputToken);
			fw.write(outputToken+"\n");
		}
		fw.close();
		
		// SysConvert sysConvert = SysConvert.getInstance();
		// System.out.println(sysConvert.Convert(16, 10, ""+88.80, 10));
	}
	public static int index = 0;
	public static ArrayList<String> buffer = new ArrayList();
	public static String scan() {
		return buffer.get(index++);
	}

}
