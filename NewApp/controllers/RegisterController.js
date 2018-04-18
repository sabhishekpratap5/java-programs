app.controller('registerController', function($scope, $state)
{
  $scope.firstName ="";
  $scope.lastName ="";
  $scope.email = "";
  $scope.password="";
  $scope.contact="";
  $scope.login = function() {
       // console.log("hello");
       $state.go('login');
     }
});
