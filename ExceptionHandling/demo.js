try{
    const a = 10;
    const b = 0;
    const res = a/b;
    if(b == 0) throw new Error("Division by Zero is not allowed");
}
catch(err)
{
    console.log(err);
}
finally{
    console.log("Execution Finished");
}