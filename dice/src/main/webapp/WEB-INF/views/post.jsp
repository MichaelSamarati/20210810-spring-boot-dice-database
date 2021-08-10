<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>PostDicePage</title>
        <link rel="stylesheet" href="/css/style.css">
    </head>
    <body>
    <div>
        <h2>Post-Dice-Page!</h2>
        <div>
        <form action="/post/successful" method="post">
            <div>
                <label for="color">Color:</label>
                <input type="text" name="color" id="color" value="red" required/>
            </div>
            </br>
            <div>
                <label for="number">Number:</label>
                <input type="number" name="number" id="number" min="1" max="6" value="1" required/>
            </div>
            </br>
            <div>
                <input type="submit" />
            </div>
            </form>
        </div>
        </br>
        </br>
        <div>
            <a href="/">Click here</a> to return to the start page!
        </div>
    </div>
    </body>
</html>