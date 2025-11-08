package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sparkles: ImageVector
    get() {
        if (_sparkles != null) {
            return _sparkles!!
        }
        _sparkles = ImageVector.Builder(
            name = "Sparkles",
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
        moveTo(15f, 2f)
        lineTo(15.5387f, 4.39157f)
        curveTo(15.9957f, 6.42015f, 17.5798f, 8.00431f, 19.6084f, 8.46127f)
        lineTo(22f, 9f)
        lineTo(19.6084f, 9.53873f)
        curveTo(17.5798f, 9.99569f, 15.9957f, 11.5798f, 15.5387f, 13.6084f)
        lineTo(15f, 16f)
        lineTo(14.4613f, 13.6084f)
        curveTo(14.0043f, 11.5798f, 12.4202f, 9.99569f, 10.3916f, 9.53873f)
        lineTo(8f, 9f)
        lineTo(10.3916f, 8.46127f)
        curveTo(12.4201f, 8.00431f, 14.0043f, 6.42015f, 14.4613f, 4.39158f)
        lineTo(15f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 12f)
        lineTo(7.38481f, 13.7083f)
        curveTo(7.71121f, 15.1572f, 8.84275f, 16.2888f, 10.2917f, 16.6152f)
        lineTo(12f, 17f)
        lineTo(10.2917f, 17.3848f)
        curveTo(8.84275f, 17.7112f, 7.71121f, 18.8427f, 7.38481f, 20.2917f)
        lineTo(7f, 22f)
        lineTo(6.61519f, 20.2917f)
        curveTo(6.28879f, 18.8427f, 5.15725f, 17.7112f, 3.70827f, 17.3848f)
        lineTo(2f, 17f)
        lineTo(3.70827f, 16.6152f)
        curveTo(5.15725f, 16.2888f, 6.28879f, 15.1573f, 6.61519f, 13.7083f)
        lineTo(7f, 12f)
        }
        }.build()

        return _sparkles!!
    }

private var _sparkles: ImageVector? = null
