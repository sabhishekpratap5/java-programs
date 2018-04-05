
app.controller('loginController', function($scope){
  $scope.sendHome=function()
  {
   $state.go('home');
 }
});
