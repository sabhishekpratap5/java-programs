var myApp=angular.module("myModule",[]);
myApp.controller("myController",function($scope)
{
    $scope.message="Abhishek Singh";
});

myApp.controller("myController1",function($scope)
{
  var employee={
    firstName:'pardeep',
    lastName:'pagal',
    gender:'others'
  };
  $scope.employee=employee;
});

 var myApp1=angular.module("myModule",[]);
                myApp1.controller("myController2",function($scope){
                    $scope.message1="hello Abhishek";
                });
