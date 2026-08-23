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

val HugeIcons.FileCodeCorner: ImageVector
    get() {
        if (_fileCodeCorner != null) {
            return _fileCodeCorner!!
        }
        _fileCodeCorner = ImageVector.Builder(
            name = "FileCodeCorner",
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
            moveTo(5.99998f, 22f)
            curveTo(5.99998f, 22f, 3.00001f, 19.7905f, 3f, 19f)
            curveTo(3f, 18.2094f, 6f, 16f, 6f, 16f)
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
            moveTo(10f, 22f)
            curveTo(10f, 22f, 13f, 19.7905f, 13f, 19f)
            curveTo(13f, 18.2094f, 10f, 16f, 10f, 16f)
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
            moveTo(5f, 12f)
            verticalLineTo(9.45584f)
            curveTo(5f, 6.21082f, 5f, 4.58831f, 5.88607f, 3.48933f)
            curveTo(6.06508f, 3.26731f, 6.26731f, 3.06508f, 6.48933f, 2.88607f)
            curveTo(7.58831f, 2f, 9.21082f, 2f, 12.4558f, 2f)
            curveTo(13.1614f, 2f, 13.5141f, 2f, 13.8372f, 2.11401f)
            curveTo(13.9044f, 2.13772f, 13.9702f, 2.165f, 14.0345f, 2.19575f)
            curveTo(14.3436f, 2.34355f, 14.593f, 2.593f, 15.0919f, 3.09188f)
            lineTo(19.8284f, 7.82843f)
            curveTo(20.4065f, 8.40649f, 20.6955f, 8.69552f, 20.8478f, 9.06306f)
            curveTo(21f, 9.4306f, 21f, 9.83935f, 21f, 10.6569f)
            verticalLineTo(14f)
            curveTo(21f, 17.7712f, 21f, 19.6569f, 19.8284f, 20.8284f)
            curveTo(18.8853f, 21.7715f, 17.4796f, 21.9554f, 15f, 21.9913f)
            moveTo(14f, 2.5f)
            verticalLineTo(3f)
            curveTo(14f, 5.82843f, 14f, 7.24264f, 14.8787f, 8.12132f)
            curveTo(15.7574f, 9f, 17.1716f, 9f, 20f, 9f)
            horizontalLineTo(20.5f)
        }
        }.build()

        return _fileCodeCorner!!
    }

private var _fileCodeCorner: ImageVector? = null
