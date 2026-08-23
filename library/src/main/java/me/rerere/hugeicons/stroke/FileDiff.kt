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

val HugeIcons.FileDiff: ImageVector
    get() {
        if (_fileDiff != null) {
            return _fileDiff!!
        }
        _fileDiff = ImageVector.Builder(
            name = "FileDiff",
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
            moveTo(5.9925f, 12f)
            verticalLineTo(18f)
            moveTo(9f, 14.9925f)
            lineTo(3f, 14.9925f)
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
            moveTo(3f, 22f)
            horizontalLineTo(9f)
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
            moveTo(13f, 22f)
            curveTo(16.7712f, 22f, 18.6569f, 22f, 19.8284f, 20.8284f)
            curveTo(21f, 19.6569f, 21f, 17.7712f, 21f, 14f)
            verticalLineTo(10.6569f)
            curveTo(21f, 9.83935f, 21f, 9.4306f, 20.8478f, 9.06306f)
            curveTo(20.6955f, 8.69552f, 20.4065f, 8.40649f, 19.8284f, 7.82843f)
            lineTo(15.0919f, 3.09188f)
            curveTo(14.593f, 2.593f, 14.3436f, 2.34355f, 14.0345f, 2.19575f)
            curveTo(13.9702f, 2.165f, 13.9044f, 2.13772f, 13.8372f, 2.11401f)
            curveTo(13.5141f, 2f, 13.1614f, 2f, 12.4558f, 2f)
            curveTo(9.21082f, 2f, 7.58831f, 2f, 6.48933f, 2.88607f)
            curveTo(6.26732f, 3.06508f, 6.06508f, 3.26731f, 5.88608f, 3.48933f)
            curveTo(5.14374f, 4.41003f, 5.02332f, 5.69818f, 5.00378f, 8f)
            moveTo(14f, 2.5f)
            verticalLineTo(3f)
            curveTo(14f, 5.82843f, 14f, 7.24264f, 14.8787f, 8.12132f)
            curveTo(15.7574f, 9f, 17.1716f, 9f, 20f, 9f)
            horizontalLineTo(20.5f)
        }
        }.build()

        return _fileDiff!!
    }

private var _fileDiff: ImageVector? = null
