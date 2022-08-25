function form_Check(){
    var frm = document.getElementById("frm");
    var pwd = document.getElementById("pwd");
    var c_pwd = document.getElementById("c_pwd");
    if(pwd == c_pwd){
        frm.action=url;
        frm.submit();
    }
}