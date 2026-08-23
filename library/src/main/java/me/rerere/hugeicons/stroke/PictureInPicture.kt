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

val HugeIcons.PictureInPicture: ImageVector
    get() {
        if (_pictureInPicture != null) {
            return _pictureInPicture!!
        }
        _pictureInPicture = ImageVector.Builder(
            name = "PictureInPicture",
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
            moveTo(9.49286f, 20f)
            horizontalLineTo(6.99286f)
            curveTo(6.06355f, 20f, 5.59889f, 20f, 5.2125f, 19.9231f)
            curveTo(3.62574f, 19.6075f, 2.38534f, 18.3671f, 2.06972f, 16.7804f)
            curveTo(1.99286f, 16.394f, 1.99286f, 15.9293f, 1.99286f, 15f)
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
            moveTo(12.9929f, 4f)
            horizontalLineTo(15.4928f)
            curveTo(17.8274f, 4f, 18.9947f, 4f, 19.8783f, 4.47231f)
            curveTo(20.5761f, 4.84525f, 21.1475f, 5.4167f, 21.5204f, 6.11441f)
            curveTo(21.9928f, 6.99805f, 21.9928f, 8.16537f, 21.9928f, 10.5f)
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
            moveTo(1.99286f, 4f)
            lineTo(8.47716f, 10.4845f)
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
            moveTo(8.69686f, 6f)
            curveTo(8.80609f, 7.25534f, 9.3155f, 10.0469f, 8.67762f, 10.6848f)
            curveTo(8.03974f, 11.3226f, 5.2482f, 10.8132f, 3.99286f, 10.704f)
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
            moveTo(20.4929f, 14f)
            horizontalLineTo(15.4929f)
            curveTo(14.6644f, 14f, 13.9929f, 14.6716f, 13.9929f, 15.5f)
            verticalLineTo(18.5f)
            curveTo(13.9929f, 19.3284f, 14.6644f, 20f, 15.4929f, 20f)
            horizontalLineTo(20.4929f)
            curveTo(21.3213f, 20f, 21.9929f, 19.3284f, 21.9929f, 18.5f)
            verticalLineTo(15.5f)
            curveTo(21.9929f, 14.6716f, 21.3213f, 14f, 20.4929f, 14f)
            close()
        }
        }.build()

        return _pictureInPicture!!
    }

private var _pictureInPicture: ImageVector? = null
