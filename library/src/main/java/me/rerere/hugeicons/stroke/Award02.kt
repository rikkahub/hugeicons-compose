package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Award02: ImageVector
    get() {
        if (_award02 != null) {
            return _award02!!
        }
        _award02 = ImageVector.Builder(
            name = "Award02",
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
        moveTo(8f, 21f)
        curveTo(8f, 19.5858f, 8f, 18.8787f, 8.43934f, 18.4393f)
        curveTo(8.87868f, 18f, 9.58579f, 18f, 11f, 18f)
        horizontalLineTo(13f)
        curveTo(14.4142f, 18f, 15.1213f, 18f, 15.5607f, 18.4393f)
        curveTo(16f, 18.8787f, 16f, 19.5858f, 16f, 21f)
        verticalLineTo(22f)
        horizontalLineTo(8f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 13f)
        lineTo(12f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 22f)
        horizontalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.0366f, 2.86651f)
        lineTo(14.0925f, 4.99573f)
        curveTo(14.2364f, 5.29212f, 14.6204f, 5.57642f, 14.9444f, 5.63086f)
        lineTo(16.8582f, 5.95145f)
        curveTo(18.082f, 6.15712f, 18.37f, 7.05236f, 17.4881f, 7.9355f)
        lineTo(16.0003f, 9.43563f)
        curveTo(15.7483f, 9.68968f, 15.6103f, 10.1796f, 15.6883f, 10.5305f)
        lineTo(16.1142f, 12.3875f)
        curveTo(16.4502f, 13.8574f, 15.6763f, 14.426f, 14.3864f, 13.6578f)
        lineTo(12.5926f, 12.5871f)
        curveTo(12.2687f, 12.3935f, 11.7347f, 12.3935f, 11.4048f, 12.5871f)
        lineTo(9.61096f, 13.6578f)
        curveTo(8.3271f, 14.426f, 7.54719f, 13.8513f, 7.88315f, 12.3875f)
        lineTo(8.3091f, 10.5305f)
        curveTo(8.3871f, 10.1796f, 8.24911f, 9.68968f, 7.99714f, 9.43563f)
        lineTo(6.5093f, 7.9355f)
        curveTo(5.6334f, 7.05236f, 5.91537f, 6.15712f, 7.13923f, 5.95145f)
        lineTo(9.05302f, 5.63086f)
        curveTo(9.37099f, 5.57642f, 9.75494f, 5.29212f, 9.89893f, 4.99573f)
        lineTo(10.9548f, 2.86651f)
        curveTo(11.5307f, 1.71116f, 12.4666f, 1.71116f, 13.0366f, 2.86651f)
        }
        }.build()

        return _award02!!
    }

private var _award02: ImageVector? = null
