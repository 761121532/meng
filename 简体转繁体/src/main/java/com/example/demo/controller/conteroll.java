package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class conteroll {
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public static deo Update(deo str){
        ZHCnoverter jf=new ZHCnoverter();//简体转繁体的类
        String firestStr=str.getFirest();//获得文本域中的值   firest就是文本域中的值
        String[] shuoYouInput=firestStr.split("\n"); //将文本域中的值按照换行拆分为 每一个单个的input的值
        String[] qieLeDouHaoDeInput; //用来存单个文本域中切了逗号的值，判断是不是有口碑的
        String result="";//存储最终的返回值
        for (int i=0;i<shuoYouInput.length;i++){//遍历所有input框的值
            qieLeDouHaoDeInput=shuoYouInput[i].split(",");//将遍历出来的东西，按照逗号分隔
            String ppp=shuoYouInput[i];//ppp等于单个的input的值

            /**
             * 有口碑的
             */
            if (qieLeDouHaoDeInput.length>2){//如果以逗号分隔，值大于2，就是有口碑的

                for (int j=0;j<qieLeDouHaoDeInput.length;j++){//遍历以逗号分隔出来的值

                    String[] mubiaozhan=qieLeDouHaoDeInput[j].split("\\|");//将逗号分隔出来的东西 以 | 切割
                    if(mubiaozhan.length>1){//如果切割出来的值大于1，证明它不是第一个地名
                           String aaa = jf.convert(mubiaozhan[1], 1);//将第二个值变成繁体
                           String bbb = shuoYouInput[i].replace(mubiaozhan[1], aaa);//将input里面的值替换屌
                           //System.out.println("mubiaozhan[k]   " + mubiaozhan[1] + "    aaa    " + aaa);
                           ppp = ppp.replace(mubiaozhan[1], aaa);//添加到ppp里面

                    }else {//是第一个地名的处理方式
                        String aaa = jf.convert(mubiaozhan[0], 1);
                        String bbb = shuoYouInput[i].replace(mubiaozhan[0], aaa);
                       // System.out.println("mubiaozhan[k]   " + mubiaozhan[0] + "    aaa    " + aaa);
                        ppp = ppp.replace(mubiaozhan[0], aaa);
                    }

                }
                if (result=="")
                result=ppp;
                else result=result+"\n"+ppp;//将处理结束的值添加到result中
            }else {//没有口碑的
                String[] addArr={"臺北","新北","臺中","桃園","高雄","臺南","新竹",
                        "苗栗","基隆","彰化","嘉義","宜蘭","花蓮","屏東","雲林",
                        "嘉義","南投","臺東","金門","澎湖","連江"};
                String[] s=shuoYouInput[i].split(",");
                String huanlede;

                if (s.length>1){
                    String[] s2=s[1].split("\\|");
                    int number = (int) Math.floor(Math.random()*21);
                    huanlede =shuoYouInput[i].replace(s2[0],addArr[number]);
                }else {
                    huanlede = shuoYouInput[i];
                }
                String OOO = jf.convert(huanlede, 1);
                ppp=ppp.replace(shuoYouInput[i],OOO);
                if (result=="")
                    result=ppp;
                else result=result+"\n"+ppp;
            }

        }
        deo deo=new deo();
        deo.setFirest(result);
        return deo;
    }
}
