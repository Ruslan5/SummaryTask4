package ua.nure.mirzoiev.summaryTask4.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import java.util.Calendar;

/**
 * Custom tag date
 * 
 */
public class CurrentDate extends TagSupport {

	public int doStartTag() throws JspException {  
	    JspWriter out=pageContext.getOut();//returns the instance of JspWriter  
	    try{  
	     out.print(Calendar.getInstance().getTime());//printing date and time using JspWriter  
	    }catch(Exception e){System.out.println(e);}  
	    return SKIP_BODY;//will not evaluate the body content of the tag  
	}  
}