package arviLearning.learning;

import com.jagacy.Session3270;
import com.jagacy.util.JagacyException;

public class JagacyPractice extends Session3270{

	private static String huonHost = "zsys2.mfsys.auiag.corp";		//Non-virtual env
	private static int huonPort = 23;								//Non-virtual env	
	private static int virtualHuonPort = 8623;
	
	public JagacyPractice() throws JagacyException
	{
		
		super("HUON","zsys2.mfsys.auiag.corp", 23, "IBM-3278-2-E");
		
		System.setProperty("jagacy.host",String.valueOf("zsys2.mfsys.auiag.corp"));
		System.setProperty("jagacy.port",String.valueOf("23"));
		System.setProperty("jagacy.terminal","IBM-3278-2-E");	
		
		super.open();		
	}
	public static void main(String[] args)
	{	
		
	}

}
