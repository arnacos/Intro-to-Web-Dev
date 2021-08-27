function countingCharacters3(str, search) {
    var count=0; var numChars=search.length; var lastIndex=str.length-numChars;
    for (var index=0; index<=lastIndex; index++){
        var current=str.substring(index,index+numChars); 
        if(current==search){
            count++;
        }
    }
  
     console.log ("String to search in: " + str);
     console.log("Character to fnd: "+ search);
     console.log ("Number of times te character appears: " + count);
}