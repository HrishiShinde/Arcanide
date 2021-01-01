<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <script src='main.js'></script>
</head>
<body>
    <?php
        include "php/db_connection.php";
        $conn = OpenCon();
        function validate(){
            $vali = FALSE;
        if (isset($_POST["n"])) {  
    
            $name = $_POST["n"];  
            if (!preg_match ("/^[a-zA-z]*$/", $name) ) {  
                $ErrMsg = "Only alphabets and whitespace are allowed.";  
                echo "<script> document.getElementById('nspan')='Only alphabets and whitespace are allowed.'; </script>";  
            } else {  
                //echo $name . "<br>";
            }  
        
            $phone = $_POST["p"];  
            if (!preg_match ("/^[0-9]*$/", $phone) ){  
                $ErrMsg = "Only numeric value is allowed.";  
                echo $ErrMsg;  
            } else {  
            //echo $phone . "<br>";  
            }  
        
            $email = $_POST["e"];  
            $pattern = "^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,3})$^";  
            if (!preg_match ($pattern, $email) ){  
                $ErrMsg = "Email is not valid.";  
                echo $ErrMsg;  
            } else {  
                //echo "Your valid email address is: " .$email;  
            }
            $error="";
            $password = $_POST['password'];
        
                if( strlen($password ) < 8 ) {
                $error .= "Password too short!";
                }
        
                if( strlen($password ) > 20 ) {
                $error .= "Password too long!";
                }
        
                if( strlen($password ) < 8 ) {
                $error .= "Password too short!";
                }
        
                if( !preg_match("#[0-9]+#", $password ) ) {
                $error .= "Password must include at least one number!";
                }
        
                if( !preg_match("#[a-z]+#", $password ) ) {
                $error .= "Password must include at least one letter!";
                }
        
                if( !preg_match("#[A-Z]+#", $password ) ) {
                $error .= "Password must include at least one CAPS!";
                }
        
                if( !preg_match("#\W+#", $password ) ) {
                $error .= "Password must include at least one symbol!";
                }
        
                if($error){
                echo "Password validation failure(your choice is weak): $error";
                } else {
                //echo "Your password is strong.";
                }  
            $vali = TRUE;
        }
        }
        
        
        if ($vali == TRUE){
            $sql = "INSERT INTO `test_user` (`name`, `email`, `phone`, `password`) VALUES ('$name', '$email', '$phone', '$password');";
        
            if ($conn->query($sql) === TRUE) {
                echo "<script type='text/JavaScript'> alert('Register Successful'); </script>";
            } else {
                echo "Error: " . $sql . "<br>" . $conn->error;
            }
        }
    ?>
    <form action="" method="POST">
        <label>name</label>
        <input type="text" name="n" id="name">
        <span id="nspan"></span><br>
        <label>email</label>
        <input type="email" name="e" id="email"><br>
        <label>phone</label>
        <input type="text" name="p" id="phone"><br>
        <label>pass</label>
        <input type="text" name="password" id="phone"><br>
        <input type="submit" name="btn" id="btn" onclick="validate()">
    </form>
</body>
</html>