<html><body>
<?php
// subject to change
$servername = "localhost";
$username = "root";
$password = "toor";
$dbName = "test1";
$table1 = "branch";
$table2 = "customer";
$table3 = "appointment";

// create connection to mysql server
$connect = new mysqli($servername, $username, $password, $dbName);
// check connection
if ($connect->connect_error) {
    die("Connection failed: "  . $connect->connect_error);
}

// preparing SQL statements to be queried
$sql1 = "SELECT * FROM {$table1}";
$sql2 = "SELECT * FROM {$table2}";
$sql3 = "SELECT * FROM {$table3}";

// start with first table
// query using SQL statement and store in $result
$result = $connect->query($sql1);
if (!$result) {
    die("Query for table failed.");
}

$fields_num = mysqli_num_fields($result);
// print header
echo "<h1>Table: {$table1} </h1>";

echo "<table border=\"1\"><tr>";
for ($i = 0; $i<$fields_num; $i++) {
    $field = mysqli_fetch_field($result);
    echo "<td>{$field->name}</td>";
}
echo "</tr>\n";

// print rows and info
while($row = mysqli_fetch_row($result)) {
    echo "<tr>";

    // $cell = each element because each row is an array of fields
    foreach($row as $cell) {
        echo "<td>$cell</td>";
    }
    echo "</tr>";
}
echo "</table>";

// frees memory
mysqli_free_result($result);

// customer table
$result = $connect->query($sql2);
if (!$result) {
    die("Query for table failed.");
}

$fields_num = mysqli_num_fields($result);
// print header
echo "<h1>Table: {$table2} </h1>";

echo "<table border=\"1\"><tr>";
for ($i = 0; $i<$fields_num; $i++) {
    $field = mysqli_fetch_field($result);
    echo "<td>{$field->name}</td>";
}
echo "</tr>\n";

// print rows and info
while($row = mysqli_fetch_row($result)) {
    echo "<tr>";

    // $cell = each element because each row is an array of fields
    foreach($row as $cell) {
        echo "<td>$cell</td>";
    }
    echo "</tr>";
}
echo "</table>";

// frees memory
mysqli_free_result($result);


//appointment table
$result = $connect->query($sql3);
if (!$result) {
    die("Query for table failed.");
}

$fields_num = mysqli_num_fields($result);
// print header
echo "<h1>Table: {$table3} </h1>";

echo "<table border=\"1\"><tr>";
for ($i = 0; $i<$fields_num; $i++) {
    $field = mysqli_fetch_field($result);
    echo "<td>{$field->name}</td>";
}
echo "</tr>\n";

// print rows and info
while($row = mysqli_fetch_row($result)) {
    echo "<tr>";

    // $cell = each element because each row is an array of fields
    foreach($row as $cell) {
        echo "<td>$cell</td>";
    }
    echo "</tr>";
}
echo "</table>";

// frees memory
mysqli_free_result($result);

?>
</body></html>