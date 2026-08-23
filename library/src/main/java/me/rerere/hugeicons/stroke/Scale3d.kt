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

val HugeIcons.Scale3d: ImageVector
    get() {
        if (_scale3d != null) {
            return _scale3d!!
        }
        _scale3d = ImageVector.Builder(
            name = "Scale3d",
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
            moveTo(4.99093f, 3.5f)
            verticalLineTo(10.9998f)
            curveTo(4.99093f, 14.771f, 4.99093f, 16.6566f, 6.1625f, 17.8282f)
            curveTo(7.33407f, 18.9998f, 9.21969f, 18.9998f, 12.9909f, 18.9998f)
            horizontalLineTo(20.4909f)
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
            moveTo(6.49171f, 17.5f)
            lineTo(13.4917f, 10.5f)
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
            moveTo(6.99093f, 5f)
            lineTo(6.55267f, 4.4231f)
            curveTo(5.83192f, 3.47437f, 5.47155f, 3f, 4.99093f, 3f)
            curveTo(4.5103f, 3f, 4.14993f, 3.47437f, 3.42919f, 4.4231f)
            lineTo(2.99093f, 5f)
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
            moveTo(18.9909f, 21f)
            lineTo(19.5678f, 20.5617f)
            curveTo(20.5166f, 19.841f, 20.9909f, 19.4806f, 20.9909f, 19f)
            curveTo(20.9909f, 18.5194f, 20.5166f, 18.159f, 19.5678f, 17.4383f)
            lineTo(18.9909f, 17f)
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
            moveTo(13.8194f, 13.0654f)
            lineTo(13.9174f, 12.3476f)
            curveTo(14.0786f, 11.1671f, 14.1592f, 10.5768f, 13.8194f, 10.237f)
            curveTo(13.4795f, 9.89712f, 12.8893f, 9.97773f, 11.7088f, 10.1389f)
            lineTo(10.9909f, 10.237f)
        }
        }.build()

        return _scale3d!!
    }

private var _scale3d: ImageVector? = null
