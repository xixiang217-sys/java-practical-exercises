package java_11.part10;

import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Demo10 {
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 9999);) {
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("TCP测试消息".getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
/// /第 10 题（TCP 通信）
/// /题目：编写 TCP 客户端 + 服务端。
/// /• 客户端：连接127.0.0.1端口9999，向服务端发送一句话：TCP测试消息，发送完毕关闭 socket。
/// /• 服务端：监听 9999 端口，等待客户端连接；连接成功后读取客户端发来的数据，打印到控制台，读完释放资源。
/// /提示
/// /1. TCP 客户端：Socket(地址,端口)建立连接，通过getOutputStream()写数据。
/// /2. TCP 服务端：ServerSocket(9999)创建服务器套接字，accept()阻塞等待客户端接入，返回 Socket 对象。
/// /3. 通过 Socket 的getInputStream()读取客户端发送字节数据。
/// /4. 注意：ServerSocket和Socket都要关闭释放资源。