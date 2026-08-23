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

val HugeIcons.FileHeart: ImageVector
    get() {
        if (_fileHeart != null) {
            return _fileHeart!!
        }
        _fileHeart = ImageVector.Builder(
            name = "FileHeart",
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
            moveTo(6.86428f, 21.7808f)
            curveTo(5.73577f, 20.9121f, 3.5f, 18.9261f, 3.5f, 17.1389f)
            curveTo(3.5f, 15.9576f, 4.34211f, 15f, 5.5f, 15f)
            curveTo(6.1f, 15f, 6.7f, 15.2059f, 7.5f, 16.0294f)
            curveTo(8.3f, 15.2059f, 8.9f, 15f, 9.5f, 15f)
            curveTo(10.6579f, 15f, 11.5f, 15.9576f, 11.5f, 17.1389f)
            curveTo(11.5f, 18.9261f, 9.26423f, 20.9121f, 8.13572f, 21.7808f)
            curveTo(7.75598f, 22.0731f, 7.24403f, 22.0731f, 6.86428f, 21.7808f)
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
            moveTo(4.5f, 12f)
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
        }.build()

        return _fileHeart!!
    }

private var _fileHeart: ImageVector? = null
