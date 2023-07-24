package com.ovidiooswaldo.projetoporah;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class Cr7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cr7);
        //----------------------------------------------------------------- DOMINGO ----------------------------
        CardView cr7DCardView = findViewById(R.id.domingoCR7);
        final int initialCardViewDC = cr7DCardView.getLayoutParams().height;
        final int expandedCardViewDC = getResources().getDimensionPixelSize(R.dimen.cr7domingo);
        final boolean[] isExpandedDC = {false};
        cr7DCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator heightAnimator;
                if (isExpandedDC[0]){
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewDC, initialCardViewDC);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewDC, expandedCardViewDC);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = cr7DCardView.getLayoutParams();
                        layoutParams.height = val;
                        cr7DCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedDC[0] = !isExpandedDC[0];
            }
        });
        //----------------------------------------------------------------- SABADO -----------------------------
        CardView cr7SACardView = findViewById(R.id.sabadoCR7);
        final int initialCardViewSAC = cr7SACardView.getLayoutParams().height;
        final int expandedCardViewSAC = getResources().getDimensionPixelSize(R.dimen.cr7sabado);
        final boolean[] isExpandedSAC = {false};
        cr7SACardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator heightAnimator;
                if (isExpandedSAC[0]) {
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewSAC, initialCardViewSAC);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewSAC, expandedCardViewSAC);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = cr7SACardView.getLayoutParams();
                        layoutParams.height = val;
                        cr7SACardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedSAC[0] = !isExpandedSAC[0];
            }
        });
        //----------------------------------------------------------------- SEXTA ------------------------------
        CardView cr7SECardView = findViewById(R.id.sextaCR7);
        final int initialCardViewSEC = cr7SECardView.getLayoutParams().height;
        final int expandedCardVicSEC = getResources().getDimensionPixelSize(R.dimen.cr7sexta);
        final boolean[] isExpandedSEC = {false};
        cr7SECardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator heightAnimator;
                if (isExpandedSEC[0]) {
                    heightAnimator = ValueAnimator.ofInt(expandedCardVicSEC, initialCardViewSEC);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewSEC, expandedCardVicSEC);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = cr7SECardView.getLayoutParams();
                        layoutParams.height = val;
                        cr7SECardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedSEC[0] = !isExpandedSEC[0];
            }
        });
        //----------------------------------------------------------------- QUINTA -----------------------------
        CardView cr7QUCardView = findViewById(R.id.quintaCR7);
        final int initialCardViewQUC = cr7QUCardView.getLayoutParams().height;
        final int expandedCardViewQUC = getResources().getDimensionPixelSize(R.dimen.cr7quinta);
        final boolean[] isExpandedQUC = {false};
        cr7QUCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator heightAnimator;
                if (isExpandedQUC[0]) {
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewQUC, initialCardViewQUC);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewQUC, expandedCardViewQUC);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = cr7QUCardView.getLayoutParams();
                        layoutParams.height = val;
                        cr7QUCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedQUC[0] = !isExpandedQUC[0];
            }
        });
        //---------------------------------------------------------------- QUARTA -----------------------------
        CardView cr7QCardView = findViewById(R.id.quartaCR7);
        final int initialCardViewCQ = cr7QCardView.getLayoutParams().height;
        final int expandedCardViewCQ = getResources().getDimensionPixelSize(R.dimen.cr7quarta);
        final boolean[] isExpandedCQ = {false};
        cr7QCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator heightAnimator;
                if (isExpandedCQ[0]) {
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewCQ, initialCardViewCQ);
                }else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewCQ, expandedCardViewCQ);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = cr7QCardView.getLayoutParams();
                        layoutParams.height = val;
                        cr7QCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedCQ[0] = !isExpandedCQ[0];
            }
        });
        //---------------------------------------------------------------- TERÇA ------------------------------
        CardView cr7TCardView = findViewById(R.id.tercaCR7);
        final int initialCardViewCT = cr7TCardView.getLayoutParams().height;
        final int expandedCardViewCT = getResources().getDimensionPixelSize(R.dimen.cr7terca);
        final boolean[] isExpandedCT = {false};
        cr7TCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator heightAnimator;
                if (isExpandedCT[0]){
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewCT, initialCardViewCT);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewCT, expandedCardViewCT);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = cr7TCardView.getLayoutParams();
                        layoutParams.height = val;
                        cr7TCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedCT[0] = !isExpandedCT[0];
            }
        });
        //---------------------------------------------------------------- SEGUNDA ----------------------------
        CardView cr7SCardView = findViewById(R.id.segundaCR7);
        final int initialCardViewCS = cr7SCardView.getLayoutParams().height;
        final int expandedCardViewCS = getResources().getDimensionPixelSize(R.dimen.cr7segunda);
        final boolean[] isExpandedCS = {false};
        cr7SCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator heightAnimator;
                if (isExpandedCS[0]) {
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewCS, initialCardViewCS);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewCS, expandedCardViewCS);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = cr7SCardView.getLayoutParams();
                        layoutParams.height = val;
                        cr7SCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.getAnimatedValue();
                heightAnimator.start();
                isExpandedCS[0] = !isExpandedCS[0];
            }
        });
    }
}