package com.ovidiooswaldo.projetoporah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class IgorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_igor);
        //------------------------------------------------------------- DOMINGO -----------------------------------------------------------
        CardView domingoCardView = findViewById(R.id.domingoIgor);
        final int initialCardViewD = domingoCardView.getLayoutParams().height;
        final int expandedCardViewD = getResources().getDimensionPixelSize(R.dimen.igordomingo);
        final boolean[] isExpandedD = {false};
        domingoCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueAnimator heightAnimator;
                if (isExpandedD[0]){
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewD, initialCardViewD);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewD, expandedCardViewD);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = domingoCardView.getLayoutParams();
                        layoutParams.height = val;
                        domingoCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedD[0] = !isExpandedD[0];
            }
        });
        //------------------------------------------------------------- SABADO ------------------------------------------------------------
        CardView sabadoCardView = findViewById(R.id.sabadoIgor);
        final int initialCardViewSa = sabadoCardView.getLayoutParams().height;
        final int expandedCardViwSa = getResources().getDimensionPixelSize(R.dimen.igorsabado);
        final boolean[] isExpandedSa = {false};
        sabadoCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueAnimator heightAnimator;
                if (isExpandedSa[0]){
                    heightAnimator = ValueAnimator.ofInt(expandedCardViwSa, initialCardViewSa);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewSa, expandedCardViwSa);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = sabadoCardView.getLayoutParams();
                        layoutParams.height = val;
                        sabadoCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedSa[0] = !isExpandedSa[0];
            }
        });
        //------------------------------------------------------------- SEXTA -------------------------------------------------------------
        CardView sextaCardView = findViewById(R.id.sextaIgor);
        final int initialCardViewSe = sextaCardView.getLayoutParams().height;
        final int expandedCardViewSe = getResources().getDimensionPixelSize(R.dimen.igorsexta);
        final boolean[] isExpandedSe = {false};
        sextaCardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ValueAnimator heightAnimator;
                if (isExpandedSe[0]){
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewSe, initialCardViewSe);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewSe, expandedCardViewSe);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(){
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = sextaCardView.getLayoutParams();
                        layoutParams.height = val;
                        sextaCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedSe[0] = !isExpandedSe[0];
            }
        });
        //------------------------------------------------------------- QUINTA ------------------------------------------------------------
        CardView quintaCardView = findViewById(R.id.quintaIgor);
        final int initialCardViewQi = quintaCardView.getLayoutParams().height;
        final int expandedCardViewQi = getResources().getDimensionPixelSize(R.dimen.igorquinta);
        final boolean[] isExpandedQi = {false};
        quintaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueAnimator heightAnimator;
                if (isExpandedQi[0]){
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewQi, initialCardViewQi);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewQi, expandedCardViewQi);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = quintaCardView.getLayoutParams();
                        layoutParams.height = val;
                        quintaCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedQi[0] = !isExpandedQi[0];
            }
        });
        //------------------------------------------------------------- QUARTA ------------------------------------------------------------
        CardView quartaCardView = findViewById(R.id.quartaIgor);
        final int initialCardViewQ = quartaCardView.getLayoutParams().height;
        final int expandedCardViewQ = getResources().getDimensionPixelSize(R.dimen.igorquarta);
        final boolean[] isExpandedQ = {false};
        quartaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueAnimator heightAnimator;
                if (isExpandedQ[0]){
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewQ, initialCardViewQ);
                } else{
                    heightAnimator = ValueAnimator.ofInt(initialCardViewQ, expandedCardViewQ);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = quartaCardView.getLayoutParams();
                        layoutParams.height = val;
                        quartaCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedQ[0] = !isExpandedQ[0];
            }
        });
        //------------------------------------------------------------- TERÇA -------------------------------------------------------------
        CardView tercaCardView = findViewById(R.id.tercaIgor);
        final int initialCardViewT = tercaCardView.getLayoutParams().height;
        final int expandedCardViewT = getResources().getDimensionPixelSize(R.dimen.igorterca);
        final boolean[] isExpandedT = {false};
        tercaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueAnimator heightAnimator;
                if (isExpandedT[0]){
                    // Contrair CardView
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewT, initialCardViewT);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewT, expandedCardViewT);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate( ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = tercaCardView.getLayoutParams();
                        layoutParams.height = val;
                        tercaCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedT[0] = !isExpandedT[0];
            }
        });
        //----------------------------------------------------- SEGUNDA --------------------------------------------------------------
        CardView igorsegCardView = findViewById(R.id.segundaIgor);
        final int initialCardViewigorseg = igorsegCardView.getLayoutParams().height;
        final int expandedCardViewigorseg = getResources().getDimensionPixelSize(R.dimen.igorsegunda);
        final boolean[] isExpandedigorseg = {false};
        igorsegCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator heightAnimator;
                if (isExpandedigorseg[0]) {
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewigorseg, initialCardViewigorseg);
                }else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewigorseg, expandedCardViewigorseg);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = igorsegCardView.getLayoutParams();
                        layoutParams.height = val;
                        igorsegCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedigorseg[0] = !isExpandedigorseg[0];
            }
        });
    }
}
