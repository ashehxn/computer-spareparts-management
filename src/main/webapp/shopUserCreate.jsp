<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>
<link rel="stylesheet" href="style.css">
<link
	rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/fpnt-awesome/6.4.0/css/all.min.css"
>
</head>
<body>
	<!-- =============== Navigation ================ -->
    <div class="container">
        <div class="navigation">
            <ul>
                <li>
                    <a href="#">
                        <span class="icon">
                            <ion-icon name="logo-microsoft"></ion-icon>
                        </span>
                        <span class="title">Admin Dashboard</span>
                    </a>
                </li>

                <li>
                    <a href="adminDashboard.jsp">
                        <span class="icon">
                            <ion-icon name="home-outline"></ion-icon>
                        </span>
                        <span class="title">Dashboard</span>
                    </a>
                </li>

                <li>
                    <a href="chooseUserToShow.jsp">
                        <span class="icon">
                            <ion-icon name="people-outline"></ion-icon>
                        </span>
                        <span class="title">View Users</span>
                    </a>
                </li>

                <li>
                    <a href="chooseUserToAdd.jsp">
                        <span class="icon">
                            <ion-icon name="person-add-outline"></ion-icon>
                        </span>
                        <span class="title">Add Users</span>
                    </a>
                </li>

                <li>
                    <a href="chooseUserToManage.jsp">
                        <span class="icon">
                            <ion-icon name="person-remove-outline"></ion-icon>
                        </span>
                        <span class="title">Manage Users</span>
                    </a>
                </li>

                <li>
                    <a href="http://localhost:8090/ComputerSpareParts2/AdminLogoutServlet">
                        <span class="icon">
                            <ion-icon name="log-out-outline"></ion-icon>
                        </span>
                        <span class="title">Sign Out</span>
                    </a>
                </li>
            </ul>
        </div>


        <div class="main">
            <div class="topbar">
                <div class="toggle">
                    <ion-icon name="menu-outline"></ion-icon>
                </div>

                <div class="user">
                    <img src="https://upload.wikimedia.org/wikipedia/commons/a/a6/Profile_picture_3_edited_%281%29.jpg" alt="avatar">
                </div>
            </div>

 
            <div class="form">
            	<div class="formRows">
            
	            	<h2>Enter Shop Manager Details</h2>
	                <form action="ShopUserInsertServlet" method="post">
		
						<h4>Name: </h4>
						<div class="inputContainer">
							<input type="text" name="name" class="inputField" required><br>
						</div>
						
						<h4>Username: </h4>
						<div class="inputContainer">
							<input type="text" name="user" class="inputField" required><br>
						</div>
						
						<h4>Password: </h4>
						<div class="inputContainer">
							<input type="password" name="pass" class="inputField" required><br>
						</div>
						
						<h4>Supervising Admin ID: </h4>
						<div class="inputContainer">
							<input type="number" name="adminId" class="inputField" required><br>
						</div>
						
						<div class="submitContainer">
							<input type="submit" name="submit" value="Submit" class="submit">
						</div>
					
					</form>
				</div>
            </div>
        </div>
    </div>

   
    <script src="main.js"></script>

    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
	
</body>
</html>