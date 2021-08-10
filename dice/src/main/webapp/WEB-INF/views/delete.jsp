<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>DeleteDicePage</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
    <body>
        <div>
            <h2>Delete-Dice-Page!</h2>
            <div>
                <form action="/delete/successful" method="post">
                    <div>
                        <label for="id">Id:</label>
                        <input type="text" name="id" id="id" required/>
                    </div>
                    </br>
                    <div>
                        <input type="submit" />
                    </div>
                </form>
            </div>
            </br>
            <p>OR</p>
            </br>
            <div>
                <form action="/delete/all/successful" method="post">
                    <div>
                        <label>DELETE ALL</label>
                        </br>
                        </br>
                        <input type="submit" />
                    </div>
                </form>
            </div>
            </br>
            </br>
            <div>
                <p><a href="/">Click here</a> to return to the start page!</p>
            </div>
        </div>
    </body>
</html>