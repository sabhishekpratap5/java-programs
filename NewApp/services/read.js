app.service('readJson',function($http){
  this.getJson=function(){
    return $http.get("products.json").then(function(response){
      return response.data;
      console.log(myData);
    });
  }
});
