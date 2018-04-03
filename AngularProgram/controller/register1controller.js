var app = angular.module('myApp');
app.controller('register1controller', function($scope)
{
  $scope.name="";
  $scope.email = "";
  $scope.password="";
  $scope.msg = "You have not yet clicked submit";
  $scope.myFunction = function () {
      $scope.msg = "You clicked submit!";
    }
    $scope.submit = function()
    {
      console.log("Name: "+$scope.name);
      console.log("Email: "+$scope.email);
      console.log("Password: "+$scope.password);
    }

});
