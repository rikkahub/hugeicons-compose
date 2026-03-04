package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RubberDuck: ImageVector
    get() {
        if (_rubberDuck != null) {
            return _rubberDuck!!
        }
        _rubberDuck = ImageVector.Builder(
            name = "RubberDuck",
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
        moveTo(7.50122f, 6f)
        verticalLineTo(6.01f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.62724f, 6f)
        curveTo(5.07128f, 4.27477f, 6.63738f, 3f, 8.50122f, 3f)
        curveTo(10.7104f, 3f, 12.5012f, 4.79086f, 12.5012f, 7f)
        curveTo(12.5012f, 8.19469f, 11.9775f, 9.26706f, 11.147f, 10f)
        horizontalLineTo(16.9785f)
        curveTo(18.3568f, 10f, 19.0012f, 8.88071f, 19.0012f, 7.5f)
        curveTo(22.5012f, 11f, 21.97f, 15f, 21.97f, 15f)
        curveTo(21.97f, 18.5f, 18.5012f, 21f, 13.0012f, 21f)
        horizontalLineTo(8.99195f)
        curveTo(5.9595f, 21f, 3.50122f, 18.5376f, 3.50122f, 15.5f)
        curveTo(3.50122f, 13.3105f, 4.77843f, 11.4198f, 6.62726f, 10.5348f)
        curveTo(5.96398f, 10.1824f, 5.41166f, 9.6488f, 5.03635f, 9f)
        moveTo(4.62724f, 6f)
        lineTo(2.00122f, 7f)
        curveTo(2.19131f, 8f, 3.06445f, 9f, 5.03635f, 9f)
        moveTo(4.62724f, 6f)
        lineTo(5.21437f, 6.85464f)
        curveTo(5.67231f, 7.52122f, 5.59789f, 8.41801f, 5.03635f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.0012f, 18f)
        horizontalLineTo(12.5012f)
        curveTo(14.7104f, 18f, 17.5012f, 15.2091f, 17.5012f, 13f)
        horizontalLineTo(11.0012f)
        curveTo(9.62051f, 13f, 8.50122f, 14.1193f, 8.50122f, 15.5f)
        curveTo(8.50122f, 16.8807f, 9.62051f, 18f, 11.0012f, 18f)
        }
        }.build()

        return _rubberDuck!!
    }

private var _rubberDuck: ImageVector? = null
