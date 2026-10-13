package java_11.part09;

import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
            try (
                    DatagramSocket datagramSocket = new DatagramSocket();) {
                DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 8888);
                datagramSocket.send(datagramPacket);

                if (new String(datagramPacket.getData(), 0, datagramPacket.getLength()).equals("exit")) {
                    datagramSocket.close();
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
//第 9 题（UDP 通信）
//题目：编写 UDP 发送端与接收端两个程序。
//• 发送端：键盘循环录入字符串，发送到本机127.0.0.1，端口8888；输入exit停止发送并关闭 socket。
//• 接收端：绑定端口 8888，死循环接收数据包，打印收到的消息。
//提示
//1. UDP 发送：DatagramSocket()无参构造，DatagramPacket封装字节数组、目标地址和端口。
//2. UDP 接收：DatagramSocket(8888)绑定端口；接收包只需要字节缓冲区和长度。
//3. receive()方法是阻塞方法，没有数据会一直等待。
//4. 使用new String(字节数组,0,实际长度)解析消息，不要直接 new String 整个缓冲区。
//第 10 题（TCP 通信）
//题目：编写 TCP 客户端 + 服务端。
//• 客户端：连接127.0.0.1端口9999，向服务端发送一句话：TCP测试消息，发送完毕关闭 socket。
//• 服务端：监听 9999 端口，等待客户端连接；连接成功后读取客户端发来的数据，打印到控制台，读完释放资源。
//提示
//1. TCP 客户端：Socket(地址,端口)建立连接，通过getOutputStream()写数据。
//2. TCP 服务端：ServerSocket(9999)创建服务器套接字，accept()阻塞等待客户端接入，返回 Socket 对象。
//3. 通过 Socket 的getInputStream()读取客户端发送字节数据。
//4. 注意：ServerSocket和Socket都要关闭释放资源。