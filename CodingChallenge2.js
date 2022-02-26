/*
* compute the distinct number of ways a bunny can hop to reach n steps, taking 1 or 2 or 3 steps at a time.
* example 4 steps. There are seven different ways a bunny can hop to reach 4 steps using 1 or 2 or 3 steps at a time: 
* [1,1,1,1] [2,1,1] [1,2,1] [1,1,2] [2,2][1,3] [3,1]
* Parameters: n
*/
function bunnyHops(n)
{
    var hopsArray = new Array(n + 1);
    hopsArray[0] = 1;
    // 1 = only 1 hops
    if (n >= 1){
        hopsArray[1] = 1;
    }
    // 2 = only 2 hops
    if (n >= 2){
        hopsArray[2] = 2;
    }
    // anything other number of steps = count hops
    for(var i = 3; i <= n; i++){
        hopsArray[i] = hopsArray[i - 1] + hopsArray[i - 2] + hopsArray[i - 3];
    }
    return hopsArray[n];
}

/* execute test */
//bunnyHops(4);