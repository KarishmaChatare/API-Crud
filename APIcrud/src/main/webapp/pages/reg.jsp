<html>

<head>

<title>Registration Page</title>

</head>


<style>
        body {
            font-family: Arial;
            background-color: #050a3b;
            color: #fff;
            margin: 20px;
            font-weight: bold;
          

        }

        form {
            max-width: 400px;
            margin: 0 auto;
            background-color: #d3d9f0;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            
        }

        label {
            display: block;
            margin-bottom: 8px;
            font-size: 25px;
             color: #020736;
        }

        input {
            width: calc(100% - 16px);
            padding: 10px;
            margin-bottom: 16px;
            box-sizing: border-box;
            background-color:#604066;
            border: 1px solid #666;
            color: #fff;
            border-radius: 4px;
            outline: none;
              box-shadow:0 0 30px rgba(0,0,0,0.3);
        }

        input[type="submit"],
        input[type="reset"] {
            background-color: #340245;
            color: #fff;
            border: none;
            padding: 12px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
            border-radius: 4px;
            transition: background-color 0.3s ease;
              box-shadow:0 0 30px rgba(0,0,0,0.3);
        }

        input[type="reset"] {
            background-color: #340245;
        }

        input[type="submit"]:hover,
        input[type="reset"]:hover {
            background-color: #9306c2;
        }
    </style>
</head>
<body>

    <form>
        
        <label for="id">ID:</label>
        <input type="text" id="id" name="id">
        
        <label for="name">Name:</label>
        <input type="text" id="name" name="name">
        

        <div>
            <input type="submit" value="Submit"  formaction="savedata" formmethod="post">>
            <input type="reset" value="Reset">
        </div>
    </form>


</body>



</html>





