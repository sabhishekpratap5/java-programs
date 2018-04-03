var app = angular.module('myApp',['ui.router']);
app.config(['$stateProvider','$urlRouterProvider',function($stateProvider,$urlRouterProvider)
{
  $stateProvider
  .state('register1',
  {
    url : '/register1',

    templateUrl : 'templates/register1.html',
    controller : 'register1controller'
  })

  .state('login1',
{
  url : '/login1',
  templateUrl : 'templates/login1.html',
  controller : 'login1controller'
});
  $urlRouterProvider.otherwise('/register1');
}]);
