package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Logout05: ImageVector
    get() {
        if (_logout05 != null) {
            return _logout05!!
        }
        _logout05 = ImageVector.Builder(
            name = "Logout05",
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
        moveTo(7.00003f, 3f)
        curveTo(6.07006f, 3f, 5.60507f, 3f, 5.22357f, 3.10222f)
        curveTo(4.1883f, 3.37962f, 3.37966f, 4.18827f, 3.10225f, 5.22354f)
        curveTo(3.00003f, 5.60504f, 3.00003f, 6.07003f, 3.00003f, 7f)
        lineTo(3.00003f, 17f)
        curveTo(3.00003f, 17.93f, 3.00003f, 18.395f, 3.10225f, 18.7765f)
        curveTo(3.37965f, 19.8117f, 4.1883f, 20.6204f, 5.22357f, 20.8978f)
        curveTo(5.60507f, 21f, 6.07006f, 21f, 7.00003f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5001f, 16.5f)
        curveTo(16.5001f, 16.5f, 21f, 13.1858f, 21f, 12f)
        curveTo(21f, 10.8141f, 16.5f, 7.5f, 16.5f, 7.5f)
        moveTo(20f, 12f)
        lineTo(8.00003f, 12f)
        }
        }.build()

        return _logout05!!
    }

private var _logout05: ImageVector? = null
