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

val HugeIcons.PictureInPicture01: ImageVector
    get() {
        if (_pictureInPicture01 != null) {
            return _pictureInPicture01!!
        }
        _pictureInPicture01 = ImageVector.Builder(
            name = "PictureInPicture01",
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
            moveTo(6.99219f, 19.965f)
            curveTo(5.11989f, 19.8873f, 3.97194f, 19.6366f, 3.16376f, 18.8284f)
            curveTo(1.99219f, 17.6569f, 1.99219f, 15.7712f, 1.99219f, 12f)
            curveTo(1.99219f, 8.22876f, 1.99219f, 6.34315f, 3.16376f, 5.17157f)
            curveTo(4.33534f, 4f, 6.22095f, 4f, 9.99219f, 4f)
            horizontalLineTo(13.9922f)
            curveTo(17.7634f, 4f, 19.6491f, 4f, 20.8206f, 5.17157f)
            curveTo(21.4738f, 5.82475f, 21.7628f, 6.69989f, 21.8907f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19.9297f, 12f)
            horizontalLineTo(13.0547f)
            curveTo(11.9156f, 12f, 10.9922f, 12.8954f, 10.9922f, 14f)
            verticalLineTo(18f)
            curveTo(10.9922f, 19.1046f, 11.9156f, 20f, 13.0547f, 20f)
            horizontalLineTo(19.9297f)
            curveTo(21.0688f, 20f, 21.9922f, 19.1046f, 21.9922f, 18f)
            verticalLineTo(14f)
            curveTo(21.9922f, 12.8954f, 21.0688f, 12f, 19.9297f, 12f)
            close()
        }
        }.build()

        return _pictureInPicture01!!
    }

private var _pictureInPicture01: ImageVector? = null
