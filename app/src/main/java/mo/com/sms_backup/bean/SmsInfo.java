package mo.com.sms_backup.bean;

/**
 * Created by Administrator on 2015/7/25.
 */
public class SmsInfo {
    private int id;         //���ݿ��еĶ���id
    private String address; //���ͳ�ȥ�ĵ�ַ

    private long data;  //ʱ��
    private int type;   //����1�ǽ��գ�2�Ƿ���
    private String body;    //��������

    public SmsInfo() {
    }

    public SmsInfo(int id, String address, long data, int type, String body) {
        this.id = id;
        this.address = address;
        this.data = data;
        this.type = type;
        this.body = body;
    }

    @Override
    public String toString() {
        return "SmsInfo{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", data=" + data +
                ", type=" + type +
                ", body='" + body + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
