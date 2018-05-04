app.controller('dashboardCtrl', function($scope, $mdDialog, readJson, $location) {


  $scope.go = function ( path ) {
    $location.path("/a"+path)



};
  $scope.showDialog = function(event1, item) {
    $mdDialog.show({
      locals: {
        Mobile: item
      },
      controller: openDialogueBox,
      templateUrl: 'template/DialogueBox.html',
      parent: angular.element(document.body),
      targetEvent: event1,
      clickOutsideToClose: true,
      fullscreen: $scope.customFullscreen
    });
  };
  $scope.getData = readJson.getJson("JSON/newTeamInfo.json");
$scope.getData.then(function(response) {
  $scope.jsonRecord = response['teaminfo'];
})

  function openDialogueBox($scope, $mdDialog, Mobile) {
    $scope.getData = readJson.getJson("JSON/newTeamInfo.json");
  $scope.getData.then(function(response) {
    $scope.jsonRecord = response['teaminfo'];
    console.log(response['teaminfo']);
    console.log(Mobile);
  })

    $scope.getData = readJson.getJson("JSON/newPlayerInfo.json");
  $scope.getData.then(function(response) {
      $scope.Mobile = response['Playersinfo'];
  })
    $scope.cancel = function() {
      $mdDialog.cancel();
    };
  }
});
