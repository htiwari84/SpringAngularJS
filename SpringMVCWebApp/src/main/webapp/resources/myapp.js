function TestJSController($scope, $http) {
    $http.get('http://localhost:8080/SpringMVCWebApp/getRecordById?id=3').
        success(function(data) {
            $scope.test = data;
        });
}