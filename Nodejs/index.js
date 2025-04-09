import express from 'express'
import dotenv from 'dotenv'
import jwt from 'jsonwebtoken'

const server = express();

dotenv.config();

let PORT = process.env.PORT || 8000;

server.get("/user/generateToken", async (req,res)=>{

    let key = process.env.JWT_SECREAT_KEY || "POSTMAN"

   const data = {
        username : "dhanush",
        loginDateAndTime : Date(),
    };

    const token = jwt.sign(
        data,
        key,
        {
            expiresIn : '2h'
        }
    );

    res.status(200).json({
        token : token
    });

});

server.get("/user/verifyToken", async (req,res)=>{

    try{

        const header = req.header("JWT_TOKEN");
        const key = process.env.JWT_SECREAT_KEY;

        const isVerified = jwt.verify(header,key)

        if(isVerified) res.status(200).send("Token verified successfully");
        else res.status(401).send("Invalid token, Unauthorized");


    }catch(err){
        console.log(err);
        res.status(500).send("Server Error");
    }

    res.status(404).send("No Header token found")

});

server.get("/user/dashboard", (req,res)=>{

    try{

        const token = req.header("JWT_TOKEN");
        const key = process.env.JWT_SECREAT_KEY;

        const isVerified = jwt.verify(token,key)

        if(isVerified){

            const data = jwt.decode(token);
            res.status(200).json(data);

        }
        else res.status(401).send("Invalid token, Unauthorized");


    }catch(err){
        console.log(err);
        res.status(500).send("Server Error");
    }

})

server.get("/", (req,res)=>{

    console.log("Server running on port " + PORT);
    res.send("Server Running Successfully");

});

server.listen(PORT,(err)=>{
    if(err){
        console.log(err);
    }
    else{
        console.log("Server running on port " + PORT);
    }
})
