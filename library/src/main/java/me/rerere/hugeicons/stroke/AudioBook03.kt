package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AudioBook03: ImageVector
    get() {
        if (_audioBook03 != null) {
            return _audioBook03!!
        }
        _audioBook03 = ImageVector.Builder(
            name = "AudioBook03",
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
        moveTo(20f, 22f)
        horizontalLineTo(6f)
        curveTo(4.89543f, 22f, 4f, 21.1046f, 4f, 20f)
        moveTo(4f, 20f)
        curveTo(4f, 18.8954f, 4.89543f, 18f, 6f, 18f)
        horizontalLineTo(20f)
        verticalLineTo(6f)
        curveTo(20f, 4.11438f, 20f, 3.17157f, 19.4142f, 2.58579f)
        curveTo(18.8284f, 2f, 17.8856f, 2f, 16f, 2f)
        horizontalLineTo(10f)
        curveTo(7.17157f, 2f, 5.75736f, 2f, 4.87868f, 2.87868f)
        curveTo(4f, 3.75736f, 4f, 5.17157f, 4f, 8f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 18f)
        curveTo(19.5f, 18f, 18.5f, 18.7628f, 18.5f, 20f)
        curveTo(18.5f, 21.2372f, 19.5f, 22f, 19.5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 8.55078f)
        horizontalLineTo(10.5f)
        curveTo(10.0341f, 8.55078f, 9.80109f, 8.55078f, 9.61732f, 8.6269f)
        curveTo(9.37229f, 8.7284f, 9.17761f, 8.92307f, 9.07612f, 9.1681f)
        curveTo(9f, 9.35187f, 9f, 9.58484f, 9f, 10.0508f)
        curveTo(9f, 10.5167f, 9f, 10.7497f, 9.07612f, 10.9335f)
        curveTo(9.17761f, 11.1785f, 9.37229f, 11.3732f, 9.61732f, 11.4747f)
        curveTo(9.80109f, 11.5508f, 10.0341f, 11.5508f, 10.5f, 11.5508f)
        horizontalLineTo(11.5f)
        lineTo(15f, 14f)
        verticalLineTo(6f)
        lineTo(11.5f, 8.55078f)
        }
        }.build()

        return _audioBook03!!
    }

private var _audioBook03: ImageVector? = null
