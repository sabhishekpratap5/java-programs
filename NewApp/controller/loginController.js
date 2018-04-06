
app.controller('loginController', function($scope,$state){
  $scope.vm = {
      formData: {
        email: 'abc@gmail.com',
       	password: '123456'
      }
  }
  $scope.sendHome=function()
  {
   $state.go('home');
 }
});
