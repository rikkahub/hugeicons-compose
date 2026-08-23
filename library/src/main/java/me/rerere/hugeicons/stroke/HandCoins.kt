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

val HugeIcons.HandCoins: ImageVector
    get() {
        if (_handCoins != null) {
            return _handCoins!!
        }
        _handCoins = ImageVector.Builder(
            name = "HandCoins",
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
            moveTo(2f, 18f)
            verticalLineTo(12f)
            curveTo(2f, 11.535f, 2f, 11.3025f, 2.05111f, 11.1118f)
            curveTo(2.18981f, 10.5941f, 2.59413f, 10.1898f, 3.11177f, 10.0511f)
            curveTo(3.30252f, 10f, 3.53501f, 10f, 4f, 10f)
            curveTo(4.46499f, 10f, 4.69748f, 10f, 4.88823f, 10.0511f)
            curveTo(5.40587f, 10.1898f, 5.81019f, 10.5941f, 5.94889f, 11.1118f)
            curveTo(6f, 11.3025f, 6f, 11.535f, 6f, 12f)
            verticalLineTo(18f)
            curveTo(6f, 18.465f, 6f, 18.6975f, 5.94889f, 18.8882f)
            curveTo(5.81019f, 19.4059f, 5.40587f, 19.8102f, 4.88823f, 19.9489f)
            curveTo(4.69748f, 20f, 4.46499f, 20f, 4f, 20f)
            curveTo(3.53501f, 20f, 3.30252f, 20f, 3.11177f, 19.9489f)
            curveTo(2.59413f, 19.8102f, 2.18981f, 19.4059f, 2.05111f, 18.8882f)
            curveTo(2f, 18.6975f, 2f, 18.465f, 2f, 18f)
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
            moveTo(6f, 11f)
            horizontalLineTo(7.76845f)
            curveTo(8.58101f, 11f, 9.38511f, 11.165f, 10.132f, 11.4851f)
            lineTo(14.8574f, 13.5103f)
            curveTo(15.5506f, 13.8074f, 16f, 14.489f, 16f, 15.2431f)
            curveTo(16f, 15.9373f, 15.4373f, 16.5f, 14.7431f, 16.5f)
            horizontalLineTo(14.0986f)
            curveTo(13.3729f, 16.5f, 12.6538f, 16.3615f, 11.98f, 16.092f)
            lineTo(10.5f, 15.5f)
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
            moveTo(14f, 16.5f)
            horizontalLineTo(20.5749f)
            curveTo(21.362f, 16.5f, 22f, 17.138f, 22f, 17.9251f)
            curveTo(22f, 18.5613f, 21.5782f, 19.1205f, 20.9664f, 19.2953f)
            lineTo(15.7451f, 20.7871f)
            curveTo(15.2508f, 20.9283f, 14.7392f, 21f, 14.2251f, 21f)
            curveTo(13.7437f, 21f, 13.2645f, 20.9372f, 12.7994f, 20.8132f)
            lineTo(6f, 19f)
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
            moveTo(22f, 7f)
            arcTo(4f, 4f, 0f, true, false, 14f, 7f)
            arcTo(4f, 4f, 0f, true, false, 22f, 7f)
            close()
        }
        }.build()

        return _handCoins!!
    }

private var _handCoins: ImageVector? = null
