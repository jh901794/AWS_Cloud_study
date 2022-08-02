package questionpool;

import Common.CommonHome;
import j20220802.awt.CommonAwtEvent2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Gwang_Home extends CommonAwtEvent2 implements ActionListener {
    TextField name, address, age, a_search;
    Label result;
    static ArrayList al = new ArrayList();

    public static void main(String[] args) throws IOException {
        Gwang_Home gh = new Gwang_Home();

    }
    public Gwang_Home() {
        setSize(300, 800);
        setVisible(true);
        setLayout(new GridLayout(7, 2));

        Label l_name = new Label("Name : ");
        name = new TextField(15);
        Label l_address = new Label("Address : ");
        address = new TextField(15);
        Label l_age = new Label("Age : ");
        age = new TextField(15);
        add(l_name);
        add(name);
        add(l_address);
        add(address);
        add(l_age);
        add(age);

        Button Signin = new Button("Sign in");
        Signin.addActionListener(this);
        add(Signin);
        Button End = new Button("Show");

        a_search = new TextField(15);
        add(a_search);

        End.addActionListener(this);
        add(End);
        addWindowListener(new CommonAwtEvent2());

        result = new Label("");
        add(result);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String even = e.getActionCommand();
        switch (even){
            case "Sign in":
                CommonHome commonHome = new CommonHome();
                commonHome.setName(name.getText());
                commonHome.setAddress(address.getText());
                commonHome.setAge(Integer.parseInt(age.getText()));
                al.add(commonHome);
                break;
            case "Show":
                for(int i =0; i<al.size(); i++){
                    CommonHome cm = (CommonHome) al.get(i);
                    if(cm.getName().equals(a_search.getText())){
                        result.setText("Search : " + cm.getName() +"\t"+cm.getAddress() + "\t" + cm.getAge());
                    }
                }




                /*System.out.println("이름 | 주소 | 나이");
                for(int i = 0; i< al.size(); i++){
                    CommonHome cm = (CommonHome) al.get(i);
                    System.out.println(cm.getName() +"\t"+cm.getAddress() + "\t" + cm.getAge());
                }
                System.out.println("검색할 이름은? ");
                String search = null;
                try {
                    search = buffer.readLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                for(int i = 0; i < al.size(); i++){
                    CommonHome cm = (CommonHome) al.get(i);
                    if(cm.getName().equals(search)){
                        System.out.println(cm.getName() +"\t"+cm.getAddress() + "\t" + cm.getAge());
                    }
                }*/

        }

    }
}
