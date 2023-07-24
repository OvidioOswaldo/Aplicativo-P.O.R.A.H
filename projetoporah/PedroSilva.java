package com.ovidiooswaldo.projetoporah;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class PedroSilva extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedro_silva);
        //----------------------------------------------------------- DOMINGO -------------------------------
        CardView domingoPCardView = findViewById(R.id.domingoPedro);
        final int initialCardViewDP = domingoPCardView.getLayoutParams().height;
        final int expandedCardViewDP = getResources().getDimensionPixelSize(R.dimen.pedrodomingo);
        final boolean[] isExpandedDP = {false};
        domingoPCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator heightAnimator;
                if (isExpandedDP[0]) {
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewDP, initialCardViewDP);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewDP, expandedCardViewDP);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = domingoPCardView.getLayoutParams();
                        layoutParams.height = val;
                        domingoPCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedDP[0] = !isExpandedDP[0];
            }
        });
        //----------------------------------------------------------- SABADO --------------------------------
        CardView sabadoPCardView = findViewById(R.id.sabadoPedro);
        final int initialCardViewSABP = sabadoPCardView.getLayoutParams().height;
        final int expandedCardViewSABP = getResources().getDimensionPixelSize(R.dimen.pedrosabado);
        final boolean[] isExpandedSABP = {false};
        sabadoPCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator heightAnimator;
                if (isExpandedSABP[0]){
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewSABP, initialCardViewSABP);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewSABP, expandedCardViewSABP);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = sabadoPCardView.getLayoutParams();
                        layoutParams.height = val;
                        sabadoPCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedSABP[0] = !isExpandedSABP[0];
            }
        });
        //----------------------------------------------------------- SEXTA ---------------------------------
        CardView sextaPCardView = findViewById(R.id.sextaPedro);
        final int initialCardViewSP = sextaPCardView.getLayoutParams().height;
        final int expandedCardViewSP = getResources().getDimensionPixelSize(R.dimen.pedrosexta);
        final boolean[] isExpandedSP = {false};
        sextaPCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator heightAnimator;
                if (isExpandedSP[0]){
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewSP, initialCardViewSP);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewSP, expandedCardViewSP);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = sextaPCardView.getLayoutParams();
                        layoutParams.height = val;
                        sextaPCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedSP[0] = !isExpandedSP[0];
            }
        });
        //----------------------------------------------------------- QUINTA --------------------------------
        CardView quintaPCardView = findViewById(R.id.quintaPedro);
        final int initialCardViewQP = quintaPCardView.getLayoutParams().height;
        final int expandedCardViewQP = getResources().getDimensionPixelSize(R.dimen.pedroquinta);
        final boolean[] isExpandedQP = {false};
        quintaPCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator heightAnimator;
                if (isExpandedQP[0]) {
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewQP, initialCardViewQP);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewQP, expandedCardViewQP);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = quintaPCardView.getLayoutParams();
                        layoutParams.height = val;
                        quintaPCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedQP[0] = !isExpandedQP[0];
            }
        });
        //----------------------------------------------------------- QUARTA --------------------------------
        CardView quartaPCardView = findViewById(R.id.quartaPedro);
        final int initialCardViewQUP = quartaPCardView.getLayoutParams().height;
        final int expandedCardViewQUP = getResources().getDimensionPixelSize(R.dimen.pedroquarta);
        final boolean[] isExpandedQUP = {false};
        quartaPCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator heightAnimator;
                if (isExpandedQUP[0]) {
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewQUP, initialCardViewQUP);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewQUP, expandedCardViewQUP);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = quartaPCardView.getLayoutParams();
                        layoutParams.height = val;
                        quartaPCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedQUP[0] = !isExpandedQUP[0];
            }
        });
        //----------------------------------------------------------- TERCA ---------------------------------
        CardView tercaPCardView = findViewById(R.id.tercaPedro);
        final int initialCardViewTP = tercaPCardView.getLayoutParams().height;
        final int expandedCardViewTP = getResources().getDimensionPixelSize(R.dimen.pedroterca);
        final boolean[] isExpandedTP = {false};
        tercaPCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator heightAnimator;
                if (isExpandedTP[0]) {
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewTP, initialCardViewTP);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewTP, expandedCardViewTP);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = tercaPCardView.getLayoutParams();
                        layoutParams.height = val;
                        tercaPCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedTP[0] = !isExpandedTP[0];
            }
        });
        //----------------------------------------------------------- SEGUNDA -------------------------------
        CardView SegundaPCardView = findViewById(R.id.segundaPedro);
        final int initialCardViewPS = SegundaPCardView.getLayoutParams().height;
        final int expandedCardViewPS = getResources().getDimensionPixelSize(R.dimen.pedrosegunda);
        final boolean[] isExpandedPS = {false};
        SegundaPCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator heightAnimator;
                if (isExpandedPS[0]) {
                    heightAnimator = ValueAnimator.ofInt(expandedCardViewPS, initialCardViewPS);
                } else {
                    heightAnimator = ValueAnimator.ofInt(initialCardViewPS, expandedCardViewPS);
                }
                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = SegundaPCardView.getLayoutParams();
                        layoutParams.height = val;
                        SegundaPCardView.setLayoutParams(layoutParams);
                    }
                });
                heightAnimator.setDuration(300);
                heightAnimator.start();
                isExpandedPS[0] = !isExpandedPS[0];
            }
        });
    }
}