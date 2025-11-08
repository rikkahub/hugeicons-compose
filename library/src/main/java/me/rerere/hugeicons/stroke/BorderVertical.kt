package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BorderVertical: ImageVector
    get() {
        if (_borderVertical != null) {
            return _borderVertical!!
        }
        _borderVertical = ImageVector.Builder(
            name = "BorderVertical",
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
        moveTo(6.3f, 2.75143f)
        curveTo(5.26076f, 2.94471f, 4.49591f, 3.28657f, 3.89124f, 3.89124f)
        curveTo(3.28657f, 4.49591f, 2.94471f, 5.26076f, 2.75143f, 6.3f)
        moveTo(17.7f, 2.75143f)
        curveTo(18.7392f, 2.94471f, 19.5041f, 3.28657f, 20.1088f, 3.89124f)
        curveTo(20.7134f, 4.49591f, 21.0553f, 5.26076f, 21.2486f, 6.3f)
        moveTo(13.9f, 2.50495f)
        curveTo(13.3156f, 2.5f, 12.6839f, 2.5f, 12f, 2.5f)
        curveTo(11.3161f, 2.5f, 10.6844f, 2.5f, 10.1f, 2.50495f)
        moveTo(21.495f, 10.1f)
        curveTo(21.5f, 10.6844f, 21.5f, 11.3161f, 21.5f, 12f)
        curveTo(21.5f, 12.6839f, 21.5f, 13.3156f, 21.495f, 13.9001f)
        moveTo(2.50495f, 10.1f)
        curveTo(2.5f, 10.6844f, 2.5f, 11.3161f, 2.5f, 12f)
        curveTo(2.5f, 12.6839f, 2.5f, 13.3156f, 2.50496f, 13.9001f)
        moveTo(2.75143f, 17.7f)
        curveTo(2.94471f, 18.7392f, 3.28657f, 19.5041f, 3.89124f, 20.1088f)
        curveTo(4.49591f, 20.7134f, 5.26076f, 21.0553f, 6.3f, 21.2486f)
        moveTo(21.2486f, 17.7f)
        curveTo(21.0553f, 18.7392f, 20.7134f, 19.5041f, 20.1088f, 20.1088f)
        curveTo(19.5041f, 20.7134f, 18.7392f, 21.0553f, 17.7f, 21.2486f)
        moveTo(13.9f, 21.495f)
        curveTo(13.3156f, 21.5f, 12.6839f, 21.5f, 12f, 21.5f)
        curveTo(11.3162f, 21.5f, 10.6845f, 21.5f, 10.1002f, 21.495f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.15f, 12f)
        horizontalLineTo(14.85f)
        moveTo(19.6f, 12f)
        lineTo(21.5f, 12f)
        moveTo(2.5f, 12f)
        horizontalLineTo(4.4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2.5f)
        lineTo(12f, 21.5f)
        }
        }.build()

        return _borderVertical!!
    }

private var _borderVertical: ImageVector? = null
