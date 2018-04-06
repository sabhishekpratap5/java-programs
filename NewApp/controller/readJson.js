app.controller('jsonCtrl',function($scope,readJson) {
  $scope.getData = readJson.getJson();
  $scope.getData.then(function(response){
    $scope.jsonRecord = response;
  })
});
