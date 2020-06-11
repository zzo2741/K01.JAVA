package ex21jdbc.shopping;

public class GoodsDTO
{
	private int g_idx;
	private String goods_name;
	private String goods_price;
	private String regidate;
	private int p_code;

	public int getG_idx()
	{
		return g_idx;
	}

	public void setG_idx(int g_idx)
	{
		this.g_idx = g_idx;
	}

	public String getGoods_name()
	{
		return goods_name;
	}

	public void setGoods_name(String goods_name)
	{
		this.goods_name = goods_name;
	}

	public String getGoods_price()
	{
		return goods_price;
	}

	public void setGoods_price(String goods_price)
	{
		this.goods_price = goods_price;
	}

	public String getRegidate()
	{
		return regidate;
	}

	public void setRegidate(String regidate)
	{
		this.regidate = regidate;
	}

	public int getP_code()
	{
		return p_code;
	}

	public void setP_code(int p_code)
	{
		this.p_code = p_code;
	}

}
