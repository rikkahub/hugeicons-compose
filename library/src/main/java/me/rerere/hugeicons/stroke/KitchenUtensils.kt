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
        moveTo(11.9831f, 14.0001f)
        verticalLineTo(3.00006f)
        moveTo(11.9831f, 14.0001f)
        curveTo(10.3247f, 14.0001f, 8.98038f, 15.4355f, 8.98038f, 16.6251f)
        curveTo(8.98038f, 18.3751f, 10.3247f, 21.0001f, 11.9831f, 21.0001f)
        curveTo(13.6414f, 21.0001f, 14.9857f, 18.3751f, 14.9857f, 16.6251f)
        curveTo(14.9857f, 15.4355f, 13.6414f, 14.0001f, 11.9831f, 14.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.97841f, 10.0283f)
        lineTo(4.97841f, 21f)
        moveTo(3.68615f, 3.12945f)
        lineTo(2.90347f, 3.20753f)
        curveTo(2.33225f, 3.26452f, 1.92596f, 3.78885f, 2.01382f, 4.35564f)
        lineTo(2.6828f, 8.67118f)
        curveTo(2.79612f, 9.40225f, 3.426f, 10.0106f, 4.16644f, 10.0106f)
        horizontalLineTo(5.7904f)
        curveTo(6.53083f, 10.0106f, 7.16071f, 9.40225f, 7.27404f, 8.67118f)
        lineTo(7.94301f, 4.35564f)
        curveTo(8.03087f, 3.78885f, 7.62458f, 3.26452f, 7.05336f, 3.20753f)
        lineTo(6.27337f, 3.12962f)
        curveTo(5.41311f, 3.04368f, 4.54642f, 3.04363f, 3.68615f, 3.12945f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.996f, 13.8182f)
        lineTo(17.996f, 3.02594f)
        curveTo(19.1545f, 3.34592f, 21.0815f, 4.55268f, 21.4006f, 7.52842f)
        lineTo(21.9737f, 12.0424f)
        curveTo(22.0743f, 12.8351f, 21.8727f, 13.6261f, 21.0846f, 13.7616f)
        curveTo(20.4244f, 13.8751f, 19.4229f, 13.9122f, 17.996f, 13.8182f)
        moveTo(17.996f, 13.8182f)
        lineTo(17.996f, 21.0001f)
        }
        }.build()

        return _kitchenUtensils!!
    }

private var _kitchenUtensils: ImageVector? = null
