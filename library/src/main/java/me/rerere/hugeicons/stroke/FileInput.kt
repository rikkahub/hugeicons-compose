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

val HugeIcons.FileInput: ImageVector
    get() {
        if (_fileInput != null) {
            return _fileInput!!
        }
        _fileInput = ImageVector.Builder(
            name = "FileInput",
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
            moveTo(11f, 18f)
            curveTo(11f, 18f, 14f, 15.7905f, 14f, 15f)
            curveTo(14f, 14.2094f, 11f, 12f, 11f, 12f)
            moveTo(13f, 15f)
            lineTo(4f, 15f)
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
            moveTo(4f, 11f)
            verticalLineTo(9.45584f)
            curveTo(4f, 6.21082f, 4f, 4.58831f, 4.88607f, 3.48933f)
            curveTo(5.06508f, 3.26731f, 5.26731f, 3.06508f, 5.48933f, 2.88607f)
            curveTo(6.58831f, 2f, 8.21082f, 2f, 11.4558f, 2f)
            curveTo(12.1614f, 2f, 12.5141f, 2f, 12.8372f, 2.11401f)
            curveTo(12.9044f, 2.13772f, 12.9702f, 2.165f, 13.0345f, 2.19575f)
            curveTo(13.3436f, 2.34355f, 13.593f, 2.593f, 14.0919f, 3.09188f)
            lineTo(18.8284f, 7.82843f)
            curveTo(19.4065f, 8.40649f, 19.6955f, 8.69552f, 19.8478f, 9.06306f)
            curveTo(20f, 9.4306f, 20f, 9.83935f, 20f, 10.6569f)
            verticalLineTo(14f)
            curveTo(20f, 17.7712f, 20f, 19.6569f, 18.8284f, 20.8284f)
            curveTo(17.6569f, 22f, 15.7712f, 22f, 12f, 22f)
            curveTo(8.22876f, 22f, 6.34315f, 22f, 5.17157f, 20.8284f)
            curveTo(4.70197f, 20.3588f, 4.4206f, 19.7745f, 4.25201f, 19f)
            moveTo(13f, 2.5f)
            verticalLineTo(3f)
            curveTo(13f, 5.82843f, 13f, 7.24264f, 13.8787f, 8.12132f)
            curveTo(14.7574f, 9f, 16.1716f, 9f, 19f, 9f)
            horizontalLineTo(19.5f)
        }
        }.build()

        return _fileInput!!
    }

private var _fileInput: ImageVector? = null
