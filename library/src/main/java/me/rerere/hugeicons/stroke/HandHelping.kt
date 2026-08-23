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

val HugeIcons.HandHelping: ImageVector
    get() {
        if (_handHelping != null) {
            return _handHelping!!
        }
        _handHelping = ImageVector.Builder(
            name = "HandHelping",
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
            moveTo(2f, 14.5f)
            verticalLineTo(8.5f)
            curveTo(2f, 8.03501f, 2f, 7.80252f, 2.05111f, 7.61177f)
            curveTo(2.18981f, 7.09413f, 2.59413f, 6.68981f, 3.11177f, 6.55111f)
            curveTo(3.30252f, 6.5f, 3.53501f, 6.5f, 4f, 6.5f)
            curveTo(4.46499f, 6.5f, 4.69748f, 6.5f, 4.88823f, 6.55111f)
            curveTo(5.40587f, 6.68981f, 5.81019f, 7.09413f, 5.94889f, 7.61177f)
            curveTo(6f, 7.80252f, 6f, 8.03501f, 6f, 8.5f)
            verticalLineTo(14.5f)
            curveTo(6f, 14.965f, 6f, 15.1975f, 5.94889f, 15.3882f)
            curveTo(5.81019f, 15.9059f, 5.40587f, 16.3102f, 4.88823f, 16.4489f)
            curveTo(4.69748f, 16.5f, 4.46499f, 16.5f, 4f, 16.5f)
            curveTo(3.53501f, 16.5f, 3.30252f, 16.5f, 3.11177f, 16.4489f)
            curveTo(2.59413f, 16.3102f, 2.18981f, 15.9059f, 2.05111f, 15.3882f)
            curveTo(2f, 15.1975f, 2f, 14.965f, 2f, 14.5f)
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
            moveTo(6f, 7.5f)
            horizontalLineTo(7.76845f)
            curveTo(8.58101f, 7.5f, 9.38511f, 7.66505f, 10.132f, 7.98513f)
            lineTo(14.8574f, 10.0103f)
            curveTo(15.5506f, 10.3074f, 16f, 10.989f, 16f, 11.7431f)
            curveTo(16f, 12.4373f, 15.4373f, 13f, 14.7431f, 13f)
            horizontalLineTo(14.0986f)
            curveTo(13.3729f, 13f, 12.6538f, 12.8615f, 11.98f, 12.592f)
            lineTo(10.5f, 12f)
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
            moveTo(14f, 13f)
            horizontalLineTo(20.5749f)
            curveTo(21.362f, 13f, 22f, 13.638f, 22f, 14.4251f)
            curveTo(22f, 15.0613f, 21.5782f, 15.6205f, 20.9664f, 15.7953f)
            lineTo(15.7451f, 17.2871f)
            curveTo(15.2508f, 17.4283f, 14.7392f, 17.5f, 14.2251f, 17.5f)
            curveTo(13.7437f, 17.5f, 13.2645f, 17.4372f, 12.7994f, 17.3132f)
            lineTo(6f, 15.5f)
        }
        }.build()

        return _handHelping!!
    }

private var _handHelping: ImageVector? = null
