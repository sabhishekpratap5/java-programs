app.controller('loginController', function($scope,$state)
{
  $scope.email = "";
   $scope.password="";
   $scope.home = function()
   {
        // console.log("hello");
        $state.go('home');
      }
 });
