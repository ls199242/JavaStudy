import java.util.Calendar;

public class CalendarDemo {
	public static void main(String []args){
		Calendar c = Calendar.getInstance();//��ǰΪ2017-02-19 00:45
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);//�·ݴ�0��ʼ��Ŀǰ��2�£�ֱ�����Ϊ1,������Ҫ+1
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//���ڴ��տ�ʼΪ1
	}
}
