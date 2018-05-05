app.controller('dashboardCtrl', function($scope, $mdDialog, readJson, $location,$scope) {


  $scope.go = function ( team_name )
   {
     console.log("id",team_name);
     // if(team_name=='Delhi Daredevils')
     // {
     //   console.log("ranu");
     //   $location.path("/a"+path);
     //
     // }
     switch (team_name)
     {
      case 'Delhi Daredevils' : path='/1';
                                $location.path("/a"+path);
                                console.log("ranu1");
                                break;
      case 'Gujrat Lions'     : path='/2';
                                $location.path("/a"+path);
                                console.log("ranu2");
                                break;
      case 'Kings XI Punjab'  : path='/3';
                                $location.path("/a"+path);
                                console.log("ranu3");
                                break;



      default : path='/1';
                $location.path("/a"+path)
     }

   };
  // $scope.showDialog = function(event1, item) {
  //   $mdDialog.show({
  //     locals: {
  //       Mobile: item
  //     },
  //     controller: openDialogueBox,
  //     templateUrl: 'template/DialogueBox.html',
  //     parent: angular.element(document.body),
  //     targetEvent: event1,
  //     clickOutsideToClose: true,
  //     fullscreen: $scope.customFullscreen
  //   });
  // };

  $scope.getData = readJson.getJson("JSON/newTeamInfo.json");
  $scope.getData.then(function(response) {
  $scope.jsonRecord = response['teaminfo'];
})



  // function openDialogueBox($scope, $mdDialog, Mobile) {
  //   $scope.getData = readJson.getJson("JSON/newTeamInfo.json");
  // $scope.getData.then(function(response) {
  //   $scope.jsonRecord = response['teaminfo'];
  //   console.log(response['teaminfo']);
  //   console.log(Mobile);
  // })
  //
  //   $scope.getData = readJson.getJson("JSON/newPlayerInfo.json");
  // $scope.getData.then(function(response) {
  //     $scope.Mobile = response['Playersinfo'];
  // })
  //   $scope.cancel = function() {
  //     $mdDialog.cancel();
  //   };
  // }
});
