package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SpartanHelmet: ImageVector
    get() {
        if (_spartanHelmet != null) {
            return _spartanHelmet!!
        }
        _spartanHelmet = ImageVector.Builder(
            name = "SpartanHelmet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.53767f, 15.0937f)
        curveTo(2.8878f, 8.60966f, 5.99612f, 4.5631f, 12.0003f, 2f)
        curveTo(18.0046f, 4.5631f, 21.1122f, 8.60966f, 19.4623f, 15.0937f)
        curveTo(19.3427f, 15.5637f, 19.3575f, 16.063f, 19.5336f, 16.514f)
        lineTo(20.9095f, 20.038f)
        curveTo(21.4448f, 21.409f, 19.4664f, 21.7351f, 18.6252f, 21.9121f)
        curveTo(16.3106f, 22.3991f, 14.0668f, 20.8106f, 13.693f, 18.4203f)
        curveTo(13.4291f, 16.7328f, 14.3833f, 16.4559f, 15.6306f, 15.817f)
        curveTo(15.6306f, 15.817f, 17.1867f, 15.2855f, 17.1867f, 13.6913f)
        curveTo(17.1867f, 12.5173f, 16.2578f, 11.5656f, 15.1119f, 11.5656f)
        curveTo(14.3943f, 11.5656f, 13.7621f, 11.774f, 13.135f, 12.4517f)
        curveTo(12.5272f, 13.1086f, 12.2234f, 13.437f, 12.0004f, 13.437f)
        curveTo(11.7774f, 13.437f, 11.4734f, 13.1086f, 10.8656f, 12.4518f)
        curveTo(10.2382f, 11.774f, 9.60571f, 11.5656f, 8.88813f, 11.5656f)
        curveTo(7.74224f, 11.5656f, 6.81332f, 12.5173f, 6.81332f, 13.6913f)
        curveTo(6.81332f, 15.2855f, 8.36942f, 15.817f, 8.36942f, 15.817f)
        curveTo(9.61674f, 16.4559f, 10.5709f, 16.7328f, 10.307f, 18.4203f)
        curveTo(9.93315f, 20.8106f, 7.6894f, 22.3991f, 5.37484f, 21.9121f)
        curveTo(4.53362f, 21.7351f, 2.55521f, 21.409f, 3.09051f, 20.038f)
        lineTo(4.46636f, 16.514f)
        curveTo(4.64246f, 16.063f, 4.65729f, 15.5637f, 4.53767f, 15.0937f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 20f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9998f, 8f)
        horizontalLineTo(12.0088f)
        }
        }.build()

        return _spartanHelmet!!
    }

private var _spartanHelmet: ImageVector? = null
