import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		Date dClone = (Date)d.clone();
		Date dBefore = new Date(System.currentTimeMillis()-60000);//当前时刻向前一分钟
		Date dAfter =new Date(System.currentTimeMillis()+60000);//当前时刻向后一分钟
		System.out.println(d.toString());				//Sun Feb 19 00:07:31 CST 2017	
		System.out.println(System.currentTimeMillis());	//1487434051528
		System.out.println(d.getTime());				//1487434051512
		System.out.println(d.before(dAfter));			//true
		System.out.println(d.after(dBefore));			//true
		System.out.println(dBefore.compareTo(dAfter));	//-1
		System.out.println(d.equals(dClone));			//true
		System.out.println(d==dClone);					//false
	}
}
