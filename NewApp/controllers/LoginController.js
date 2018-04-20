app.controller('loginController', function($scope,$state)
{
  $scope.email = "abc@gmail.com";
   $scope.password="123456789";
   $scope.home = function()
   {
        // console.log("hello");
        $state.go('home');
      }
 });
