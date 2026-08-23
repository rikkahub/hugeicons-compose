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

val HugeIcons.HandHeart: ImageVector
    get() {
        if (_handHeart != null) {
            return _handHeart!!
        }
        _handHeart = ImageVector.Builder(
            name = "HandHeart",
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
            moveTo(15.2053f, 10.7181f)
            curveTo(13.7947f, 9.60121f, 11f, 7.0478f, 11f, 4.74998f)
            curveTo(11f, 3.23121f, 12.0526f, 2f, 13.5f, 2f)
            curveTo(14.25f, 2f, 15f, 2.2647f, 16f, 3.32352f)
            curveTo(17f, 2.2647f, 17.75f, 2f, 18.5f, 2f)
            curveTo(19.9474f, 2f, 21f, 3.23121f, 21f, 4.74998f)
            curveTo(21f, 7.0478f, 18.2053f, 9.60121f, 16.7947f, 10.7181f)
            curveTo(16.32f, 11.094f, 15.68f, 11.094f, 15.2053f, 10.7181f)
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
            moveTo(2f, 19f)
            verticalLineTo(13f)
            curveTo(2f, 12.535f, 2f, 12.3025f, 2.05111f, 12.1118f)
            curveTo(2.18981f, 11.5941f, 2.59413f, 11.1898f, 3.11177f, 11.0511f)
            curveTo(3.30252f, 11f, 3.53501f, 11f, 4f, 11f)
            curveTo(4.46499f, 11f, 4.69748f, 11f, 4.88823f, 11.0511f)
            curveTo(5.40587f, 11.1898f, 5.81019f, 11.5941f, 5.94889f, 12.1118f)
            curveTo(6f, 12.3025f, 6f, 12.535f, 6f, 13f)
            verticalLineTo(19f)
            curveTo(6f, 19.465f, 6f, 19.6975f, 5.94889f, 19.8882f)
            curveTo(5.81019f, 20.4059f, 5.40587f, 20.8102f, 4.88823f, 20.9489f)
            curveTo(4.69748f, 21f, 4.46499f, 21f, 4f, 21f)
            curveTo(3.53501f, 21f, 3.30252f, 21f, 3.11177f, 20.9489f)
            curveTo(2.59413f, 20.8102f, 2.18981f, 20.4059f, 2.05111f, 19.8882f)
            curveTo(2f, 19.6975f, 2f, 19.465f, 2f, 19f)
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
            moveTo(6f, 12f)
            horizontalLineTo(7.76845f)
            curveTo(8.58101f, 12f, 9.38511f, 12.165f, 10.132f, 12.4851f)
            lineTo(14.8574f, 14.5103f)
            curveTo(15.5506f, 14.8074f, 16f, 15.489f, 16f, 16.2431f)
            curveTo(16f, 16.9373f, 15.4373f, 17.5f, 14.7431f, 17.5f)
            horizontalLineTo(14.0986f)
            curveTo(13.3729f, 17.5f, 12.6538f, 17.3615f, 11.98f, 17.092f)
            lineTo(10.5f, 16.5f)
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
            moveTo(14f, 17.5f)
            horizontalLineTo(20.5749f)
            curveTo(21.362f, 17.5f, 22f, 18.138f, 22f, 18.9251f)
            curveTo(22f, 19.5613f, 21.5782f, 20.1205f, 20.9664f, 20.2953f)
            lineTo(15.7451f, 21.7871f)
            curveTo(15.2508f, 21.9283f, 14.7392f, 22f, 14.2251f, 22f)
            curveTo(13.7437f, 22f, 13.2645f, 21.9372f, 12.7994f, 21.8132f)
            lineTo(6f, 20f)
        }
        }.build()

        return _handHeart!!
    }

private var _handHeart: ImageVector? = null
