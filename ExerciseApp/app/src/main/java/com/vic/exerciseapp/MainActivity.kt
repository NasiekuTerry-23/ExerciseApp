package com.vic.exerciseapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


import com.vic.exerciseapp.ui.theme.ExerciseAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            login()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun login() {

    Box(
        modifier = Modifier.fillMaxWidth()

    ) {

        Image(
            modifier = Modifier.fillMaxSize(),
        painter = painterResource(id = R.drawable.back),
        contentDescription = null,
            contentScale = ContentScale.Crop,

        )


        Column(


               // .background(Color(color = 0xff08e5e0))

                //.fillMaxSize(),

            modifier = Modifier
            .padding(100.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center



        ) {

            Image(
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(10.dp)),
                   // .border(3.dp, Color.LightGray),
                        painter = painterResource(id = R.drawable.logo),
                contentDescription = null
            )

            Spacer(
                modifier = Modifier
                    .height(17.dp)
            )

            Text(
                text = "Login",
                fontSize = 35.sp,
                color = Color.Black,
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold


            )

            Spacer(
                modifier = Modifier
                    .height(17.dp)
            )

            Text(
                text = "Come back with your ID",
                fontSize = 15.sp,
                color = Color(0xff012c0a),
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(
                modifier = Modifier
                    .height(12.dp)
            )

            Text(
                text = "For easy, fast and secure login",
                fontSize = 10.sp,
                color = Color.Black,
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(
                modifier = Modifier
                    .height(10.dp)
            )

            var name by remember{
                mutableStateOf(TextFieldValue(""))
            }

            Column {
                OutlinedTextField(
                    value = name,
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color.Blue,
                        focusedBorderColor = Color.Blue,
                        unfocusedLabelColor = Color.Blue,
                        focusedLabelColor = Color.Blue,


                    ),
                    onValueChange = { name = it },
                    label = { Text(text = "Name") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(30.dp),


                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Person,
                            contentDescription = "personIcon")

                    }
                )
            }

            Spacer(
                modifier = Modifier
                    .height(10.dp)
            )

            var email by remember{
                mutableStateOf(TextFieldValue(""))
            }

            Column {
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text(text = "Email") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(30.dp),

                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Email,
                            contentDescription = "emailIcon")
                    }
                )
            }

            Spacer(
                modifier = Modifier
                    .height(10.dp)

            )

            var password by remember{
                mutableStateOf(TextFieldValue(""))
            }

            Column {
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text(text = "Password") },
                    visualTransformation = PasswordVisualTransformation(),
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(30.dp),


                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Lock,
                            contentDescription = "lockIcon")
                    }
                )
            }

            Spacer(
                modifier = Modifier
                    .height(20.dp)

            )

            Button(

                onClick = {
                    //   about.startActivity(Intent(about, AboutActivity::class.java))

                },
                colors = ButtonDefaults.buttonColors(Color(0xff3e33ff)),
                shape = RoundedCornerShape(30.dp)
            ) {

                Text(text = "Login")

            }

            Spacer(
                modifier = Modifier
                    .height(10.dp)

            )

            Text(
                text = "Forgot Password",
                fontSize = 15.sp,
                color = Color.Black,
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(
                modifier = Modifier
                    .height(10.dp)

            )

            Text(
                text = "OR",
                fontSize = 30.sp,
                color = Color.Black,
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold
            )

            Spacer(
                modifier = Modifier
                    .height(10.dp)

            )

            Text(
                text = "Not a member? Sign up",
                fontSize = 15.sp,
                color = Color.Black,
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.SemiBold
            )
        }



    }

}


