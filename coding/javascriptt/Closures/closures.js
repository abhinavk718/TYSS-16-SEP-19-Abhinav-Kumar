function outerFunction(counter)
{
    function innerFunction()
    {
        let count
        count=counter+10;
        return count
    }
    return innerFunction
}
let innerFunc=outerFunction(20)
let counter=innerFunc()
console.log('Counter value = ',counter);
