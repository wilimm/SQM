package org.itstack.test;

public class ApiStaticTest extends T {

    public static void main(String[] args) throws InterruptedException {
        String res01 = ApiStaticTest.queryUserInfo(111, 17);
        System.out.println("测试结果：" + res01 + "\r\n");
    }


    public static String queryUserInfo(int uId, int age) throws InterruptedException {
        return "哈哈哈被你抓到了";
    }


}
