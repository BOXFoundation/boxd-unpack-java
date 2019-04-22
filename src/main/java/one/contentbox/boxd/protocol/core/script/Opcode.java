package one.contentbox.boxd.protocol.core.script;

import one.contentbox.boxd.util.ArrayUtils;

public class Opcode {

    public static int OP0 = 0x00;         // 0
    public static int OPPUSHDATA1 = 0x4c; // 76
    public static int OPPUSHDATA2 = 0x4d; // 77
    public static int OPPUSHDATA4 = 0x4e; // 78

    public static int OPDUP          = 0x76; // 118
    public static int OPHASH160      = 0xa9; // 169
    public static int OPEQUALVERIFY  = 0x88; // 136
    public static int OPCHECKSIG     = 0xac; // 172

    private  byte[] result = new byte[0];

    public synchronized Opcode addOperand(byte[] operand){
        int l = operand.length;
        byte[] data = getData(l);
        byte[] tmp =  ArrayUtils.join(data, operand);
        this.result = ArrayUtils.join(this.getResult(), tmp);
        return this;
    }

    public synchronized Opcode adddOpCode(byte b){
        byte[]  a =  new byte[this.getResult().length + 1];
        for(int i = 0; i < this.getResult().length; i ++){
            a[i] = this.getResult()[i];
        }
        a[ a.length - 1] = b;
        this.result = a;
        return this;
    }


    public byte[] getResult() {
        return this.result;
    }

    public void reset(){
        this.result = new byte[0];
    }


    private byte[] getData(int l){
        if(l < OPPUSHDATA1){
            byte[] b = {(byte)l};
            return b;
        }else if(l <= 0xff){
            byte[] b = {(byte)OPPUSHDATA1, (byte)l};
            return b;
        }else if(l <= 0xffff){
            byte[] buf = new byte[2];
            buf = Binary.putUnit16(buf, l);
            byte[] b = {(byte) OPPUSHDATA2, buf[0], buf[1]};
            return b;
        }else {
            byte[] buf = new byte[4];
            buf = Binary.putUint32(buf, l);
            byte[] b = {(byte) OPPUSHDATA4, buf[0], buf[1], buf[2], buf[3]};
            return b;
        }
    }
}