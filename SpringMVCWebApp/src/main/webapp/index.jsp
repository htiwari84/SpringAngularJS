<!doctype html>
<html data-ng-app>
	<head>
		<title>Test </title>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
    	<script src="myapp.js"></script>
	</head>

	<body>
		<div data-ng-controller="TestJSController">
			<p>The ID is {{test.id}}</p>
			<p>The content is {{test.content}}</p>
		</div>
	</body>
</html>