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
        moveTo(7.50119f, 6f)
        verticalLineTo(6.01f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.62721f, 6f)
        curveTo(5.07125f, 4.27477f, 6.63735f, 3f, 8.50119f, 3f)
        curveTo(10.7103f, 3f, 12.5012f, 4.79086f, 12.5012f, 7f)
        curveTo(12.5012f, 8.19469f, 11.9774f, 9.26706f, 11.147f, 10f)
        horizontalLineTo(16.9784f)
        curveTo(18.3568f, 10f, 19.0012f, 8.88071f, 19.0012f, 7.5f)
        curveTo(22.5012f, 11f, 21.97f, 15f, 21.97f, 15f)
        curveTo(21.97f, 18.5f, 18.5012f, 21f, 13.0012f, 21f)
        horizontalLineTo(8.99192f)
        curveTo(5.95947f, 21f, 3.50119f, 18.5376f, 3.50119f, 15.5f)
        curveTo(3.50119f, 13.3105f, 4.7784f, 11.4198f, 6.62723f, 10.5348f)
        curveTo(5.96394f, 10.1824f, 5.41163f, 9.6488f, 5.03632f, 9f)
        moveTo(4.62721f, 6f)
        lineTo(2.00119f, 7f)
        curveTo(2.19128f, 8f, 3.06442f, 9f, 5.03632f, 9f)
        moveTo(4.62721f, 6f)
        lineTo(5.21434f, 6.85464f)
        curveTo(5.67228f, 7.52122f, 5.59786f, 8.41801f, 5.03632f, 9f)
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
        curveTo(14.7103f, 18f, 17.5012f, 15.2091f, 17.5012f, 13f)
        horizontalLineTo(11.0012f)
        curveTo(9.62048f, 13f, 8.50119f, 14.1193f, 8.50119f, 15.5f)
        curveTo(8.50119f, 16.8807f, 9.62048f, 18f, 11.0012f, 18f)
        }
        }.build()

        return _rubberDuck!!
    }

private var _rubberDuck: ImageVector? = null
