app.service('readJson',function($http){
  this.getJson=function(){
    return $http.get("share.json").then(function(response){
      return response.data.Share_Info;
      // console.log(myData);
    });
  }
});
