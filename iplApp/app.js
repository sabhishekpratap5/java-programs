var app = angular.module('myApp', ['ui.router', 'ngMaterial']);
app.config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider) {
  $stateProvider
  .state("dashboard", {
      url: "/dashboard",
      templateUrl: "template/dashboard.html",
      controller: "dashboardCtrl"
    })
    .state("a", {
        url: "/a/:id",
        templateUrl: "template/a.html",
        controller: "Playersinfoctrl"
      });
    $urlRouterProvider.otherwise("/dashboard");
  }]);
