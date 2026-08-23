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

val HugeIcons.FileDigit: ImageVector
    get() {
        if (_fileDigit != null) {
            return _fileDigit!!
        }
        _fileDigit = ImageVector.Builder(
            name = "FileDigit",
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
            moveTo(7f, 20f)
            verticalLineTo(18f)
            curveTo(7f, 16.8954f, 6.10457f, 16f, 5f, 16f)
            curveTo(3.89543f, 16f, 3f, 16.8954f, 3f, 18f)
            verticalLineTo(20f)
            curveTo(3f, 21.1046f, 3.89543f, 22f, 5f, 22f)
            curveTo(6.10457f, 22f, 7f, 21.1046f, 7f, 20f)
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
            moveTo(15f, 22f)
            horizontalLineTo(11f)
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
            verticalLineTo(17.4878f)
            curveTo(13f, 16.6127f, 13f, 16.1752f, 12.7236f, 16.0367f)
            curveTo(12.4472f, 15.8981f, 12.0981f, 16.1606f, 11.4f, 16.6856f)
            lineTo(11f, 16.9864f)
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
            verticalLineTo(14.5849f)
            curveTo(21f, 18.3561f, 21f, 20.2417f, 19.8284f, 21.4133f)
            curveTo(19.5862f, 21.6555f, 19.3136f, 21.8476f, 19f, 22f)
            moveTo(14f, 2.5f)
            verticalLineTo(3f)
            curveTo(14f, 5.82843f, 14f, 7.24264f, 14.8787f, 8.12132f)
            curveTo(15.7574f, 9f, 17.1716f, 9f, 20f, 9f)
            horizontalLineTo(20.5f)
        }
        }.build()

        return _fileDigit!!
    }

private var _fileDigit: ImageVector? = null
