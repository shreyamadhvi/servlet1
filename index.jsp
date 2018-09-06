<%-- 
    Document   : index
    Created on : Aug 29, 2018, 11:49:37 AM
    Author     : iiht
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>Hello first index page</h1>
        <p>Request URI: /helloservlet/sayhello</p>
<p>Protocol: HTTP/1.1</p>
<p>PathInfo: null</p>
<p>Remote Address: 127.0.0.1</p>
<p>A Random Number: <strong>0.4320795689818858</strong></p>

        <form>
            <input type="text" name="username" value="user" />
            <input type="text" name="password" value="pass" /><br>
            <p>Gender:</p>
            Male:<input type="radio" name="gender" value="male" />
            Female:<input type="radio" name="gender" value="female" /><br>
            <p>Hobby:</p>
            singing : <input type="checkbox" name="hobby" value="singing" /><br>
            dancing : <input type="checkbox" name="hobby" value="dancing" /><br>
            reading: <input type="checkbox" name="hobby" value="reading" /><br>
            <select name="city">
                <option value="surat">Surat</option>
                <option value="navsari">Navsari</option>
                <option value="vapi">Vapi</option>
            </select>
            <br> <br>
            <select name="education" multiple>
                <option value="BE">BE</option>
                <option value="HSC">HSC</option>
                <option value="SSC">SSC</option>
            </select>
            <br>
             <br>
             <p>Cast:</p>
             General:<input type="radio" name="cast" value="General" /><br>
             OBC:<input type="radio" name="cast" value="Obc" /><br>
             St:<input type="radio" name="cast" value="st" /><br>
             Sc:<input type="radio" name="cast" value="sc" /><br>
             <br>
             <br>
            <input type="submit" value="login" formmethod="post" formaction="/shreya1/login"/>
        </form>
        
        
        
        
    </body>
</html>
