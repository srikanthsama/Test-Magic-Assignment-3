package library.interfaces.daos;

import library.interfaces.entities.IMember;

public interface IMemberHelper {
	
	public IMember makeMember(String firstName, String lastName, String contactPhone, String emailAddress, int id);
{
	return new Mmber(firstName, lastName, contactPhone, emailAddress, id);
}

}
