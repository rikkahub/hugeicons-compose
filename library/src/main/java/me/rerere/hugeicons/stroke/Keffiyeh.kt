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
        moveTo(6f, 5f)
        horizontalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.62f, 7.83371f)
        curveTo(16.8666f, 4.40421f, 14.9933f, 2f, 12f, 2f)
        curveTo(9.00669f, 2f, 7.13336f, 4.40421f, 6.38003f, 7.83371f)
        curveTo(5.86608f, 10.1734f, 4.74087f, 12.3564f, 3.55134f, 14.4304f)
        curveTo(3.22035f, 15.0076f, 3f, 15.5955f, 3f, 16.1316f)
        curveTo(3f, 17.1729f, 3.79818f, 18.2142f, 4.57112f, 19.3941f)
        curveTo(5.65943f, 21.0553f, 6.20358f, 21.8859f, 6.56891f, 21.9853f)
        curveTo(6.93423f, 22.0846f, 7.7456f, 21.6785f, 9.36831f, 20.8665f)
        curveTo(10.2012f, 20.4496f, 11.0848f, 20.1692f, 12f, 20.1692f)
        curveTo(12.9152f, 20.1692f, 13.7988f, 20.4496f, 14.6317f, 20.8665f)
        curveTo(16.2544f, 21.6785f, 17.0658f, 22.0846f, 17.4311f, 21.9853f)
        curveTo(17.7964f, 21.8859f, 18.3406f, 21.0553f, 19.4289f, 19.3941f)
        curveTo(20.2018f, 18.2142f, 21f, 17.1729f, 21f, 16.1316f)
        curveTo(21f, 15.5955f, 20.7796f, 15.0076f, 20.4487f, 14.4304f)
        curveTo(19.2591f, 12.3564f, 18.1339f, 10.1734f, 17.62f, 7.83371f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 22f)
        curveTo(7.01593f, 20.596f, 7.57692f, 17.3641f, 6.96996f, 15.8262f)
        curveTo(6.53677f, 14.7286f, 7.07434f, 13.631f, 7.78352f, 12.7813f)
        curveTo(8.23628f, 12.2389f, 8.58177f, 11.6075f, 8.768f, 10.9225f)
        curveTo(9.29923f, 8.96859f, 10.3923f, 8f, 12f, 8f)
        curveTo(13.6077f, 8f, 14.7008f, 8.96859f, 15.232f, 10.9225f)
        curveTo(15.4182f, 11.6075f, 15.7637f, 12.2389f, 16.2165f, 12.7813f)
        curveTo(16.9257f, 13.631f, 17.4632f, 14.7286f, 17.03f, 15.8262f)
        curveTo(16.4231f, 17.3641f, 16.9841f, 20.596f, 17.5f, 22f)
        }
        }.build()

        return _keffiyeh!!
    }

private var _keffiyeh: ImageVector? = null
