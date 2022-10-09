
package c_collection;

class aArrayListEx
{
	public static void main(String[] args) 
	{
		Object[] data = dataSet();
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

	// Object[] 다양한 자료형 배열로 리턴
	static Object[] dataSet()
	{
		String	name = "김태희";
		int		age = 31;
		double	height = 162.3;

		Object[] obj = new Object[3];
		obj[0] = name; 
		obj[1] = age; 
		obj[2] = height; 
		return obj;
		
	}
}
