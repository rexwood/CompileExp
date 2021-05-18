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

public class ExtractInterfaceListener extends tBaseListener{
	tParser parser;
	public ExtractInterfaceListener(tParser parser) {
		this.parser = parser;
	}
	
	@Override
	public void enterB(tParser.BContext ctx) {
		System.out.println("*******");
	}
}
