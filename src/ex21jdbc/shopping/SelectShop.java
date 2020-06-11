package ex21jdbc.shopping;

import java.util.ArrayList;
import java.util.List;

import ex21jdbc.connect.IConnectImpl;

public class SelectShop extends IConnectImpl
{

	public SelectShop()
	{
		super("kosmo", "1234");

	}

	@Override
	public void execute()
	{
		List<GoodsDTO> goods = new ArrayList<GoodsDTO>(); 
		try
		{
			String sql = "select "
					+ " g_idx, goods_name, "
					+ " ltrim(to_char(goods_price, '999,999,999')), "
					+ " to_char(regidate, 'yyyy-mm-dd hh:mi:ss'), "
					+ " p_code "
					+ " from sh_goods "
					+ " where goods_name like '%" + scanValue("상품명") + "%'";
			smt = con.createStatement();
			rs = smt.executeQuery(sql);
			while (rs.next())
			{
				GoodsDTO gdto = new GoodsDTO();
				gdto.setG_idx(rs.getInt("g_idx"));
				gdto.setGoods_name(rs.getString("goods_name"));
				gdto.setGoods_price(rs.getString(3));
				gdto.setRegidate(rs.getString(4));
				gdto.setP_code(rs.getInt("p_code"));
				goods.add(gdto);
			}
			for (GoodsDTO _goods : goods)
			{	
				String goodsInfo = String.format("일련번호 : %d 상품명 : %s 가격 : %s 등록일 : %s 제품코드 : %d"
						, _goods.getG_idx(), _goods.getGoods_name(), _goods.getGoods_price(), _goods.getRegidate(), _goods.getP_code());
				System.out.println(goodsInfo);
			}
			System.out.println("select 성공");
		} catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("select 실패");
		} finally
		{
			close();
		}
	}

	public static void main(String[] args)
	{
		SelectShop ss = new SelectShop();
		ss.execute();
	}

}
