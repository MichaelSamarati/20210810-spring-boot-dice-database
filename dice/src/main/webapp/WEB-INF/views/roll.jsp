<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>RollDicePage</title>
  <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div>
  <h2>Roll-Dice-Page!</h2>
  <div>
    <form action="/roll/successful" method="post">
      <div>
        <label for="id">Id:</label>
        <input type="text" name="id" id="id" required/>
      </div>
      </br>
      <div>
        <input type="submit"  />
      </div>
    </form>
  </div>
  </br>
  <p>OR</p>
  </br>
  <div>
    <form action="/roll/all/successful" method="post">
      <div>
        <label>Roll ALL</label>
        </br>
        </br>
        <input type="submit" />
      </div>
    </form>
  </div>
  </br>
  </br>
  <div>
    <a href="/">Click here</a> to return to the start page!
  </div>
  </br>
</div>
</body>
</html>