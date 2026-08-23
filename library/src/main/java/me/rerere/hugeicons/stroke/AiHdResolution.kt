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

val HugeIcons.AiHdResolution: ImageVector
    get() {
        if (_aiHdResolution != null) {
            return _aiHdResolution!!
        }
        _aiHdResolution = ImageVector.Builder(
            name = "AiHdResolution",
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
            moveTo(13f, 4f)
            horizontalLineTo(10f)
            curveTo(6.22876f, 4f, 4.34315f, 4f, 3.17157f, 5.17157f)
            curveTo(2f, 6.34315f, 2f, 8.22876f, 2f, 12f)
            curveTo(2f, 15.7712f, 2f, 17.6569f, 3.17157f, 18.8284f)
            curveTo(4.34315f, 20f, 6.22876f, 20f, 10f, 20f)
            horizontalLineTo(14f)
            curveTo(17.7712f, 20f, 19.6569f, 20f, 20.8284f, 18.8284f)
            curveTo(22f, 17.6569f, 22f, 15.7712f, 22f, 12f)
            verticalLineTo(10f)
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
            moveTo(7f, 9f)
            lineTo(6f, 15f)
            moveTo(11f, 9f)
            lineTo(10f, 15f)
            moveTo(7f, 12f)
            horizontalLineTo(10f)
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
            moveTo(13f, 15f)
            lineTo(14f, 9f)
            horizontalLineTo(15.6391f)
            curveTo(16.875f, 9f, 17.815f, 10.1097f, 17.6119f, 11.3288f)
            lineTo(17.3482f, 12.911f)
            curveTo(17.1473f, 14.1165f, 16.1043f, 15f, 14.8822f, 15f)
            horizontalLineTo(13f)
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
            moveTo(19.5f, 2.9375f)
            verticalLineTo(4.5f)
            moveTo(19.5f, 4.5f)
            verticalLineTo(6.0625f)
            moveTo(19.5f, 4.5f)
            horizontalLineTo(18.25f)
            moveTo(19.5f, 4.5f)
            horizontalLineTo(20.75f)
            moveTo(22f, 4.5f)
            lineTo(20.9156f, 4.13852f)
            curveTo(20.4179f, 3.97263f, 20.0274f, 3.58211f, 19.8615f, 3.08443f)
            lineTo(19.5f, 2f)
            lineTo(19.1385f, 3.08443f)
            curveTo(18.9726f, 3.58211f, 18.5821f, 3.97263f, 18.0844f, 4.13852f)
            lineTo(17f, 4.5f)
            lineTo(18.0844f, 4.86148f)
            curveTo(18.5821f, 5.02737f, 18.9726f, 5.41789f, 19.1385f, 5.91557f)
            lineTo(19.5f, 7f)
            lineTo(19.8615f, 5.91557f)
            curveTo(20.0274f, 5.41789f, 20.4179f, 5.02737f, 20.9156f, 4.86148f)
            lineTo(22f, 4.5f)
            close()
        }
        }.build()

        return _aiHdResolution!!
    }

private var _aiHdResolution: ImageVector? = null
