// 检查用户名
function checkUsername(){
    var usernameReg = /^[a-zA-Z0-9]{5,10}$/;
    var username = document.getElementById("usernameInput").value;
    var usernameMsgSpan = document.getElementById("usernameMsg");
    if(!usernameReg.test(username)){
        usernameMsgSpan.innerText="不合格";
        return false;
    }
    usernameMsgSpan.innerText="OK";
    return true;
}
// 检查密码
function checkUserPwd(){
    var passwordReg=/^[0-9]{6}$/;
    var userPwd = document.getElementById("userPwdInput").value;
    var userPwdMsgSpan = document.getElementById("userPwdMsg");
    if(!passwordReg.test(userPwd)){
        userPwdMsgSpan.innerText="不合法";
        return false;
    }
    userPwdMsgSpan.innerText="OK";
    return true;
}
// 检查用户名和密码
function checkForm(){
    return checkUserPwd() && checkUsername();
}


// 确认密码
function checkReUserPwd(){
    var passwordReg=/^[0-9]{6}$/; 
    var userPwd = document.getElementById("userPwdInput").value;
    var userRePwd = document.getElementById("userRePwdInput").value;
    var userPwdReMsgSpan = document.getElementById("userRePwdMsg")
    if(!passwordReg.test(userRePwd)){
        userPwdReMsgSpan.innerText="不合法";
        return false;
    }
    if(!(userPwd === userRePwd)){
        userPwdReMsgSpan.innerText="两次输入的密码不一致";
        return false;
    }
    userPwdReMsgSpan.innerText="OK";
    return true;
}


// 检查注册页面的数据
function checkReForm(){
    return checkUserPwd() && checkUsername() && checkReUserPwd();
}