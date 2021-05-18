import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Scanner;


public class MyVisitor extends tBaseVisitor<String>{
	int labelNum = 1;
	int tempNum = 1;
	//存place
	ParseTreeProperty<String> places = new ParseTreeProperty<String>();
	//存True Label:
	ParseTreeProperty<String> trueLabel = new ParseTreeProperty<String>();
	//存False Label:
	ParseTreeProperty<String> falseLabel = new ParseTreeProperty<String>(); 
	//存Next：
	ParseTreeProperty<String> next = new ParseTreeProperty<String>();
	//存Prev：
	ParseTreeProperty<String> prev = new ParseTreeProperty<String>();
	//新建标签newlabel: 
	public String newLabel() {
		return "L"+(labelNum++)+"	";
	}
	//新建中间变量newtemp:
	public String newTemp() {
		return "t"+tempNum++;
	}
	//F生成的产生式：
	@Override 
	public String visitInt10(tParser.Int10Context ctx) {
		places.put(ctx, ctx.INT10().toString());
		return "";
	}
	@Override
	public String visitId(tParser.IdContext ctx) {
		places.put(ctx, ctx.IDN().toString());
		return "";
	}
	@Override
	public String visitParens(tParser.ParensContext ctx) {
		String eCode = visit(ctx.e());
		String ePlace =  places.get(ctx.e());
		places.put(ctx, ePlace);
		return eCode;
	}
	@Override
	public String visitInt8(tParser.Int8Context ctx) {
		places.put(ctx, ctx.INT8().toString());
		return "";
	}
	@Override
	public String visitSingleF(tParser.SingleFContext ctx) {
		String code = visit(ctx.f());
		String fPlace = places.get(ctx.f());
		places.put(ctx, fPlace);
		return code;
	}
	@Override
	public String visitMulDiv(tParser.MulDivContext ctx) {
		
		String t1Code = visit(ctx.t());
		String fCode = visit(ctx.f());
		places.put(ctx, newTemp());
		String genCode = "";
		if(ctx.op.getType() == tParser.MUL)
			genCode = places.get(ctx)+":="+places.get(ctx.t())+"*"+places.get(ctx.f());
		else
			genCode = places.get(ctx)+":="+places.get(ctx.t())+"/"+places.get(ctx.f());
		//System.out.println(t1Code+fCode+genCode);
		if(t1Code!="") t1Code=t1Code+"\n";
		if(fCode!="") fCode=fCode+"\n";
		return t1Code+fCode+genCode;
	}
	@Override
	public String visitSingleT(tParser.SingleTContext ctx) {
		String code = visit(ctx.t());
		String tPlace = places.get(ctx.t());
		places.put(ctx, tPlace);
		return code;
	}
	@Override
	public String visitAddSub(tParser.AddSubContext ctx) {
		
		String e1Code = visit(ctx.e());
		String tCode = visit(ctx.t());
		places.put(ctx, newTemp());
		String genCode = "";
		if(ctx.op.getType() == tParser.ADD)
			genCode = places.get(ctx)+":="+places.get(ctx.e())+"+"+places.get(ctx.t());
		else
			genCode = places.get(ctx)+":="+places.get(ctx.e())+"-"+places.get(ctx.t());
		//System.out.println(e1Code+tCode+genCode);
		if(e1Code!="") e1Code=e1Code+"\n";
		if(tCode!="") tCode=tCode+"\n";
		return e1Code+tCode+genCode;
	}	
	@Override
	public String visitAssign(tParser.AssignContext ctx) {
		String code = visit(ctx.e());
		String idPlace = ctx.IDN().getText();//*****!!!!
		String ePlace = places.get(ctx.e());
		return code+"\n"+idPlace+":="+ePlace;
	}
	@Override
	public String visitL(tParser.LContext ctx) {		
		String code = visit(ctx.s());
		return code;
	}
	@Override
	public String visitP(tParser.PContext ctx) {
		String lCode = visit(ctx.l());
		String pCode = "";
		if(ctx.getChildCount()!=1) {
			pCode = visit(ctx.p());
		}
		return lCode+pCode;
	}
	@Override
	public String visitB(tParser.BContext ctx) {
		String result = visit(ctx.p());
		System.out.println(result);
		return result;
	}
	@Override
	public String visitBp(tParser.BpContext ctx) {
		return visit(ctx.p());
	}
	//if & while产生式：
	@Override
	public String visitIf1(tParser.If1Context ctx) {
		String cTrue = newLabel();
		String sNext = "";
		String sNextO="";
		if(next.get(ctx) == null) {
			sNext = newLabel();
			next.put(ctx, sNext);
			sNextO=sNext;
		}
		else {
			sNext = next.get(ctx);
		}
		next.put(ctx.s(), sNext);
		String cFalse = sNext;
		trueLabel.put(ctx.c(), cTrue);
		falseLabel.put(ctx.c(), cFalse);
		String cCode = visit(ctx.c());
		prev.put(ctx.s(), cTrue);
		String s1Code = visit(ctx.s());
		return cCode+"\n"+trueLabel.get(ctx.c())+"\n"+s1Code+"\n"+sNextO+"\n";
	}
	@Override
	public String visitIf2(tParser.If2Context ctx) {
		String cTrue = newLabel();
		String cFalse = newLabel();
		trueLabel.put(ctx.c(), cTrue);
		falseLabel.put(ctx.c(), cFalse);
		String sNext = "";
		String sNextO = "";
		if(next.get(ctx) == null) {
			sNext = newLabel();
			next.put(ctx, sNext);
			sNextO = sNext;
		}
		else {
			sNext = next.get(ctx);
		}
		next.put(ctx.s(0), sNext);
		next.put(ctx.s(1), sNext);
		
		String cCode = visit(ctx.c());
		prev.put(ctx.s(0), cTrue);
		String s1Code = visit(ctx.s(0));
		prev.put(ctx.s(1), cTrue);
		String s2Code = visit(ctx.s(1));
		
		return cCode+"\n"+trueLabel.get(ctx.c())+"\n"+s1Code+"\ngoto "+sNext+"\n"+falseLabel.get(ctx.c())+"\n"+s2Code+"\n"+sNextO+"\n";
	}
	@Override
	public String visitWhile(tParser.WhileContext ctx) {
		String sBegin = "";
		String sBeginO="";
		if(prev.get(ctx) == null) {
			sBegin = newLabel();
			sBeginO = sBegin; 
		}
		else {
			sBegin = prev.get(ctx);
		}
		String cTrue = newLabel();
		String sNext = "";
		String sNextO = "";
		if(next.get(ctx) == null) {
			sNext = newLabel();
			next.put(ctx, sNext);
			sNextO=sNext;
		}
		else {
			sNext = next.get(ctx);
		}
		next.put(ctx.s(), sBegin);
		String cFalse = sNext;
		trueLabel.put(ctx.c(), cTrue);
		falseLabel.put(ctx.c(), cFalse);
		String cCode = visit(ctx.c());
		prev.put(ctx.s(), cTrue);
		String s1Code = visit(ctx.s());
		return sBeginO+"\n"+cCode+trueLabel.get(ctx.c())+"\n"+
				s1Code+"\n"+
				"goto "+sBegin+"\n"+sNextO+"\n";
		
	}
	@Override
	public String visitEqual(tParser.EqualContext ctx) {
		String e1 = visit(ctx.e(0));
		String e2 = visit(ctx.e(1));
		String genCode = "if "+places.get(ctx.e(0))+"="+places.get(ctx.e(1))+" goto "+trueLabel.get(ctx)+"\n goto "+falseLabel.get(ctx)+"\n";
		return e1+e2+genCode;
	}
	@Override
	public String visitRtLt(tParser.RtLtContext ctx) {
		String e1 = visit(ctx.e(0));
		String e2 = visit(ctx.e(1));
		String genCode = "";
		if(ctx.op.getType() == tParser.RT) {
			genCode = "if "+places.get(ctx.e(0))+">"+places.get(ctx.e(1))+" goto "+trueLabel.get(ctx)+"\n goto"+falseLabel.get(ctx)+"\n";
		}
		else {
			genCode = "if "+places.get(ctx.e(0))+"<"+places.get(ctx.e(1))+" goto "+trueLabel.get(ctx)+"\n goto"+falseLabel.get(ctx)+"\n";
		}
		return e1+e2+genCode;
	}
	/*
	//判断条件产生式:
	@Override
	public String visitEqual(tParser.EqualContext ctx) {
		String e1 = visit(ctx.e(0));
		String e2 = visit(ctx.e(1));
		String cTrue = newLabel();
		String cFalse = newLabel();
		trueLabel.put(ctx, cTrue);
		falseLabel.put(ctx, cFalse);
		String genCode = "if "+places.get(ctx.e(0))+"="+places.get(ctx.e(1))+" goto "+cTrue+"\n goto "+cFalse;
		return e1+e2+genCode;
	}
	@Override
	public String visitRtLt(tParser.RtLtContext ctx) {
		String e1 = visit(ctx.e(0));
		String e2 = visit(ctx.e(1));
		String genCode = "";
		String cTrue = newLabel();
		String cFalse = newLabel();
		trueLabel.put(ctx, cTrue);
		falseLabel.put(ctx, cFalse);
		if(ctx.op.getType() == tParser.RT) {
			genCode = "if "+places.get(ctx.e(0))+">"+places.get(ctx.e(1))+" goto "+cTrue+"\n goto"+cFalse;
		}
		else {
			genCode = "if "+places.get(ctx.e(0))+"<"+places.get(ctx.e(1))+" goto "+cTrue+"\n goto"+cFalse;
		}
		return e1+e2+genCode;
	}
	*/
	
}


