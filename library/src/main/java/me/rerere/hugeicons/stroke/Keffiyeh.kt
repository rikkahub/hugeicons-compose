package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Keffiyeh: ImageVector
    get() {
        if (_keffiyeh != null) {
            return _keffiyeh!!
        }
        _keffiyeh = ImageVector.Builder(
            name = "Keffiyeh",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 5f)
        horizontalLineTo(18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.12f, 7.83371f)
        curveTo(17.3666f, 4.40421f, 15.4933f, 2f, 12.5f, 2f)
        curveTo(9.50669f, 2f, 7.63336f, 4.40421f, 6.88003f, 7.83371f)
        curveTo(6.36608f, 10.1734f, 5.24087f, 12.3564f, 4.05134f, 14.4304f)
        curveTo(3.72035f, 15.0076f, 3.5f, 15.5955f, 3.5f, 16.1316f)
        curveTo(3.5f, 17.1729f, 4.29818f, 18.2142f, 5.07112f, 19.3941f)
        curveTo(6.15943f, 21.0553f, 6.70358f, 21.8859f, 7.06891f, 21.9853f)
        curveTo(7.43423f, 22.0846f, 8.2456f, 21.6785f, 9.86831f, 20.8665f)
        curveTo(10.7012f, 20.4496f, 11.5848f, 20.1692f, 12.5f, 20.1692f)
        curveTo(13.4152f, 20.1692f, 14.2988f, 20.4496f, 15.1317f, 20.8665f)
        curveTo(16.7544f, 21.6785f, 17.5658f, 22.0846f, 17.9311f, 21.9853f)
        curveTo(18.2964f, 21.8859f, 18.8406f, 21.0553f, 19.9289f, 19.3941f)
        curveTo(20.7018f, 18.2142f, 21.5f, 17.1729f, 21.5f, 16.1316f)
        curveTo(21.5f, 15.5955f, 21.2796f, 15.0076f, 20.9487f, 14.4304f)
        curveTo(19.7591f, 12.3564f, 18.6339f, 10.1734f, 18.12f, 7.83371f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 22f)
        curveTo(7.51593f, 20.596f, 8.07692f, 17.3641f, 7.46996f, 15.8262f)
        curveTo(7.03677f, 14.7286f, 7.57434f, 13.631f, 8.28352f, 12.7813f)
        curveTo(8.73628f, 12.2389f, 9.08177f, 11.6075f, 9.268f, 10.9225f)
        curveTo(9.79923f, 8.96859f, 10.8923f, 8f, 12.5f, 8f)
        curveTo(14.1077f, 8f, 15.2008f, 8.96859f, 15.732f, 10.9225f)
        curveTo(15.9182f, 11.6075f, 16.2637f, 12.2389f, 16.7165f, 12.7813f)
        curveTo(17.4257f, 13.631f, 17.9632f, 14.7286f, 17.53f, 15.8262f)
        curveTo(16.9231f, 17.3641f, 17.4841f, 20.596f, 18f, 22f)
        }
        }.build()

        return _keffiyeh!!
    }

private var _keffiyeh: ImageVector? = null
