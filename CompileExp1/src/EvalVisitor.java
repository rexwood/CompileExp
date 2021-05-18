import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Scanner;

public class EvalVisitor extends tBaseVisitor<Double>{
	public ArrayList<String> buffer = new ArrayList<String>(); //±£´æ½á¹û
	@Override 
	public Double visitProg(tParser.ProgContext ctx) { 
		System.out.println("aaaa");
		visitChildren(ctx); 
		return 0.0;
	}
	@Override
	public Double visitReserved(tParser.ReservedContext ctx) {
		if(ctx.reserved.getType() == tParser.IF) {
			//System.out.printf("IF\t_\n");
			buffer.add("IF\t_");
		}
		else if(ctx.reserved.getType() == tParser.THEN) {
			//System.out.printf("THEN\t_\n");
			buffer.add("THEN\t_");
		}
		else if(ctx.reserved.getType() == tParser.ELSE) {
			//System.out.printf("ELSE\t_\n");
			buffer.add("ELSE\t_");
		}
		else if(ctx.reserved.getType() == tParser.WHILE) {
			//System.out.printf("WHILE\t_\n");
			buffer.add("WHILE\t_");
		}
		else if(ctx.reserved.getType() == tParser.DO) {
			//System.out.printf("DO\t_\n");
			buffer.add("DO\t_");
		}
		return 0.0;
	}
	@Override
	public Double visitOp(tParser.OpContext ctx) {
		if(ctx.op.getType() == tParser.ADD) {
			//System.out.printf("+\t_\n");
			buffer.add("+\t_");
		}
		else if(ctx.op.getType() == tParser.SUB) {
			//System.out.printf("-\t_\n");
			buffer.add("-\t_");
		}
		else if(ctx.op.getType() == tParser.MUL) {
			//System.out.printf("*\t_\n");
			buffer.add("*\t_");
		}
		else if(ctx.op.getType() == tParser.DIV) {
			//System.out.printf("/\t_\n");
			buffer.add("/\t_");
		}
		else if(ctx.op.getType() == tParser.ASSIGN) {
			//System.out.printf("=\t_\n");
			buffer.add("=\t_");
		}
		else if(ctx.op.getType() == tParser.RT) {
			//System.out.printf(">\t_\n");
			buffer.add(">\t_");
		}
		else if(ctx.op.getType() == tParser.LT) {
			//System.out.printf("<\t_\n");
			buffer.add("<\t_");
		}
		else if(ctx.op.getType() == tParser.LP) {
			//System.out.printf("(\t_\n");
			buffer.add("(\t_");
		}
		else if(ctx.op.getType() == tParser.RP) {
			//System.out.printf(")\t_\n");
			buffer.add(")\t_");
		}
		else if(ctx.op.getType() == tParser.SEMICOLON) {
			//System.out.printf(";\t_\n");
			buffer.add(";\t_");
		}
		return 0.0;
	}
	@Override
	public Double visitId(tParser.IdContext ctx) {
		//System.out.printf("IDN\t%s\n", ctx.IDN());
		buffer.add("IDN\t"+ctx.IDN());
		return 0.0;
	}
	@Override
	public Double visitInt(tParser.IntContext ctx)  {
		if(ctx.integer.getType() == tParser.INT8) {
			//System.out.printf("INT8\t%d\n", Integer.parseInt(ctx.integer.getText().toString(), 8));
			buffer.add("INT8\t"+Integer.parseInt(ctx.integer.getText().toString(), 8));
		}
		else if(ctx.integer.getType() == tParser.INT10) {
			//System.out.printf("INT10\t%d\n", Integer.parseInt(ctx.integer.getText().toString()));
			buffer.add("INT10\t"+Integer.parseInt(ctx.integer.getText().toString()));
		}
		if(ctx.integer.getType() == tParser.INT16) {
			//System.out.printf("INT16\t%s\n", Integer.parseInt(ctx.integer.getText().toString().substring(2), 16));
			buffer.add("INT16\t"+Integer.parseInt(ctx.integer.getText().toString().substring(2), 16));
		}
		return 0.0;
	}
	@Override
	public Double visitReal(tParser.RealContext ctx) {
		if(ctx.realnum.getType() == tParser.REAL8) {
			SysConvert sysConvert = SysConvert.getInstance();
			//System.out.printf("REAL8\t%s\n", Double.parseDouble(sysConvert.Convert(8, 10, ctx.realnum.getText(), 10)));
			buffer.add("REAL8\t"+Double.parseDouble(sysConvert.Convert(8, 10, ctx.realnum.getText(), 10)));
		}
		else if(ctx.realnum.getType() == tParser.REAL10) {
			//System.out.printf("REAL10\t%s\n", ctx.realnum.getText());
			buffer.add("REAL10\t"+ctx.realnum.getText());
		}
		if(ctx.realnum.getType() == tParser.REAL16) {
			SysConvert sysConvert = SysConvert.getInstance();
			//System.out.printf("REAL16\t%s\n", Double.parseDouble(sysConvert.Convert(16, 10, ctx.realnum.getText(), 10)));
			buffer.add("REAL16\t"+Double.parseDouble(sysConvert.Convert(16, 10, ctx.realnum.getText().toString().substring(2), 10)));
			//System.out.println("1666666666:"+ctx.realnum.getText().toString().substring(2));
		}
		return 0.0;
	}	

}
