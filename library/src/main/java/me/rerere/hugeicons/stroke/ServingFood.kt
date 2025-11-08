package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ServingFood: ImageVector
    get() {
        if (_servingFood != null) {
            return _servingFood!!
        }
        _servingFood = ImageVector.Builder(
            name = "ServingFood",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 14f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 22f)
        lineTo(5.93056f, 21.0694f)
        curveTo(6.45933f, 20.5407f, 6.72371f, 20.2763f, 7.05684f, 20.126f)
        curveTo(7.38997f, 19.9756f, 7.76314f, 19.9523f, 8.50947f, 19.9057f)
        lineTo(11.7619f, 19.7024f)
        curveTo(13.3604f, 19.6025f, 14.1597f, 19.5525f, 14.863f, 19.2148f)
        curveTo(15.5664f, 18.877f, 16.1051f, 18.2844f, 17.1824f, 17.0993f)
        lineTo(20f, 14f)
        horizontalLineTo(16.5f)
        lineTo(14.7071f, 15.7929f)
        curveTo(14.5879f, 15.9121f, 14.5282f, 15.9718f, 14.4662f, 16.0244f)
        curveTo(14.1472f, 16.2954f, 13.7512f, 16.4594f, 13.3341f, 16.4934f)
        curveTo(13.2529f, 16.5f, 13.1686f, 16.5f, 13f, 16.5f)
        moveTo(2f, 19f)
        lineTo(5.07774f, 15.9223f)
        curveTo(5.81669f, 15.1833f, 6.18617f, 14.8138f, 6.62171f, 14.5564f)
        curveTo(6.94612f, 14.3647f, 7.29599f, 14.2198f, 7.66095f, 14.126f)
        curveTo(8.15093f, 14f, 8.67345f, 14f, 9.71849f, 14f)
        horizontalLineTo(10.5f)
        curveTo(10.9647f, 14f, 11.197f, 14f, 11.3902f, 14.0384f)
        curveTo(12.1836f, 14.1962f, 12.8038f, 14.8164f, 12.9616f, 15.6098f)
        curveTo(13f, 15.803f, 13f, 16.0353f, 13f, 16.5f)
        moveTo(13f, 16.5f)
        horizontalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 11.5f)
        curveTo(5f, 7.08171f, 8.58171f, 3.5f, 13f, 3.5f)
        moveTo(13f, 3.5f)
        curveTo(17.4183f, 3.5f, 21f, 7.08171f, 21f, 11.5f)
        moveTo(13f, 3.5f)
        verticalLineTo(2f)
        }
        }.build()

        return _servingFood!!
    }

private var _servingFood: ImageVector? = null
