package java_11.part09;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Demo09_reserve {
    public static void main(String[] args) {
        try (DatagramSocket datagramSocket = new DatagramSocket(8888)) {
            while (true) {
                byte[] bytes = new byte[1024];
                DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
                datagramSocket.receive(datagramPacket);
                System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
/// /第 9 题（UDP 通信）
/// /题目：编写 UDP 发送端与接收端两个程序。
/// /• 发送端：键盘循环录入字符串，发送到本机127.0.0.1，端口8888；输入exit停止发送并关闭 socket。
/// /• 接收端：绑定端口 8888，死循环接收数据包，打印收到的消息。
/// /提示
/// /1. UDP 发送：DatagramSocket()无参构造，DatagramPacket封装字节数组、目标地址和端口。
/// /2. UDP 接收：DatagramSocket(8888)绑定端口；接收包只需要字节缓冲区和长度。
/// /3. receive()方法是阻塞方法，没有数据会一直等待。
/// /4. 使用new String(字节数组,0,实际长度)解析消息，不要直接 new String 整个缓冲区。
