package com.example.memorygame;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class MainActivity extends AppCompatActivity {

   private String firstEmoji = "";
   private String secondEmoji = "";
   private int firstCard = 0;
   private int secondCard = 0;
   private int match = 0 ;
   private int flipcnt = 0;

   private TextView flipCntTxt;
   private TextView comment;
   private TextView timerText;


   CountDownTimer timer = null;

   //start the timer
   public void startTimer(){

       timer = new CountDownTimer(100000, 1000) {
           @Override
           public void onTick(long millisUntilFinished) {
               timerText = findViewById(R.id.timerText);
               timerText.setText("Time:" + millisUntilFinished/1000);

           }

           @Override
           public void onFinish() {

               timerText.setText("Time is over!");
               timeOver();

           }
       };
       timer.start();
   }

   //stop the timer
   public void cancelTimer(){
       if(timer!=null){
           timer.cancel();
       }
   }

   //if the time is over: event listener by all buttons is removed
   public void timeOver(){

       Button button0 = findViewById(R.id.button0);
       Button button1 = findViewById(R.id.button1);
       Button button2 = findViewById(R.id.button2);
       Button button3 = findViewById(R.id.button3);
       Button button4 = findViewById(R.id.button4);
       Button button5 = findViewById(R.id.button5);
       Button button6 = findViewById(R.id.button6);
       Button button7 = findViewById(R.id.button7);
       Button button8 = findViewById(R.id.button8);
       Button button9 = findViewById(R.id.button9);
       Button button10 = findViewById(R.id.button10);
       Button button11 = findViewById(R.id.button11);
       Button button12 = findViewById(R.id.button12);
       Button button13 = findViewById(R.id.button13);
       Button button14 = findViewById(R.id.button14);
       Button button15 = findViewById(R.id.button15);
       Button button16 = findViewById(R.id.button16);
       Button button17 = findViewById(R.id.button17);
       Button button18 = findViewById(R.id.button18);
       Button button19 = findViewById(R.id.button19);
       Button button20 = findViewById(R.id.button20);
       Button button21 = findViewById(R.id.button21);
       Button button22 = findViewById(R.id.button22);
       Button button23 = findViewById(R.id.button23);
       Button button24 = findViewById(R.id.button24);
       Button button25 = findViewById(R.id.button25);
       Button button26 = findViewById(R.id.button26);
       Button button27 = findViewById(R.id.button27);
       Button button28 = findViewById(R.id.button28);
       Button button29 = findViewById(R.id.button29);

       button0.setOnClickListener(null);
       button1.setOnClickListener(null);
       button2.setOnClickListener(null);
       button3.setOnClickListener(null);
       button4.setOnClickListener(null);
       button5.setOnClickListener(null);
       button6.setOnClickListener(null);
       button7.setOnClickListener(null);
       button8.setOnClickListener(null);
       button9.setOnClickListener(null);
       button10.setOnClickListener(null);
       button11.setOnClickListener(null);
       button12.setOnClickListener(null);
       button13.setOnClickListener(null);
       button14.setOnClickListener(null);
       button15.setOnClickListener(null);
       button16.setOnClickListener(null);
       button17.setOnClickListener(null);
       button18.setOnClickListener(null);
       button19.setOnClickListener(null);
       button20.setOnClickListener(null);
       button21.setOnClickListener(null);
       button22.setOnClickListener(null);
       button23.setOnClickListener(null);
       button24.setOnClickListener(null);
       button25.setOnClickListener(null);
       button26.setOnClickListener(null);
       button27.setOnClickListener(null);
       button28.setOnClickListener(null);
       button29.setOnClickListener(null);

   }

   //Emojis array
   public int [] emojis = {R.string.emoji0, R.string.emoji0, R.string.emoji1, R.string.emoji1,
           R.string.emoji2, R.string.emoji2, R.string.emoji3, R.string.emoji3, R.string.emoji4,
           R.string.emoji4, R.string.emoji5, R.string.emoji5, R.string.emoji6, R.string.emoji6,
           R.string.emoji7, R.string.emoji7, R.string.emoji8, R.string.emoji8, R.string.emoji9,
           R.string.emoji9, R.string.emoji10, R.string.emoji10, R.string.emoji11, R.string.emoji11,
           R.string.emoji12, R.string.emoji12,R.string.emoji13, R.string.emoji13, R.string.emoji14,
           R.string.emoji14};


   // Mix an array
   public static int [] RandomizedArray(int[]arr){

       Random rnd = ThreadLocalRandom.current();

       for(int i = arr.length - 1; i > 0; i--) {
           int index = rnd.nextInt(i + 1);


           //swap
           int a = arr[index];
           arr[index] = arr[i];
           arr[i] = a;
       }
       return arr;
   }


   //mix emojis
   public int [] RandomizedEmoji = RandomizedArray(emojis);


   //here is set the mixed array on each button
   public void touchCard(View view){


        switch(view.getId()){

            case R.id.button0:
                flipcnt++;
                flipCard(RandomizedEmoji[0], (Button) findViewById(view.getId()));
                break;

            case R.id.button1:
                flipcnt++;
                flipCard(RandomizedEmoji[1], (Button) findViewById(view.getId()));
                break;

            case R.id.button2:
                flipcnt++;
                flipCard(RandomizedEmoji[2], (Button) findViewById(view.getId()));
                break;


            case R.id.button3:
                flipcnt++;
                flipCard(RandomizedEmoji[3], (Button) findViewById(view.getId()));
                break;

            case R.id.button4:
                flipcnt++;
                flipCard(RandomizedEmoji[4], (Button) findViewById(view.getId()));
                break;

            case R.id.button5:
                flipcnt++;
                flipCard(RandomizedEmoji[5], (Button) findViewById(view.getId()));
                break;

            case R.id.button6:
                flipcnt++;
                flipCard(RandomizedEmoji[6], (Button) findViewById(view.getId()));
                break;

            case R.id.button7:
                flipcnt++;

                flipCard(RandomizedEmoji[7], (Button) findViewById(view.getId()));
                break;

            case R.id.button8:
                flipcnt++;

                flipCard(RandomizedEmoji[8], (Button) findViewById(view.getId()));
                break;


            case R.id.button9:

                flipcnt++;
                flipCard(RandomizedEmoji[9], (Button) findViewById(view.getId()));
                break;

            case R.id.button10:
                flipcnt++;

                flipCard(RandomizedEmoji[10], (Button) findViewById(view.getId()));
                break;

            case R.id.button11:
                flipcnt++;

                flipCard(RandomizedEmoji[11], (Button) findViewById(view.getId()));
                break;

            case R.id.button12:
                flipcnt++;

                flipCard(RandomizedEmoji[12], (Button) findViewById(view.getId()));
                break;

            case R.id.button13:
                flipcnt++;

                flipCard(RandomizedEmoji[13], (Button) findViewById(view.getId()));
                break;

            case R.id.button14:
                flipcnt++;

                flipCard(RandomizedEmoji[14], (Button) findViewById(view.getId()));
                break;

            case R.id.button15:
                flipcnt++;
                flipCard(RandomizedEmoji[15], (Button) findViewById(view.getId()));
                break;

            case R.id.button16:
                flipcnt++;

                flipCard(RandomizedEmoji[16], (Button) findViewById(view.getId()));
                break;

            case R.id.button17:
                flipcnt++;

                flipCard(RandomizedEmoji[17], (Button) findViewById(view.getId()));
                break;

            case R.id.button18:
                flipcnt++;

                flipCard(RandomizedEmoji[18], (Button) findViewById(view.getId()));
                break;


            case R.id.button19:
                flipcnt++;

                flipCard(RandomizedEmoji[19], (Button) findViewById(view.getId()));
                break;

            case R.id.button20:
                flipcnt++;

                flipCard(RandomizedEmoji[20], (Button) findViewById(view.getId()));
                break;

            case R.id.button21:
                flipcnt++;

                flipCard(RandomizedEmoji[21], (Button) findViewById(view.getId()));
                break;

            case R.id.button22:
                flipcnt++;

                flipCard(RandomizedEmoji[22], (Button) findViewById(view.getId()));
                break;

            case R.id.button23:
                flipcnt++;

                flipCard(RandomizedEmoji[23], (Button) findViewById(view.getId()));
                break;

            case R.id.button24:
                flipcnt++;

                flipCard(RandomizedEmoji[24], (Button) findViewById(view.getId()));
                break;


            case R.id.button25:
                flipcnt++;

                flipCard(RandomizedEmoji[25], (Button) findViewById(view.getId()));
                break;

            case R.id.button26:
                flipcnt++;

                flipCard(RandomizedEmoji[26], (Button) findViewById(view.getId()));
                break;

            case R.id.button27:
                flipcnt++;

                flipCard(RandomizedEmoji[27], (Button) findViewById(view.getId()));
                break;

            case R.id.button28:
                flipcnt++;

                flipCard(RandomizedEmoji[28], (Button) findViewById(view.getId()));
                break;

            case R.id.button29:
                flipcnt++;

                flipCard(RandomizedEmoji[29], (Button) findViewById(view.getId()));
                break;

                default:
                    break;

        }
        flipCntTxt =  findViewById(R.id.flipText);
        flipCntTxt.setText("Flips:" + String.valueOf(flipcnt));


    }


    //flip cards, set emojis and get id from the button
   public void flipCard(int emoji, Button btn){

            if (btn.getText() == "") {
                btn.setBackgroundColor(Color.WHITE);
                btn.setText(emoji);

                if(firstEmoji == ""){
                    firstEmoji=String.valueOf(btn.getText());
                    firstCard=btn.getId();
                }else{
                    secondEmoji=String.valueOf(btn.getText());
                    secondCard=btn.getId();
                    isMatch();
                }
            }


   }


    // if there is no match between the cards, the background color is changed in green and the event listener is removed
   public void isMatch(){

       if(firstEmoji==secondEmoji) {

           Button btn1 = findViewById(firstCard);
           Button btn2 = findViewById(secondCard);

           btn1.setBackgroundColor(Color.rgb(0,255,0));
           btn2.setBackgroundColor(Color.rgb(0,255,0));

           comment = (TextView) findViewById(R.id.textView1);
           comment.setText("Correct!");
           comment.setTextColor(Color.GREEN);

           Handler handler = new Handler();
           handler.postDelayed(new Runnable() {
               public void run() {

                   comment.setText("");

               }
           }, 1000);   //1 second

           // no click
           btn1.setOnClickListener(null);
           btn1.setOnClickListener(null);

           match++;
           ifGameWon();
           resetCards();

       }else {
           noMatch();
       }

   }


   // if there is no match between the cards, the background color is changed in red
   public void noMatch(){

        final Button btn1 = findViewById(firstCard);
        final Button btn2 = findViewById(secondCard);

       btn1.setBackgroundColor(Color.rgb(255, 0, 0));
       btn2.setBackgroundColor(Color.rgb(255, 0, 0));

       comment = (TextView) findViewById(R.id.textView1);
       comment.setText("Try Again!");
       comment.setTextColor(Color.RED);


       // set delay for 1 sec
       Handler handler = new Handler();
       handler.postDelayed(new Runnable() {
           public void run() {

               btn1.setBackgroundColor(Color.rgb(255, 140, 0));
               btn1.setText("");

               btn2.setBackgroundColor(Color.rgb(255, 140, 0));
               btn2.setText("");

               comment.setText("");


           }
       }, 1000);   //1 second

       resetCards();

    }

    //reset all variables
   public void resetCards(){

       firstEmoji = "";
       secondEmoji = "";
       firstCard = 0;
       secondCard = 0;

   }

   //if all emojis are matched and if the game is finished
   public void ifGameWon(){
        if(match==15){
            timeOver();
            cancelTimer();
            comment = (TextView) findViewById(R.id.textView1);
            comment.setText("Well done!");

        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //starting the same MainActivity with button (restart the game)
        Button restartButton = findViewById(R.id.restart);
        restartButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this , MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });


        startTimer();


    }

}
