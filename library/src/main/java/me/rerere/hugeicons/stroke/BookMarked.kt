package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BookMarked: ImageVector
    get() {
        if (_bookMarked != null) {
            return _bookMarked!!
        }
        _bookMarked = ImageVector.Builder(
            name = "BookMarked",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20f, 14f)
            verticalLineTo(18f)
            horizontalLineTo(6f)
            curveTo(4.89543f, 18f, 4f, 18.8954f, 4f, 20f)
            moveTo(10f, 2f)
            curveTo(7.17157f, 2f, 5.75736f, 2f, 4.87868f, 2.87868f)
            curveTo(4f, 3.75736f, 4f, 5.17157f, 4f, 8f)
            verticalLineTo(20f)
            moveTo(4f, 20f)
            curveTo(4f, 21.1046f, 4.89543f, 22f, 6f, 22f)
            horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14f, 8.45369f)
            verticalLineTo(4.98797f)
            curveTo(14f, 3.57943f, 14f, 2.87515f, 14.4393f, 2.43758f)
            curveTo(14.8787f, 2f, 15.5858f, 2f, 17f, 2f)
            curveTo(18.4142f, 2f, 19.1213f, 2f, 19.5607f, 2.43758f)
            curveTo(20f, 2.87515f, 20f, 3.57942f, 20f, 4.98797f)
            verticalLineTo(8.45369f)
            curveTo(20f, 9.37363f, 20f, 9.83359f, 19.7121f, 9.96791f)
            curveTo(19.4242f, 10.1022f, 19.0694f, 9.80776f, 18.3598f, 9.21883f)
            lineTo(17.6402f, 8.62154f)
            curveTo(17.3341f, 8.36748f, 17.181f, 8.24045f, 17f, 8.24045f)
            curveTo(16.819f, 8.24045f, 16.6659f, 8.36748f, 16.3598f, 8.62154f)
            lineTo(15.6402f, 9.21883f)
            curveTo(14.9306f, 9.80776f, 14.5758f, 10.1022f, 14.2879f, 9.96791f)
            curveTo(14f, 9.83359f, 14f, 9.37363f, 14f, 8.45369f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19.5f, 18f)
            curveTo(19.5f, 18f, 18.5f, 18.7628f, 18.5f, 20f)
            curveTo(18.5f, 21.2372f, 19.5f, 22f, 19.5f, 22f)
        }
        }.build()

        return _bookMarked!!
    }

private var _bookMarked: ImageVector? = null
