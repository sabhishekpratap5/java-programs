app.controller('dashboardCtrl', function($scope, $mdDialog) {
  $scope.showDialog = function(event1, item) {
    $mdDialog.show({
      locals: {
        Mobile: item
      },
      controller: openDialogueBox,
      templateUrl: 'templates/DialogueBox.html',
      parent: angular.element(document.body),
      targetEvent: event1,
      clickOutsideToClose: true,
      fullscreen: $scope.customFullscreen
    });
  };

  function openDialogueBox($scope, $mdDialog, Mobile) {
    $scope.Mobile = Mobile;
    $scope.cancel = function() {
      $mdDialog.cancel();
    };
  }
});
