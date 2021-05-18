import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String inputFile = "./src/input.txt";
		if(args.length>0) inputFile = args[0];
		InputStream is  = System.in;
		if( inputFile!= null) is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		tLexer lexer = new tLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		tParser parser = new tParser(tokens);
		ParseTree tree = parser.b();
		EvalVisitor eval = new EvalVisitor();
		eval.visit(tree);
		System.out.println(tree.toStringTree(parser));
		/*
		//guiÊ÷
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
		*/
	}

}
