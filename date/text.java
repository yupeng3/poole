package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

public class text
{
    public static void main(String[] args) throws ParseException {
        //打印当前时间
//        Date a=new Date();
//        System.out.println(a);
//        //更加细致
//        long d=a.getTime();
//        System.out.println(d);
//        //5秒后的时间
//        d+=5*1000;
//        Date time=new Date(d);
//        System.out.println(time);
//        //time.setTime(00);，设置当前的时间
//
//        //格式化时间
//        SimpleDateFormat time1=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
//        String b=time1.format(a);
//        System.out.println(b);
//
//        //字符串变为日期对象
//        String tim="2023-12-22 12:12:14";
//        SimpleDateFormat tim1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date tim2=tim1.parse(tim);
//        System.out.println(tim2);

        //日历类
        Calendar now=Calendar.getInstance();//获取对象
        System.out.println(now);

        int year=now.get(Calendar.YEAR);//获取需要的信息
        System.out.println(year);
        int day=now.get(Calendar.DAY_OF_YEAR);
        System.out.println(day);

        //拿日期对象
        Date ELE=now.getTime();
        System.out.println(ELE);

        //set()用于修改日期时间，add用于增加
    }
}
