app.controller('Playersinfoctrl', function($scope,readJson) {

  
  $scope.getData = readJson.getJson("JSON/newPlayerInfo.json");
  $scope.getData.then(function(response) {
  $scope.pInfo = response['Playersinfo'];
  })
});
