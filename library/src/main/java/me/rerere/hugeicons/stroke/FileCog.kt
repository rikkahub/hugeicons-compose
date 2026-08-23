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

val HugeIcons.FileCog: ImageVector
    get() {
        if (_fileCog != null) {
            return _fileCog!!
        }
        _fileCog = ImageVector.Builder(
            name = "FileCog",
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
            moveTo(6.46161f, 20f)
            curveTo(7.56618f, 20f, 8.46161f, 19.1046f, 8.46161f, 18f)
            curveTo(8.46161f, 16.8954f, 7.56618f, 16f, 6.46161f, 16f)
            moveTo(6.46161f, 20f)
            curveTo(5.35704f, 20f, 4.46161f, 19.1046f, 4.46161f, 18f)
            curveTo(4.46161f, 16.8954f, 5.35704f, 16f, 6.46161f, 16f)
            moveTo(6.46161f, 20f)
            verticalLineTo(22f)
            moveTo(6.46161f, 16f)
            verticalLineTo(14f)
            moveTo(8.19617f, 16.9956f)
            lineTo(9.92822f, 15.9956f)
            moveTo(4.73207f, 18.9956f)
            lineTo(3.00002f, 19.9956f)
            moveTo(8.20118f, 18.9956f)
            lineTo(9.93323f, 19.9956f)
            moveTo(4.73708f, 16.9956f)
            lineTo(3.00502f, 15.9956f)
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
            moveTo(13f, 2.5f)
            verticalLineTo(3f)
            curveTo(13f, 5.82843f, 13f, 7.24264f, 13.8787f, 8.12132f)
            curveTo(14.7574f, 9f, 16.1716f, 9f, 19f, 9f)
            horizontalLineTo(19.5f)
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
            moveTo(13f, 21.9991f)
            curveTo(16.1143f, 21.99f, 17.7653f, 21.8915f, 18.8284f, 20.8284f)
            curveTo(20f, 19.6569f, 20f, 17.7712f, 20f, 14f)
            verticalLineTo(10.6569f)
            curveTo(20f, 9.83935f, 20f, 9.4306f, 19.8478f, 9.06306f)
            curveTo(19.6955f, 8.69552f, 19.4065f, 8.40649f, 18.8284f, 7.82843f)
            lineTo(14.0919f, 3.09188f)
            curveTo(13.593f, 2.593f, 13.3436f, 2.34355f, 13.0345f, 2.19575f)
            curveTo(12.9702f, 2.165f, 12.9044f, 2.13772f, 12.8372f, 2.11401f)
            curveTo(12.5141f, 2f, 12.1614f, 2f, 11.4558f, 2f)
            curveTo(8.21082f, 2f, 6.58831f, 2f, 5.48933f, 2.88607f)
            curveTo(5.26731f, 3.06508f, 5.06508f, 3.26731f, 4.88607f, 3.48933f)
            curveTo(4f, 4.58831f, 4f, 6.21082f, 4f, 9.45584f)
            verticalLineTo(11f)
        }
        }.build()

        return _fileCog!!
    }

private var _fileCog: ImageVector? = null
