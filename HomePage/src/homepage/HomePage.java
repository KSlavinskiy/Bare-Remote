package homepage;

import java.io.*;
import java.net.*;

@SuppressWarnings("unused")
public class HomePage 
{
	public static void main(String[] args)
	{
		
		String req = "Ïאנאלוענû, ןמסûכאולûו CGI-ןנמדנאללו";
		/*
		byte[] data; 
		try
		{
			data = req.getBytes("KOI8-R");
		}
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
		*/
		
		URL myIIS7 = null;
		try 
		{
			myIIS7 = new URL("http://10.130.44.20/");
		} 
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}
		
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(myIIS7.openStream()));
			/*
			URLConnection uc = bhv.openConnection();
			uc.setDoInput(true);
			uc.setDoOutput(true);
			uc.setUseCaches(false);
			uc.setRequestProperty( "content-type", "application/octet-stream" );
			uc.setRequestProperty( "content-length", ""+ req.length() );	
			uc.connect();
			InputStream is = uc.getInputStream();

			InputStreamReader isr = new InputStreamReader(is);
			br = new BufferedReader( isr);*/
			
			String line = null;
			while( ( line = br.readLine()) != null )
			{
				System.out.println(line);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
