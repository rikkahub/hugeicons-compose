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

val HugeIcons.SquareLock02: ImageVector
    get() {
        if (_squareLock02 != null) {
            return _squareLock02!!
        }
        _squareLock02 = ImageVector.Builder(
            name = "SquareLock02",
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
            moveTo(12f, 14.5f)
            verticalLineTo(17.5f)
            moveTo(13f, 14.5f)
            curveTo(13f, 15.0523f, 12.5523f, 15.5f, 12f, 15.5f)
            curveTo(11.4477f, 15.5f, 11f, 15.0523f, 11f, 14.5f)
            curveTo(11f, 13.9477f, 11.4477f, 13.5f, 12f, 13.5f)
            curveTo(12.5523f, 13.5f, 13f, 13.9477f, 13f, 14.5f)
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
            moveTo(16.5f, 9f)
            verticalLineTo(6.5f)
            curveTo(16.5f, 4.01472f, 14.4853f, 2f, 12f, 2f)
            curveTo(9.51471f, 2f, 7.49999f, 4.01472f, 7.49999f, 6.5f)
            verticalLineTo(9f)
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
            moveTo(4.2678f, 18.8447f)
            curveTo(4.49268f, 20.515f, 5.87612f, 21.8235f, 7.55965f, 21.9009f)
            curveTo(8.97627f, 21.966f, 10.4153f, 22f, 12f, 22f)
            curveTo(13.5847f, 22f, 15.0237f, 21.966f, 16.4403f, 21.9009f)
            curveTo(18.1239f, 21.8235f, 19.5073f, 20.515f, 19.7322f, 18.8447f)
            curveTo(19.8789f, 17.7547f, 20f, 16.6376f, 20f, 15.5f)
            curveTo(20f, 14.3624f, 19.8789f, 13.2453f, 19.7322f, 12.1553f)
            curveTo(19.5073f, 10.485f, 18.1239f, 9.17649f, 16.4403f, 9.09909f)
            curveTo(15.0237f, 9.03397f, 13.5847f, 9f, 12f, 9f)
            curveTo(10.4153f, 9f, 8.97627f, 9.03397f, 7.55965f, 9.09909f)
            curveTo(5.87612f, 9.17649f, 4.49268f, 10.485f, 4.2678f, 12.1553f)
            curveTo(4.12104f, 13.2453f, 3.99999f, 14.3624f, 3.99999f, 15.5f)
            curveTo(3.99999f, 16.6376f, 4.12104f, 17.7547f, 4.2678f, 18.8447f)
            close()
        }
        }.build()

        return _squareLock02!!
    }

private var _squareLock02: ImageVector? = null
