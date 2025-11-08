package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Rhombus: ImageVector
    get() {
        if (_rhombus != null) {
            return _rhombus!!
        }
        _rhombus = ImageVector.Builder(
            name = "Rhombus",
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
        moveTo(6.91412f, 5.99584f)
        curveTo(9.31163f, 3.33195f, 10.5104f, 2f, 12f, 2f)
        curveTo(13.4896f, 2f, 14.6884f, 3.33195f, 17.0859f, 5.99584f)
        lineTo(17.4037f, 6.34903f)
        curveTo(19.8012f, 9.01292f, 21f, 10.3449f, 21f, 12f)
        curveTo(21f, 13.6551f, 19.8012f, 14.9871f, 17.4037f, 17.651f)
        lineTo(17.0859f, 18.0042f)
        curveTo(14.6884f, 20.6681f, 13.4896f, 22f, 12f, 22f)
        curveTo(10.5104f, 22f, 9.31163f, 20.6681f, 6.91412f, 18.0042f)
        lineTo(6.59626f, 17.651f)
        curveTo(4.19875f, 14.9871f, 3f, 13.6551f, 3f, 12f)
        curveTo(3f, 10.3449f, 4.19875f, 9.01292f, 6.59626f, 6.34903f)
        lineTo(6.91412f, 5.99584f)
        }
        }.build()

        return _rhombus!!
    }

private var _rhombus: ImageVector? = null
