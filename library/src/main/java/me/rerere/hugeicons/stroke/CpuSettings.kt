package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CpuSettings: ImageVector
    get() {
        if (_cpuSettings != null) {
            return _cpuSettings!!
        }
        _cpuSettings = ImageVector.Builder(
            name = "CpuSettings",
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
        moveTo(20f, 10f)
        curveTo(19.9641f, 7.52043f, 19.7801f, 6.11466f, 18.8365f, 5.17157f)
        curveTo(17.6643f, 4f, 15.7776f, 4f, 12.0043f, 4f)
        curveTo(8.23106f, 4f, 6.34442f, 4f, 5.17221f, 5.17157f)
        curveTo(4f, 6.34315f, 4f, 8.22876f, 4f, 12f)
        curveTo(4f, 15.7712f, 4f, 17.6569f, 5.17221f, 18.8284f)
        curveTo(6.23545f, 19.8911f, 7.88646f, 19.9899f, 11f, 19.9991f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 19.7143f)
        verticalLineTo(21f)
        moveTo(18f, 19.7143f)
        curveTo(16.8432f, 19.7143f, 15.8241f, 19.1461f, 15.2263f, 18.2833f)
        moveTo(18f, 19.7143f)
        curveTo(19.1568f, 19.7143f, 20.1759f, 19.1461f, 20.7737f, 18.2833f)
        moveTo(18f, 13.2857f)
        curveTo(19.1569f, 13.2857f, 20.1761f, 13.854f, 20.7738f, 14.7169f)
        moveTo(18f, 13.2857f)
        curveTo(16.8431f, 13.2857f, 15.8239f, 13.854f, 15.2262f, 14.7169f)
        moveTo(18f, 13.2857f)
        verticalLineTo(12f)
        moveTo(22f, 13.9286f)
        lineTo(20.7738f, 14.7169f)
        moveTo(14.0004f, 19.0714f)
        lineTo(15.2263f, 18.2833f)
        moveTo(14f, 13.9286f)
        lineTo(15.2262f, 14.7169f)
        moveTo(21.9996f, 19.0714f)
        lineTo(20.7737f, 18.2833f)
        moveTo(20.7738f, 14.7169f)
        curveTo(21.1273f, 15.2271f, 21.3333f, 15.8403f, 21.3333f, 16.5f)
        curveTo(21.3333f, 17.1597f, 21.1272f, 17.773f, 20.7737f, 18.2833f)
        moveTo(15.2262f, 14.7169f)
        curveTo(14.8727f, 15.2271f, 14.6667f, 15.8403f, 14.6667f, 16.5f)
        curveTo(14.6667f, 17.1597f, 14.8728f, 17.773f, 15.2263f, 18.2833f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 2f)
        verticalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 2f)
        verticalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 20f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 9.5f)
        lineTo(2f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 14.5f)
        lineTo(2f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 9.5f)
        lineTo(20f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8f)
        horizontalLineTo(8f)
        }
        }.build()

        return _cpuSettings!!
    }

private var _cpuSettings: ImageVector? = null
