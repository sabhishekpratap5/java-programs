var app = angular.module('myApp',['ui.router']);
app.config(['$stateProvider','$urlRouterProvider',function($stateProvider,$urlRouterProvider)
{
  $stateProvider
  .state('register',
  {
    url : '/register',
    templateUrl : 'templates/register.html',
    controller : 'registercontroller'
  })

  .state('login',
{
  url : '/login',
  templateUrl : 'templates/login.html',
  controller : 'logincontroller'
});
  $urlRouterProvider.otherwise('/register');
}]);
