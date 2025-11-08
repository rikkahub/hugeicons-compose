package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FallingStar: ImageVector
    get() {
        if (_fallingStar != null) {
            return _fallingStar!!
        }
        _fallingStar = ImageVector.Builder(
            name = "FallingStar",
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
        moveTo(9.03658f, 10.8665f)
        lineTo(10.0925f, 12.9957f)
        curveTo(10.2364f, 13.2921f, 10.6204f, 13.5764f, 10.9444f, 13.6309f)
        lineTo(12.8582f, 13.9515f)
        curveTo(14.082f, 14.1571f, 14.37f, 15.0524f, 13.4881f, 15.9355f)
        lineTo(12.0003f, 17.4356f)
        curveTo(11.7483f, 17.6897f, 11.6103f, 18.1796f, 11.6883f, 18.5305f)
        lineTo(12.1142f, 20.3875f)
        curveTo(12.4502f, 21.8574f, 11.6763f, 22.426f, 10.3864f, 21.6578f)
        lineTo(8.59263f, 20.5871f)
        curveTo(8.26867f, 20.3935f, 7.73473f, 20.3935f, 7.40476f, 20.5871f)
        lineTo(5.61096f, 21.6578f)
        curveTo(4.3271f, 22.426f, 3.54719f, 21.8513f, 3.88315f, 20.3875f)
        lineTo(4.3091f, 18.5305f)
        curveTo(4.3871f, 18.1796f, 4.24911f, 17.6897f, 3.99714f, 17.4356f)
        lineTo(2.5093f, 15.9355f)
        curveTo(1.6334f, 15.0524f, 1.91537f, 14.1571f, 3.13923f, 13.9515f)
        lineTo(5.05302f, 13.6309f)
        curveTo(5.37099f, 13.5764f, 5.75494f, 13.2921f, 5.89893f, 12.9957f)
        lineTo(6.95481f, 10.8665f)
        curveTo(7.53075f, 9.71116f, 8.46665f, 9.71116f, 9.03658f, 10.8665f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 2f)
        lineTo(14f, 10f)
        moveTo(16f, 2f)
        lineTo(11f, 7f)
        moveTo(20f, 10f)
        lineTo(17f, 13f)
        }
        }.build()

        return _fallingStar!!
    }

private var _fallingStar: ImageVector? = null
