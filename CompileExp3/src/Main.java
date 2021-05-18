import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.io.FileWriter;  

public class Main {

	public static void main(String[] args) throws Exception{
		String inputFile = "./src/input.txt";
		if(args.length>0) inputFile = args[0];
		InputStream is  = System.in;
		if( inputFile!= null) is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		tLexer lexer = new tLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		tParser parser = new tParser(tokens);
		ParseTree tree = parser.b();
		MyVisitor eval = new MyVisitor();
		String result = eval.visit(tree);
		//消除多余空行
		String[] strLines = result.split("\n");
		String finalResult = "";
		for(int i=0;i<strLines.length;i++) {
			if(!strLines[i].isEmpty()) {
				finalResult += strLines[i];
				finalResult += "\n";
			}
		}
		//打印三地址码
		System.out.println(finalResult);
		//打印语法树
		JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewr.setScale(1.5);//scale a little
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
	}

}
