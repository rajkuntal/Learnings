package com.raju.problems;

import java.util.HashMap;
import java.util.Map;

public class CustomerId {
	  private long crmID;
	  private int nameSpace;

	  public CustomerId(long crmID, int nameSpace) {
	    //super();
	    this.crmID = crmID;
	    this.nameSpace = nameSpace;
	  }

	  public boolean equals(Object obj) {
	    //null instanceof Object will always return false
	    if (!(obj instanceof CustomerId))
	      return false;
	    if (obj == this)
	      return true;
	    return  this.crmID == ((CustomerId) obj).crmID &&
	            this.nameSpace == ((CustomerId) obj).nameSpace;
	  }

	  public int hashCode() {
	    int result = 0;
	    result = (int)(crmID/12) + nameSpace;
	    return result;
	  }

	  public static void main(String[] args) {
	    Map m = new HashMap<>();
	    m.put(new CustomerId(2345891234L,0),"Jeff Smith");
	    
	    System.out.println(m.get(new CustomerId(2345891234L,0)));
	  }

	}
