package ex20io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class E13MyFriendDeserializable
{

	public static void main(String[] args)
	{
		try
		{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/ex20io/friend_info.obj"));

			while (true)
			{
				Friend friend = (Friend) in.readObject();
				if (friend == null)
					break;
				friend.showAllData();
			}
			in.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
