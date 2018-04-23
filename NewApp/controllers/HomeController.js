app.controller('homeCtrl', function($scope, $mdSidenav, $state, readJson,$filter) {

    var manufacturer = [];
    var storage = [];
    var os = [];
    var camera = [];
  $scope.toggleLeft = buildToggler('left');


  function buildToggler(componentId) {
    return function() {
      $mdSidenav(componentId).toggle();
      var isOpen=$mdSidenav(componentId).isOpen();
      if(isOpen)
      {
        document.getElementById('dashboard').style.marginLeft='200px';
      }
      else{
        document.getElementById('dashboard').style.marginLeft='0px';

      }
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
        switchCaseFunction(manufacturer,keyword)
        break;
      case 'storage':
        switchCaseFunction(storage,keyword)
        break;
      case 'os':
        switchCaseFunction(os,keyword)
        break;
      case 'camera':
        switchCaseFunction(camera,keyword)
        break;
    }
  };
  $scope.arrManufacturer = manufacturer;
  $scope.arrStorage = storage;
  $scope.arrOs = os;
  $scope.arrCamera = camera;

});
switchCaseFunction=function(array,keyword)
{
  var indexm = array.indexOf(keyword);
  if (indexm > -1) {
    array.splice(indexm, 1);
  } else {
    array.push(keyword);
  }
}

app.filter('selectedString', function()
{
  return function(x, arrManufacturer, arrStorage, arrOs, arrCamera) {
    var filter = [];
    var temparr = [];

    if (x !=0) {

      if (arrManufacturer.length > 0 || arrStorage.length > 0 || arrOs.length > 0 || arrCamera.length > 0) {

        for (var j = 0; j < x.length; j++) {
          var item = x[j];

          for (var i = 0; i < arrManufacturer.length; i++) {
            var selectedItem = arrManufacturer[i];
            if (item.specs.manufacturer == selectedItem || item.specs.storage == selectedItem ||
              item.specs.os == selectedItem || item.specs.camera == selectedItem) {
              filter.push(item);
            }
          }
        }
        if (filter.length > 0) {
          temparr = filter;
          filter = [];
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
                filter.push(item);
              }
            }
          }
          temparr = filter;
          filter = [];
        }

        if (arrOs.length > 0) {
          for (var j = 0; j < temparr.length; j++) {
            var item = temparr[j];

            for (var i = 0; i < arrOs.length; i++) {
              var selectedItem = arrOs[i];
              if (item.specs.manufacturer == selectedItem || item.specs.storage == selectedItem ||
                item.specs.os == selectedItem || item.specs.camera == selectedItem) {
                filter.push(item);
              }
            }
          }
          temparr = filter;
          filter = [];
        }

        if (arrCamera.length > 0) {
          for (var j = 0; j <= temparr.length-1; j++) {
            var item = temparr[j];

            for (var i = 0; i <= arrCamera.length-1; i++) {
              var selectedItem = arrCamera[i];
              if (item.specs.manufacturer == selectedItem || item.specs.storage == selectedItem ||
                item.specs.os == selectedItem || item.specs.camera == selectedItem) {
                filter.push(item);
              }
            }

          }
          temparr = filter;
          filter = [];
        }
      } else {
        temparr = x;
      }
    }
    return temparr;
  };
});
