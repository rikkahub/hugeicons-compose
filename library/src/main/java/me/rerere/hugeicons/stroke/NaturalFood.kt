package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NaturalFood: ImageVector
    get() {
        if (_naturalFood != null) {
            return _naturalFood!!
        }
        _naturalFood = ImageVector.Builder(
            name = "NaturalFood",
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
        moveTo(5.05857f, 11.7421f)
        curveTo(6.97712f, 11.9781f, 8.73113f, 10.5535f, 8.97628f, 8.56018f)
        curveTo(9.22142f, 6.56689f, 6.93885f, 4.64584f, 7.76802f, 2f)
        curveTo(3.66477f, 2.59449f, 2.25056f, 5.90113f, 2.02862f, 7.70572f)
        curveTo(1.78348f, 9.69901f, 3.14003f, 11.5062f, 5.05857f, 11.7421f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 20f)
        curveTo(5.07536f, 15.3242f, 4.76992f, 11.1941f, 5.13275f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.50786f, 17.6681f)
        curveTo(10.6828f, 20.0602f, 13.5206f, 20.7199f, 15.8463f, 19.1415f)
        curveTo(18.172f, 17.5631f, 18.5378f, 13.1898f, 22f, 11.6651f)
        curveTo(18.3054f, 7.57247f, 13.6971f, 9.04998f, 11.5916f, 10.4789f)
        curveTo(9.26587f, 12.0573f, 8.33296f, 15.276f, 9.50786f, 17.6681f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 22f)
        curveTo(8.37778f, 17.9044f, 11.2644f, 15.43f, 14f, 14f)
        }
        }.build()

        return _naturalFood!!
    }

private var _naturalFood: ImageVector? = null
