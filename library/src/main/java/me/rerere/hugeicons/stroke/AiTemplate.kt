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

val HugeIcons.AiTemplate: ImageVector
    get() {
        if (_aiTemplate != null) {
            return _aiTemplate!!
        }
        _aiTemplate = ImageVector.Builder(
            name = "AiTemplate",
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
            moveTo(13f, 8.50733f)
            verticalLineTo(11.5f)
            horizontalLineTo(14.8832f)
            curveTo(15.5f, 11.5f, 16f, 12f, 16f, 12.6168f)
            curveTo(16f, 12.8652f, 15.9172f, 13.1064f, 15.7647f, 13.3025f)
            lineTo(12.8025f, 17.1111f)
            curveTo(12.6116f, 17.3565f, 12.3182f, 17.5f, 12.0073f, 17.5f)
            curveTo(11.451f, 17.5f, 11f, 17.049f, 11f, 16.4927f)
            lineTo(11f, 13.5f)
            horizontalLineTo(9.11681f)
            curveTo(8.50001f, 13.5f, 8f, 13f, 8f, 12.3832f)
            curveTo(8f, 12.1348f, 8.08278f, 11.8936f, 8.23525f, 11.6975f)
            lineTo(11.1975f, 7.88889f)
            curveTo(11.3884f, 7.64352f, 11.6818f, 7.5f, 11.9927f, 7.5f)
            curveTo(12.549f, 7.5f, 13f, 7.951f, 13f, 8.50733f)
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
            moveTo(20f, 10f)
            verticalLineTo(14f)
            curveTo(20f, 17.7712f, 20f, 19.6569f, 18.8284f, 20.8284f)
            curveTo(17.6569f, 22f, 15.7712f, 22f, 12f, 22f)
            curveTo(8.22876f, 22f, 6.34315f, 22f, 5.17157f, 20.8284f)
            curveTo(4f, 19.6569f, 4f, 17.7712f, 4f, 14f)
            verticalLineTo(11f)
            curveTo(4f, 7.22876f, 4f, 5.34315f, 5.17157f, 4.17157f)
            curveTo(6.34315f, 3f, 8.22876f, 3f, 12f, 3f)
            horizontalLineTo(14f)
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

        return _aiTemplate!!
    }

private var _aiTemplate: ImageVector? = null
