var array = new Object();

array.object = new Array();

array.object.push({place:"mumbai",name:"rakesh"});
array.object.push({place:"mumbai",name:"abhishek"});
array.object.push({place:"mumbai",name:"rakesh"});
array.object.push({place:"mumbai",name:"pardeep"});
array.object.push({place:"mumbai",name:"pardeep"});
array.object.push({place:"chenni",name:"pardeep"});

// assign things.thing to myData for brevity
var myData = array.object;

array.object = Array.from(new Set(myData.map(JSON.stringify))).map(JSON.parse);

console.log(array.object)
