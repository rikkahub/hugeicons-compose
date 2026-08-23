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

val HugeIcons.FileSymlink: ImageVector
    get() {
        if (_fileSymlink != null) {
            return _fileSymlink!!
        }
        _fileSymlink = ImageVector.Builder(
            name = "FileSymlink",
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
            moveTo(9.99964f, 12f)
            lineTo(12.9996f, 15f)
            lineTo(9.99964f, 18f)
            moveTo(3.99964f, 11f)
            verticalLineTo(9.45584f)
            curveTo(3.99964f, 6.21082f, 3.99964f, 4.58831f, 4.88572f, 3.48933f)
            curveTo(5.06472f, 3.26731f, 5.26696f, 3.06508f, 5.48897f, 2.88607f)
            curveTo(6.58795f, 2f, 8.21046f, 2f, 11.4555f, 2f)
            curveTo(12.161f, 2f, 12.5138f, 2f, 12.8368f, 2.11401f)
            curveTo(12.904f, 2.13772f, 12.9699f, 2.165f, 13.0342f, 2.19575f)
            curveTo(13.3432f, 2.34355f, 13.5926f, 2.593f, 14.0915f, 3.09188f)
            lineTo(18.8281f, 7.82843f)
            curveTo(19.4061f, 8.40649f, 19.6952f, 8.69552f, 19.8474f, 9.06306f)
            curveTo(19.9996f, 9.4306f, 19.9996f, 9.83935f, 19.9996f, 10.6569f)
            verticalLineTo(14f)
            curveTo(19.9996f, 17.7712f, 19.9996f, 19.6569f, 18.8281f, 20.8284f)
            curveTo(17.6565f, 22f, 15.7709f, 22f, 11.9996f, 22f)
            curveTo(8.22841f, 22f, 6.34279f, 22f, 5.17122f, 20.8284f)
            curveTo(4.70112f, 20.3583f, 4.41965f, 19.7733f, 4.25112f, 18.9975f)
            curveTo(3.88789f, 17.3256f, 3.70628f, 16.4897f, 4.30669f, 15.7449f)
            curveTo(4.90709f, 15f, 5.94216f, 15f, 8.0123f, 15f)
            horizontalLineTo(11.9996f)
        }
        }.build()

        return _fileSymlink!!
    }

private var _fileSymlink: ImageVector? = null
