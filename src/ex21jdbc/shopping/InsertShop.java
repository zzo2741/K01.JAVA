package ex21jdbc.shopping;

import ex21jdbc.connect.IConnectImpl;

public class InsertShop extends IConnectImpl
{

	public InsertShop()
	{
		super("kosmo", "1234");

	}

	@Override
	public void execute()
	{
		try
		{
			String sql = "insert into sh_goods (g_idx, goods_name, goods_price, p_code) values (goods_seq.nextval, ?, ?, ?)";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, scanValue("상품명"));
			psmt.setString(2, scanValue("상품가격"));
			psmt.setString(3, scanValue("상품코드"));
			psmt.executeUpdate();
			System.out.println("insert 성공");
		} catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("insert 실패");
		} finally
		{
			close();
		}
	}

	public static void main(String[] args)
	{
		InsertShop is = new InsertShop();
		is.execute();
	}

}
