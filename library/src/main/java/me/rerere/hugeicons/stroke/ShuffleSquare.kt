package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShuffleSquare: ImageVector
    get() {
        if (_shuffleSquare != null) {
            return _shuffleSquare!!
        }
        _shuffleSquare = ImageVector.Builder(
            name = "ShuffleSquare",
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
        moveTo(16.5f, 17.5f)
        lineTo(18f, 15.75f)
        horizontalLineTo(16.1407f)
        curveTo(15.0928f, 15.75f, 14.5688f, 15.75f, 14.1267f, 15.5281f)
        curveTo(13.6845f, 15.3063f, 13.3938f, 14.8976f, 12.8125f, 14.0801f)
        lineTo(9.85413f, 9.91987f)
        curveTo(9.27285f, 9.10244f, 8.9822f, 8.69372f, 8.54002f, 8.47186f)
        curveTo(8.09783f, 8.25f, 7.57386f, 8.25f, 6.52593f, 8.25f)
        horizontalLineTo(6f)
        moveTo(16.5f, 6.5f)
        lineTo(18f, 8.25f)
        horizontalLineTo(16.1407f)
        curveTo(15.0928f, 8.25f, 14.5688f, 8.25f, 14.1267f, 8.47186f)
        curveTo(13.6845f, 8.69372f, 13.3938f, 9.10244f, 12.8125f, 9.91987f)
        moveTo(6f, 15.75f)
        horizontalLineTo(6.52593f)
        curveTo(7.57386f, 15.75f, 8.09783f, 15.75f, 8.54001f, 15.5281f)
        curveTo(8.9822f, 15.3063f, 9.27285f, 14.8976f, 9.85413f, 14.0801f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }
        }.build()

        return _shuffleSquare!!
    }

private var _shuffleSquare: ImageVector? = null
