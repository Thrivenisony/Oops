package com.ciq.inputandoutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {
public static void main(String[] args) throws IOException {
	DataOutputStream dos=new DataOutputStream(new FileOutputStream("data.txt"));
	dos.writeInt(10);
	dos.writeByte(2);
	dos.writeBoolean(true);
	dos.writeDouble(20.00);
	dos.writeUTF("hello data outputStream");
	dos.close();
	DataInputStream dis=new DataInputStream(new FileInputStream("data.txt"));

 int i=dis.readInt();	
 System.out.println(i);
 Byte b=dis.readByte();
 System.out.println(b);
 Double d=dis.readDouble();
 System.out.println(d);
 boolean bl=dis.readBoolean();
 System.out.println(bl);
 String s=dis.readUTF();
  System.out.println(s);
	
}
}
