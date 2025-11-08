package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AudioBook04: ImageVector
    get() {
        if (_audioBook04 != null) {
            return _audioBook04!!
        }
        _audioBook04 = ImageVector.Builder(
            name = "AudioBook04",
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
        moveTo(7.5f, 11f)
        horizontalLineTo(9f)
        curveTo(9.55228f, 11f, 10f, 11.4477f, 10f, 12f)
        verticalLineTo(13f)
        curveTo(10f, 13.5523f, 9.55228f, 14f, 9f, 14f)
        horizontalLineTo(8.5f)
        curveTo(7.94772f, 14f, 7.5f, 13.5523f, 7.5f, 13f)
        verticalLineTo(11f)
        moveTo(7.5f, 11f)
        verticalLineTo(10.5f)
        curveTo(7.5f, 8.01472f, 9.51472f, 6f, 12f, 6f)
        curveTo(14.4853f, 6f, 16.5f, 8.01472f, 16.5f, 10.5f)
        verticalLineTo(11f)
        moveTo(16.5f, 11f)
        horizontalLineTo(15f)
        curveTo(14.4477f, 11f, 14f, 11.4477f, 14f, 12f)
        verticalLineTo(13f)
        curveTo(14f, 13.5523f, 14.4477f, 14f, 15f, 14f)
        horizontalLineTo(15.5f)
        curveTo(16.0523f, 14f, 16.5f, 13.5523f, 16.5f, 13f)
        verticalLineTo(11f)
        }
        }.build()

        return _audioBook04!!
    }

private var _audioBook04: ImageVector? = null
