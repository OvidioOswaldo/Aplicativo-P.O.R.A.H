package com.ovidiooswaldo.projetoporah;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class Giovanna extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giovanna);
        //------------------------------------------------------------ DOMINGO ------------------------------------------
        CardView domingoGCardView = findViewById(R.id.domingogiovanna);
        final int initialCardViewDG = domingoGCardView.getLayoutParams().height;
        final int expandedCardViewDG = getResources().getDimensionPixelSize(R.dimen.giovannadomingo);
        final boolean[] isExpandedDG = {false};
        domingoGCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator heightAnimator;
                if (isExpandedDG[0]) {
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewDG, initialCardViewDG);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewDG, expandedCardViewDG);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = domingoGCardView.getLayoutParams();
                        layoutParams.height = val;
                        domingoGCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedDG[0] = !isExpandedDG[0];
            }
        });
        //------------------------------------------------------------ SABADO -------------------------------------------
        CardView sabadoGCardView = findViewById(R.id.sabadogiovanna);
        final int initialCardViewSAG = sabadoGCardView.getLayoutParams().height;
        final int expandedCardViewSAG = getResources().getDimensionPixelSize(R.dimen.giovannasabado);
        final boolean[] isExpandedSAG = {false};
        sabadoGCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator heightAnimator;
                if (isExpandedSAG[0]) {
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewSAG, initialCardViewSAG);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewSAG, expandedCardViewSAG);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = sabadoGCardView.getLayoutParams();
                        layoutParams.height = val;
                        sabadoGCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedSAG[0] = !isExpandedSAG[0];
            }
        });
        //------------------------------------------------------------ SEXTA --------------------------------------------
        CardView sextaGCardView = findViewById(R.id.sextagiovanna);
        final int initialCardViewSEG = sextaGCardView.getLayoutParams().height;
        final int expandedCardViewSUG = getResources().getDimensionPixelSize(R.dimen.giovannasexta);
        final boolean[] isExpandedSEG = {false};
        sextaGCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator heightAnimator;
                if (isExpandedSEG[0]){
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewSUG, initialCardViewSEG);
                } else{
                    heightAnimator = ValueAnimator.ofInt(initialCardViewSEG, expandedCardViewSUG);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = sextaGCardView.getLayoutParams();
                        layoutParams.height = val;
                        sextaGCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedSEG[0] = !isExpandedSEG[0];
            }
        });
        //------------------------------------------------------------ QUINTA -------------------------------------------
        CardView quintaCardView = findViewById(R.id.quintagiovanna);
        final int initialCardViewQUG = quintaCardView.getLayoutParams().height;
        final int expandedCardViewQUG = getResources().getDimensionPixelSize(R.dimen.giovannaquinta);
        final boolean[] isExpandedQUG = {false};
        quintaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueAnimator heightAnimator;
                if (isExpandedQUG[0]){
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewQUG, initialCardViewQUG);
                } else{
                    heightAnimator = ValueAnimator.ofInt(initialCardViewQUG, expandedCardViewQUG);
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
                isExpandedQUG[0] = !isExpandedQUG[0];
            }
        });
        //------------------------------------------------------------ QUARTA -------------------------------------------
        CardView quartaCardView = findViewById(R.id.quartagiovanna);
        final int initialCardViewQ = quartaCardView.getLayoutParams().height;
        final int expandedCardViewQ = getResources().getDimensionPixelSize(R.dimen.giovannaquarta);
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
        //------------------------------------------------------------ TERCA --------------------------------------------
        CardView CardViewST = findViewById(R.id.tercagiovanna);
        final int initialCardViewST = CardViewST.getLayoutParams().height;
        final int expandedCardViewST = getResources().getDimensionPixelSize(R.dimen.giovannaterca);
        final boolean[] isExpandedST = {false};
        CardViewST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueAnimator heightAnimator;
                if (isExpandedST[0]) {
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewST, initialCardViewST);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewST, expandedCardViewST);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = CardViewST.getLayoutParams();
                        layoutParams.height = val;
                        CardViewST.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedST[0] = !isExpandedST[0];
            }
        });
        //------------------------------------------------------------ SEGUNDA -------------------------------------------
        CardView SGCardView = findViewById(R.id.segundagiovanna);
        final int SGinitialCardView = SGCardView.getLayoutParams().height;
        final int SGexpandedCardView = getResources().getDimensionPixelSize(R.dimen.giovannasegunda);
        final boolean[] isExpandedSG = {false};

        SGCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator heightAnimator;
                if (isExpandedSG[0]) {
                    // Contrair o CardView
                    heightAnimator = ValueAnimator.ofInt(SGexpandedCardView, SGinitialCardView);
                } else {
                    heightAnimator = ValueAnimator.ofInt(SGinitialCardView, SGexpandedCardView);
                }

                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = SGCardView.getLayoutParams();
                        layoutParams.height = val;
                        SGCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedSG[0] = !isExpandedSG[0];
            }
        });

    }
}