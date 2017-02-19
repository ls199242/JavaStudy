import java.util.Calendar;

public class CalendarDemo {
	public static void main(String []args){
		Calendar c = Calendar.getInstance();//当前为2017-02-19 00:45
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);//月份从0开始，目前是2月，直接输出为1,所以需要+1
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//星期从日开始为1
	}
}
