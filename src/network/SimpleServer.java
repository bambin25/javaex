package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
  public static void main(String[] args) {
    // 서버를 먼저 실행해야 그후에 클라이언트가 연결을 시도하면 메세지를 출력하는 방식이였던것이다.
    // try {} catch {} finally {} ==> try with resources
    // try ( ) {
    // } catch () {
    // }
    try(ServerSocket server = new ServerSocket(5000);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is)) {
      String msg = (String) ois.readObject();
      System.out.println("받은 문자열은  = " + msg); // 메세지 출력
    } catch (IOException | ClassNotFoundException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();  // 예외 스택 트레이스 출력
    }
  }
}
