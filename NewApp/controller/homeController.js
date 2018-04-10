app.controller('homeCtrl', function ($scope, $timeout, $mdSidenav,$state,readJson)
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

    $scope.getData = readJson.getJson();
    $scope.getData.then(function(response){
      $scope.jsonRecord = response;
    })
  });
  app.filter('unique', function() {
      return function(collection, primaryKey) { //no need for secondary key
        var output = [],
            keys = [];
            var splitKeys = primaryKey.split('.'); //split by period


        angular.forEach(collection, function(x) {
              var key = {};
              angular.copy(x, key);
              for(var i=0; i<splitKeys.length; i++){
                  key = key[splitKeys[i]];    //the beauty of loosely typed js :)
              }

              if(keys.indexOf(key) === -1) {
                keys.push(key);
                output.push(x);
              }
        });

        return output;
      };
  });
