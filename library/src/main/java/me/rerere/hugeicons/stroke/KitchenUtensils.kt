package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.KitchenUtensils: ImageVector
    get() {
        if (_kitchenUtensils != null) {
            return _kitchenUtensils!!
        }
        _kitchenUtensils = ImageVector.Builder(
            name = "KitchenUtensils",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.4831f, 14.0001f)
        verticalLineTo(3.00006f)
        moveTo(12.4831f, 14.0001f)
        curveTo(10.8247f, 14.0001f, 9.48038f, 15.4355f, 9.48038f, 16.6251f)
        curveTo(9.48038f, 18.3751f, 10.8247f, 21.0001f, 12.4831f, 21.0001f)
        curveTo(14.1414f, 21.0001f, 15.4857f, 18.3751f, 15.4857f, 16.6251f)
        curveTo(15.4857f, 15.4355f, 14.1414f, 14.0001f, 12.4831f, 14.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.47841f, 10.0283f)
        lineTo(5.47841f, 21f)
        moveTo(4.18615f, 3.12945f)
        lineTo(3.40347f, 3.20753f)
        curveTo(2.83225f, 3.26452f, 2.42596f, 3.78885f, 2.51382f, 4.35564f)
        lineTo(3.1828f, 8.67118f)
        curveTo(3.29612f, 9.40225f, 3.926f, 10.0106f, 4.66644f, 10.0106f)
        horizontalLineTo(6.2904f)
        curveTo(7.03083f, 10.0106f, 7.66071f, 9.40225f, 7.77404f, 8.67118f)
        lineTo(8.44301f, 4.35564f)
        curveTo(8.53087f, 3.78885f, 8.12458f, 3.26452f, 7.55336f, 3.20753f)
        lineTo(6.77337f, 3.12962f)
        curveTo(5.91311f, 3.04368f, 5.04642f, 3.04363f, 4.18615f, 3.12945f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.496f, 13.8182f)
        lineTo(18.496f, 3.02594f)
        curveTo(19.6545f, 3.34592f, 21.5815f, 4.55268f, 21.9006f, 7.52842f)
        lineTo(22.4737f, 12.0424f)
        curveTo(22.5743f, 12.8351f, 22.3727f, 13.6261f, 21.5846f, 13.7616f)
        curveTo(20.9244f, 13.8751f, 19.9229f, 13.9122f, 18.496f, 13.8182f)
        moveTo(18.496f, 13.8182f)
        lineTo(18.496f, 21.0001f)
        }
        }.build()

        return _kitchenUtensils!!
    }

private var _kitchenUtensils: ImageVector? = null
