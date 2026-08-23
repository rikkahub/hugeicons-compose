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

val HugeIcons.FileSearchCorner: ImageVector
    get() {
        if (_fileSearchCorner != null) {
            return _fileSearchCorner!!
        }
        _fileSearchCorner = ImageVector.Builder(
            name = "FileSearchCorner",
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
            moveTo(21f, 22f)
            lineTo(19.125f, 20.125f)
            moveTo(20f, 18f)
            curveTo(20f, 19.6569f, 18.6569f, 21f, 17f, 21f)
            curveTo(15.3431f, 21f, 14f, 19.6569f, 14f, 18f)
            curveTo(14f, 16.3431f, 15.3431f, 15f, 17f, 15f)
            curveTo(18.6569f, 15f, 20f, 16.3431f, 20f, 18f)
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
            moveTo(20f, 12f)
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
            verticalLineTo(14f)
            curveTo(4f, 17.7712f, 4f, 19.6569f, 5.17157f, 20.8284f)
            curveTo(6.11466f, 21.7715f, 7.52043f, 21.9554f, 10f, 21.9913f)
            horizontalLineTo(11f)
        }
        }.build()

        return _fileSearchCorner!!
    }

private var _fileSearchCorner: ImageVector? = null
