package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HandPrayer: ImageVector
    get() {
        if (_handPrayer != null) {
            return _handPrayer!!
        }
        _handPrayer = ImageVector.Builder(
            name = "HandPrayer",
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
        moveTo(15.5f, 15f)
        lineTo(14f, 10.5f)
        curveTo(12.3432f, 10.4999f, 12f, 11.843f, 12f, 13.4999f)
        verticalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 15f)
        lineTo(10f, 10.5f)
        curveTo(11.6568f, 10.4999f, 12f, 11.843f, 12f, 13.4999f)
        verticalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.9779f, 21.9999f)
        curveTo(20.8283f, 21.3294f, 18.8918f, 19.8143f, 16.2887f, 20.008f)
        curveTo(15.6292f, 20.057f, 15.2991f, 20.0816f, 14.9976f, 20.0584f)
        curveTo(14.696f, 20.0352f, 14.6875f, 20.0333f, 14.6706f, 20.0293f)
        curveTo(13.139f, 19.6745f, 12f, 18.3357f, 12f, 16.7382f)
        verticalLineTo(3.19665f)
        curveTo(12f, 2.53578f, 12.5357f, 2.00003f, 13.1966f, 2f)
        curveTo(13.6825f, 1.99997f, 14.1202f, 2.29381f, 14.3042f, 2.74356f)
        lineTo(17.0224f, 9.38799f)
        curveTo(18.088f, 11.993f, 18.6209f, 13.2954f, 19.5497f, 13.9653f)
        curveTo(19.6069f, 14.0065f, 19.7128f, 14.0777f, 19.7726f, 14.1149f)
        curveTo(20.7443f, 14.721f, 21.1628f, 14.721f, 22f, 14.721f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.02208f, 22f)
        curveTo(3.17173f, 21.3295f, 5.1082f, 19.8144f, 7.71127f, 20.008f)
        curveTo(8.37081f, 20.057f, 8.70094f, 20.0816f, 9.00245f, 20.0584f)
        curveTo(9.304f, 20.0353f, 9.31246f, 20.0333f, 9.32938f, 20.0294f)
        curveTo(10.861f, 19.6746f, 12f, 18.3357f, 12f, 16.7382f)
        verticalLineTo(3.19664f)
        curveTo(12f, 2.53575f, 11.4642f, 2f, 10.8034f, 2f)
        curveTo(10.3175f, 2f, 9.8798f, 2.29382f, 9.69582f, 2.74355f)
        lineTo(6.97762f, 9.38804f)
        curveTo(5.91195f, 11.993f, 5.37912f, 13.2955f, 4.45028f, 13.9654f)
        curveTo(4.39315f, 14.0066f, 4.28717f, 14.0777f, 4.22741f, 14.115f)
        curveTo(3.25573f, 14.721f, 2.83715f, 14.721f, 2f, 14.721f)
        }
        }.build()

        return _handPrayer!!
    }

private var _handPrayer: ImageVector? = null
