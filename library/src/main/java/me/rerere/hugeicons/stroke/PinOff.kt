package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PinOff: ImageVector
    get() {
        if (_pinOff != null) {
            return _pinOff!!
        }
        _pinOff = ImageVector.Builder(
            name = "PinOff",
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
        moveTo(7.5f, 8f)
        curveTo(6.95863f, 8.1281f, 6.49932f, 8.14239f, 5.99268f, 8.45891f)
        curveTo(5.07234f, 9.03388f, 4.85108f, 9.71674f, 5.08821f, 10.7612f)
        curveTo(5.94028f, 14.5139f, 9.48599f, 18.0596f, 13.2388f, 18.9117f)
        curveTo(14.2834f, 19.1489f, 14.9661f, 18.928f, 15.5416f, 18.0077f)
        curveTo(15.8411f, 17.5288f, 15.8716f, 17.0081f, 16f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7.79915f)
        curveTo(12.1776f, 7.77794f, 12.3182f, 7.74034f, 12.4295f, 7.68235f)
        curveTo(13.3997f, 7.17686f, 13.9291f, 5.53361f, 14.4498f, 4.60009f)
        curveTo(14.9311f, 3.73715f, 15.1718f, 3.30567f, 15.7379f, 3.10227f)
        curveTo(16.3041f, 2.89888f, 16.6448f, 3.02205f, 17.3262f, 3.26839f)
        curveTo(18.9197f, 3.8445f, 20.1555f, 5.08032f, 20.7316f, 6.6738f)
        curveTo(20.9779f, 7.35521f, 21.1011f, 7.69591f, 20.8977f, 8.26204f)
        curveTo(20.6943f, 8.82817f, 20.2628f, 9.06884f, 19.3999f, 9.55018f)
        curveTo(18.4608f, 10.074f, 16.7954f, 10.6108f, 16.2905f, 11.5898f)
        curveTo(16.2345f, 11.6983f, 16.1978f, 11.8327f, 16.1769f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 21f)
        lineTo(8f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 3f)
        lineTo(21f, 21f)
        }
        }.build()

        return _pinOff!!
    }

private var _pinOff: ImageVector? = null
