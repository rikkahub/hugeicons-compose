package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Thermometer: ImageVector
    get() {
        if (_thermometer != null) {
            return _thermometer!!
        }
        _thermometer = ImageVector.Builder(
            name = "Thermometer",
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
        moveTo(13.8801f, 15.9369f)
        lineTo(20.6738f, 8.17267f)
        curveTo(21.4217f, 7.31791f, 21.7956f, 6.89053f, 21.9252f, 6.41326f)
        curveTo(22.0376f, 5.99901f, 22.023f, 5.56052f, 21.8833f, 5.15466f)
        curveTo(21.7223f, 4.68707f, 21.3207f, 4.28551f, 20.5176f, 3.4824f)
        curveTo(19.7145f, 2.67928f, 19.3129f, 2.27773f, 18.8453f, 2.11672f)
        curveTo(18.4395f, 1.97696f, 18.001f, 1.96236f, 17.5867f, 2.07481f)
        curveTo(17.1095f, 2.20436f, 16.6821f, 2.57832f, 15.8273f, 3.32623f)
        lineTo(8.06312f, 10.1199f)
        curveTo(7.10741f, 10.9562f, 6.62955f, 11.3743f, 6.34846f, 11.9258f)
        curveTo(6.06738f, 12.4774f, 6.00989f, 13.1098f, 5.89492f, 14.3745f)
        lineTo(5.87152f, 14.6319f)
        curveTo(5.81078f, 15.3f, 5.78041f, 15.6341f, 5.65293f, 15.9386f)
        curveTo(5.52546f, 16.2431f, 5.30877f, 16.4992f, 4.8754f, 17.0114f)
        lineTo(2.27543f, 20.0841f)
        curveTo(1.88438f, 20.5462f, 1.91286f, 21.231f, 2.34094f, 21.6591f)
        curveTo(2.76903f, 22.0871f, 3.45379f, 22.1156f, 3.91594f, 21.7246f)
        lineTo(6.98863f, 19.1246f)
        curveTo(7.5008f, 18.6912f, 7.75689f, 18.4745f, 8.06139f, 18.3471f)
        curveTo(8.36589f, 18.2196f, 8.69998f, 18.1892f, 9.36814f, 18.1285f)
        lineTo(9.62553f, 18.1051f)
        curveTo(10.8902f, 17.9901f, 11.5226f, 17.9326f, 12.0741f, 17.6515f)
        curveTo(12.6257f, 17.3704f, 13.0438f, 16.8926f, 13.8801f, 15.9369f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.78906f, 9.89453f)
        lineTo(9.36983f, 10.843f)
        curveTo(9.74255f, 11.0666f, 9.86341f, 11.5501f, 9.63978f, 11.9228f)
        lineTo(9.34781f, 12.4094f)
        curveTo(8.96198f, 13.0524f, 9.06331f, 13.8755f, 9.59357f, 14.4058f)
        curveTo(10.1238f, 14.9361f, 10.9469f, 15.0374f, 11.59f, 14.6516f)
        lineTo(12.0766f, 14.3596f)
        curveTo(12.4493f, 14.136f, 12.9328f, 14.2568f, 13.1564f, 14.6296f)
        lineTo(14.1049f, 16.2103f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.2634f, 6.7373f)
        lineTo(14.1055f, 9.8952f)
        }
        }.build()

        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
