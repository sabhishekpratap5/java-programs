app.controller('homeCtrl', function($scope, $mdSidenav, $state, readJson,$filter) {

    var manufacturer = [];
    var storage = [];
    var os = [];
    var camera = [];
  $scope.toggleLeft = buildToggler('left');
  $scope.toggleRight = buildToggler('right');

  function buildToggler(componentId) {
    return function() {
      $mdSidenav(componentId).toggle();
    };
  }
  $scope.sendLogin = function() {
    $state.go('login');
  }

  $scope.getData = readJson.getJson();
  $scope.getData.then(function(response) {
    $scope.jsonRecord = response;
  })

  $state.go('home.dashboard');

  $scope.toggle = function(category,keyword) {
    switch (category) {
      case 'manufacturer':
        var indexm = manufacturer.indexOf(keyword);
        if (indexm > -1) {
          manufacturer.splice(indexm, 1);
        } else {
          manufacturer.push(keyword);
        }
        break;
      case 'storage':
        var indexs = storage.indexOf(keyword);
        if (indexs > -1) {
          storage.splice(indexs, 1);
        } else {
          storage.push(keyword);
        }
        break;
      case 'os':
        var indexo = os.indexOf(keyword);
        if (indexo > -1) {
          os.splice(indexo, 1);
        } else {
          os.push(keyword);
        }
        break;
      case 'camera':
        var indexc = camera.indexOf(keyword);
        if (indexc > -1) {
          camera.splice(indexc, 1);
        } else {
          camera.push(keyword);
        }
        break;
    }
  };
  $scope.arrManufacturer = manufacturer;
  $scope.arrStorage = storage;
  $scope.arrOs = os;
  $scope.arrCamera = camera;

});
app.filter('selectedString', function()
{
  return function(x, arrManufacturer, arrStorage, arrOs, arrCamera) {
    var filtered = [];
    var temparr = [];

    if (x !=0) {

      if (arrManufacturer.length > 0 || arrStorage.length > 0 || arrOs.length > 0 || arrCamera.length > 0) {

        for (var j = 0; j < x.length; j++) {
          var item = x[j];

          for (var i = 0; i < arrManufacturer.length; i++) {
            var selectedItem = arrManufacturer[i];
            if (item.specs.manufacturer == selectedItem || item.specs.storage == selectedItem ||
              item.specs.os == selectedItem || item.specs.camera == selectedItem) {
              filtered.push(item);
            }
          }
        }
        if (filtered.length > 0) {
          temparr = filtered;
          filtered = [];
        } else {
          temparr = x;
        }

        if (arrStorage.length > 0) {
          for (var j = 0; j < temparr.length; j++) {
            var item = temparr[j];

            for (var i = 0; i < arrStorage.length; i++) {
              var selectedItem = arrStorage[i];
              if (item.specs.manufacturer == selectedItem || item.specs.storage == selectedItem ||
                item.specs.os == selectedItem || item.specs.camera == selectedItem) {
                filtered.push(item);
              }
            }
          }
          temparr = filtered;
          filtered = [];
        }

        if (arrOs.length > 0) {
          for (var j = 0; j < temparr.length; j++) {
            var item = temparr[j];

            for (var i = 0; i < arrOs.length; i++) {
              var selectedItem = arrOs[i];
              if (item.specs.manufacturer == selectedItem || item.specs.storage == selectedItem ||
                item.specs.os == selectedItem || item.specs.camera == selectedItem) {
                filtered.push(item);
              }
            }
          }
          temparr = filtered;
          filtered = [];
        }

        if (arrCamera.length > 0) {
          for (var j = 0; j <= temparr.length-1; j++) {
            var item = temparr[j];

            for (var i = 0; i <= arrCamera.length-1; i++) {
              var selectedItem = arrCamera[i];
              if (item.specs.manufacturer == selectedItem || item.specs.storage == selectedItem ||
                item.specs.os == selectedItem || item.specs.camera == selectedItem) {
                filtered.push(item);
              }
            }

          }
          temparr = filtered;
          filtered = [];
        }
      } else {
        temparr = x;
      }
    }
    return temparr;
  };
});
