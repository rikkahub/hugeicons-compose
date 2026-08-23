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

val HugeIcons.Ship: ImageVector
    get() {
        if (_ship != null) {
            return _ship!!
        }
        _ship = ImageVector.Builder(
            name = "Ship",
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
            moveTo(1.99219f, 21.5f)
            curveTo(3.49219f, 21.5f, 4.54253f, 20.5f, 5.49219f, 20.5f)
            curveTo(6.44186f, 20.5f, 7.65025f, 21.5113f, 8.49219f, 21.5f)
            curveTo(9.50251f, 21.5085f, 10.8526f, 20.5f, 11.9922f, 20.5f)
            curveTo(13.1318f, 20.5f, 14.4819f, 21.5085f, 15.4922f, 21.5f)
            curveTo(16.3341f, 21.5113f, 17.5425f, 20.5f, 18.4922f, 20.5f)
            curveTo(19.4418f, 20.5f, 20.4922f, 21.5f, 21.9922f, 21.5f)
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
            moveTo(5.49217f, 20.4999f)
            lineTo(4.51927f, 18.3595f)
            curveTo(3.79459f, 16.7653f, 3.43226f, 15.9681f, 3.67706f, 15.2258f)
            curveTo(3.92186f, 14.4834f, 4.68729f, 14.0582f, 6.21816f, 13.2077f)
            lineTo(10.0496f, 11.0791f)
            curveTo(10.9991f, 10.5516f, 11.4739f, 10.2878f, 11.9922f, 10.2878f)
            curveTo(12.5104f, 10.2878f, 12.9852f, 10.5516f, 13.9347f, 11.0791f)
            lineTo(17.7662f, 13.2077f)
            curveTo(19.297f, 14.0582f, 20.0625f, 14.4834f, 20.3073f, 15.2258f)
            curveTo(20.5521f, 15.9681f, 20.1897f, 16.7653f, 19.4651f, 18.3595f)
            lineTo(18.4922f, 20.4999f)
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
            moveTo(5.99219f, 13.2639f)
            verticalLineTo(11.2361f)
            curveTo(5.99219f, 10.0333f, 5.99219f, 9.43184f, 6.29089f, 8.94854f)
            curveTo(6.58958f, 8.46523f, 7.1275f, 8.19628f, 8.20333f, 7.65836f)
            lineTo(10.2033f, 6.65836f)
            curveTo(11.0811f, 6.21945f, 11.5201f, 6f, 11.9922f, 6f)
            curveTo(12.4643f, 6f, 12.9032f, 6.21945f, 13.781f, 6.65836f)
            lineTo(15.781f, 7.65836f)
            curveTo(16.8569f, 8.19628f, 17.3948f, 8.46523f, 17.6935f, 8.94854f)
            curveTo(17.9922f, 9.43184f, 17.9922f, 10.0333f, 17.9922f, 11.2361f)
            verticalLineTo(13.2639f)
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
            moveTo(9.99219f, 6.5f)
            verticalLineTo(4.5f)
            curveTo(9.99219f, 4.03501f, 9.99219f, 3.80252f, 10.0433f, 3.61177f)
            curveTo(10.182f, 3.09413f, 10.5863f, 2.68981f, 11.104f, 2.55111f)
            curveTo(11.2947f, 2.5f, 11.5272f, 2.5f, 11.9922f, 2.5f)
            curveTo(12.4572f, 2.5f, 12.6897f, 2.5f, 12.8804f, 2.55111f)
            curveTo(13.3981f, 2.68981f, 13.8024f, 3.09413f, 13.9411f, 3.61177f)
            curveTo(13.9922f, 3.80252f, 13.9922f, 4.03501f, 13.9922f, 4.5f)
            verticalLineTo(6.5f)
        }
        }.build()

        return _ship!!
    }

private var _ship: ImageVector? = null
