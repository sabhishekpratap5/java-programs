app.controller('dashboardCtrl', function($scope, $mdDialog) {
  $scope.showDialog = function(clickEvent, item) {
    $mdDialog.show({
      locals: {
        data: item
      },
      controller: DialogController,
      templateUrl: 'templates/mobileDialog.html',
      parent: angular.element(document.body),
      targetEvent: clickEvent,
      clickOutsideToClose: true,
      fullscreen: $scope.customFullscreen
    });
  };

  function DialogController($scope, $mdDialog, data) {
    $scope.data = data;
    $scope.cancel = function() {
      $mdDialog.cancel();
    };
  }
});
app.config(function($mdThemingProvider) {
  $mdThemingProvider.theme('dark-blue')
    .backgroundPalette('blue').dark();

});
