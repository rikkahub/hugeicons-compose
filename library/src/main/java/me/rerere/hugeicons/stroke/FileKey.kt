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

val HugeIcons.FileKey: ImageVector
    get() {
        if (_fileKey != null) {
            return _fileKey!!
        }
        _fileKey = ImageVector.Builder(
            name = "FileKey",
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
            moveTo(4.5f, 14f)
            verticalLineTo(9.45584f)
            curveTo(4.5f, 6.21082f, 4.5f, 4.58831f, 5.38607f, 3.48933f)
            curveTo(5.56508f, 3.26731f, 5.76731f, 3.06508f, 5.98933f, 2.88607f)
            curveTo(7.08831f, 2f, 8.71082f, 2f, 11.9558f, 2f)
            curveTo(12.6614f, 2f, 13.0141f, 2f, 13.3372f, 2.11401f)
            curveTo(13.4044f, 2.13772f, 13.4702f, 2.165f, 13.5345f, 2.19575f)
            curveTo(13.8436f, 2.34355f, 14.093f, 2.593f, 14.5919f, 3.09188f)
            lineTo(19.3284f, 7.82843f)
            curveTo(19.9065f, 8.40649f, 20.1955f, 8.69552f, 20.3478f, 9.06306f)
            curveTo(20.5f, 9.4306f, 20.5f, 9.83935f, 20.5f, 10.6569f)
            verticalLineTo(14f)
            curveTo(20.5f, 17.7712f, 20.5f, 19.6569f, 19.3284f, 20.8284f)
            curveTo(18.1569f, 22f, 16.2712f, 22f, 12.5f, 22f)
            moveTo(13.5f, 2.5f)
            verticalLineTo(3f)
            curveTo(13.5f, 5.82843f, 13.5f, 7.24264f, 14.3787f, 8.12132f)
            curveTo(15.2574f, 9f, 16.6716f, 9f, 19.5f, 9f)
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
            moveTo(7f, 18.5f)
            lineTo(11.5f, 14f)
            moveTo(10.5f, 15.5f)
            lineTo(11.5f, 16.5f)
            moveTo(7.5f, 20f)
            curveTo(7.5f, 21.1046f, 6.60457f, 22f, 5.5f, 22f)
            curveTo(4.39543f, 22f, 3.5f, 21.1046f, 3.5f, 20f)
            curveTo(3.5f, 18.8954f, 4.39543f, 18f, 5.5f, 18f)
            curveTo(6.60457f, 18f, 7.5f, 18.8954f, 7.5f, 20f)
            close()
        }
        }.build()

        return _fileKey!!
    }

private var _fileKey: ImageVector? = null
