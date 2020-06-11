package ex21jdbc.shopping;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.connect.IConnectImpl;

public class DeleteShop extends IConnectImpl
{

	public DeleteShop()
	{
		super("kosmo", "1234");
	}

	@Override
	public void execute()
	{
		try
		{
			csmt = con.prepareCall("{call ShopDeleteGoods(?, ?)}");
			csmt.setString(1, scanValue("삭제할 일련번호"));
			csmt.registerOutParameter(2, Types.NUMERIC);
			csmt.execute();
			System.out.println("삭제 프로시저 실행결과 : " + csmt.getInt(2));

		} catch (SQLException e)
		{
			e.printStackTrace();
		} finally
		{
			close();
		}
	}

	public static void main(String[] args)
	{
		new DeleteShop().execute();
	}

}
