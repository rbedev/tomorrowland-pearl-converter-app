package borralloespinarrafael.tomorrowlandpearlconverter.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Random;

import borralloespinarrafael.tomorrowlandpearlconverter.R;
import borralloespinarrafael.tomorrowlandpearlconverter.activities.PricesBelgiumActivity;
import borralloespinarrafael.tomorrowlandpearlconverter.activities.PricesWinterActivity;
import borralloespinarrafael.tomorrowlandpearlconverter.model.TomorrowlandPearlConverter;


public class FragmentTMLWinter  extends Fragment {

    private Spinner spinnerCurrencies;

    private ArrayList<String> arrayListCurrencies;
    private ArrayAdapter<String> arrayAdapterCurrencies;

    private Button buttonConvert;
    private ImageButton buttonChangeConversion;

    private Button buttonPrices;

    private TextView textViewCriteria;

    private EditText editTextQuantity;

    private TextView textViewResult;

    private TextView textViewPearlRate;

    private MediaPlayer mMediaPlayer;

    private boolean wrongQuantity = false;

    private boolean longClick = false;

    private static boolean fromPearlsToCurrency = true;

    private static final double PEARL_EURO_RATIO = 2.1428571428571428;

    public FragmentTMLWinter() {}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tml_winter, container, false);

        textViewPearlRate = view.findViewById(R.id.textViewPearlRate);
        textViewPearlRate.setText("1 Pearl = 2.14€");

        textViewCriteria = view.findViewById(R.id.textViewCriteria);

        textViewResult = view.findViewById(R.id.textViewResult);

        editTextQuantity = view.findViewById(R.id.editTextQuantity);

        buttonPrices = view.findViewById(R.id.buttonPrices);

        buttonConvert = view.findViewById(R.id.buttonConvert);
        buttonChangeConversion = view.findViewById(R.id.buttonChangeConversion);

        spinnerCurrencies = view.findViewById(R.id.spinnerCurrency);

        fillSpinner();
        setSpinnerPopupSize();

        buttonPrices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), PricesWinterActivity.class);
                startActivity(intent);
            }
        });

        buttonChangeConversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fromPearlsToCurrency){
                    textViewCriteria.setText("From selected currency to Pearls");
                    fromPearlsToCurrency = false;
                }else {
                    textViewCriteria.setText("From Pearls to selected currency");
                    fromPearlsToCurrency = true;
                }
            }
        });

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkCurrencyValue()){
                    if(fromPearlsToCurrency){
                        convertToCurrency();
                    }else{
                        convertToPearls();
                    }
                }else{
                    if(!wrongQuantity){
                        Toast.makeText(getActivity().getApplicationContext(), "If you try it again, DV&LM will visit you.", Toast.LENGTH_SHORT).show();
                        wrongQuantity = true;
                    }else{
                        Toast.makeText(getActivity().getApplicationContext(), "I told you.", Toast.LENGTH_SHORT).show();
                        playRandomSound();
                    }
                }

            }


        });

        buttonConvert.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(!longClick){
                    Toast.makeText(getActivity().getApplicationContext(), "Are you ready? Do it again.", Toast.LENGTH_SHORT).show();
                    longClick=true;
                }else{
                    Toast.makeText(getActivity().getApplicationContext(), "I told you.", Toast.LENGTH_SHORT).show();
                    playAreYouReadySound();
                }
                return true;
            }
        });



        return view;
    }

    private void playAreYouReadySound() {
        play(getActivity(), R.raw.davidguetasound0);
    }

    private void playRandomSound() {
        try {
            Random rand = new Random();
            int n = rand.nextInt(5); // Gives n such that 0 <= n < 5
            if(n==0){
                play(getActivity(), R.raw.dvlmsound0);
            }else if(n==1){
                play(getActivity(), R.raw.dvlmsound1);
            }else if(n==2){
                play(getActivity(), R.raw.dvlmsound2);
            }else if(n==3){
                play(getActivity(), R.raw.dvlmsound3);
            }else{
                play(getActivity(), R.raw.dvlmsound4);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void play(Context c, int rid) {
        stop();

        mMediaPlayer = MediaPlayer.create(c, rid);
        mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                stop();
            }
        });

        mMediaPlayer.start();
    }

    public void stop() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }

    private boolean checkCurrencyValue() {

        try {
            String str = editTextQuantity.getText().toString();
            Log.d("content", str);
            if(str.length()>=0) {
                double quantity = Double.parseDouble(str);
                if(quantity>0){
                    return true;
                }else{
                    return false;
                }

            }else{
                return false;
            }


        }catch (Exception e){
            Log.d("Exception","Exception");
            return false;
        }
    }

    private void convertToPearls() {
        double quantity = Double.parseDouble(editTextQuantity.getText().toString());
        double rate = Double.parseDouble(TomorrowlandPearlConverter.CURRENCIES_TO_EURO[spinnerCurrencies.getSelectedItemPosition()]);

        double euros = quantity*rate;
        double result = euros / PEARL_EURO_RATIO;


        textViewResult.setText(String.format("%.1f", result) + " pearls");

    }

    private void convertToCurrency() {
        double quantity = Double.parseDouble(editTextQuantity.getText().toString());
        double rate = Double.parseDouble(TomorrowlandPearlConverter.VALUES_FROM_EURO[spinnerCurrencies.getSelectedItemPosition()]);

        double euros = quantity*PEARL_EURO_RATIO;
        double result = euros * rate;

        textViewResult.setText(String.format("%.2f", result) + " " + spinnerCurrencies.getSelectedItem().toString().toLowerCase() + "s");


    }

    private void fillSpinner() {
        arrayListCurrencies = new ArrayList<>();

        for (int i = 0; i < TomorrowlandPearlConverter.CURRENCIES.length; i++) {
            arrayListCurrencies.add(TomorrowlandPearlConverter.CURRENCIES[i]);
        }

        arrayAdapterCurrencies  = new ArrayAdapter<>(getActivity().getApplicationContext(), R.layout.spinner_item, arrayListCurrencies);
        spinnerCurrencies.setAdapter(arrayAdapterCurrencies);
        spinnerCurrencies.setSelection(0);

        spinnerCurrencies.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                ((TextView) spinnerCurrencies.getSelectedView()).setTextColor(Color.BLACK);
            }
        });
    }

    private void setSpinnerPopupSize() {
        try {
            Field popup = Spinner.class.getDeclaredField("mPopup");
            popup.setAccessible(true);

            // Get private mPopup member variable and try cast to ListPopupWindow
            android.widget.ListPopupWindow popupWindow = (android.widget.ListPopupWindow) popup.get(spinnerCurrencies);

            // Set popupWindow height to 500px
            popupWindow.setHeight(800);
        }
        catch (NoClassDefFoundError | ClassCastException | NoSuchFieldException | IllegalAccessException e) {
            // silently fail...
        }
    }

}
