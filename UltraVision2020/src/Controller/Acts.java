package Controller;

import java.util.ArrayList;

public class Acts {
	
	ArrayList<Number> member = new ArrayList();
	
	public void newMember(Number contact) {
		member.add(contact);
	}
	public String QuantityOfMembers() {
		return member.size()+"";
	}

}
