app.controller('homeCtrl', function ($scope, $timeout, $mdSidenav, $state)
{
    $scope.toggleLeft = buildToggler('left');
    $scope.toggleRight = buildToggler('right');

    function buildToggler(componentId) {
      return function() {
        $mdSidenav(componentId).toggle();
      };
    }

    $scope.sendLogin=function()
  {
   $state.go('login');
  }
});
