package com.ovidiooswaldo.projetoporah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.view.ViewGroup;
public class Jacinto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jacinto);
        //----------------------------------------------------------------------- Domingo ---------------------------------------------------------------
        CardView domingoCardView = findViewById(R.id.domingoJacinto);
        final int initialCardHeightD = domingoCardView.getLayoutParams().height;
        final int expandedCardHeightD = getResources().getDimensionPixelSize(R.dimen.jacintodomingo);
        final boolean[] isExpandedD = {false};
        domingoCardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ValueAnimator heightAnimator;
                if (isExpandedD[0]){
                    // Contrair CardView
                    heightAnimator = ValueAnimator.ofInt(expandedCardHeightD, initialCardHeightD);
                } else {
                    // Expandir o CardView
                    heightAnimator = ValueAnimator.ofInt(initialCardHeightD, expandedCardHeightD);
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
        //----------------------------------------------------------------------- SABADO ----------------------------------------------------------------
        CardView sabadoCardView = findViewById(R.id.sabadoJacinto);
        final int initialCardHeightSa = sabadoCardView.getLayoutParams().height;
        final int expandedCarHeightSa = getResources().getDimensionPixelSize(R.dimen.jacintosabado);
        final boolean[] isExpandedSa = {false};
        sabadoCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueAnimator heightAnimator;
                if (isExpandedSa[0]){
                    // Contrarir o CardView
                    heightAnimator = ValueAnimator.ofInt(expandedCarHeightSa, initialCardHeightSa);
                } else {
                    // Expandir o CardView
                    heightAnimator = ValueAnimator.ofInt(initialCardHeightSa, expandedCarHeightSa);
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
        //----------------------------------------------------------------------- SEXTA -----------------------------------------------------------------
        CardView sextaCardView = findViewById(R.id.sextaJacinto);
        final int initialCardHeightS = sextaCardView.getLayoutParams().height;
        final int expandedCardHeightS = getResources().getDimensionPixelSize(R.dimen.jacintosexta);
        final boolean[] isExpandedS = {false};
        sextaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueAnimator heightAnimator;
                if (isExpandedS[0]) {
                    // Contrair o CardView
                    heightAnimator = ValueAnimator.ofInt(expandedCardHeightS, initialCardHeightS);
                } else {
                    // Expandir o Cardview
                    heightAnimator = ValueAnimator.ofInt(initialCardHeightS, expandedCardHeightS);
                }

                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
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

                isExpandedS[0] = !isExpandedS[0];
            }
        });
        //----------------------------------------------------------------------- QUINTA ----------------------------------------------------------------
        CardView quintaCardView = findViewById(R.id.quintaJacinto);
        final int initialCardHeightQu = quintaCardView.getLayoutParams().height;
        final int expandedCardHeightQu = getResources().getDimensionPixelSize(R.dimen.jacintoquinta);
        final boolean[] isExpandedQu = {false};
        quintaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueAnimator heightAnimator;
                if (isExpandedQu[0]) {
                    // Contrair o CardView
                    heightAnimator = ValueAnimator.ofInt(expandedCardHeightQu, initialCardHeightQu);
                } else {
                    // Expandir o CardView
                    heightAnimator = ValueAnimator.ofInt(initialCardHeightQu, expandedCardHeightQu);
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

                isExpandedQu[0] = !isExpandedQu[0];
            }
        });
        //----------------------------------------------------------------------- QUARTA ---------------------------------------------------------------
        CardView quartaCardView = findViewById(R.id.quartaJacinto);
        final int initialCardHeightQ = quartaCardView.getLayoutParams().height;
        final int expandedCardHeightQ = getResources().getDimensionPixelSize(R.dimen.jacintoquarta);
        final boolean[] isExpandedQ = {false};
        quartaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueAnimator heightAnimator;
                if (isExpandedQ[0]) {
                    // Contrair o CardView
                    heightAnimator = ValueAnimator.ofInt(expandedCardHeightQ, initialCardHeightQ);
                } else {
                    // Expandir o CardView
                    heightAnimator = ValueAnimator.ofInt(initialCardHeightQ, expandedCardHeightQ);
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


        //----------------------------------------------------------------------- TERÇA -----------------------------------------------------
        CardView tercaCardView = findViewById(R.id.tercaJacinto);
        final int initialCardHeightT = tercaCardView.getLayoutParams().height;
        final int expandedCardHeightT = getResources().getDimensionPixelSize(R.dimen.jacintoterca);
        final boolean[] isExpanded = {false};

        tercaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueAnimator heightAnimator;
                if (isExpanded[0]) {
                    // Contrair o CardView
                    heightAnimator = ValueAnimator.ofInt(expandedCardHeightT, initialCardHeightT);
                } else {
                    // Expandir o CardView
                    heightAnimator = ValueAnimator.ofInt(initialCardHeightT, expandedCardHeightT);
                }

                heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int val = (Integer) valueAnimator.getAnimatedValue();
                        ViewGroup.LayoutParams layoutParams = tercaCardView.getLayoutParams();
                        layoutParams.height = val;
                        tercaCardView.setLayoutParams(layoutParams);
                    }
                });

                heightAnimator.setDuration(300);
                heightAnimator.start();

                isExpanded[0] = !isExpanded[0];
            }
        });

        // ------------------------------------ SEGUNDA -----------------------------------------
        CardView cardView = findViewById(R.id.segundaJacinto);

        // Defina uma altura inicial para o CardView
        final int initialCardHeight = getResources().getDimensionPixelSize(R.dimen.card_initial_height);
        // Defina uma largura inicial para o CardView
        final int initialCardWidth = getResources().getDimensionPixelSize(R.dimen.card_initial_width);

        // Defina a altura expandida para o CardView
        final int expandedCardHeight = getResources().getDimensionPixelSize(R.dimen.jacintosegunda);
        // Defina a largura expandida para o CardView
        final int expandedCardWidth = getResources().getDimensionPixelSize(R.dimen.jacintosegundalados);

        cardView.setOnClickListener(new View.OnClickListener() {
            boolean isExpanded = false;

            @Override
            public void onClick(View v) {
                if (isExpanded) {
                    // Recolher o CardView
                    ValueAnimator heightAnimator = ValueAnimator.ofInt(expandedCardHeight, initialCardHeight);
                    heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int val = (Integer) valueAnimator.getAnimatedValue();
                            ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
                            layoutParams.height = val;
                            cardView.setLayoutParams(layoutParams);
                        }
                    });

                    ValueAnimator widthAnimator = ValueAnimator.ofInt(expandedCardWidth, initialCardWidth);
                    widthAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int val = (Integer) valueAnimator.getAnimatedValue();
                            ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
                            layoutParams.width = val;
                            cardView.setLayoutParams(layoutParams);
                        }
                    });

                    heightAnimator.setDuration(300);
                    widthAnimator.setDuration(300);

                    heightAnimator.start();
                    widthAnimator.start();

                    isExpanded = false;
                } else {
                    // Expandir o CardView
                    ValueAnimator heightAnimator = ValueAnimator.ofInt(initialCardHeight, expandedCardHeight);
                    heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int val = (Integer) valueAnimator.getAnimatedValue();
                            ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
                            layoutParams.height = val;
                            cardView.setLayoutParams(layoutParams);
                        }
                    });

                    ValueAnimator widthAnimator = ValueAnimator.ofInt(initialCardWidth, expandedCardWidth);
                    widthAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int val = (Integer) valueAnimator.getAnimatedValue();
                            ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
                            layoutParams.width = val;
                            cardView.setLayoutParams(layoutParams);
                        }
                    });

                    heightAnimator.setDuration(300);
                    widthAnimator.setDuration(300);

                    heightAnimator.start();
                    widthAnimator.start();

                    isExpanded = true;
                }
            }
        });

    }
}
