package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Rain: ImageVector
    get() {
        if (_rain != null) {
            return _rain!!
        }
        _rain = ImageVector.Builder(
            name = "Rain",
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
        moveTo(3f, 7.67122f)
        curveTo(3f, 5.99755f, 4.47444f, 4.34363f, 5.50935f, 3.38889f)
        curveTo(6.0714f, 2.87037f, 6.9286f, 2.87037f, 7.49065f, 3.38889f)
        curveTo(8.52556f, 4.34363f, 10f, 5.99755f, 10f, 7.67122f)
        curveTo(10f, 9.31217f, 8.67462f, 11f, 6.5f, 11f)
        curveTo(4.32538f, 11f, 3f, 9.31217f, 3f, 7.67122f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 17.6712f)
        curveTo(8.5f, 15.9975f, 9.97444f, 14.3436f, 11.0093f, 13.3889f)
        curveTo(11.5714f, 12.8704f, 12.4286f, 12.8704f, 12.9907f, 13.3889f)
        curveTo(14.0256f, 14.3436f, 15.5f, 15.9975f, 15.5f, 17.6712f)
        curveTo(15.5f, 19.3122f, 14.1746f, 21f, 12f, 21f)
        curveTo(9.82538f, 21f, 8.5f, 19.3122f, 8.5f, 17.6712f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 7.67122f)
        curveTo(14f, 5.99755f, 15.4744f, 4.34363f, 16.5093f, 3.38889f)
        curveTo(17.0714f, 2.87037f, 17.9286f, 2.87037f, 18.4907f, 3.38889f)
        curveTo(19.5256f, 4.34363f, 21f, 5.99755f, 21f, 7.67122f)
        curveTo(21f, 9.31217f, 19.6746f, 11f, 17.5f, 11f)
        curveTo(15.3254f, 11f, 14f, 9.31217f, 14f, 7.67122f)
        }
        }.build()

        return _rain!!
    }

private var _rain: ImageVector? = null
