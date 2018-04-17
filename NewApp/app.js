var app= angular.module('myApp',['ui.router','ngMaterial','ngAnimate','ngAria','ngMessages']);
app.config(['$stateProvider','$urlRouterProvider',function($stateProvider,$urlRouterProvider)
{
  $stateProvider.state('login',{
      url : '/login',
      templateUrl : 'templete/login.html',
      controller : 'loginController'
})
.state('home',
{
  url         : '/home',
  templateUrl : 'templete/home.html',
  controller  : 'homeCtrl'
})

.state('readJson',
{
  url         : '/readJson',
  templateUrl : 'templete/readData.html',
  controller  : 'jsonCtrl'
})

.state("home.dashboard", {
      url: "/dashboard",
      templateUrl: "templete/Dashboard.html",
      controller: "dashboardCtrl"
    });


  $urlRouterProvider.otherwise('/login');
}]);
