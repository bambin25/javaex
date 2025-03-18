package network;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SimpleClient {
  public static void main(String[] args) {
    // 클라이언트는 서버에 보내는 역할이기에 안녕단순서버야를 출력하려면 따로 sout을 해야함
    try (Socket client = new Socket("172.30.1.36", 5000);
         OutputStream os = client.getOutputStream();
         ObjectOutputStream oos = new ObjectOutputStream(os)) {
      String msg = "안녕, 단순 서버야 !";
      oos.writeObject(msg);
      oos.flush();
      System.out.println("보낸 메시지 = " + msg);  // 보낸 메시지 출력
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();  // 예외 스택 트레이스 출력
    }
  }
}
