package Before.questionpool;

import Before.j20220802.awt.CommonAwtEvent2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

//runtime : �޸��� ���� �ϴ°�?
// ȸ������ - �̸� ���̵� ��й�ȣ ��й�ȣ Ȯ�� �̸��� �ּ� ���ּ� ����ó
// ȸ�������� ��
// ���̵� ��й�ȣ �α�����
// path : C:\project\share\questionfile\Home\�̸�.properties
public class InputLogin_1 extends CommonAwtEvent2 {
    String name, pwd, c_pwd, email, addr, addr_2, num;
    static String path = "C:\\project\\share\\questionfile\\Home\\jaehoon.properties";
    static File file = new File(path);
    BufferedReader br = new BufferedReader(new FileReader(path));
    BufferedWriter bw = new BufferedWriter(new FileWriter(path));
    Properties p = new Properties();
    TextField tf_name, tf_id, tf_pwd, tf_cpw, tf_email, tf_addr, tf_maddr, tf_num, l_tf_id, l_tf_pwd;
    Label la_btn, laa_btn;

    public static void main(String[] args) throws IOException {
        if (file.createNewFile()) {
            System.out.println("���� ������");
        }
        InputLogin_1 il = new InputLogin_1();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String even = e.getActionCommand();
        switch (even) {
            case "Sign":
                try {
                    if (tf_pwd.getText().trim().equals(tf_cpw.getText().trim())) {
                        bw.write("Name : " + tf_name.getText() + "\n");
                        bw.write("ID : " + tf_id.getText() + "\n");
                        bw.write("PASSWORD : " + tf_pwd.getText() + "\n");
                        bw.write("EMAIL : " + tf_email.getText() + "\n");
                        bw.write("ADDRESS : " + tf_addr.getText() + "\n");
                        bw.write("DETAIL : " + tf_maddr.getText() + "\n");
                        bw.write("NUM : " + tf_num.getText() + "\n");
                        bw.close();
                        la_btn.setText("Success");
                        System.out.println("ȸ������ �Ϸ�");
                    } else {
                        la_btn.setText("PWD Error");
                    }

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                break;
            case "Login":
                try {
                    p.load(br);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                Enumeration e1 = p.elements();
                while (e1.hasMoreElements()){
                    if(l_tf_id.getText().trim().equals(p.getProperty("ID")) && l_tf_pwd.getText().trim().equals(p.getProperty("PASSWORD"))){
                        laa_btn.setText("Login Success");
                    }else{
                        laa_btn.setText("Login Faild");
                    }
                }
                break;
        }
    }

    public InputLogin_1() throws IOException {
        Frame fr = new Frame();
        setSize(400, 400);
        setVisible(true);
        setLayout(new GridLayout(12, 2));

        Label lb_name = new Label("Name : ");
        tf_name = new TextField(15);

        add(lb_name);
        add(tf_name);

        Label lb_id = new Label("ID : ");
        tf_id = new TextField(15);
        add(lb_id);
        add(tf_id);

        Label lb_pwd = new Label("PassWord : ");
        tf_pwd = new TextField(15);
        add(lb_pwd);
        add(tf_pwd);

        Label lb_cpw = new Label("Check_PWD : ");
        tf_cpw = new TextField(15);
        add(lb_cpw);
        add(tf_cpw);

        Label lb_email = new Label("Email : ");
        tf_email = new TextField(15);
        add(lb_email);
        add(tf_email);

        Label lb_addr = new Label("Address : ");
        tf_addr = new TextField(15);
        add(lb_addr);
        add(tf_addr);

        Label lb_m_addr = new Label("More : ");
        tf_maddr = new TextField(15);
        add(lb_m_addr);
        add(tf_maddr);

        Label lb_num = new Label("Num : ");
        tf_num = new TextField(15);
        add(lb_num);
        add(tf_num);

        la_btn = new Label(" ");
        Button btn_Sign = new Button("Sign");
        btn_Sign.addActionListener(this);
        add(la_btn);
        add(btn_Sign);

        Label l_lb_id = new Label("ID : ");
        l_tf_id = new TextField(15);
        add(l_lb_id);
        add(l_tf_id);

        Label l_lb_pwd = new Label("PassWord : ");
        l_tf_pwd = new TextField(15);
        add(l_lb_pwd);
        add(l_tf_pwd);

        laa_btn = new Label(" ");
        Button btn_Login = new Button("Login");
        btn_Login.addActionListener(this);
        add(laa_btn);
        add(btn_Login);

        addWindowListener(this);
    }
    public void adding (Label label, TextField textField){
        label = new Label(label + " : ");
        textField = new TextField(15);
        add(label);
        add(textField);
    }

}
