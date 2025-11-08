package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SolarPower: ImageVector
    get() {
        if (_solarPower != null) {
            return _solarPower!!
        }
        _solarPower = ImageVector.Builder(
            name = "SolarPower",
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
        moveTo(2.98915f, 15.3273f)
        lineTo(4.05648f, 12.3273f)
        curveTo(4.28468f, 11.6859f, 4.39879f, 11.3652f, 4.65689f, 11.1826f)
        curveTo(4.91498f, 11f, 5.25424f, 11f, 5.93275f, 11f)
        horizontalLineTo(18.0672f)
        curveTo(18.7458f, 11f, 19.085f, 11f, 19.3431f, 11.1826f)
        curveTo(19.6012f, 11.3652f, 19.7153f, 11.6859f, 19.9435f, 12.3273f)
        lineTo(21.0108f, 15.3273f)
        curveTo(21.4437f, 16.5438f, 21.6601f, 17.1521f, 21.3624f, 17.576f)
        curveTo(21.0648f, 18f, 20.4214f, 18f, 19.1346f, 18f)
        horizontalLineTo(4.86542f)
        curveTo(3.5786f, 18f, 2.93519f, 18f, 2.63756f, 17.576f)
        curveTo(2.33994f, 17.1521f, 2.55634f, 16.5438f, 2.98915f, 15.3273f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 11f)
        lineTo(8f, 18f)
        moveTo(14.5f, 11f)
        lineTo(16f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 14.5f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.3333f, 5.5f)
        curveTo(14.3333f, 6.78866f, 13.2887f, 7.83333f, 12f, 7.83333f)
        moveTo(14.3333f, 5.5f)
        curveTo(14.3333f, 4.21134f, 13.2887f, 3.16667f, 12f, 3.16667f)
        moveTo(14.3333f, 5.5f)
        horizontalLineTo(15.5f)
        moveTo(12f, 7.83333f)
        curveTo(10.7113f, 7.83333f, 9.66667f, 6.78866f, 9.66667f, 5.5f)
        moveTo(12f, 7.83333f)
        verticalLineTo(9f)
        moveTo(9.66667f, 5.5f)
        curveTo(9.66667f, 4.21134f, 10.7113f, 3.16667f, 12f, 3.16667f)
        moveTo(9.66667f, 5.5f)
        lineTo(8.5f, 5.5f)
        moveTo(12f, 3.16667f)
        verticalLineTo(2f)
        moveTo(13.6499f, 3.85009f)
        lineTo(14.4749f, 3.02513f)
        moveTo(10.3501f, 7.14992f)
        lineTo(9.52513f, 7.97488f)
        moveTo(13.6499f, 7.14992f)
        lineTo(14.4749f, 7.97488f)
        moveTo(10.3501f, 3.85009f)
        lineTo(9.52513f, 3.02513f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 22f)
        curveTo(13.9398f, 20.8271f, 14f, 19f, 14f, 18f)
        moveTo(9f, 22f)
        curveTo(10.0602f, 20.8271f, 10f, 19f, 10f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 22f)
        horizontalLineTo(22f)
        }
        }.build()

        return _solarPower!!
    }

private var _solarPower: ImageVector? = null
